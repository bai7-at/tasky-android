package defpackage;

/* loaded from: classes3.dex */
public final class dle {
    public static final dle b = new dle("ENABLED");
    public static final dle c = new dle("DISABLED");
    public static final dle d = new dle("DESTROYED");
    private final String a;

    private dle(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
