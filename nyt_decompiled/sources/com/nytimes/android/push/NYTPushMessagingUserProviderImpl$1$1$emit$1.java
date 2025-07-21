package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.push.NYTPushMessagingUserProviderImpl;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1", f = "NYTPushMessagingUserProviderImpl.kt", l = {36, 37}, m = "emit")
/* loaded from: classes4.dex */
final class NYTPushMessagingUserProviderImpl$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NYTPushMessagingUserProviderImpl.AnonymousClass1.C03761 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTPushMessagingUserProviderImpl$1$1$emit$1(NYTPushMessagingUserProviderImpl.AnonymousClass1.C03761 c03761, by0 by0Var) {
        super(by0Var);
        this.this$0 = c03761;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit(null, this);
    }
}
