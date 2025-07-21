package androidx.compose.material.ripple;

import defpackage.bo3;
import defpackage.by0;
import defpackage.d26;
import defpackage.e26;
import defpackage.eo3;
import defpackage.f26;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ c $instance;
    final /* synthetic */ eo3 $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ c a;
        final /* synthetic */ CoroutineScope b;

        a(c cVar, CoroutineScope coroutineScope) {
            this.a = cVar;
            this.b = coroutineScope;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(bo3 bo3Var, by0 by0Var) {
            if (bo3Var instanceof e26) {
                this.a.b((e26) bo3Var, this.b);
            } else if (bo3Var instanceof f26) {
                this.a.g(((f26) bo3Var).a());
            } else if (bo3Var instanceof d26) {
                this.a.g(((d26) bo3Var).a());
            } else {
                this.a.h(bo3Var, this.b);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1(eo3 eo3Var, c cVar, by0 by0Var) {
        super(2, by0Var);
        this.$interactionSource = eo3Var;
        this.$instance = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, by0Var);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow b = this.$interactionSource.b();
            a aVar = new a(this.$instance, coroutineScope);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
        return ((Ripple$rememberUpdatedInstance$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
