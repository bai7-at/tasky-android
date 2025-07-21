package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class uv7 {
    public static final uv7 a = new uv7();
    public static final int b = 0;

    private uv7() {
    }

    public final long a(Composer composer, int i) {
        composer.z(1630911716);
        if (b.G()) {
            b.S(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:202)");
        }
        ag4 ag4Var = ag4.a;
        long g = wn0.g(nn0.r(ag4Var.a(composer, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), ag4Var.a(composer, 6).n());
        if (b.G()) {
            b.R();
        }
        composer.R();
        return g;
    }

    public final long b(Composer composer, int i) {
        long k;
        composer.z(-810329402);
        if (b.G()) {
            b.S(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:222)");
        }
        ro0 a2 = ag4.a.a(composer, 6);
        if (a2.o()) {
            k = wn0.g(nn0.r(a2.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), a2.j());
        } else {
            k = a2.k();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return k;
    }
}
