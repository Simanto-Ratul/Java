public class MotorCycleInsurance extends Insurance{
    public MotorCycleInsurance(String policyNum,String policyHolder, double premium){
        super(policyNum, policyHolder, premium);
        }

        @Override
        public double calculateCovarage(){
            return getPremium() * 0.15;
    }
}

