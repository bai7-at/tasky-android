package com.nytimes.android.fragment;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentType;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.fragment.b;
import defpackage.bu1;
import defpackage.fm1;
import defpackage.gh;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class VerticalScrollStateKt {
    public static final float a(b bVar, float f, it2 it2Var, kt2 kt2Var, Composer composer, int i) {
        zq3.h(bVar, "scrollState");
        zq3.h(it2Var, "scrollToTarget");
        zq3.h(kt2Var, "onNewTarget");
        composer.z(1404941646);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1404941646, i, -1, "com.nytimes.android.fragment.animateToolbarHeight (VerticalScrollState.kt:133)");
        }
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        composer.z(1581139013);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.b(f)) || (i & 48) == 32;
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = gh.b(f, 0.0f, 2, null);
            composer.q(A);
        }
        Animatable animatable = (Animatable) A;
        composer.R();
        composer.z(1581139093);
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.S(bVar)) || (i & 6) == 4;
        Object A2 = composer.A();
        if (z2 || A2 == Composer.a.a()) {
            A2 = bu1.d(((bu1) it2Var.invoke(bVar, bu1.d(bu1.g(((Number) animatable.m()).floatValue())), fm1Var)).n());
            composer.q(A2);
        }
        float n = ((bu1) A2).n();
        composer.R();
        py1.d(bu1.d(n), new VerticalScrollStateKt$animateToolbarHeight$1(kt2Var, bVar, animatable, n, null), composer, 64);
        float g = bu1.g(((Number) animatable.m()).floatValue());
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    public static final float b(b bVar, final float f, final float f2, final boolean z, Composer composer, int i, int i2) {
        zq3.h(bVar, "scrollState");
        composer.z(499121301);
        if ((i2 & 4) != 0) {
            f2 = bu1.g(0);
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(499121301, i, -1, "com.nytimes.android.fragment.animateToolbarHeightAlways (VerticalScrollState.kt:108)");
        }
        composer.z(1657887023);
        boolean z2 = ((((i & 7168) ^ 3072) > 2048 && composer.a(z)) || (i & 3072) == 2048) | ((((i & 896) ^ 384) > 256 && composer.b(f2)) || (i & 384) == 256);
        int i3 = i & ContentType.LONG_FORM_ON_DEMAND;
        boolean z3 = z2 | (((i3 ^ 48) > 32 && composer.b(f)) || (i & 48) == 32);
        Object A = composer.A();
        if (z3 || A == Composer.a.a()) {
            A = new it2() { // from class: com.nytimes.android.fragment.VerticalScrollStateKt$animateToolbarHeightAlways$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final float b(b bVar2, float f3, fm1 fm1Var) {
                    zq3.h(bVar2, "scrollState");
                    zq3.h(fm1Var, "<anonymous parameter 2>");
                    if (!z) {
                        return f;
                    }
                    if (bVar2 instanceof b.C0316b) {
                        return f2;
                    }
                    if (bVar2 instanceof b.d ? true : bVar2 instanceof b.c ? true : bVar2 instanceof b.a) {
                        return f;
                    }
                    throw new NoWhenBranchMatchedException();
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return bu1.d(b((b) obj, ((bu1) obj2).n(), (fm1) obj3));
                }
            };
            composer.q(A);
        }
        composer.R();
        float a = a(bVar, f, (it2) A, new VerticalScrollStateKt$animateToolbarHeightAlways$2(null), composer, (i & 14) | ProgressEvent.PART_FAILED_EVENT_CODE | i3);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a;
    }

    public static final mt2 c(final ss2 ss2Var) {
        zq3.h(ss2Var, "onScroll");
        return new mt2() { // from class: com.nytimes.android.fragment.VerticalScrollStateKt$verticalScrollListener$1
            {
                super(5);
            }

            public final void b(View view, int i, int i2, int i3, int i4) {
                zq3.h(view, QueryKeys.INTERNAL_REFERRER);
                int i5 = i2 - i4;
                ss2.this.invoke(i5 > 0 ? ViewExtensions.d(view) ? new b.C0316b(i2, i5) : new b.a(i2, i5) : ViewExtensions.e(view) ? new b.c(i2, i5) : new b.d(i2, i5));
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                return ww8.a;
            }
        };
    }
}
