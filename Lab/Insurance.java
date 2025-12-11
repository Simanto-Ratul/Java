public class Insurance {
    private String policyNum;
    private String policyHolder;
    private double premium;

    public Insurance(String policyNum,String policyHolder, double premium){
        this.policyNum = policyNum;
        this.policyHolder = policyHolder;
        this.premium = premium;
    }

    public String getPolicyNum(){
        return policyNum;
    }

    public String getPolicyHolder(){
        return policyHolder;
    }

    public double getPremium(){
        return premium;
    }

    public double calculateCovarage(){
        return 0.0;
    }

    public void renewPolicy(){
        System.out.println(getPolicyNum()+" renewed.");
    }

    public void displayPolicy(){
        System.out.println("Policy Holder Name: "+ getPolicyHolder());
        System.out.println("Policy Number: "+getPolicyNum());
    }
}
