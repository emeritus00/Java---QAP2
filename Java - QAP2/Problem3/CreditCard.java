package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.creditLimit = limit;
        this.owner = newCardHolder;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge successful: " + amount);
        } else {
            System.out.println("Charge denied: Exceeds credit limit!");
        }
    }

    // Make a payment
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment made: " + amount);
    }

    public String toString() {
        return "CreditCard owned by: " + owner + ", Balance: " + balance + ", Credit Limit: " + creditLimit;
    }
}
