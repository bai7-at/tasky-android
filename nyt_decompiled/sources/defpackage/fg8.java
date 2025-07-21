package defpackage;

/* loaded from: classes.dex */
public final class fg8 {
    public static final fg8 e;
    public static final fg8 f;
    public static final fg8 g;
    public static final fg8 h;
    public static final fg8 i;
    public static final fg8 j;
    final float[] a;
    final float[] b;
    final float[] c = new float[3];
    boolean d = true;

    static {
        fg8 fg8Var = new fg8();
        e = fg8Var;
        m(fg8Var);
        p(fg8Var);
        fg8 fg8Var2 = new fg8();
        f = fg8Var2;
        o(fg8Var2);
        p(fg8Var2);
        fg8 fg8Var3 = new fg8();
        g = fg8Var3;
        l(fg8Var3);
        p(fg8Var3);
        fg8 fg8Var4 = new fg8();
        h = fg8Var4;
        m(fg8Var4);
        n(fg8Var4);
        fg8 fg8Var5 = new fg8();
        i = fg8Var5;
        o(fg8Var5);
        n(fg8Var5);
        fg8 fg8Var6 = new fg8();
        j = fg8Var6;
        l(fg8Var6);
        n(fg8Var6);
    }

    fg8() {
        float[] fArr = new float[3];
        this.a = fArr;
        float[] fArr2 = new float[3];
        this.b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(fg8 fg8Var) {
        float[] fArr = fg8Var.b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(fg8 fg8Var) {
        float[] fArr = fg8Var.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(fg8 fg8Var) {
        float[] fArr = fg8Var.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(fg8 fg8Var) {
        float[] fArr = fg8Var.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(fg8 fg8Var) {
        float[] fArr = fg8Var.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public float d() {
        return this.b[0];
    }

    public float e() {
        return this.a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    void k() {
        int length = this.c.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.c[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.c.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.c;
                float f4 = fArr[i3];
                if (f4 > 0.0f) {
                    fArr[i3] = f4 / f2;
                }
            }
        }
    }
}
