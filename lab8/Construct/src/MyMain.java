/**
 * Created by Yura on 17.12.13.
 */
public class MyMain {
    public static void main(String [] args){
        MyClass Ob=new MyClass();
        int res1=Ob.sum(6);
        System.out.println("res1 = "+res1);
        int res2=Ob.sum(7, 2);
        System.out.println("res2 = "+res2);
        Ob.sum("Вывод результата типа string");
        Ob.sum();

        //MyClass newObject = new MyClass(5, 9);
        MyClass newObject2 = new MyClass(5);
    }
}
