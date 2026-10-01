import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Linear {

    public class Matrix <A>{


        
        Matrix <A>  makeEchelon (Matrix <A>  m){
            Matrix <A>  M = new Matrix <A> ();
            /*
            put here logic that makes the Echelon 
             */
            
            return M; 
        }
        
        Matrix <A> makeReducedEchelon(Matrix <A> m){
            Matrix <A> M = new Matrix <A>(); 
            /*
            put here logic that makes the reduced Echelon form 
             */
            
            return M; 
        }
        
        long getA_Rank(Matrix <A> m){
            long r =0; 
            /*
            put here logic that computes the rank
             */
            return r; 
        }

        long getAB_Rank(Matrix <A> m){
            long r =0; 
            /*
            put here logic that computes the rank
             */
            return r;
        }
        
        boolean isSquared(Matrix <A> m){
            boolean b ; 
            /*
            put here logic 
             */
            return b; 
        }
        
        ArrayList <A> getDiagonal (Matrix <A> m){
            ArrayList<A> a = new ArrayList<>();
            
            /* 
            put here logic 
             */
            return a; 
        }


        
       






    }

    public class System {
        // NO of equations
        long n;

/*
given a system of linear equations in which some coefficients of some variables are unknown
and we are asked to figure out a value for the unknown such that the system becomes
either consistent with full information representing the equations of the uniques solution
or without full information representing the set of all possible solutions (infinite solutions )
or the value or the set of values that shall make the system inconsistent , how to translate all
of this to code?

 */


        // draws the lines of the equations of a given system of linear equations
        void drawGraphS(System){

        }

        boolean checkConsistency(System S) {

            boolean C;
        /*

you can know it just from the pattern of the Matrix <A> but i need to understand why that works
         */


            return C;
        }




    }



        public class Equation {



            // NO of variables and value of the constant of an equation
            long n , constant;
            // Each variable has a symbol and a coefficient , hence, it is represented by a pair of char and long

            public class pair<A, B> {
                A first;
                B second;

                pair(A first, B second) {

                    this.first = first;
                    this.second = second;
                }
            }

            ArrayList<pair> variables = new ArrayList<pair>();

            pair<Character, Long> variable;


            void drawGraph(Equation E) {
            /*
            there will be GUI logic here
             */

            }

            boolean checkDegree(Equation E) {


                boolean b;


                return b;
            }

            ;


            Equation buildEquationFromMatrix <A>(long[][] Matrix <A>) {
                Equation E;

                return E;
            }




    }

    void addingMatrices(){

    };
    void multiplicationMatrices(){

    }



}

void main() {

   /* i want this program to be with a GUI not just console based and for it to be as much
    as user-friendly

    */









}
