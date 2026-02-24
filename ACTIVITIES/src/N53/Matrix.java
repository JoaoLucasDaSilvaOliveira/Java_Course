package N53;

import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {
    public static final int SIZE = 3;

    List<List<T>> elements = new ArrayList<>(SIZE);

    public Matrix (){
        for (int i = 0; i < SIZE; i++){
            List<T> row = new ArrayList<>(SIZE);
            for (int j = 0; j < SIZE; j++){
                row.add(null);
            }
            elements.add(row);
        }
    }

    public void showElements (){
        for (List<T> eList: elements){
            for (T e : eList){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public void setElements (int codinateRow, int cordinateCol, T obj){
        elements.get(codinateRow).set(cordinateCol, obj);
    }
}
