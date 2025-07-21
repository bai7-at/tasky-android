package androidx.paging;

import androidx.paging.PagedList;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements gt2 {
    AsyncPagedListDiffer$loadStateListener$1(Object obj) {
        super(2, obj, PagedList.d.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    public final void g(LoadType loadType, d dVar) {
        zq3.h(loadType, "p0");
        zq3.h(dVar, "p1");
        ((PagedList.d) this.receiver).e(loadType, dVar);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        g((LoadType) obj, (d) obj2);
        return ww8.a;
    }
}
