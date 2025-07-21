package androidx.paging.compose;

import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyPagingItems$collectPagingData$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyPagingItems this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyPagingItems$collectPagingData$2(LazyPagingItems lazyPagingItems, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lazyPagingItems;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, by0 by0Var) {
        return ((LazyPagingItems$collectPagingData$2) create(pagingData, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(this.this$0, by0Var);
        lazyPagingItems$collectPagingData$2.L$0 = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LazyPagingItems.b bVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PagingData pagingData = (PagingData) this.L$0;
            bVar = this.this$0.c;
            this.label = 1;
            if (bVar.m(pagingData, this) == h) {
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
}
