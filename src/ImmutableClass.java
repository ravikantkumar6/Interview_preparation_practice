import java.util.Date;

public final class ImmutableClass {

    private final Integer immutableInteger;
    private final String immutableString;
    private final Date immutableDate;

    private ImmutableClass(Integer immutableInteger, String immutableString, Date immutableDate) {
        this.immutableInteger = immutableInteger;
        this.immutableString = immutableString;
        this.immutableDate = new Date(immutableDate.getTime());
    }

    public static ImmutableClass createNewInstance(Integer immutableInteger, String immutableString, Date immutableDate) {
        return new ImmutableClass(immutableInteger, immutableString, immutableDate);
    }

    public Integer getImmutableInteger() {
        return immutableInteger;
    }

    public String getImmutableString() {
        return immutableString;
    }

    public Date getImmutableDate() {
        return new Date(immutableDate.getTime());
    }

    @Override
    public String toString() {
        return "ImmutableClass [immutableInteger=" + immutableInteger + ", immutableString=" + immutableString
                + ", immutableDate=" + immutableDate + "]";
    }


}
