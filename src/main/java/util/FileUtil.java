package util;

import org.mozilla.universalchardet.UniversalDetector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class FileUtil {

    public static String readFileInSameFolder(String fileName) {
        try {
            String jarpath = System.getProperty("java.class.path");
            int firstIndex = jarpath.lastIndexOf(System.getProperty("path.separator")) + 1;
            int lastIndex = jarpath.lastIndexOf(File.separator) + 1;
            jarpath = jarpath.substring(firstIndex, lastIndex);

            File conffile =new File(jarpath + fileName);
            if(conffile.exists() != true) {
                return "false";
            }
           if(getFileDetector(jarpath + fileName).equals("UTF-8")) {
                InputStreamReader confrd = new InputStreamReader (new FileInputStream(conffile),"UTF-8");
                BufferedReader confbf = new BufferedReader(confrd);
                int ch = 0;
                StringBuffer sb = new StringBuffer();
                while((ch = confbf.read()) != -1) {
                    sb.append((char) ch);
                }

                return sb.toString();
           }

            UnicodeReader confrd = new UnicodeReader(new FileInputStream(jarpath + fileName), Charset.defaultCharset().name());
            BufferedReader confbf = new BufferedReader(confrd);
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while((ch = confbf.read()) != -1) {
                sb.append((char) ch);
            }

            return sb.toString();

        }catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }


    public static String getFileDetector(String filePath) {
        try {
            byte[] buf = new byte[4096];
            FileInputStream fis = new FileInputStream(filePath);

            // (1)
            UniversalDetector detector = new UniversalDetector(null);

            // (2)
            int nread;
            while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
                detector.handleData(buf, 0, nread);
            }
            // (3)
            detector.dataEnd();

            // (4)
            String encoding = detector.getDetectedCharset();

            // (5)
            detector.reset();

            if(encoding.equals("null"))
                return "false";
            return encoding;
        }catch (Exception e) {
            return "false";
        }
    }
}
