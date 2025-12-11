public class Customer {
    private String phoneNum;
    private Account acc;

    public Customer() {

    }

    public Customer(String phoneNum, Account acc) {
        this.phoneNum = phoneNum;
        this.acc = acc;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Account getAcc() {
        return acc;
    }

    public void showDetails(){
        acc.showDetails();
        System.out.println("Phone Number: " + getPhoneNum());
    }
}
