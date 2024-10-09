package Problem3;

public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount){
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money other){
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Adds two Money objects
    public Money add(Money otherAmount){
        long totalCents = ((this.dollars * 100) + this.cents) + ((otherAmount.dollars * 100) + otherAmount.cents);
        return new Money(totalCents / 100);
    }

    // Subtracts two Money objects
    public Money subtract(Money otherAmount){
        long totalCents = ((this.dollars * 100) + this.cents) - ((otherAmount.dollars * 100) + otherAmount.cents);
        return new Money(totalCents / 100);
    }

    // Compare two Money objects
    public int compareTo(Money otherAmount){
        return Long.compare(((this.dollars * 100) - this.cents), ((otherAmount.dollars * 100) + otherAmount.cents));
    }

    // Check if two Money objects are equal
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

}
