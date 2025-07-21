package androidx.compose.ui.layout;

import defpackage.ba3;
import defpackage.fb;

/* loaded from: classes.dex */
public abstract class AlignmentLineKt {
    private static final ba3 a = new ba3(AlignmentLineKt$FirstBaseline$1.a);
    private static final ba3 b = new ba3(AlignmentLineKt$LastBaseline$1.a);

    public static final ba3 a() {
        return a;
    }

    public static final ba3 b() {
        return b;
    }

    public static final int c(fb fbVar, int i, int i2) {
        return ((Number) fbVar.a().invoke(Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}
