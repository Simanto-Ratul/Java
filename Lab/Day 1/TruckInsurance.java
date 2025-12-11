public class TruckInsurance extends Insurance{
    public TruckInsurance(String policyNum,String policyHolder, double premium){
        super( policyNum, policyHolder,  premium);
    }

    @Override
        public double calculateCovarage(){
            return getPremium() * 0.1;
        }
}

