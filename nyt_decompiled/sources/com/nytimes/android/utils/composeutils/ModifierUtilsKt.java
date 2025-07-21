package com.nytimes.android.utils.composeutils;

import androidx.compose.ui.Modifier;
import defpackage.dj7;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.jj7;
import defpackage.kj7;
import defpackage.lj7;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes4.dex */
public abstract class ModifierUtilsKt {
    public static final Modifier a(Modifier modifier, boolean z, ss2 ss2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(ss2Var, "modifier");
        return z ? modifier.h((Modifier) ss2Var.invoke(Modifier.a)) : modifier;
    }

    public static final Modifier b(Modifier modifier, Object obj, gt2 gt2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(gt2Var, "onNotNull");
        return obj != null ? modifier.h((Modifier) gt2Var.invoke(modifier, obj)) : modifier;
    }

    public static final Modifier c(Modifier modifier, boolean z, ss2 ss2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(ss2Var, "ifTrue");
        return z ? modifier.h((Modifier) ss2Var.invoke(modifier)) : modifier;
    }

    public static final Modifier d(Modifier modifier, final String str) {
        zq3.h(modifier, "<this>");
        zq3.h(str, "value");
        return dj7.d(modifier, false, new ss2() { // from class: com.nytimes.android.utils.composeutils.ModifierUtilsKt$testTag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(lj7 lj7Var) {
                zq3.h(lj7Var, "$this$semantics");
                kj7.a(lj7Var, true);
                jj7.a0(lj7Var, str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }, 1, null);
    }

    public static final Modifier e(Modifier modifier, final long j, final float f, final float f2) {
        zq3.h(modifier, "$this$underline");
        return modifier.h(androidx.compose.ui.draw.a.b(Modifier.a, new ss2() { // from class: com.nytimes.android.utils.composeutils.ModifierUtilsKt$underline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((fv1) obj);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                zq3.h(fv1Var, "$this$drawBehind");
                float f1 = fv1Var.f1(f);
                float g = zt7.g(fv1Var.b()) + f2;
                fv1.s0(fv1Var, j, hd5.a(0.0f, g), hd5.a(zt7.i(fv1Var.b()), g), f1, 0, null, 0.0f, null, 0, 496, null);
            }
        }));
    }
}
