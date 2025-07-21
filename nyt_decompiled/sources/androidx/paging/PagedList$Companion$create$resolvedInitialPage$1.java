package androidx.paging;

import androidx.paging.PagingSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PagedList$Companion$create$resolvedInitialPage$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagingSource $pagingSource;
    final /* synthetic */ PagingSource.a.d $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$Companion$create$resolvedInitialPage$1(PagingSource pagingSource, PagingSource.a.d dVar, by0 by0Var) {
        super(2, by0Var);
        this.$pagingSource = pagingSource;
        this.$params = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PagedList$Companion$create$resolvedInitialPage$1(this.$pagingSource, this.$params, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            PagingSource pagingSource = this.$pagingSource;
            PagingSource.a.d dVar = this.$params;
            this.label = 1;
            obj = pagingSource.load(dVar, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        PagingSource.b bVar = (PagingSource.b) obj;
        if (bVar instanceof PagingSource.b.C0106b) {
            return (PagingSource.b.C0106b) bVar;
        }
        if (bVar instanceof PagingSource.b.a) {
            throw ((PagingSource.b.a) bVar).a();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
