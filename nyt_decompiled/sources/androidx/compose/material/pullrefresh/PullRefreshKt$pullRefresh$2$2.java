package androidx.compose.material.pullrefresh;

import defpackage.by0;
import defpackage.gt2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
/* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends AdaptedFunctionReference implements gt2 {
    PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    public final Object b(float f, by0 by0Var) {
        Object e;
        e = PullRefreshKt.e((PullRefreshState) this.receiver, f, by0Var);
        return e;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj).floatValue(), (by0) obj2);
    }
}
