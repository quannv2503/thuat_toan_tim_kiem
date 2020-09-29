import java.util.ArrayList;

public class Chen {
    public static ArrayList<Integer> arrayList(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            Integer thuc = arrayList.get(i);
            int j = i - 1;
            while (arrayList.get(j) > thuc && j >= 0) {
                arrayList.set(j + 1, arrayList.get(j));
                j = j - 1;
            }
            arrayList.set(j + 1, thuc);
        }
        return arrayList;
    }
}
