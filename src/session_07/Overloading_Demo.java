package session_07;

public class Overloading_Demo {
    //Phương thức 1
    public int sumNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //Phuơng thức 2 là phương thức nạp chồng của phương thức 1
    public float sumNumbers(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }
    //Phương thức 3 là phương thức nạp chồng của phương thức 1 và phương thức 2
    public int sumNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public void test(int number, String str){

    }

    public void test(String str, int number){

    }
}
