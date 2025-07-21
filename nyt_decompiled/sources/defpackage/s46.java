package defpackage;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.v48;

/* loaded from: classes.dex */
public final class s46 {
    public static final s46 a = new s46();
    private static final float b = zk0.a.b();
    private static final int c;
    private static final int d;
    private static final int e;
    private static final qz7 f;

    static {
        v48.a aVar = v48.a;
        c = aVar.a();
        d = aVar.a();
        e = aVar.c();
        f = new qz7(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private s46() {
    }

    public final long a(Composer composer, int i) {
        composer.z(1803349725);
        if (b.G()) {
            b.S(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:601)");
        }
        long j = ColorSchemeKt.j(zk0.a.a(), composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return j;
    }

    public final int b() {
        return e;
    }

    public final float c() {
        return b;
    }

    public final long d(Composer composer, int i) {
        composer.z(-404222247);
        if (b.G()) {
            b.S(-404222247, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:608)");
        }
        long f2 = nn0.b.f();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return f2;
    }
}
