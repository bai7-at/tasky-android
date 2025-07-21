package com.nytimes.android.designsystem.uicompose.composable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import defpackage.bi6;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jg6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class CharmBraceletLayoutKt {
    private static final float a = bu1.g(60);

    public static final void a(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(521411112);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(521411112, i3, -1, "com.nytimes.android.designsystem.uicompose.composable.CharmBraceletLayout (CharmBraceletLayout.kt:15)");
            }
            AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CharmBraceletLayoutKt$CharmBraceletLayout$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Toolbar invoke(Context context) {
                    zq3.h(context, "context");
                    return (Toolbar) LayoutInflater.from(context).inflate(bi6.charm_bracelet_layout, (ViewGroup) null, false).findViewById(jg6.toolbar);
                }
            }, SizeKt.i(SizeKt.h(modifier, 0.0f, 1, null), a), null, h, 6, 4);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CharmBraceletLayoutKt$CharmBraceletLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    CharmBraceletLayoutKt.a(Modifier.this, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final float b() {
        return a;
    }
}
