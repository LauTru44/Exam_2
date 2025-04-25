import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Solution
{

    public Solution()
    {
        ArrayList<Double> temperatures = new ArrayList();
        temperatures.add(35.6);
        temperatures.add(41.8);
        temperatures.add(37.6);
        temperatures.add(34.2);
        
        temperatureInfo(temperatures);
    }

    //Question 24
    public void question24(){
    /**comments:
     * - Missed of braces
     */    
    //(a)
    String a="yes";
    String b = "no";
    //(b)
        if (a.equals(b)){
        System.out.println("equal");
        } else {//(c)
         System.out.println("They are not equal ");
        }
    }
    
    /**question 25
    */
     public void temperatureInfo(ArrayList<Double> temperatures){
    /**comments:
     * - Wrong comparation symbol
     * - Added the arraylist as the parameter
     */          
        int C=0;
        double M=0;
        for (double T:temperatures){
            if (T>37.5) {
            C++;
            }
        }
        for (double t:temperatures){
            if (M<t){
                M=t;
            }
        }
        System.out.println(C+" have condition of fever and "+M+" was the max temp");
    }
    
    /**question 26
    */
    public static void temperatureInfo26(ArrayList<Double> temperatures){
        double M;
        M= Collections.max(temperatures);
        System.out.print(" the max temp is "+M);
    }
    
    /**question 27
    */
    public static void temperatureInfo27(ArrayList<Double> temperatures){
        Collections.sort(temperatures);
        double M;
        M=temperatures.get(temperatures.size()-1); //index of the last value in the list
        System.out.print("max temp: "+M);
    }   
    
    public void executeMethods(){ //just to check if the last two methods work
        ArrayList<Double> temperatures = new ArrayList();
        temperatures.add(35.6);
        temperatures.add(41.8);
        temperatures.add(37.6);
        temperatures.add(34.2);
        
     temperatureInfo26(temperatures);  
     temperatureInfo27(temperatures);
    }
    
}
