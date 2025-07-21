package com.nytimes.android;

import com.nytimes.android.fragment.gateway.PaywallOverlayViewModel;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
/* synthetic */ class SingleArticleActivity$AssetContent$4 extends FunctionReferenceImpl implements qs2 {
    SingleArticleActivity$AssetContent$4(Object obj) {
        super(0, obj, PaywallOverlayViewModel.class, "reportUserInteraction", "reportUserInteraction()V", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m174invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m174invoke() {
        ((PaywallOverlayViewModel) this.receiver).i();
    }
}
