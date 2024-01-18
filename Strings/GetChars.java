import java.lang.*;
import java.util.*;
public class GetChars {
   public static void main(String[] args) {

	//Question 4
      System.out.println("question 4 : ");
      //instantiate the string class
      String str = new String("welcome to bmsce college");
      System.out.println("The given string is: " + str);
      
      // create character array
      char[] chararr = new char[10];
      
      // copies characters from starting and ending index into the destination character array
      
      //initialize the srcBegin, srcEnd, and dstBegin values
      int srcBegin = 11, srcEnd = 16, dstBegin = 0;
      System.out.println("The srcBegin, srcEnd, and dstBegin values are: " + srcBegin + ", " + srcEnd + ", and " + dstBegin);
      
      //using the getChars() method
      str.getChars(srcBegin, srcEnd, chararr, dstBegin);
      
      // print the character array
      System.out.print("The Value of character array : " + Arrays.toString(chararr));
   }
}