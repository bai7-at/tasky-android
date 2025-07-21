package androidx.compose.foundation.lazy.layout;

import com.google.android.gms.common.ConnectionResult;
import defpackage.bu1;
import defpackage.by0;
import defpackage.fm1;
import defpackage.i04;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class LazyAnimateScrollKt {
    private static final float a = bu1.g(2500);
    private static final float b = bu1.g(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    private static final float c = bu1.g(50);

    public static final Object d(i04 i04Var, int i, int i2, int i3, fm1 fm1Var, by0 by0Var) {
        Object h = i04Var.h(new LazyAnimateScrollKt$animateScrollToItem$2(i, fm1Var, i04Var, i2, i3, null), by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    public static final boolean e(i04 i04Var, int i) {
        return i <= i04Var.e() && i04Var.c() <= i;
    }
}
