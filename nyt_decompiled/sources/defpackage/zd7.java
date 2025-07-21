package defpackage;

import androidx.paging.PagingSource;
import androidx.paging.m;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor;

/* loaded from: classes4.dex */
public final class zd7 extends PagingSource {
    private final ContentSearchExecutor a;
    private final String b;

    public zd7(ContentSearchExecutor contentSearchExecutor, String str) {
        zq3.h(contentSearchExecutor, "searchExecutor");
        zq3.h(str, "query");
        this.a = contentSearchExecutor;
        this.b = str;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getRefreshKey(m mVar) {
        zq3.h(mVar, TransferTable.COLUMN_STATE);
        return null;
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.a aVar, by0 by0Var) {
        return this.a.b(this.b, (String) aVar.a(), by0Var);
    }
}
