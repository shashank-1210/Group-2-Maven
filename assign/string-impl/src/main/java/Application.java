
import java.util.*;

public class Application {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the String:");
        String myString=sc.nextLine();

        StringFunctions obj=new StringFunctions();
        int myLength= obj.myStringLength(myString);
        String myReverse=obj.myStringReverse(myString);

        System.out.println("The length is:"+myLength);
        System.out.println("The reverse of String:"+myReverse);

    }


}
