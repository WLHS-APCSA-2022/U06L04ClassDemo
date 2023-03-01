import java.util.Arrays; //need this to sort arrays

public class Main {
    public static void main(String[] args) {
        double[] testValues = {-5.5, 10.7, 0.0, -3.8, 1.2, 4.3, -2.5, 1.2, 7.0, -0.5};

        //sort is a static method that belongs to the Array class, so to call it
        //we use the form ClassName.methodName(params). We are not creating an object
        Arrays.sort(testValues);

        //to print arrays we can use an enhanced for loop
        System.out.println("Enhanced for loop printing: ");
        for(double value: testValues){
            System.out.print(value + ", ");
        }
        System.out.println("\ntoString method printing: ");

        //or you can use the toString method in the Arrays class
        System.out.println(Arrays.toString(testValues));

        System.out.println("\nThe max value is: " + findMax(testValues));


    }

    public static double findMax(double[] arr){
        if(arr.length == 0){
            return -10000;
        }

        double max = arr[0];
        for(double value: arr){
            if(value>max){
                max = value;
            }
        }
        return max;
    }
}
