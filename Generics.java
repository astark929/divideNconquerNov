package testingCode;

import java.util.ArrayList;
import java.util.Scanner;


public class Generics {

    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        T temp;
        for(int i = 0; i < list.size(); ++i) {
            for(int k = 0; k < list.size()-1; ++k) {
                if(list.get(k).compareTo(list.get(k+1)) > 0) {
                    temp = list.get(k);
                    list.set(k, list.get(k+1));
                    list.set(k+1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }

        sort(list);
        System.out.print("The sorted numbers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

