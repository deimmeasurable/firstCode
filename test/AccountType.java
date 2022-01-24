public enum AccountType{
    SAVING(0.5),
    CURRENT(0.6),
    TEENS(2.3);

    private final double interestRate;

   AccountType(Double interestRate){
       this.interestRate = interestRate;
   }

    public  double getInterestRate() {
        return interestRate;
    }


    }


