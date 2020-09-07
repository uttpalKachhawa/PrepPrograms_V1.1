package patterns;

/**
 * @author 703238043 on Jul, 2020
 */
public interface DispenseChain {


    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency currency);


}
