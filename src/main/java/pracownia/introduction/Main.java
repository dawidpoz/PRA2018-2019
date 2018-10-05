package pracownia.introduction;

import org.apache.log4j.Logger;

public class Main {

    public static void main(String [ ] args) {

        System.out.println("Hello World");
        Logger superlogger = Logger.getLogger("name");
        superlogger.info("message");
    }

}