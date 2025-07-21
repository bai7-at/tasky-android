package com.nytimes.android.textsize;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wj8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.textsize.TextSizeViewModel$onCreate$1", f = "TextSizeViewModel.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TextSizeViewModel$onCreate$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextSizeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextSizeViewModel$onCreate$1(TextSizeViewModel textSizeViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = textSizeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TextSizeViewModel$onCreate$1 textSizeViewModel$onCreate$1 = new TextSizeViewModel$onCreate$1(this.this$0, by0Var);
        textSizeViewModel$onCreate$1.L$0 = obj;
        return textSizeViewModel$onCreate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wj8 wj8Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            wj8Var = this.this$0.b;
            this.label = 1;
            if (wj8Var.a(coroutineScope, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TextSizeViewModel$onCreate$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
