package com.nytimes.android.readerhybrid.widget;

import androidx.fragment.app.f;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ic3;
import defpackage.ww8;
import defpackage.xt6;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.widget.EmbeddedLinkWebChromeClient$onCreateWindow$2", f = "EmbeddedLinkWebChromeClient.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EmbeddedLinkWebChromeClient$onCreateWindow$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ EmbeddedLinkWebChromeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedLinkWebChromeClient$onCreateWindow$2(EmbeddedLinkWebChromeClient embeddedLinkWebChromeClient, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = embeddedLinkWebChromeClient;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new EmbeddedLinkWebChromeClient$onCreateWindow$2(this.this$0, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ic3 ic3Var;
        f fVar;
        xt6 xt6Var;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                ic3Var = this.this$0.d;
                fVar = this.this$0.a;
                String str = this.$url;
                xt6Var = this.this$0.e;
                String a = xt6Var.a();
                this.label = 1;
                if (ic3Var.a(fVar, str, a, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                NYTLogger.i(e, "Error in HybridLinkHandlerImpl", new Object[0]);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((EmbeddedLinkWebChromeClient$onCreateWindow$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
