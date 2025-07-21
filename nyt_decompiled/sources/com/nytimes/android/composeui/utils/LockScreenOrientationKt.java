package com.nytimes.android.composeui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class LockScreenOrientationKt {
    public static final void a(final int i, Composer composer, final int i2) {
        int i3;
        Composer h = composer.h(1951756341);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1951756341, i3, -1, "com.nytimes.android.composeui.utils.LockScreenOrientation (LockScreenOrientation.kt:14)");
            }
            final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
            py1.a(Integer.valueOf(i), new ss2() { // from class: com.nytimes.android.composeui.utils.LockScreenOrientationKt$LockScreenOrientation$1

                public static final class a implements ms1 {
                    @Override // defpackage.ms1
                    public void dispose() {
                    }
                }

                public static final class b implements ms1 {
                    final /* synthetic */ Activity a;
                    final /* synthetic */ int b;

                    public b(Activity activity, int i) {
                        this.a = activity;
                        this.b = i;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.setRequestedOrientation(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    Activity c;
                    zq3.h(ns1Var, "$this$DisposableEffect");
                    c = LockScreenOrientationKt.c(context);
                    if (c == null) {
                        return new a();
                    }
                    int requestedOrientation = c.getRequestedOrientation();
                    c.setRequestedOrientation(i);
                    return new b(c, requestedOrientation);
                }
            }, h, i3 & 14);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.composeui.utils.LockScreenOrientationKt$LockScreenOrientation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    LockScreenOrientationKt.a(i, composer2, i2 | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        zq3.g(baseContext, "getBaseContext(...)");
        return c(baseContext);
    }
}
