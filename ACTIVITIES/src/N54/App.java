package N54;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void closeAll (List<? extends Closeable> elements) throws IOException {
        for (Closeable element : elements) {
            element.close();
        }
    }
}
