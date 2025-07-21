package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Composer;
import defpackage.jl3;
import defpackage.ll3;
import defpackage.u39;
import defpackage.zg;

/* loaded from: classes.dex */
public abstract class p {
    public static final u39 a(jl3 jl3Var, String str) {
        return new u39(d(jl3Var), str);
    }

    public static final o b(o.a aVar, Composer composer, int i) {
        composer.z(-675090670);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        zg e = WindowInsetsHolder.x.c(composer, 8).e();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return e;
    }

    public static final o c(o.a aVar, Composer composer, int i) {
        composer.z(-282936756);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        zg f = WindowInsetsHolder.x.c(composer, 8).f();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return f;
    }

    public static final ll3 d(jl3 jl3Var) {
        return new ll3(jl3Var.a, jl3Var.b, jl3Var.c, jl3Var.d);
    }
}
