package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;

/* loaded from: classes.dex */
public interface io5 {
    static /* synthetic */ void h(io5 io5Var, ph0 ph0Var, long j, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        io5Var.w(ph0Var, (i2 & 2) != 0 ? nn0.b.g() : j, (i2 & 4) != 0 ? null : jo7Var, (i2 & 8) != 0 ? null : ph8Var, (i2 & 16) == 0 ? gv1Var : null, (i2 & 32) != 0 ? fv1.p.a() : i);
    }

    static /* synthetic */ void t(io5 io5Var, ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        io5Var.r(ph0Var, yc0Var, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : jo7Var, (i2 & 16) != 0 ? null : ph8Var, (i2 & 32) != 0 ? null : gv1Var, (i2 & 64) != 0 ? fv1.p.a() : i);
    }

    kt6 A(int i);

    List B();

    float a();

    float b();

    ResolvedTextDirection c(int i);

    float d(int i);

    kt6 e(int i);

    long f(int i);

    float g();

    float getHeight();

    float getWidth();

    int i(long j);

    int j(int i);

    int k(int i, boolean z);

    int l();

    float m(int i);

    boolean n();

    int o(float f);

    ip5 p(int i, int i2);

    float q(int i, boolean z);

    void r(ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i);

    float s(int i);

    void u(long j, float[] fArr, int i);

    float v();

    void w(ph0 ph0Var, long j, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i);

    int x(int i);

    ResolvedTextDirection y(int i);

    float z(int i);
}
