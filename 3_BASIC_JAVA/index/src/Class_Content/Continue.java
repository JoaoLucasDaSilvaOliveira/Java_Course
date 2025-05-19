package Class_Content;

public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<100; i++)
        {
            if (i % 2 ==0)
            {
                //continue pula para a próx. execução. break para a execução
                continue;
            }
            System.out.println("i: "+i);
        }
    }
}
