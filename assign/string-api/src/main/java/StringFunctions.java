public class StringFunctions {

    public int myStringLength(String myString)
    {
        return myString.length();
    }
    public String myStringReverse(String myString)
    {
        StringBuffer sb=new StringBuffer(myString);
        sb=sb.reverse();
        return sb.toString();

    }


}
