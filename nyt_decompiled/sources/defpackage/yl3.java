package defpackage;

/* loaded from: classes2.dex */
public final class yl3 implements ca2 {
    private static final yl3 b = new yl3(null);
    private final Object a;

    private yl3(Object obj) {
        this.a = obj;
    }

    public static ca2 a(Object obj) {
        return new yl3(a16.c(obj, "instance cannot be null"));
    }

    @Override // defpackage.p76
    public Object get() {
        return this.a;
    }
}
