package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class i {
    public static final PagingSource.a a(PagedList.c cVar, Object obj) {
        zq3.h(cVar, "<this>");
        return new PagingSource.a.d(obj, cVar.d, cVar.c);
    }
}
