package session_07;

public class Demo {
    public static void main(String[] args) {
        Overloading_Demo old = new Overloading_Demo();
        old.sumNumbers(5, 7);
        old.sumNumbers(4.6F, 9.2F);
        old.sumNumbers(2, 4, 6);

        //Khởi tạo đối tượng website và cho khách hàng truy cập vào web
        //RA_Website --> static cntGuest được nạp vào staticPool với giá trị khởi tạo là 0
        RA_Website guest1 = new RA_Website();//cntGuest = 0 --> 1, thuộc tính thuộc về guest1
        guest1.visitedWebsite();//1
        RA_Website guest2 = new RA_Website();//cntGuest = 0 --> 1, thộc tính thuộc về guest2
        guest2.visitedWebsite();//2
        RA_Website guest3 = new RA_Website();//cntGuest = 0 --> 1, thuộc tính thuộc về guest3
        guest3.visitedWebsite();//3
        System.out.println(RA_Website.cntGuest);

        RA_Website raw = new RA_Website();
        raw.sumTwoNumbers(5, 7);
        RA_Website.sumTwoNumbers(5, 7);
    }
}
