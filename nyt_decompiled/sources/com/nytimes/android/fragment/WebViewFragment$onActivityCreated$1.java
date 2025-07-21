package com.nytimes.android.fragment;

import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.d83;
import defpackage.eq7;
import defpackage.fc1;
import defpackage.fq7;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.fragment.WebViewFragment$onActivityCreated$1", f = "WebViewFragment.kt", l = {AdvertisementType.ON_DEMAND_PRE_ROLL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewFragment$onActivityCreated$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewFragment$onActivityCreated$1(WebViewFragment webViewFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webViewFragment;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(eq7 eq7Var, by0 by0Var) {
        return ((WebViewFragment$onActivityCreated$1) create(eq7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewFragment$onActivityCreated$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AssetViewModel v1 = this.this$0.v1();
            this.label = 1;
            obj = v1.f(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        Asset asset = (Asset) obj;
        final WebViewFragment webViewFragment = this.this$0;
        HybridWebView hybridWebView = webViewFragment.l;
        if (hybridWebView != null) {
            webViewFragment.h1(hybridWebView, asset, new ss2() { // from class: com.nytimes.android.fragment.WebViewFragment$onActivityCreated$1.1
                {
                    super(1);
                }

                public final void b(fq7 fq7Var) {
                    d83 d83Var;
                    zq3.h(fq7Var, "sharedTextFound");
                    d83Var = WebViewFragment.this.h;
                    d83Var.b(fq7Var);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((fq7) obj2);
                    return ww8.a;
                }
            });
        }
        return ww8.a;
    }
}
