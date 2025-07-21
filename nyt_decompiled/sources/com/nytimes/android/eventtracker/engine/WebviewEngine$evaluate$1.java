package com.nytimes.android.eventtracker.engine;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.engine.WebviewEngine", f = "WebviewEngine.kt", l = {92}, m = "evaluate")
/* loaded from: classes4.dex */
final class WebviewEngine$evaluate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebviewEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebviewEngine$evaluate$1(WebviewEngine webviewEngine, by0 by0Var) {
        super(by0Var);
        this.this$0 = webviewEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
