package patterns;

/**
 * @author 703238043 on Jul, 2020
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {

        this.chain = dispenseChain;

    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }

        } else {
            this.chain.dispense(currency);
        }


    }
}
