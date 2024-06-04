package bg.smg;

public class Test1 {

    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    // Case 3: Static blocks
    // static initialization block
    {
        i = 10;
        System.out.println("static block called ");
    }

    // instance initialization block
    {
        j=2;
        System.out.println("int");
    }

    // Constructor calling
    Test1() { System.out.println("Constructor called"); }
}