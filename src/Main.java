import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * Created by adavi on 24.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        ArraysClass aClass = new ArraysClass();
        ArraysClass arraysClass = new ArraysClass();

        int []array1 = aClass.generationArray(5);
        int []array2 =  arraysClass.generationArray(5);

        double avgArr1 = aClass.avgArray(array1);
        double avgArr2 = aClass.avgArray(array2);

        aClass.equalsArrays(avgArr1,avgArr2);


    }
}
