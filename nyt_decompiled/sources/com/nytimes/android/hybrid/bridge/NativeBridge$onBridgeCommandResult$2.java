package com.nytimes.android.hybrid.bridge;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.bridge.NativeBridge$onBridgeCommandResult$2", f = "NativeBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NativeBridge$onBridgeCommandResult$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $resultScript;
    int label;
    final /* synthetic */ NativeBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeBridge$onBridgeCommandResult$2(NativeBridge nativeBridge, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nativeBridge;
        this.$resultScript = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str) {
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NativeBridge$onBridgeCommandResult$2(this.this$0, this.$resultScript, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        webView = this.this$0.a;
        webView.evaluateJavascript(this.$resultScript, new ValueCallback() { // from class: com.nytimes.android.hybrid.bridge.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                NativeBridge$onBridgeCommandResult$2.c((String) obj2);
            }
        });
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NativeBridge$onBridgeCommandResult$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
