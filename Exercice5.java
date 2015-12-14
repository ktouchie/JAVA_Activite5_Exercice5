import java.util.*;
class Exercice5 {
    
    public static void main(String [] args) {  

        int a[] = {2,5,3,1,4,-7,6};
        boolean order = true;
        
        for (int i=0; i<(a.length-1); i++) {
            if (a[i+1]>=a[i]) {
            order = false;
            break;
            }
        }
        System.out.println(order);
    }
}