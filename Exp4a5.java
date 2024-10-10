import java.util.Scanner;
public class Exp4a5 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        boolean flag = true; //checks for iterating the algorithm
        String temp; //checks and satisfies the iteration condition
        int size; //no. of elements asked from the user
        while (flag){
            try{
                System.out.println("Enter the size: ");
                size = input.nextInt();
                int array[] = new int [size];                
                int i;
                for (i = 0; i < size; i++){array[i] = input.nextInt();}
                byte numOfLeaders = 0; //keeps track on the no. of leaders
                byte tempVariable; //checks if the next elements are lesser in magnitude
                for (i = 0; i < size; i++){
                    tempVariable = 0;
                    for (int j = i; j < size; j++)
                    {
                        if (array[i] > array[j])
                        {tempVariable++;}
                    }
                    if ((size - (i + 1)) == tempVariable)
                    {numOfLeaders++;}
                }
                System.out.println("\n" + numOfLeaders);
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
