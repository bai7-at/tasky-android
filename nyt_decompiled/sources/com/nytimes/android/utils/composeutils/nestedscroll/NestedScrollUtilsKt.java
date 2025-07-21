package com.nytimes.android.utils.composeutils.nestedscroll;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.fd5;
import defpackage.g35;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NestedScrollUtilsKt {
    public static final void a(NestedScrollDispatcher nestedScrollDispatcher, long j, int i, ss2 ss2Var) {
        zq3.h(nestedScrollDispatcher, "$this$dispatchScroll");
        zq3.h(ss2Var, "onNewAvailable");
        long d = nestedScrollDispatcher.d(j, i);
        long s = fd5.s(j, d);
        long x = ((fd5) ss2Var.invoke(fd5.d(s))).x();
        nestedScrollDispatcher.b(fd5.t(d, x), fd5.s(s, x), i);
    }

    public static /* synthetic */ void b(NestedScrollDispatcher nestedScrollDispatcher, long j, int i, ss2 ss2Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = g35.a.a();
        }
        if ((i2 & 4) != 0) {
            ss2Var = new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollUtilsKt$dispatchScroll$1
                public final long b(long j2) {
                    return j2;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return fd5.d(b(((fd5) obj2).x()));
                }
            };
        }
        a(nestedScrollDispatcher, j, i, ss2Var);
    }
}
