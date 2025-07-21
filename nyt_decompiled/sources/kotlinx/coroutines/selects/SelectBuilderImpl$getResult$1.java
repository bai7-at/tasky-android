package kotlinx.coroutines.selects;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SelectBuilderImpl$getResult$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SelectBuilderImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectBuilderImpl$getResult$1(SelectBuilderImpl<R> selectBuilderImpl, by0<? super SelectBuilderImpl$getResult$1> by0Var) {
        super(2, by0Var);
        this.this$0 = selectBuilderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new SelectBuilderImpl$getResult$1(this.this$0, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, ww8] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                SelectImplementation selectImplementation = this.this$0;
                this.label = 1;
                obj = selectImplementation.doSelect(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            cancellableContinuationImpl2 = ((SelectBuilderImpl) this.this$0).cont;
            SelectOldKt.resumeUndispatched(cancellableContinuationImpl2, obj);
            this = ww8.a;
            return this;
        } catch (Throwable th) {
            cancellableContinuationImpl = ((SelectBuilderImpl) this.this$0).cont;
            SelectOldKt.resumeUndispatchedWithException(cancellableContinuationImpl, th);
            return ww8.a;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((SelectBuilderImpl$getResult$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
