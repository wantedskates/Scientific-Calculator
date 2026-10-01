import java.util.ArrayList;
import java.util.Scanner;


/*before i run the code my text editor show me my semantics and syntax errors in
the code as colored highlights within the error area, this feature is disrupting
my educational journey, i want to see syntax and runtime errors and debug them so to
learn

also i most stop the automatic import setting !
*/
public class Representation {




    int multiAddLogic (ArrayList<Integer>  arr , int B){
        int ans =0;






        return ans;
    }
   void cutter (ArrayList<Integer> arr , double a ){

       int clone = (int) a ,x;

       double fraction  = a - clone;

           while (clone !=0){

              arr.add(clone % 10);
              clone /=10;


           }

       }





    char doubleOrInt(double a){
        int clone = (int) a;
        if (a - clone >0 ){
            return 'd';
        }
        else {
            return 'i';
        }

    }
    void representation(){
        System.out.print("The Value Positioning System for " +
                "representing numbers has an integer base and you want to convert a " +
                "number from one system (input) to other one (target) ");

        int I , O , ans =0;
        System.out.print("Enter the base of the input system :" );
        Scanner scan = new Scanner(System.in);

        I = scan.nextInt();

        System.out.println("Enter the base of the target system :" );

        O = scan.nextInt();



        System.out.println("Enter the input number : " );
        double input = scan.nextInt();

        char d = doubleOrInt(input);



        if (I == O){
            // send an error message to the user
        }
        else if (O > I){




        }
        else {

            if (d == 'd'){
                // do logic for double number
            }
            else {
                // do logic for integer number
            }




        }




        ArrayList<Integer> v = new ArrayList<>();






    }


}