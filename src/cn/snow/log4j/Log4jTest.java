package cn.snow.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {
    public static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        // TODO Auto-generated method stub    
        String log="log4日志测试";
        logger.info(log);        
    }

}