package com.nytimes.android.hybrid;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.nytimes.android.hybrid.AsyncEvaluatorImpl;
import com.squareup.moshi.JsonAdapter;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.AsyncEvaluatorImpl$callAsync$2", f = "AsyncEvaluatorImpl.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AsyncEvaluatorImpl$callAsync$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $script;
    final /* synthetic */ WebView $view;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AsyncEvaluatorImpl this$0;

    public static final class a extends WebMessagePort.WebMessageCallback {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ AsyncEvaluatorImpl b;

        a(CancellableContinuation cancellableContinuation, AsyncEvaluatorImpl asyncEvaluatorImpl) {
            this.a = cancellableContinuation;
            this.b = asyncEvaluatorImpl;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            JsonAdapter jsonAdapter;
            if (webMessage == null) {
                CancellableContinuation cancellableContinuation = this.a;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(new AsyncEvaluatorImpl.CouldNotDecodeResponseError())));
                return;
            }
            jsonAdapter = this.b.c;
            AsyncEvaluatorImpl.ResultPayload resultPayload = (AsyncEvaluatorImpl.ResultPayload) jsonAdapter.fromJson(webMessage.getData());
            if (resultPayload == null) {
                CancellableContinuation cancellableContinuation2 = this.a;
                Result.a aVar2 = Result.a;
                cancellableContinuation2.resumeWith(Result.b(f.a(new AsyncEvaluatorImpl.CouldNotDecodeResponseError())));
            } else if (resultPayload.b()) {
                CancellableContinuation cancellableContinuation3 = this.a;
                Result.a aVar3 = Result.a;
                cancellableContinuation3.resumeWith(Result.b(resultPayload.a()));
            } else {
                CancellableContinuation cancellableContinuation4 = this.a;
                Result.a aVar4 = Result.a;
                cancellableContinuation4.resumeWith(Result.b(f.a(new Error(resultPayload.a()))));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncEvaluatorImpl$callAsync$2(AsyncEvaluatorImpl asyncEvaluatorImpl, WebView webView, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = asyncEvaluatorImpl;
        this.$view = webView;
        this.$script = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AsyncEvaluatorImpl$callAsync$2(this.this$0, this.$view, this.$script, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebMessagePort webMessagePort;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AsyncEvaluatorImpl asyncEvaluatorImpl = this.this$0;
            WebView webView = this.$view;
            String str = this.$script;
            this.L$0 = asyncEvaluatorImpl;
            this.L$1 = webView;
            this.L$2 = str;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(this), 1);
            cancellableContinuationImpl.initCancellability();
            webMessagePort = asyncEvaluatorImpl.a;
            if (webMessagePort == null) {
                Result.a aVar = Result.a;
                cancellableContinuationImpl.resumeWith(Result.b(f.a(new AsyncEvaluatorImpl.NotBootstrappedError())));
            } else {
                WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
                zq3.e(createWebMessageChannel);
                final WebMessagePort webMessagePort2 = createWebMessageChannel[0];
                WebMessage webMessage = new WebMessage(str, new WebMessagePort[]{createWebMessageChannel[1]});
                webMessagePort2.setWebMessageCallback(new a(cancellableContinuationImpl, asyncEvaluatorImpl));
                webMessagePort.postMessage(webMessage);
                cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: com.nytimes.android.hybrid.AsyncEvaluatorImpl$callAsync$2$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return ww8.a;
                    }

                    public final void invoke(Throwable th) {
                        try {
                            try {
                                webMessagePort2.setWebMessageCallback(null);
                            } catch (Exception e) {
                                ul8.a.z("HYBRID").f(e, "Error closing web message callback", new Object[0]);
                            }
                        } finally {
                            webMessagePort2.close();
                        }
                    }
                });
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(this);
            }
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AsyncEvaluatorImpl$callAsync$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
