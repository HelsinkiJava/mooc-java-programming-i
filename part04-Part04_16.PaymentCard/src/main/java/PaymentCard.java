public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance - 2.60 < 0) {
            this.balance = balance;
        } else {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance - 4.60 < 0) {
            this.balance = balance;
        } else {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (balance + amount >= 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance = balance;
        } else {
            this.balance += amount;
        }
    }
}
