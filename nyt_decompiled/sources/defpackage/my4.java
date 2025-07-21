package defpackage;

/* loaded from: classes.dex */
public final class my4 {
    private float a;
    private float b;
    private float c;
    private float d;

    public my4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.b;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean f() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final void g(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final void h(float f) {
        this.d = f;
    }

    public final void i(float f) {
        this.a = f;
    }

    public final void j(float f) {
        this.c = f;
    }

    public final void k(float f) {
        this.b = f;
    }

    public String toString() {
        return "MutableRect(" + yx2.a(this.a, 1) + ", " + yx2.a(this.b, 1) + ", " + yx2.a(this.c, 1) + ", " + yx2.a(this.d, 1) + ')';
    }
}
