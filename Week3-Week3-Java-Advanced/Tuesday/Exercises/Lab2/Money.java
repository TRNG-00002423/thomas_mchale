import java.util.Objects;

/**
 * TODO: immutable currency + amountMinor; equals/hashCode contract.
 */
public final class Money {
    private final String currency;
    private final long amountMinor;

    public Money(String currency, long amountMinor)
    {
        this.currency = currency;
        this.amountMinor = amountMinor;
    }

    public String getCurrency() {
        return currency;
    }

    public long getAmountMinor() {
        return amountMinor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
        return false;
        }

        Money money = (Money) o;

        return amountMinor == money.amountMinor && 
           Objects.equals(currency, money.currency);
    }
        

    @Override
    public int hashCode() {
        return Objects.hash(currency, amountMinor);
    }

    @Override
    public String toString() {
        return "Currency: " + currency + "amountMinor: " + amountMinor;
    }
}