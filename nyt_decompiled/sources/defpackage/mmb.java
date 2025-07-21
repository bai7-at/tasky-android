package defpackage;

/* loaded from: classes3.dex */
public final class mmb {
    public static final mmb b = new rkb().e();
    private static final String c = Integer.toString(0, 36);
    public static final zhf d = new zhf() { // from class: mjb
    };
    private final p0a a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mmb) {
            return this.a.equals(((mmb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
