package session_08_abstract;

import java.util.Scanner;

public interface IDemoInterface1 {
    //Trước Java-8 chỉ gồm các phương thức trừu tượng và hằng số --> trừu tượng hoàn toàn (100% trừu tượng)
    //1. Các bổ từ truy cập trong interface mặc định là public
    //2. Các thuộc tính khai báo trong interface mặc định là public static final (hằng số)
    //3. Các phương thức trong interface mặc định là public abstract (phương thức trừu tượng)
    //Khai báo thuộc tính
    public static final float PI = 3.14F;
    float MARK_PASS = 5;

    //Khai báo các phương thức
    public abstract void inputData(Scanner scanner);

    void displayData();
}
