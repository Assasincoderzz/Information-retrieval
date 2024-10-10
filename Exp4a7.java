import java.util.Scanner;
public class Exp4a7{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        boolean flag = true; //checks for iterating the algorithm
        String temp; //checks and satisfies the iteration condition
        int size; //no. of elements asked from the user
        int index; //to which index the element must be inserted
        int new_element; //stores the element to be inserted
        while (flag){
            try{
                size = input.nextInt();
                int i;
                int array[] = new int [size + 1];//for storing the elements;the size is one extra for storing the new element
                for (i = 0; i < size; i++) {array[i] = input.nextInt();}
                input.nextLine();
                new_element = input.nextInt(); //gets the new element to be inserted
                index = input.nextInt(); //the index where the new_element is inserted
                if (index < 0 || index > (size - 2)){throw new ArrayIndexOutOfBoundsException ("\nIndex out of range");}
                for (i = size; i > 0; i--){
                    if (i == index){
                        array[i] = new_element;//inserts the element and breaks the loop
                        break;}
                    else{array[i] = array[i - 1];}}
                for (i = 0; i < size + 1; i++){System.out.print(array[i] + " ");}
                //checks for iteration
                System.out.println("\nType \'quit\' to quit the program");
                temp = input.next();
                if(temp.equals("quit")){
                    flag = false;
                    input.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("\n" + e);
                input.nextLine();
            }
        }
        input.close();
    }
}
