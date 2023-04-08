import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] array = {-1.0, -2.0, 3.1, 5.0, 0.0, -4.3, 5.7, -0.1, 2.5, 3.9, 9.1, -4.6, 1.3, 6.7, 1.1};
        double sum=0.0;double count=0.0;
        boolean negativeNumber=false;
        System.out.println(Arrays.toString(array));
        for (double num:array) {
            if (num<0) {
                negativeNumber = true;
            }
            else if(negativeNumber) {
                sum += num;
                count++;
            }
        }
        if (count>0) {
            double average = sum / count;
            System.out.println("----------\n" + "Среднее арифметическое положительных чисел после первого отрицательного числа: "
                    + average + "\n----------");
        }    //HW1,2

        for (int i =0;i< array.length;i++){
            int minNum=i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j]<array[minNum]){
                    minNum=j;
                }
            }
            double temp = array[i];
            array[i] = array[minNum];
            array[minNum] = temp;
            System.out.println(Arrays.toString(array));
        }   //HW3,4
    }

}