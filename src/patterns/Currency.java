package patterns;

/**
 * @author 703238043 on Jul, 2020
 */
public class Currency {
    private int amount;

    public  Currency(){
        System.out.println("Currency amount = " + amount);
    }

    public Currency(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "amount=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
