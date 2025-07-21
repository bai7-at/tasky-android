package defpackage;

import androidx.compose.runtime.b0;

/* loaded from: classes2.dex */
public final class mv7 {
    private final sy4 a = b0.e(0, null, 2, null);
    private final sy4 b;
    private final sy4 c;
    private final sy4 d;
    private final sy4 e;

    public mv7() {
        Float valueOf = Float.valueOf(0.0f);
        this.b = b0.e(valueOf, null, 2, null);
        this.c = b0.e(valueOf, null, 2, null);
        this.d = b0.e(valueOf, null, 2, null);
        this.e = b0.e(valueOf, null, 2, null);
    }

    public final float a() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final int c() {
        return ((Number) this.a.getValue()).intValue();
    }

    public final float d() {
        return ((Number) this.d.getValue()).floatValue();
    }

    public final float e() {
        return ((Number) this.b.getValue()).floatValue();
    }

    public final void f(float f) {
        this.e.setValue(Float.valueOf(f));
    }

    public final void g(float f) {
        this.c.setValue(Float.valueOf(f));
    }

    public final void h(int i) {
        this.a.setValue(Integer.valueOf(i));
    }

    public final void i(float f) {
        this.d.setValue(Float.valueOf(f));
    }

    public final void j(float f) {
        this.b.setValue(Float.valueOf(f));
    }
}
