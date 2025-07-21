package defpackage;

/* loaded from: classes.dex */
public final class o54 {
    private final Object a;
    private final Object b;

    public o54(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean a() {
        return this.b != l12.a;
    }

    public final boolean b() {
        return this.a != l12.a;
    }

    public final Object c() {
        return this.b;
    }

    public final Object d() {
        return this.a;
    }

    public final o54 e(Object obj) {
        return new o54(this.a, obj);
    }

    public final o54 f(Object obj) {
        return new o54(obj, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o54() {
        /*
            r1 = this;
            l12 r0 = defpackage.l12.a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o54.<init>():void");
    }

    public o54(Object obj) {
        this(obj, l12.a);
    }
}
