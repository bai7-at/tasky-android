package com.airbnb.lottie.compose;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.ws.WebSocketProtocol;

@fc1(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 127, 128}, m = "lottieComposition")
/* loaded from: classes.dex */
final class RememberLottieCompositionKt$lottieComposition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    RememberLottieCompositionKt$lottieComposition$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m = RememberLottieCompositionKt.m(null, null, null, null, null, null, this);
        return m;
    }
}
