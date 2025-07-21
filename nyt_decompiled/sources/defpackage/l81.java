package defpackage;

/* loaded from: classes4.dex */
public final class l81 {
    private final int a;

    public l81(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l81) && this.a == ((l81) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return "DailyFiveQueryParams(numberOfItems=" + this.a + ")";
    }
}
