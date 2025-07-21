package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;

/* loaded from: classes.dex */
public abstract class gh {
    private static final ii a = ni.a(Float.POSITIVE_INFINITY);
    private static final ji b = ni.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final ki c = ni.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final li d = ni.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final ii e = ni.a(Float.NEGATIVE_INFINITY);
    private static final ji f = ni.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final ki g = ni.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final li h = ni.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Animatable a(float f2, float f3) {
        return new Animatable(Float.valueOf(f2), VectorConvertersKt.d(wk2.a), Float.valueOf(f3), null, 8, null);
    }

    public static /* synthetic */ Animatable b(float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f3 = 0.01f;
        }
        return a(f2, f3);
    }
}
