/**
 * Created by Yura on 17.12.13.
 */
public class MyClass {

    public MyClass(int e){}
    public MyClass(){}

    public int sum(int a){
        int result=a*a;
        return result;
    }
    public int sum(int a, int b){
        int res=a*a/b;
        return res;
    }
    public void sum(){
        System.out.println("без параметров");
    }
    public void sum(String str){
        System.out.println(str);
    }
}
