
package НОВАЯ_ПАПКА;

import java.util.LinkedList;
public class Seconnd{
    public static void main(String[] args) {

        int[] list = { 3, 5, 7, 2, 4, 6 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println(linkList);

        enqueue(linkList, 9);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
