/**
 * Created by adavi on 24.07.2017.
 */
public class ArraysClass {

    public int[] generationArray(int n){

        int array[] = new int[n];
        for (int i = 0; i < n; i++ ) {
            array[i] = (int) (Math.random() * (n) + 1);
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();

        return  array;
    }
    public double avgArray(int array[]){
        double rezult = 0;
        double avg = 0;
        for (int i : array) {

            rezult+=i;
        }
        avg = rezult/array.length;
        System.out.println(avg);

        return avg;
    }
    public void equalsArrays(double avgArray1, double avgArray2){
        if (avgArray1 > avgArray2){
            System.out.println("Більший перший масив");
        }else if(avgArray1 < avgArray2){
            System.out.println("Більший другий масив");
        }else if(avgArray1 == avgArray2){
            System.out.println("Сума масивів рвна");
        }
    }
}
