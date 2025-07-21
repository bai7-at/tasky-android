package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ContiguousPagedList$tryDispatchBoundaryCallbacks$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $dispatchBegin;
    final /* synthetic */ boolean $dispatchEnd;
    int label;
    final /* synthetic */ ContiguousPagedList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContiguousPagedList$tryDispatchBoundaryCallbacks$1(ContiguousPagedList contiguousPagedList, boolean z, boolean z2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = contiguousPagedList;
        this.$dispatchBegin = z;
        this.$dispatchEnd = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this.this$0, this.$dispatchBegin, this.$dispatchEnd, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.this$0.U(this.$dispatchBegin, this.$dispatchEnd);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ContiguousPagedList$tryDispatchBoundaryCallbacks$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
