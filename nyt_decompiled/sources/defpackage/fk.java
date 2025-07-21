package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.AppBarKt;

/* loaded from: classes.dex */
public final class fk {
    public static final fk a = new fk();
    private static final float b = bu1.g(4);
    private static final float c = bu1.g(8);
    private static final ym5 d;

    static {
        float f;
        float f2;
        f = AppBarKt.b;
        f2 = AppBarKt.b;
        d = PaddingKt.e(f, 0.0f, f2, 0.0f, 10, null);
    }

    private fk() {
    }

    public final ym5 a() {
        return d;
    }

    public final float b() {
        return b;
    }
}
