package logging._2_Testando_na_pratica;

import org.slf4j.event.Level;

import static logging._1_Primeiro_Contato.App.LOGGER;

public class App {

    public static void main(String[] args) {
        LOGGER.trace("trace()");
        LOGGER.debug("debug()");
        LOGGER.info("info()");
        LOGGER.warn("warn()");
        LOGGER.error("error()");
        //como colocar params no log
        int number = 10;
        LOGGER.info("Error number {}", number);
        //como verificar se existe um log para um certo level
//        if (LOGGER.isDebugEnabled())
//        if (LOGGER.isEnabledForLevel(Level.DEBUG))
    }
}
