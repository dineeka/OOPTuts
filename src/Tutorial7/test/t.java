package Tutorial7.test;

import java.util.ArrayList;

public class t {
    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        l1.add(10);
        l1.add(5);

        listDemo(l1);
    }

}
