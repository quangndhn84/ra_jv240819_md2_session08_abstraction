package session_07;

public class RA_Website {
    protected static int cntGuest = 0;

    public int getCntGuest() {
        return cntGuest;
    }

    public void setCntGuest(int cntGuest) {
        this.cntGuest = cntGuest;
    }

    public void visitedWebsite() {
        cntGuest++;
        System.out.println("Số lượng truy cập hiện tại là: " + cntGuest);
    }

    public static int sumTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
