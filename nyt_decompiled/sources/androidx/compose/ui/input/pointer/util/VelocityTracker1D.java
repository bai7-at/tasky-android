package androidx.compose.ui.input.pointer.util;

import defpackage.q91;
import defpackage.uo6;
import defpackage.y49;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class VelocityTracker1D {
    private final boolean a;
    private final Strategy b;
    private final int c;
    private final q91[] d;
    private int e;
    private final float[] f;
    private final float[] g;
    private final float[] h;

    public enum Strategy {
        Lsq2,
        Impulse
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        this.a = z;
        this.b = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = a.a[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.c = i2;
        this.d = new q91[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    private final float b(float[] fArr, float[] fArr2, int i) {
        try {
            return y49.i(fArr2, fArr, i, 2, this.h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        y49.j(this.d, i, j, f);
    }

    public final float c() {
        float f;
        float[] fArr = this.f;
        float[] fArr2 = this.g;
        int i = this.e;
        q91 q91Var = this.d[i];
        if (q91Var == null) {
            return 0.0f;
        }
        int i2 = 0;
        q91 q91Var2 = q91Var;
        while (true) {
            q91 q91Var3 = this.d[i];
            if (q91Var3 != null) {
                float b = q91Var.b() - q91Var3.b();
                float abs = Math.abs(q91Var3.b() - q91Var2.b());
                if (b > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = q91Var3.a();
                fArr2[i2] = -b;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                q91Var2 = q91Var3;
            } else {
                break;
            }
        }
        if (i2 < this.c) {
            return 0.0f;
        }
        int i3 = a.a[this.b.ordinal()];
        if (i3 == 1) {
            f = y49.f(fArr, fArr2, i2, this.a);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = b(fArr, fArr2, i2);
        }
        return f * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    }

    public final float d(float f) {
        if (f > 0.0f) {
            float c = c();
            if (c == 0.0f) {
                return 0.0f;
            }
            return c > 0.0f ? uo6.h(c, f) : uo6.c(c, -f);
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f).toString());
    }

    public final void e() {
        d.w(this.d, null, 0, 0, 6, null);
        this.e = 0;
    }

    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy);
    }
}
