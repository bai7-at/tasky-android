package defpackage;

/* loaded from: classes3.dex */
public final class xme {
    public static final xme b = new xme("SHA1");
    public static final xme c = new xme("SHA224");
    public static final xme d = new xme("SHA256");
    public static final xme e = new xme("SHA384");
    public static final xme f = new xme("SHA512");
    private final String a;

    private xme(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
