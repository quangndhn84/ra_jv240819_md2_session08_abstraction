package session_08_abstract;

import java.util.Scanner;

//Lớp thực thi --> Lớp trừu tượng (Abstract Class)
public abstract class AbstractionDemo {
    //Phương thức thực thi (Implement Method)
    public int sumNumbers(int firstNumber, int secondNumber) {
        //Phần thực thi của phương thức , implement block (body)
        int total = firstNumber + secondNumber;
        return total;
    }
    //Phương thức trừu tượng
    public abstract void inputData(Scanner scanner);
    public abstract void displayData();
}
