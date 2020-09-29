import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(0);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(NoiBot.arrayList(arrayList));
        System.out.println(Chon.arrayList(arrayList));
        System.out.println(Chen.arrayList(arrayList));
    }
}
