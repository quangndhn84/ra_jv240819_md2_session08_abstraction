package session_07;

import java.util.Scanner;

public class Person {
    private int personId;
    private String fullName;
    private int age;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(int personId, String fullName, int age, String address) {
        this.personId = personId;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputDataPerson(Scanner scanner) {
        System.out.println("Nhập vào mã người:");
        this.personId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên người:");
        this.fullName = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.address = scanner.nextLine();
    }

    public void displayDataPerson() {
        System.out.printf("Mã: %d - Tên: %s - Tuổi: %d - Địa chỉ: %s\n",
                this.personId, this.fullName, this.age, this.address);
    }
}
