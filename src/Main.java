

public class Main {
    public static void main(String[] args) {

        int variable = 2;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable = 9;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable = 17;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));
        variable =88;
        System.out.println(Integer.toBinaryString(variable));
        variable = variable << 1;
        System.out.println(Integer.toBinaryString(variable));


        int variable2 = 150;
        
        System.out.println("Gimme space");
        int x  = 150;
        System.out.println(Integer.toBinaryString(x));
        x =  x >> 2;
        System.out.println(Integer.toBinaryString(x));


        x = 225;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));

        x = 1555;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));


        x = 32456;
        x = x >> 2;
        System.out.println(Integer.toBinaryString(x));



    }
}