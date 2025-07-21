package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends ContiguousPagedList {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, PagedList.c cVar, Object obj) {
        super(new LegacyPagingSource(coroutineDispatcher, new b()), coroutineScope, coroutineDispatcher, coroutineDispatcher2, null, cVar, PagingSource.b.C0106b.f.a(), obj);
        zq3.h(coroutineScope, "coroutineScope");
        zq3.h(coroutineDispatcher, "notifyDispatcher");
        zq3.h(coroutineDispatcher2, "backgroundDispatcher");
        zq3.h(cVar, "config");
    }
}
