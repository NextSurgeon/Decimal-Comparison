public class DecimalComparator{
 public static boolean areEqualByThreeDecimalPlaces(double a, double b){
     int newA= (int)(a*1000);
     int newB= (int)(b*1000);
     if(newA==newB){
         return true;
     } else{
         return false;
     }
 }
