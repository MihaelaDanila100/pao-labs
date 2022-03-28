/*
    - Tablourile au lungime fixata la creare (care poate fi accesata prin variabila length)
    - Tablourile sunt indexate
    - Sort -> metoda care sorteaza tabloul ascendent
    - Equals -> testarea egalitatii a 2 tablouri
    - binarySearch -> cautarea binara a unei valori in tablou
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        exercitiul1();

    }

    public static void exercitiul1(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    private static int compara(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static void exercitiul2(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(compara(a, b));
    }

    private static long factorial(int a){
        long f = 1;
        for(int i = 2; i <= a; i++){
            f *= i;
        }
        return f;
    }

    public static void exercitiul3(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(factorial(x));
    }

    private static long mul35(int n){
        long s = 0;

        for(int i = 15; i <= n; i += 15){
            s = s + i;
        }

        return s;
    }

    public static void exercitiul4(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(mul35(x));
    }

    private static void afisVector(List<Integer> vector){
        for(ListIterator<Integer> iter = vector.listIterator(); iter.hasNext(); ){
            Integer a = iter.next();
            System.out.println(a);
        }
    }

    public static void exercitiul5(){
        Scanner sc = new Scanner(System.in);

        Integer arr[] = {};
        List<Integer> pare = new ArrayList<Integer>(Arrays.asList(arr));
        List<Integer> impare = new ArrayList<Integer>(Arrays.asList(arr));
        int x = sc.nextInt();

        for(int i = 0; i <= x; i++){
            if(i % 2 == 0){
                pare.add(i);
            }else{
                impare.add(i);
            }
        }
        System.out.println("Numere pare: ");
        afisVector(pare);
        System.out.println("Numere impare: ");
        afisVector(impare);
    }

    public static void exercitiul6(){
        Scanner sc = new Scanner(System.in);

        float media = 0;
        Integer arr[] = {};
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(arr));

        int x = sc.nextInt();

        while(x != -1){
            numbers.add(x);
            media += x;
            x = sc.nextInt();
        }

        media = media / numbers.size();

        System.out.println(media);
    }

    public static void exercitiul7(){
        Scanner sc = new Scanner(System.in);
        int f1 = 0, f2 = 1, fn = 0;

        int n = sc.nextInt();

        while( n != 0){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            n = n - 1;
        }

        System.out.println(fn);
    }
}
