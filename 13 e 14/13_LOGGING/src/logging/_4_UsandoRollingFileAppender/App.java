package logging._4_UsandoRollingFileAppender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger("rolling");

    public static void main(String[] args) {
        LOGGER.warn("Logging warn");
    }
}
