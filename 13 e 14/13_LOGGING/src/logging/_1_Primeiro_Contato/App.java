package logging._1_Primeiro_Contato;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("This is my first log message");
        LOGGER.debug("This is a debug message");
    }
}
