package defpackage;

/* loaded from: classes.dex */
public final class wm2 {
    public static final wm2 a;
    private static volatile py7 b;
    private static final Object[] c;
    private static float d;
    public static final int e;

    static {
        wm2 wm2Var = new wm2();
        a = wm2Var;
        b = new py7(0, 1, null);
        Object[] objArr = new Object[0];
        c = objArr;
        d = 1.05f;
        synchronized (objArr) {
            wm2Var.h(b, 1.15f, new xm2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            wm2Var.h(b, 1.3f, new xm2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            wm2Var.h(b, 1.5f, new xm2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            wm2Var.h(b, 1.8f, new xm2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            wm2Var.h(b, 2.0f, new xm2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            ww8 ww8Var = ww8.a;
        }
        float e2 = wm2Var.e(b.h(0)) - 0.02f;
        d = e2;
        if (e2 <= 1.0f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        e = 8;
    }

    private wm2() {
    }

    private final vm2 a(vm2 vm2Var, vm2 vm2Var2, float f) {
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i = 0; i < 9; i++) {
            float f2 = fArr[i];
            fArr2[i] = jg4.a.b(vm2Var.b(f2), vm2Var2.b(f2), f);
        }
        return new xm2(fArr, fArr2);
    }

    private final vm2 c(float f) {
        return (vm2) b.e(d(f));
    }

    private final int d(float f) {
        return (int) (f * 100.0f);
    }

    private final float e(int i) {
        return i / 100.0f;
    }

    private final void g(float f, vm2 vm2Var) {
        synchronized (c) {
            py7 clone = b.clone();
            a.h(clone, f, vm2Var);
            b = clone;
            ww8 ww8Var = ww8.a;
        }
    }

    private final void h(py7 py7Var, float f, vm2 vm2Var) {
        py7Var.i(d(f), vm2Var);
    }

    public final vm2 b(float f) {
        if (!f(f)) {
            return null;
        }
        vm2 c2 = a.c(f);
        if (c2 != null) {
            return c2;
        }
        int f2 = b.f(d(f));
        if (f2 >= 0) {
            return (vm2) b.n(f2);
        }
        int i = -(f2 + 1);
        int i2 = i - 1;
        if (i2 < 0 || i >= b.m()) {
            xm2 xm2Var = new xm2(new float[]{1.0f}, new float[]{f});
            g(f, xm2Var);
            return xm2Var;
        }
        vm2 a2 = a((vm2) b.n(i2), (vm2) b.n(i), jg4.a.a(0.0f, 1.0f, e(b.h(i2)), e(b.h(i)), f));
        g(f, a2);
        return a2;
    }

    public final boolean f(float f) {
        return f >= d;
    }
}
