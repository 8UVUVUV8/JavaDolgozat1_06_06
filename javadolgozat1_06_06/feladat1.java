
package javadolgozat1_06_06;

public class feladat1 {
    static float haromszog(int Aoldal, int Boldal) {
    int res;
    int Apow;
    int Bpow;
        
    Apow=(int) Math.pow(Aoldal, 2);
    Bpow=(int) Math.pow(Boldal, 2);
    res=Apow+Bpow;
        return (float) Math.sqrt(res);
  }
}
