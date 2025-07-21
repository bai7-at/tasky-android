package com.nytimes.android.eventtracker.validator;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.validator.JavascriptValidator", f = "JavascriptValidator.kt", l = {79, 80}, m = "isValid")
/* loaded from: classes4.dex */
final class JavascriptValidator$isValid$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JavascriptValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavascriptValidator$isValid$1(JavascriptValidator javascriptValidator, by0 by0Var) {
        super(by0Var);
        this.this$0 = javascriptValidator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
