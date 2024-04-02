
import java.util.Arrays;
 
public class Sort {
    
    public static String sortString(String inputString)
    {
        
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
 
  
    public static void main(String[] args)
    {
       
        String inputString = "haihello";
        String outputString = sortString(inputString);
 

        System.out.println("String Entered : " + inputString);
        
        System.out.println("Sorted String : "
                           + outputString);
    }
}
