package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.a;
import defpackage.av0;
import defpackage.by0;
import defpackage.dv0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseConstraintController$track$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseConstraintController this$0;

    public static final class a implements av0 {
        final /* synthetic */ BaseConstraintController a;
        final /* synthetic */ ProducerScope b;

        a(BaseConstraintController baseConstraintController, ProducerScope producerScope) {
            this.a = baseConstraintController;
            this.b = producerScope;
        }

        @Override // defpackage.av0
        public void a(Object obj) {
            this.b.getChannel().mo129trySendJP2dKIU(this.a.f(obj) ? new a.b(this.a.e()) : a.C0124a.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseConstraintController$track$1(BaseConstraintController baseConstraintController, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = baseConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        BaseConstraintController$track$1 baseConstraintController$track$1 = new BaseConstraintController$track$1(this.this$0, by0Var);
        baseConstraintController$track$1.L$0 = obj;
        return baseConstraintController$track$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dv0 dv0Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final a aVar = new a(this.this$0, producerScope);
            dv0Var = this.this$0.a;
            dv0Var.c(aVar);
            final BaseConstraintController baseConstraintController = this.this$0;
            qs2 qs2Var = new qs2() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m131invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m131invoke() {
                    dv0 dv0Var2;
                    dv0Var2 = BaseConstraintController.this.a;
                    dv0Var2.f(aVar);
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
        return ((BaseConstraintController$track$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
