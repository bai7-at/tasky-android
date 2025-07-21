package com.nytimes.android.utils.composeutils;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import defpackage.cc7;
import defpackage.d44;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.py1;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class LifecycleUtilsKt {
    public static final void a(final Object obj, final gt2 gt2Var, Composer composer, final int i) {
        zq3.h(gt2Var, "block");
        Composer h = composer.h(1241351043);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1241351043, i, -1, "com.nytimes.android.utils.composeutils.LaunchedEffectRepeatOnResume (LifecycleUtils.kt:19)");
        }
        py1.d(obj, new LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1(((d44) h.m(AndroidCompositionLocals_androidKt.i())).getLifecycle(), gt2Var, null), h, 72);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    LifecycleUtilsKt.a(obj, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow c(Lifecycle lifecycle) {
        return FlowKt.callbackFlow(new LifecycleUtilsKt$eventsAsFlow$1(lifecycle, null));
    }
}
