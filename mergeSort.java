package testingCode;

public class mergeSort {
    public static void main (String [] args){
        int [] arr =        {2, 9, 5, 4, 8, 1, 6, 7};
        // final result    1  2  4  5  6  7  8  9
        print(arr);
        mergeSort(arr);
    }
    public static void mergeSort(int [] list){

        if (list.length > 1){
            int midpoint = list.length/2;
            int [] firstHalf = new int[midpoint];
            int [] secondHalf = new int[list.length - midpoint];

            for (int i = 0; i < midpoint; i++){
                firstHalf[i] = list[i];
            }

            for (int i = 0; i < list.length - midpoint; i++){
                secondHalf[i] = list[i+midpoint];
            }

            mergeSort(firstHalf);
            mergeSort(secondHalf);

            sort(list, firstHalf, secondHalf);
        }


    }

    public static void sort (int[] list, int [] firstHalf, int[] secondHalf){
        int first = firstHalf.length;
        int second = secondHalf.length;

        int i = 0, j =0, k = 0;
        while(i < first && j < second){
            if (firstHalf[i] <= secondHalf[j]){
                list[k] = firstHalf[i];
                i++;
            }
            else{
                list[k] = secondHalf[j];
                j++;
            }
            k++;
        }
        // reminder this part below is the cleanup code for any remaining numbers
        while(i < first){
            list[k] = firstHalf[i];
            i++;
            k++;
        }
        while(i < second){
            list[k] = secondHalf[j];
            j++;
            k++;
        }
        /*
        0 1
        2 3
        0 1 2 3
         */

        print(list);
    }


    public static void print(int arr [] ){
        for (int i = 0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
