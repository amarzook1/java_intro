// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?

// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
class controlFlow {
    public static void main(String[] args){
        System.out.println("Enter a Integer: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if(userInput%2 != 0){
            System.out.println(userInput +" is a odd number");
        }else{
            System.out.println(userInput +" is a even number");
        }
    }
}