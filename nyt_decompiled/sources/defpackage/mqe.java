package defpackage;

/* loaded from: classes3.dex */
public final class mqe {
    public static final mqe b = new mqe("ASSUME_AES_GCM");
    public static final mqe c = new mqe("ASSUME_XCHACHA20POLY1305");
    public static final mqe d = new mqe("ASSUME_CHACHA20POLY1305");
    public static final mqe e = new mqe("ASSUME_AES_CTR_HMAC");
    public static final mqe f = new mqe("ASSUME_AES_EAX");
    public static final mqe g = new mqe("ASSUME_AES_GCM_SIV");
    private final String a;

    private mqe(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
