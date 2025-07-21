package defpackage;

/* loaded from: classes4.dex */
public final class xl3 implements ba2, b04 {
    private static final xl3 b = new xl3(null);
    private final Object a;

    private xl3(Object obj) {
        this.a = obj;
    }

    public static ba2 a(Object obj) {
        return new xl3(g16.c(obj, "instance cannot be null"));
    }

    @Override // defpackage.p76
    public Object get() {
        return this.a;
    }
}
