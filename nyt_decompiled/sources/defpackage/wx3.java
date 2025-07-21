package defpackage;

/* loaded from: classes2.dex */
public final class wx3 implements em8 {
    private final xl0 a;

    public wx3(xl0 xl0Var) {
        zq3.h(xl0Var, "clock");
        this.a = xl0Var;
    }

    @Override // defpackage.em8
    public long a() {
        return this.a.b();
    }

    @Override // defpackage.em8
    public long b() {
        return System.currentTimeMillis();
    }
}
