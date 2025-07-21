package com.google.accompanist.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import defpackage.ea7;
import defpackage.qs2;

/* loaded from: classes2.dex */
public abstract class PagerStateKt {
    public static final PagerState a(final int i, Composer composer, int i2, int i3) {
        composer.z(1352421093);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1352421093, i2, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:56)");
        }
        Object[] objArr = new Object[0];
        ea7 a = PagerState.h.a();
        Integer valueOf = Integer.valueOf(i);
        composer.z(1157296644);
        boolean S = composer.S(valueOf);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: com.google.accompanist.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PagerState mo865invoke() {
                    return new PagerState(i);
                }
            };
            composer.q(A);
        }
        composer.R();
        PagerState pagerState = (PagerState) RememberSaveableKt.b(objArr, a, null, (qs2) A, composer, 72, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return pagerState;
    }
}
