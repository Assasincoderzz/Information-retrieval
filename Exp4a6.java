import java.util.Scanner;
import java.util.Arrays;
public class Exp4a6 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        boolean flag = true; //checks for iterating the algorithm
        String temp; //checks and satisfies the iteration condition
        int size; //no. of elements asked from the user
        while (flag){
            try{
                size = input.nextInt();
                byte array[] = new byte [size]; //data type 'byte' is used for memory efficiency
                int i;
                int num;//for getting input
                boolean flag_1 = true; //for the execution when inputs are correct
                for (i = 0; i < size; i++)//getting input
                {
                    num = input.nextInt();
                    if (num == 0 || num == 1)
                    {array[i] = (byte) num;} //type casting integer data type to byte data type
                    else{
                        System.out.println("Enter correct input");
                        flag_1 = false;
                        input.nextLine();
                        break;}}
                if(flag_1){
                    Arrays.sort (array);
                    System.out.println();
                    for (i = 0; i < size; i++){
                        System.out.print(array[i] + " ");}}
                //checks for iteration
                System.out.println("\nType \'quit\' to quit the program");
                temp = input.next();
                if(temp.equals("quit")){
                    flag = false;
                    input.nextLine();}}
            catch (Exception e){
                System.out.println("\n" + e);
                input.nextLine();}
        }
        input.close();
    }
}
