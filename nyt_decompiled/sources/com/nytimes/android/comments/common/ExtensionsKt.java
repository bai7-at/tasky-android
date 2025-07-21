package com.nytimes.android.comments.common;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.paging.compose.LazyPagingItems;
import com.nytimes.android.comments.R;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.x08;
import defpackage.zq3;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final boolean isScrollingUp(final LazyListState lazyListState, Composer composer, int i) {
        zq3.h(lazyListState, "<this>");
        composer.z(-842802963);
        if (b.G()) {
            b.S(-842802963, i, -1, "com.nytimes.android.comments.common.isScrollingUp (Extensions.kt:24)");
        }
        composer.z(1447085770);
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && composer.S(lazyListState)) || (i & 6) == 4;
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = b0.e(Integer.valueOf(lazyListState.s()), null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(1447085859);
        boolean z2 = (i2 > 4 && composer.S(lazyListState)) || (i & 6) == 4;
        Object A2 = composer.A();
        if (z2 || A2 == Composer.a.a()) {
            A2 = b0.e(Integer.valueOf(lazyListState.t()), null, 2, null);
            composer.q(A2);
        }
        final sy4 sy4Var2 = (sy4) A2;
        composer.R();
        composer.z(1447085934);
        boolean z3 = (i2 > 4 && composer.S(lazyListState)) || (i & 6) == 4;
        Object A3 = composer.A();
        if (z3 || A3 == Composer.a.a()) {
            A3 = y.d(new qs2() { // from class: com.nytimes.android.comments.common.ExtensionsKt$isScrollingUp$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
                
                    if (r0 >= r1.t()) goto L6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
                
                    if (r0 > r1.s()) goto L6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
                
                    r2 = true;
                 */
                @Override // defpackage.qs2
                /* renamed from: invoke */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean mo865invoke() {
                    /*
                        r4 = this;
                        sy4 r0 = r2
                        int r0 = com.nytimes.android.comments.common.ExtensionsKt.access$isScrollingUp$lambda$1(r0)
                        androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListState.this
                        int r1 = r1.s()
                        r2 = 0
                        r3 = 1
                        if (r0 == r1) goto L20
                        sy4 r0 = r2
                        int r0 = com.nytimes.android.comments.common.ExtensionsKt.access$isScrollingUp$lambda$1(r0)
                        androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListState.this
                        int r1 = r1.s()
                        if (r0 <= r1) goto L2f
                    L1e:
                        r2 = r3
                        goto L2f
                    L20:
                        sy4 r0 = r3
                        int r0 = com.nytimes.android.comments.common.ExtensionsKt.access$isScrollingUp$lambda$4(r0)
                        androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListState.this
                        int r1 = r1.t()
                        if (r0 < r1) goto L2f
                        goto L1e
                    L2f:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                        androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListState.this
                        sy4 r2 = r2
                        sy4 r4 = r3
                        int r3 = r1.s()
                        com.nytimes.android.comments.common.ExtensionsKt.access$isScrollingUp$lambda$2(r2, r3)
                        int r1 = r1.t()
                        com.nytimes.android.comments.common.ExtensionsKt.access$isScrollingUp$lambda$5(r4, r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.common.ExtensionsKt$isScrollingUp$1$1.mo865invoke():java.lang.Boolean");
                }
            });
            composer.q(A3);
        }
        composer.R();
        boolean booleanValue = ((Boolean) ((x08) A3).getValue()).booleanValue();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int isScrollingUp$lambda$1(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isScrollingUp$lambda$2(sy4 sy4Var, int i) {
        sy4Var.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int isScrollingUp$lambda$4(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isScrollingUp$lambda$5(sy4 sy4Var, int i) {
        sy4Var.setValue(Integer.valueOf(i));
    }

    public static final String loadCommentsStringFor(Resources resources, int i) {
        zq3.h(resources, "<this>");
        String quantityString = resources.getQuantityString(R.plurals.comments_plurals, i, toUsLocale(i));
        zq3.g(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static final <T> LazyListState rememberLazyListState(LazyPagingItems lazyPagingItems, Composer composer, int i) {
        LazyListState c;
        zq3.h(lazyPagingItems, "<this>");
        composer.z(1511427395);
        if (b.G()) {
            b.S(1511427395, i, -1, "com.nytimes.android.comments.common.rememberLazyListState (Extensions.kt:42)");
        }
        if (lazyPagingItems.g() == 0) {
            composer.z(-1868005227);
            composer.z(-1868003265);
            boolean z = (((i & 14) ^ 6) > 4 && composer.S(lazyPagingItems)) || (i & 6) == 4;
            Object A = composer.A();
            if (z || A == Composer.a.a()) {
                A = new LazyListState(0, 0);
                composer.q(A);
            }
            c = (LazyListState) A;
            composer.R();
            composer.R();
        } else {
            composer.z(-1868003122);
            c = LazyListStateKt.c(0, 0, composer, 0, 3);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }

    public static final String toUsLocale(int i) {
        String format = NumberFormat.getNumberInstance(Locale.US).format(Integer.valueOf(i));
        zq3.g(format, "format(...)");
        return format;
    }
}
