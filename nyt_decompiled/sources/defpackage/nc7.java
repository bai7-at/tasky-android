package defpackage;

/* loaded from: classes.dex */
public final class nc7 {
    private final qs2 a;
    private final qs2 b;
    private final boolean c;

    public nc7(qs2 qs2Var, qs2 qs2Var2, boolean z) {
        this.a = qs2Var;
        this.b = qs2Var2;
        this.c = z;
    }

    public final qs2 a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final qs2 c() {
        return this.a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.mo865invoke()).floatValue() + ", maxValue=" + ((Number) this.b.mo865invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
