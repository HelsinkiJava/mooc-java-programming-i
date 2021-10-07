
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int euroAdd = euros + addition.euros();
        int centsAdd = cents + addition.cents();
        if (centsAdd == 100) {
            centsAdd -= 100;
            euroAdd++;
        }
        return new Money(euroAdd, centsAdd);
    }

    public Money minus(Money decreaser) {
        int euroMinus = euros - decreaser.euros();
        int centsMinus = cents - decreaser.cents();
        if (centsMinus < 0) {
            centsMinus = centsMinus + 100;
            euroMinus = euroMinus - 1;
        }
        if (euroMinus < 0) {
            euroMinus = 0;
            centsMinus = 0;
        }
        return new Money(euroMinus, centsMinus);
    }

    public boolean lessThan(Money compared) {
        return ((100 * euros + cents) < (100 * compared.euros() + compared.cents()));
    }

}
