package howtodoinjava.Log4j2;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log4j2Logger1 {
   Logger LOGGER = LogManager.getLogger(Log4j2Logger1.class.getName());

    public static void main(String[] args)
    {
        LOGGER.info("Info Message Logged !!!");
    }
}