package com.nytimes.android.eventtracker.validator;

import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$eventResult$1", f = "JavascriptValidator.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class JavascriptValidator$isValid$eventResult$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $wrappedEvent;
    int label;
    final /* synthetic */ JavascriptValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavascriptValidator$isValid$eventResult$1(JavascriptValidator javascriptValidator, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = javascriptValidator;
        this.$wrappedEvent = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new JavascriptValidator$isValid$eventResult$1(this.this$0, this.$wrappedEvent, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            JavascriptEngine javascriptEngine = this.this$0.a;
            String str = this.$wrappedEvent;
            this.label = 1;
            obj = javascriptEngine.c(str, this);
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
        return ((JavascriptValidator$isValid$eventResult$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
