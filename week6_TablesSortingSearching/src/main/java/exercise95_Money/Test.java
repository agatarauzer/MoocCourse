package exercise95_Money;

public class Test {
    public static void main(String[] args){

        /*
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
        //           is assigned to variable a.
        //       The Money object 10.00e that variable a used to hold
        //           is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        */

        /*

        Money a = new Money(10,0);
        Money b = new Money(10,2);
        Money c = new Money(5,0);

        System.out.println(a.less(b));
        System.out.println(b.less(c));

        */



        Money a = new Money(10,0);
        Money b = new Money(4,44);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e

    }


}
