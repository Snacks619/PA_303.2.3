

public class Main2 {
    public static void main(String[] args){
        int x = 7;
        int y = 17;
        int z =   x & y;
        System.out.println(z);

        z = x ^ y;
        System.out.println(z);


        int one = 1;
        System.out.println(one);
        ++one;


        int increment = 1;
        increment++;
        ++increment;
        increment = increment + 1;
        System.out.println(increment);

        y =8;
        x = 5;
        int sum = x + y;

        int sum2 = y + x++;
        System.out.println(sum2);

    }
}
