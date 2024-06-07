import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
3.Verilmiş bir ArrayList daxilində təkrarlanan elementləri tapmaq.
4.Cumlede her sozden ne qeder islendiyini tapmaq.
5.Verilmiş iki ArrayList-dəki birinci elementlərin bərabər olub olmadığını yoxlayın.
6.Verilmiş bir LinkedList-də istifadəçinin daxil etdiyi bir ədədi axtarmaq və onun index-ni tapmaq.
 */

        //3.
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("one");
//        arrayList.add("two");
//        arrayList.add("three");
//        arrayList.add("one");
//        arrayList.add("four");
//        arrayList.add("four");
//
//
//        HashSet<String> set = new HashSet<>();
//        HashSet<String> duplicate = new HashSet<>();
//
//        for(String element : arrayList) {
//            if (!set.add(element)) {
//                duplicate.add(element);
//            }
//        }
//            System.out.println(duplicate);

        //4.
//        ArrayList<String> arrayList = new ArrayList<>();
//        int count = 0;
//        arrayList.add("one");
//        arrayList.add("two");
//        arrayList.add("three");
//        arrayList.add("one");
//        arrayList.add("four");
//        arrayList.add("four");
//
//
//        HashSet<String> set = new HashSet<>();
//        HashSet<String> duplicate = new HashSet<>();
//
//        for(String element : arrayList) {
//            if (!set.add(element)) {
//                duplicate.add(element);
//                count++;
//            }
//        }
//            System.out.println(count);

        //5.
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(4);
//        list2.add(5);
//
//        boolean flag = false;
//        if (!list1.isEmpty() && !list2.isEmpty()) {
//            flag = list1.get(0).equals(list2.get(0));
//        }
//        if (flag) {
//            System.out.println("Birinci elementlər bərabərdir.");
//        } else {
//            System.out.println("Birinci elementlər bərabər deyil.");
//        }

        //6.

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bir ədəd daxil edin:");
//        int number = scanner.nextInt();
//        int index = list.indexOf(number);
//        if (index != -1) {
//            System.out.println(index);
//        } else {
//            System.out.println("LinkedList daxilində tapılmadı.");
//        }



    }
}
