package logging._3_Salvando_arquivos_com_timestamp_no_titulo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger("timestamp");

    public static void main(String[] args) {

        LOGGER.warn("Logando com timestamp");
    }
}
