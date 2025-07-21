package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvm.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LegacyPagingSource$load$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ DataSource.d $dataSourceParams;
    final /* synthetic */ PagingSource.a $params;
    int label;
    final /* synthetic */ LegacyPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPagingSource$load$2(LegacyPagingSource legacyPagingSource, DataSource.d dVar, PagingSource.a aVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = legacyPagingSource;
        this.$dataSourceParams = dVar;
        this.$params = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LegacyPagingSource$load$2(this.this$0, this.$dataSourceParams, this.$params, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            DataSource b = this.this$0.b();
            DataSource.d dVar = this.$dataSourceParams;
            this.label = 1;
            obj = b.f(dVar, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        PagingSource.a aVar = this.$params;
        DataSource.a aVar2 = (DataSource.a) obj;
        List list = aVar2.a;
        return new PagingSource.b.C0106b(list, (list.isEmpty() && (aVar instanceof PagingSource.a.c)) ? null : aVar2.d(), (aVar2.a.isEmpty() && (aVar instanceof PagingSource.a.C0104a)) ? null : aVar2.c(), aVar2.b(), aVar2.a());
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LegacyPagingSource$load$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
