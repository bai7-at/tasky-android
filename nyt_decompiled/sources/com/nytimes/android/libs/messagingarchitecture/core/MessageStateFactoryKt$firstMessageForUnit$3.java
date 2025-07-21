package com.nytimes.android.libs.messagingarchitecture.core;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yr4;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$BooleanRef;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$3", f = "MessageStateFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessageStateFactoryKt$firstMessageForUnit$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$BooleanRef $found;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageStateFactoryKt$firstMessageForUnit$3(Ref$BooleanRef ref$BooleanRef, by0 by0Var) {
        super(2, by0Var);
        this.$found = ref$BooleanRef;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yr4 yr4Var, by0 by0Var) {
        return ((MessageStateFactoryKt$firstMessageForUnit$3) create(yr4Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MessageStateFactoryKt$firstMessageForUnit$3 messageStateFactoryKt$firstMessageForUnit$3 = new MessageStateFactoryKt$firstMessageForUnit$3(this.$found, by0Var);
        messageStateFactoryKt$firstMessageForUnit$3.L$0 = obj;
        return messageStateFactoryKt$firstMessageForUnit$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (((yr4) this.L$0) != null) {
            this.$found.element = true;
        }
        return ww8.a;
    }
}
