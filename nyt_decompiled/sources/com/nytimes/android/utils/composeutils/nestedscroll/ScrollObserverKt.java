package com.nytimes.android.utils.composeutils.nestedscroll;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bu1;
import defpackage.fm1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ScrollObserverKt {
    public static final Modifier a(Modifier modifier, final ScrollObserver scrollObserver) {
        zq3.h(modifier, "<this>");
        zq3.h(scrollObserver, "scrollObserver");
        return b.a(modifier, new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserverKt$offsetToolTip$1
            {
                super(1);
            }

            public final void b(c cVar) {
                zq3.h(cVar, "$this$graphicsLayer");
                cVar.g(ScrollObserver.this.f());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return ww8.a;
            }
        });
    }

    public static final Modifier b(Modifier modifier, final ScrollObserver scrollObserver) {
        zq3.h(modifier, "<this>");
        zq3.h(scrollObserver, "scrollObserver");
        return b.a(modifier, new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserverKt$offsetToolbar$1
            {
                super(1);
            }

            public final void b(c cVar) {
                zq3.h(cVar, "$this$graphicsLayer");
                cVar.g(ScrollObserver.this.h());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return ww8.a;
            }
        });
    }

    public static final ScrollObserver c(float f, float f2, Composer composer, int i, int i2) {
        composer.z(1726389158);
        if ((i2 & 2) != 0) {
            f2 = bu1.g(20);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1726389158, i, -1, "com.nytimes.android.utils.composeutils.nestedscroll.rememberToolbarScrollObserver (ScrollObserver.kt:62)");
        }
        float l0 = ((fm1) composer.m(CompositionLocalsKt.e())).l0(f);
        float l02 = ((fm1) composer.m(CompositionLocalsKt.e())).l0(f2);
        composer.z(-1084184802);
        boolean b = composer.b(l0) | composer.b(l02);
        Object A = composer.A();
        if (b || A == Composer.a.a()) {
            A = new ScrollObserver(l0, l02);
            composer.q(A);
        }
        ScrollObserver scrollObserver = (ScrollObserver) A;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return scrollObserver;
    }
}
