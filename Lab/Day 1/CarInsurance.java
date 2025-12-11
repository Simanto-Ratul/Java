public class CarInsurance extends Insurance{
    public CarInsurance(String policyNum,String policyHolder, double premium){
        super( policyNum, policyHolder,  premium);
    }

    @Override
        public double calculateCovarage(){
            return getPremium() * 0.2;
        }
}
