package com.nytimes.android.side.effects;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.side.effects.a;
import defpackage.d44;
import defpackage.ei1;
import defpackage.jk;
import defpackage.mt2;
import defpackage.tr7;
import defpackage.ur7;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SideEffectOnScrollObserver {
    private final tr7 a;
    private final jk b;

    public SideEffectOnScrollObserver(Activity activity, tr7 tr7Var) {
        zq3.h(activity, "activity");
        zq3.h(tr7Var, "factory");
        this.a = tr7Var;
        this.b = (jk) activity;
    }

    private final ur7 b(boolean z) {
        return new ur7(this.b, this.a.a(), this.a.b(z));
    }

    public final void a(final WebView webView, boolean z) {
        zq3.h(webView, "webView");
        final ur7 b = b(z);
        final mt2 mt2Var = new mt2() { // from class: com.nytimes.android.side.effects.SideEffectOnScrollObserver$attachOnResume$onScroll$1
            {
                super(5);
            }

            public final void b(View view, int i, int i2, int i3, int i4) {
                zq3.h(view, QueryKeys.INTERNAL_REFERRER);
                int i5 = i2 - i4;
                if (ViewExtensions.d(view)) {
                    ur7.this.a(i2, i5);
                } else {
                    a.C0405a.a(ur7.this, 0, 0, 3, null);
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                return ww8.a;
            }
        };
        ViewExtensions.b(webView, this.b, mt2Var);
        Lifecycle lifecycle = this.b.getLifecycle();
        zq3.g(lifecycle, "<get-lifecycle>(...)");
        lifecycle.a(new ei1() { // from class: com.nytimes.android.side.effects.SideEffectOnScrollObserver$attachOnResume$$inlined$onPause$1
            @Override // defpackage.ei1
            public void onPause(d44 d44Var) {
                zq3.h(d44Var, "owner");
                d44Var.getLifecycle().d(this);
                ViewExtensions.m(webView, mt2Var);
            }
        });
    }
}
