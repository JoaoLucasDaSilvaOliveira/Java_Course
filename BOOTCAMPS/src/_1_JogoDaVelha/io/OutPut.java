package _1_JogoDaVelha.io;

public final class OutPut {

        private OutPut(){}

        public static void writeNewLine(){
            write(null);
        }

    public static void write (Object obj){
            write(obj, false);
    }

        public static void write (Object obj, boolean addNewLine){
            if (obj ==null){
                System.out.println();
            } else {
                if (addNewLine){
                    System.out.println(obj);
                } else {
                    System.out.print(obj);
                }
            }
        }
}
