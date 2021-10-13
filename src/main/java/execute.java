import entity.requestParams;
import util.ExcelUtils;

public class execute {
    public static requestParams rp = new requestParams();


    public static void go(requestParams rp) {

        //创建表格
        ExcelUtils.createExcel();


        //ECS
        ExcelUtils.createSheet("ECS");

        //RDS
        ExcelUtils.createSheet("RDS");


        //Redis
        ExcelUtils.createSheet("Redis");

        //VPC
        ExcelUtils.createSheet("VPC");


        //SLB
        ExcelUtils.createSheet("SLB");


        //高速通道
        ExcelUtils.createSheet("高速通道");


        //MQ
        ExcelUtils.createSheet("MQ");



        //K8S
        ExcelUtils.createSheet("K8S");



        //DTS
        ExcelUtils.createSheet("Sheet1");



        //ASCM组织列表
        ExcelUtils.createSheet("ASCM组织列表");



        //ASCM用户列表
        ExcelUtils.createSheet("ASCM用户列表");
    }
}
