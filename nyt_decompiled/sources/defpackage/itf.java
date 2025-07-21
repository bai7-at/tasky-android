package defpackage;

/* loaded from: classes3.dex */
public final class itf {
    public static final itf b = new itf("TINK");
    public static final itf c = new itf("CRUNCHY");
    public static final itf d = new itf("LEGACY");
    public static final itf e = new itf("NO_PREFIX");
    private final String a;

    private itf(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
