import java.util.ArrayList;

public class Chon {
    public static ArrayList<Integer> arrayList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    Integer a = 0;
                    a = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, a);
                }
            }
        }
        return arrayList;
    }
}
