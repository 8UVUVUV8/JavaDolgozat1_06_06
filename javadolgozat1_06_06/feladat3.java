
package javadolgozat1_06_06;

public class feladat3 {
    static int valami(String[] args) {
      int xTimes;
      int res=0;
      int size = args.length;
      int [] intArray = new int [size];
      for(int i=0; i<size; i++) {
          intArray[i] = Integer.parseInt(args[i]);
      }
      xTimes=intArray[0];
        if (xTimes<=size-1) {
          for (int i = 1; i < xTimes+1; i++){
              res+=intArray[i];
          }
          return res;
        }else{
            System.out.println("feladat2 : nincs elég paraméter ehez a feladathoz");
            return res;
        }   
  }
}
