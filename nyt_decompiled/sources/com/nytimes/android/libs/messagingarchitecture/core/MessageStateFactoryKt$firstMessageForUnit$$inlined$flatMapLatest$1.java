package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1", f = "MessageStateFactory.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ MessageStateFactory $messageStateFactory$inlined;
    final /* synthetic */ q $this_firstMessageForUnit$inlined;
    final /* synthetic */ String $unitName$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1(by0 by0Var, MessageStateFactory messageStateFactory, String str, q qVar) {
        super(3, by0Var);
        this.$messageStateFactory$inlined = messageStateFactory;
        this.$unitName$inlined = str;
        this.$this_firstMessageForUnit$inlined = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow g = this.$messageStateFactory$inlined.g(this.$unitName$inlined, (Map) this.L$1, r.a(this.$this_firstMessageForUnit$inlined));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, g, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1 messageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1 = new MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1(by0Var, this.$messageStateFactory$inlined, this.$unitName$inlined, this.$this_firstMessageForUnit$inlined);
        messageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1.L$0 = flowCollector;
        messageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1.L$1 = obj;
        return messageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1.invokeSuspend(ww8.a);
    }
}
