package myDate;
import java.util.Date;

/*************************
 * this is an exercise Java 
 * app
 * @author Jose Moreno
 * 
 *************************/

public class RunDate {
    public String myAddit(String greet, int additive, int art) {

        String myGreet = greet;
        int my_intx = additive;
        int my_inty = art;
        int sum = my_intx + my_inty;
        return myGreet + ", the sum is: " + sum;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub

        Date dt = new Date();

        RunDate rundt = new RunDate();
        String baseStr = rundt.myAddit("Welcome", 7, 4);

        System.out.println("The date is " + dt +"\n"+baseStr);
    }
}
