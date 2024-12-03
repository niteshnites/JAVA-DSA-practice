package java_8;

public class CallingDefaultStaticClass implements DefaultStaticMethods {
    public static void main(String[] args) {
        CallingDefaultStaticClass call = new CallingDefaultStaticClass();
        call.fun();
        call.show();
        call.showAgain();
        DefaultStaticMethods.staticMethod();
    }
    public void fun(){
        show();
    }
}
