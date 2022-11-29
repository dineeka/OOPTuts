package Tutorial7.q3;

import java.util.HashMap;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Book b1 = new Book();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book title: ");
        b1.setTitle(sc.nextLine());

        System.out.println("Enter book price: ");
        b1.setPrice(sc.nextInt());

        System.out.println("Enter published year: ");
        b1.setYear(sc.nextInt());

        System.out.println("Enter the author: ");
        b1.setAuthor(sc.next());

        System.out.println(b1.toString());

        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();

        hmap.put(b1,2);

    }
}
