package com.nytimes.xwords.hybrid.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.xwords.hybrid.analytics.HybridGamesReferringSourceData;
import defpackage.d44;
import defpackage.e52;
import defpackage.ul8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes4.dex */
public final class PageEventReporter implements g {
    private final PageContext a;
    private final String b;
    private final CoroutineScope c;
    private final HybridGamesReferringSourceData d;
    private boolean e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public PageEventReporter(PageContext pageContext, String str, CoroutineScope coroutineScope, HybridGamesReferringSourceData hybridGamesReferringSourceData) {
        zq3.h(pageContext, "pageContext");
        zq3.h(str, "section");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = pageContext;
        this.b = str;
        this.c = coroutineScope;
        this.d = hybridGamesReferringSourceData;
    }

    private final void d() {
        f(new e52.h());
    }

    private final void e() {
        e52 gVar;
        boolean z = this.e;
        if (z) {
            gVar = new e52.i();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            this.e = true;
            gVar = new e52.g();
        }
        f(gVar);
    }

    private final void f(e52 e52Var) {
        BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new PageEventReporter$sendPageEvent$1(this, e52Var, null), 3, null);
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        int i = a.a[event.ordinal()];
        if (i == 1) {
            e();
            return;
        }
        if (i == 2) {
            d();
            return;
        }
        ul8.a.a("Unhandled: onStateChanged: " + event, new Object[0]);
    }
}
