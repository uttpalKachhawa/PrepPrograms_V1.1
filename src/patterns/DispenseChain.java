package patterns;

/**
 * @author uttpal on Jul, 2020
 */
public interface DispenseChain {


    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency currency);


}
