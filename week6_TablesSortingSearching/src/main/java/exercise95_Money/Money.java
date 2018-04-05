package exercise95_Money;


public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
       Money sum = new Money(euros + added.euros, cents + added.cents);
       return sum;
    }

    public boolean less(Money compared) {
        if (euros < compared.euros)
            return true;
        if (euros == compared.euros && cents < compared.cents)
            return true;

        return false;
    }

    public Money minus(Money decremented){
        int diffCents = 0;
        int diffEuros = (euros * 100 + cents) - (decremented.euros * 100 + decremented.cents);

        if(diffEuros > 0){
            diffCents = diffEuros % 100;
            diffEuros = diffEuros / 100;
        }
        else{
            diffEuros = 0;
        }

        Money diff = new Money(diffEuros, diffCents);
        return diff;
    }
}
