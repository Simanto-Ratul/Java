public class CarInsurance extends Insurance {
    private String phoneNum;

    public CarInsurance(String policyNum, String policyHolder, double premium, String phoneNum) {
        super(policyNum, policyHolder, premium);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public double calculteCoverage() {
        return getPremium() * 0.2;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Phone Number: " + getPhoneNum());
        System.out.println("Coverage: " + calculteCoverage());
    }
}
