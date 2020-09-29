import java.util.ArrayList;

public class NoiBot {
    public static ArrayList<Integer> arrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if(arrayList.get(j)>arrayList.get(j+1)){
                    Integer a=0;
                    a=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,a);
                }
            }
        }
        return arrayList;
    }
}
