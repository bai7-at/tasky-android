package defpackage;

import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* loaded from: classes.dex */
public abstract class wi7 {
    private static final float a;
    private static final float b;
    private static final SemanticsPropertyKey c = new SemanticsPropertyKey("SelectionHandleInfo", null, 2, null);

    static {
        float f = 25;
        a = bu1.g(f);
        b = bu1.g(f);
    }

    public static final long a(long j) {
        return hd5.a(fd5.o(j), fd5.p(j) - 1.0f);
    }

    public static final float b() {
        return b;
    }

    public static final float c() {
        return a;
    }

    public static final SemanticsPropertyKey d() {
        return c;
    }
}
