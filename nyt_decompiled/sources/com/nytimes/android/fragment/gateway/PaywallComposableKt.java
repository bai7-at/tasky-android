package com.nytimes.android.fragment.gateway;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.m;
import defpackage.cc7;
import defpackage.d44;
import defpackage.gq5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jk;
import defpackage.ng6;
import defpackage.py1;
import defpackage.s5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class PaywallComposableKt {
    public static final void a(final m mVar, final PaywallOverlayViewModel paywallOverlayViewModel, final gt2 gt2Var, Composer composer, final int i) {
        zq3.h(mVar, "webViewContent");
        zq3.h(paywallOverlayViewModel, "viewModel");
        zq3.h(gt2Var, "content");
        Composer h = composer.h(-563413633);
        if (b.G()) {
            b.S(-563413633, i, -1, "com.nytimes.android.fragment.gateway.PaywallComposable (PaywallComposable.kt:38)");
        }
        h.z(-1845780110);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(gt2Var)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new ss2() { // from class: com.nytimes.android.fragment.gateway.PaywallComposableKt$PaywallComposable$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final FrameLayout invoke(Context context) {
                    zq3.h(context, "it");
                    FrameLayout frameLayout = new FrameLayout(context);
                    ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                    gt2 gt2Var2 = gt2.this;
                    composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    composeView.setContent(gt2Var2);
                    frameLayout.addView(composeView);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setId(ng6.paywallContainer);
                    frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    frameLayout.addView(frameLayout2);
                    return frameLayout;
                }
            };
            h.q(A);
        }
        h.R();
        AndroidView_androidKt.b((ss2) A, null, null, h, 0, 6);
        Lifecycle lifecycle = ((d44) h.m(AndroidCompositionLocals_androidKt.i())).getLifecycle();
        ComponentActivity b = s5.b(h, 0);
        zq3.f(b, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        jk jkVar = (jk) b;
        h.z(169908575);
        ComponentActivity b2 = s5.b(h, 0);
        zq3.f(b2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        jk jkVar2 = (jk) b2;
        h.z(1503843850);
        Object A2 = h.A();
        if (A2 == Composer.a.a()) {
            A2 = z12.a(jkVar2, gq5.class);
            h.q(A2);
        }
        h.R();
        h.R();
        py1.d(ww8.a, new PaywallComposableKt$PaywallComposable$2((gq5) A2, lifecycle, mVar, paywallOverlayViewModel, jkVar, null), h, 70);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.fragment.gateway.PaywallComposableKt$PaywallComposable$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    PaywallComposableKt.a(m.this, paywallOverlayViewModel, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
