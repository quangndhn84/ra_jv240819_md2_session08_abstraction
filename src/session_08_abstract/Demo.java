package session_08_abstract;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng gián tiếp từ lớp trừu tượng
        AbstractionDemo abstractionDemo = new AbstractionDemo() {
            @Override
            public void inputData(Scanner scanner) {
                System.out.println("Triển khai phương thức trừu tượng inputData được khai báo trong lớp AbstractionDemo");
            }

            @Override
            public void displayData() {
                System.out.println("Triển khai phương thức trừu tượng displayData được khai báo trong lớp AbstractionDemo");
            }
        };
    }
}
