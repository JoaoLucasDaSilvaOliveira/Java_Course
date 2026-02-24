package _2_StreamDeDados;

import java.io.*;
import java.util.Arrays;

public class _9_OutPutStreamWriter {
    private static final byte[] BYTES = {
            106, 97, 118, 97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47
    };

    public static void main(String[] args) throws IOException {
        String text;
        try (
                BufferedReader bfr = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(BYTES)))
        ) {
            text = bfr.readLine();
        }
        System.out.println(text);

        //parte nova da aula - escrevendo em texto e a classe transforma automaticamente em bytes
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try(
                OutputStreamWriter osw = new OutputStreamWriter(baos);
        ) {
            osw.write(text);
        }
        System.out.println(Arrays.toString(BYTES));
        byte [] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));
    }
}
