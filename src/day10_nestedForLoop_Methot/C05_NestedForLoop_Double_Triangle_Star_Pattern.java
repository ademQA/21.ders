package day10_nestedForLoop_Methot;

public class C05_NestedForLoop_Double_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int number=5;
      for (int i = 1; i <=number ; i++) {
        for (int j = 1; j <=i; j++) {
        System.out.print("*"+" ");
          }
          System.out.println(" ");
     }
        for (int k = number-1; k >=1 ; k--) {
            for (int l = 1; l <=k; l++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
