package com.nytimes.android.ribbon.composable.tabrow;

import androidx.compose.foundation.ScrollState;
import defpackage.fm1;
import defpackage.jf8;
import defpackage.uo6;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
final class ScrollableTabData {
    private final ScrollState a;
    private final CoroutineScope b;
    private Integer c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        zq3.h(scrollState, "scrollState");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = scrollState;
        this.b = coroutineScope;
    }

    private final int b(jf8 jf8Var, fm1 fm1Var, int i, List list) {
        int l0 = fm1Var.l0(((jf8) i.w0(list)).b()) + i;
        int m = l0 - this.a.m();
        return uo6.m(fm1Var.l0(jf8Var.a()) - ((m / 2) - (fm1Var.l0(jf8Var.c()) / 2)), 0, uo6.d(l0 - m, 0));
    }

    public final void c(fm1 fm1Var, int i, List list, int i2) {
        int b;
        zq3.h(fm1Var, "density");
        zq3.h(list, "tabPositions");
        Integer num = this.c;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.c = Integer.valueOf(i2);
        jf8 jf8Var = (jf8) i.n0(list, i2);
        if (jf8Var == null || this.a.n() == (b = b(jf8Var, fm1Var, i, list))) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new ScrollableTabData$onLaidOut$1$1(this, b, null), 3, null);
    }
}
