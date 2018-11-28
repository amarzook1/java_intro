// can you remember how to set up your main function?

// declare an array of Strings and print it

// declare an array of integers and print it

// declare an ArrayList of integers, add numbers to it, and then print it
import java.util.ArrayList;
class ArrayStuff {
  public static void main(String[] args) {
    String[] stringArray = {"jhon","sam","bob"};

    for(String temp : stringArray){
      System.out.println(temp);
    }

    Integer[] integerArray = {1,2,3,4};

    for(Integer temp : integerArray){
      System.out.println(temp);
    }

    ArrayList<Integer> arrayListNumbers = new ArrayList<Integer>();
    arrayListNumbers.add(2);
    arrayListNumbers.add(4);
    arrayListNumbers.add(1);
    arrayListNumbers.add(14);

    for(Integer temp : arrayListNumbers){
      System.out.println(temp);
    }

  }
}
