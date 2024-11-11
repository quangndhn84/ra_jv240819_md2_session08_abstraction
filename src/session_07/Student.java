package session_07;

import java.util.Scanner;

public class Student extends Person {
    //- Lớp Student được thừa hưởng tất cả các thuộc tính (attributes), hành vi (method), constructors của lớp Person
    //- Có thêm các thuộc tính riêng của nó
    private float mark;
    private boolean sex;

    //- Có thêm các constructor riêng của nó
    public Student() {
    }

    public Student(int personId, String fullName, int age, String address, float mark, boolean sex) {
        super(personId, fullName, age, address);
        this.mark = mark;
        this.sex = sex;
    }

    //- Có các phương thức riêng của nó
    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void inputDataStudent(Scanner scanner) {
        //- Nhập đầy đủ thông tin cho sinh viên: mã, tên, tuổi, địa chỉ, điểm, giới tính
        super.inputDataPerson(scanner);
        System.out.println("Nhập vào điểm sinh viên:");
        this.mark = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayDataStudent() {
        //In thông tin sinh viên: mã, tên, tổi, địa chỉ, điểm, giới tính
        super.displayDataPerson();
        System.out.printf("Điểm: %f - Giới tính: %s\n",
                this.mark, this.sex ? "Nam" : "Nữ");
        super.getPersonId();
    }
}
