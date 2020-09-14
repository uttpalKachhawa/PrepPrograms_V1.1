package patterns;

/**
 * @author uttpal on Jul, 2020
 */
public class Dollar10Dispenser implements  DispenseChain {

    public DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {

        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=10){
            int num=currency.getAmount()/10;
            int remainder=currency.getAmount()%10;
            System.out.println("Dispensing " + num + " 10$ note");
            if(remainder!=0){
                this.dispenseChain.dispense(new Currency(remainder));
            }

        }
        else {
            this.dispenseChain.dispense(currency);
        }

    }
}
