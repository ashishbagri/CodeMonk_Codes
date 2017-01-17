import java.util.List;
import java.util.ArrayList;

public class MonkAndPhilospherStone {

       public static void main(String[] args) throws Exception{
             // Input can be only Even numbers.
             puzzle(1000);
             }
       public static void  puzzle( int totalNumbersCount ){

           
       }

       private static List<Integer> copyNumbers( List<Integer> numberList ){

             List<Integer> copiedNumberList = new ArrayList<Integer>();
             for ( int i=1 ; i< numberList.size(); i=i+2) {
                    copiedNumberList.add( numberList.get( i ) );
             }
             return copiedNumberList;                 
       }
               }