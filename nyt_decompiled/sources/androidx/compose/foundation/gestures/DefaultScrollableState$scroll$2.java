package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultScrollableState$scroll$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ DefaultScrollableState this$0;

    @fc1(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {181}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ gt2 $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultScrollableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultScrollableState defaultScrollableState, gt2 gt2Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = defaultScrollableState;
            this.$block = gt2Var;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qc7 qc7Var, by0 by0Var) {
            return ((AnonymousClass1) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, ww8] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            sy4 sy4Var;
            sy4 sy4Var2;
            sy4 sy4Var3;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            try {
                if (i == 0) {
                    f.b(obj);
                    qc7 qc7Var = (qc7) this.L$0;
                    sy4Var2 = this.this$0.d;
                    sy4Var2.setValue(cc0.a(true));
                    gt2 gt2Var = this.$block;
                    this.label = 1;
                    if (gt2Var.invoke(qc7Var, this) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                sy4Var3 = this.this$0.d;
                sy4Var3.setValue(cc0.a(false));
                this = ww8.a;
                return this;
            } catch (Throwable th) {
                sy4Var = this.this$0.d;
                sy4Var.setValue(cc0.a(false));
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultScrollableState;
        this.$scrollPriority = mutatePriority;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        qc7 qc7Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutatorMutex = this.this$0.c;
            qc7Var = this.this$0.b;
            MutatePriority mutatePriority = this.$scrollPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            if (mutatorMutex.f(qc7Var, mutatePriority, anonymousClass1, this) == h) {
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
        return ((DefaultScrollableState$scroll$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
