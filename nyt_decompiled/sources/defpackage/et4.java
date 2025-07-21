package defpackage;

/* loaded from: classes5.dex */
public interface et4 {
    static et4 a() {
        return oi1.c();
    }

    dt4 b(String str);

    default ct4 get(String str) {
        return b(str).build();
    }
}
