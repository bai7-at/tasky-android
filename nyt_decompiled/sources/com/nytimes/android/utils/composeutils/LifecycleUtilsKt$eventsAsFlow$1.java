package com.nytimes.android.utils.composeutils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.by0;
import defpackage.d44;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "com.nytimes.android.utils.composeutils.LifecycleUtilsKt$eventsAsFlow$1", f = "LifecycleUtils.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LifecycleUtilsKt$eventsAsFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Lifecycle $this_eventsAsFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleUtilsKt$eventsAsFlow$1(Lifecycle lifecycle, by0 by0Var) {
        super(2, by0Var);
        this.$this_eventsAsFlow = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProducerScope producerScope, d44 d44Var, Lifecycle.Event event) {
        producerScope.mo129trySendJP2dKIU(event);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LifecycleUtilsKt$eventsAsFlow$1 lifecycleUtilsKt$eventsAsFlow$1 = new LifecycleUtilsKt$eventsAsFlow$1(this.$this_eventsAsFlow, by0Var);
        lifecycleUtilsKt$eventsAsFlow$1.L$0 = obj;
        return lifecycleUtilsKt$eventsAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final g gVar = new g() { // from class: com.nytimes.android.utils.composeutils.d
                @Override // androidx.lifecycle.g
                public final void h(d44 d44Var, Lifecycle.Event event) {
                    LifecycleUtilsKt$eventsAsFlow$1.c(ProducerScope.this, d44Var, event);
                }
            };
            this.$this_eventsAsFlow.a(gVar);
            final Lifecycle lifecycle = this.$this_eventsAsFlow;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.utils.composeutils.LifecycleUtilsKt$eventsAsFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m775invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m775invoke() {
                    Lifecycle.this.d(gVar);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, qs2Var, this) == h) {
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
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((LifecycleUtilsKt$eventsAsFlow$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
