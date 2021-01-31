package Package1;

import Package2.Parent;
import Package2.TestPack2;

public class Dispatcher extends Parent {
    public static void main(String[] args) {

        TestPack1 t1 = new TestPack1();
//        System.out.println(t1.x1); private
        System.out.println(t1.x2);
        System.out.println(t1.x3);
        System.out.println(t1.x4);

        TestPack2 t2 = new TestPack2();
//        System.out.println(t2.x1); private
//        System.out.println(t2.x2); default
//        System.out.println(t2.x3); protected
        System.out.println(t2.x4);

        Parent parent = new Parent();
//        System.out.println(parent.x1); //private
//        System.out.println(parent.x2); //default
//        System.out.println(parent.x3); //protected
       System.out.println(parent.x4);
    }
}
