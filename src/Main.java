package src;

public class Main {

    public static void main(String args[]){

        Operations obj = new Operations();

        int iRet = obj.Addition(11,21);
        System.out.println("Addition is = " + iRet);

        iRet = obj.Substraction(21,11);
        System.out.println("Substraction is = " + iRet);

        iRet = obj.Multiplication(11,10);
        System.out.println("Multiplication is = " + iRet);
    }
}
