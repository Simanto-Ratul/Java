public class Insurance {
    private String policyNum;
    private String policyHolder;
    private double premium;

    public Insurance(String policyNum, String policyHolder, double premium) {
        this.policyNum = policyNum;
        this.policyHolder = policyHolder;
        this.premium = premium;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public double getPremium() {
        return premium;
    }

    public double calculteCoverage() {
        return 0.0;
    }

    public void showDetails() {
        System.out.println("Policy Number: " + getPolicyNum());
        System.out.println("Policy Holder: " + getPolicyHolder());
        System.out.println("Balnace: " + getPremium());
    }

}