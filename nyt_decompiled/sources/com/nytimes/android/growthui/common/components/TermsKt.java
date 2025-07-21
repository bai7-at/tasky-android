package com.nytimes.android.growthui.common.components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m07;
import defpackage.ma3;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.w43;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class TermsKt {
    public static final void a(final Modifier modifier, final String str, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(str, "htmlContent");
        Composer h = composer.h(-1149325615);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((2 & i2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(str) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-1149325615, i3, -1, "com.nytimes.android.growthui.common.components.Terms (Terms.kt:27)");
            }
            final w43 a = c74.a.a(h, 6);
            h.z(733328855);
            rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(modifier);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            h.z(-1963249134);
            boolean S = h.S(str) | h.S(a);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.growthui.common.components.TermsKt$Terms$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final TextView invoke(Context context) {
                        zq3.h(context, "context");
                        TextView textView = new TextView(context);
                        String str2 = str;
                        w43 w43Var = a;
                        textView.setText(ma3.a(str2, 63));
                        textView.setLineSpacing(0.0f, 1.5f);
                        textView.setTextSize(12.0f);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setTypeface(m07.g(context, R.font.font_franklin_medium));
                        textView.setLinkTextColor(wn0.k(w43Var.l()));
                        textView.setTextColor(wn0.k(w43Var.l()));
                        return textView;
                    }
                };
                h.q(A);
            }
            h.R();
            AndroidView_androidKt.b((ss2) A, null, null, h, 0, 6);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.TermsKt$Terms$2
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
                    TermsKt.a(Modifier.this, str, composer2, i | 1, i2);
                }
            });
        }
    }
}
