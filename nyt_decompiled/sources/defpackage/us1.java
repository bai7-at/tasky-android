package defpackage;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class us1 {
    public static final us1 a = new us1();
    private static final float b = ws1.a.b();

    private us1() {
    }

    public final long a(Composer composer, int i) {
        composer.z(77461041);
        if (b.G()) {
            b.S(77461041, i, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:115)");
        }
        long j = ColorSchemeKt.j(ws1.a.a(), composer, 6);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return j;
    }

    public final float b() {
        return b;
    }
}
