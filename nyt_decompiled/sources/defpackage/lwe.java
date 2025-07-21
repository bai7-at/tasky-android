package defpackage;

/* loaded from: classes3.dex */
public final class lwe {
    public static final lwe b = new lwe("SHA1");
    public static final lwe c = new lwe("SHA224");
    public static final lwe d = new lwe("SHA256");
    public static final lwe e = new lwe("SHA384");
    public static final lwe f = new lwe("SHA512");
    private final String a;

    private lwe(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
