package defpackage;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class f35 {
    private static final float e(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int f(float f) {
        return ((int) e(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(long j) {
        int i = Math.abs(fd5.o(j)) >= 0.5f ? 1 : 0;
        return Math.abs(fd5.p(j)) >= 0.5f ? i | 2 : i;
    }

    public static final d35 h(View view, Composer composer, int i, int i2) {
        composer.z(1075877987);
        if ((i2 & 1) != 0) {
            view = (View) composer.m(AndroidCompositionLocals_androidKt.k());
        }
        if (b.G()) {
            b.S(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        composer.z(1157296644);
        boolean S = composer.S(view);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new e35(view);
            composer.q(A);
        }
        composer.R();
        e35 e35Var = (e35) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e35Var;
    }

    private static final float i(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(int[] iArr, long j) {
        return hd5.a(fd5.o(j) >= 0.0f ? uo6.h(i(iArr[0]), fd5.o(j)) : uo6.c(i(iArr[0]), fd5.o(j)), fd5.p(j) >= 0.0f ? uo6.h(i(iArr[1]), fd5.p(j)) : uo6.c(i(iArr[1]), fd5.p(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i) {
        return !g35.e(i, g35.a.a()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f) {
        return f * (-1.0f);
    }
}
