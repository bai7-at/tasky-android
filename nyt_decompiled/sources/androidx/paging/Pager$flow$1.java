package androidx.paging;

import defpackage.by0;
import defpackage.ss2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements ss2 {
    Pager$flow$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SuspendingPagingSourceFactory) this.receiver).c(by0Var);
    }
}
