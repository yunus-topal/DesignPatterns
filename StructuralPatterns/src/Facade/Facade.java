package Facade;


public class Facade {
    public int clientFunctionality1(){
        int x = ComplexLibrary.complexFunction1();
        int y = ComplexLibrary.complexFunction2();
        return y * x;
    }

    public int clientFunctionality2(){
        int x = ComplexLibrary.complexFunction9(10);
        return ComplexLibrary.complexFunction10(x);
    }

    public int[] clientFunctionality3(){
        int[] x = new int[3];
        x[0] = ComplexLibrary.complexFunction3();
        x[1] = ComplexLibrary.complexFunction5();
        x[2] = ComplexLibrary.complexFunction8();
        return x;
    }

}
