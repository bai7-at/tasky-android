package defpackage;

import android.content.Context;
import android.graphics.Color;

/* loaded from: classes3.dex */
public class az1 {
    private static final int f = (int) Math.round(5.1000000000000005d);
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;

    public az1(Context context) {
        this(if4.b(context, lc6.elevationOverlayEnabled, false), qf4.b(context, lc6.elevationOverlayColor, 0), qf4.b(context, lc6.elevationOverlayAccentColor, 0), qf4.b(context, lc6.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i) {
        return qo0.p(i, 255) == this.d;
    }

    public float a(float f2) {
        if (this.e <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        int i2;
        float a = a(f2);
        int alpha = Color.alpha(i);
        int j = qf4.j(qo0.p(i, 255), this.b, a);
        if (a > 0.0f && (i2 = this.c) != 0) {
            j = qf4.i(j, qo0.p(i2, f));
        }
        return qo0.p(j, alpha);
    }

    public int c(int i, float f2) {
        return (this.a && f(i)) ? b(i, f2) : i;
    }

    public int d(float f2) {
        return c(this.d, f2);
    }

    public boolean e() {
        return this.a;
    }

    public az1(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
