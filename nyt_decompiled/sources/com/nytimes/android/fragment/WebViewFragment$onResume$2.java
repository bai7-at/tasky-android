package com.nytimes.android.fragment;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.WebViewFragment$onResume$2", f = "WebViewFragment.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewFragment$onResume$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewFragment$onResume$2(WebViewFragment webViewFragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewFragment$onResume$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
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
            if (!this.this$0.v1().g().e()) {
                this.this$0.l1().c(asset, this.this$0.v1().g().k());
            }
            this.this$0.q1().p(asset);
            androidx.fragment.app.f activity = this.this$0.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                NYTLogger.h(th);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebViewFragment$onResume$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
