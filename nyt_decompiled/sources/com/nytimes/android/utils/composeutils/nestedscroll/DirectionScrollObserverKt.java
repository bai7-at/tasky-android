package com.nytimes.android.utils.composeutils.nestedscroll;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.DirectionScrollObserver;
import defpackage.ex7;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DirectionScrollObserverKt {
    public static final DirectionScrollObserver a(Composer composer, int i) {
        composer.z(83463320);
        if (b.G()) {
            b.S(83463320, i, -1, "com.nytimes.android.utils.composeutils.nestedscroll.rememberCloseKeyboardScrollObserver (DirectionScrollObserver.kt:46)");
        }
        final ex7 ex7Var = (ex7) composer.m(CompositionLocalsKt.l());
        composer.z(258991452);
        boolean S = composer.S(ex7Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new DirectionScrollObserver(new ss2() { // from class: com.nytimes.android.utils.composeutils.nestedscroll.DirectionScrollObserverKt$rememberCloseKeyboardScrollObserver$1$1
                {
                    super(1);
                }

                public final void b(DirectionScrollObserver.Direction direction) {
                    ex7 ex7Var2;
                    zq3.h(direction, "it");
                    if (direction != DirectionScrollObserver.Direction.DOWN || (ex7Var2 = ex7.this) == null) {
                        return;
                    }
                    ex7Var2.c();
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((DirectionScrollObserver.Direction) obj);
                    return ww8.a;
                }
            });
            composer.q(A);
        }
        DirectionScrollObserver directionScrollObserver = (DirectionScrollObserver) A;
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return directionScrollObserver;
    }
}
