
package javadolgozat1_06_06;

public class feladat2 {
    static void fela2(String[] args){
    int size = args.length;
        if (size>2)
        {
         int [] intArray = new int [size];
         for(int i=0; i<size; i++) {
         intArray[i] = Integer.parseInt(args[i]);
         }
        int n=intArray[0]-1;
        int a=intArray[1];
        int q=intArray[2];
        int res;
        q=(int) Math.pow(q, n);
        res=a*q;
            System.out.println("feladat 2: "+res);
        }else{
            System.out.println("Nincs elég paraméter az argumentumokban");
        }
    }
}
