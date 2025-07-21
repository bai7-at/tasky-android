package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import defpackage.fm1;
import defpackage.kf8;
import defpackage.uo6;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class ScrollableTabData {
    private final ScrollState a;
    private final CoroutineScope b;
    private Integer c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        this.a = scrollState;
        this.b = coroutineScope;
    }

    private final int b(kf8 kf8Var, fm1 fm1Var, int i, List list) {
        int l0 = fm1Var.l0(((kf8) kotlin.collections.i.w0(list)).b()) + i;
        int m = l0 - this.a.m();
        return uo6.m(fm1Var.l0(kf8Var.a()) - ((m / 2) - (fm1Var.l0(kf8Var.c()) / 2)), 0, uo6.d(l0 - m, 0));
    }

    public final void c(fm1 fm1Var, int i, List list, int i2) {
        int b;
        Integer num = this.c;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.c = Integer.valueOf(i2);
        kf8 kf8Var = (kf8) kotlin.collections.i.n0(list, i2);
        if (kf8Var == null || this.a.n() == (b = b(kf8Var, fm1Var, i, list))) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new ScrollableTabData$onLaidOut$1$1(this, b, null), 3, null);
    }
}
