
public class Fibo {


static long fibo(int x) {
    if (x < 2) {
        return x;
    } else {
        return fibo(x - 1) + fibo(x - 2);
    }
}

public static void main(String[] args) {   

      
for (int i = 0; i < 11; i++) {
        System.out.print("(" + i + "):" + Fibo.fibo(i) + "\t");
    }

}

}