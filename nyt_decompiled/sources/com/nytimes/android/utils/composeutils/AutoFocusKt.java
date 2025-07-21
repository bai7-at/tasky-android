package com.nytimes.android.utils.composeutils;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import com.comscore.streaming.ContentType;
import defpackage.b00;
import defpackage.cc7;
import defpackage.dy4;
import defpackage.fo3;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class AutoFocusKt {
    public static final void a(final qs2 qs2Var, final it2 it2Var, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "onUnfocus");
        zq3.h(it2Var, "content");
        Composer h = composer.h(-1180816602);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(it2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1180816602, i2, -1, "com.nytimes.android.utils.composeutils.AutoFocus (AutoFocus.kt:21)");
            }
            h.z(-887431153);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = fo3.a();
                h.q(A);
            }
            dy4 dy4Var = (dy4) A;
            h.R();
            FocusRequester focusRequester = new FocusRequester();
            it2Var.invoke(new b00(focusRequester, dy4Var), h, Integer.valueOf(i2 & ContentType.LONG_FORM_ON_DEMAND));
            ww8 ww8Var = ww8.a;
            h.z(-887430982);
            boolean S = h.S(focusRequester);
            Object A2 = h.A();
            if (S || A2 == aVar.a()) {
                A2 = new AutoFocusKt$AutoFocus$1$1(focusRequester, null);
                h.q(A2);
            }
            h.R();
            py1.d(ww8Var, (gt2) A2, h, 70);
            h.z(-887430922);
            boolean z = (i2 & 14) == 4;
            Object A3 = h.A();
            if (z || A3 == aVar.a()) {
                A3 = new AutoFocusKt$AutoFocus$2$1(dy4Var, qs2Var, null);
                h.q(A3);
            }
            h.R();
            py1.d(ww8Var, (gt2) A3, h, 70);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.utils.composeutils.AutoFocusKt$AutoFocus$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    AutoFocusKt.a(qs2.this, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
