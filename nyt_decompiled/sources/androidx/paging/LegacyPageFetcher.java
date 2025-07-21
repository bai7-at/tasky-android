package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import androidx.paging.d;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class LegacyPageFetcher {
    private final CoroutineScope a;
    private final PagedList.c b;
    private final PagingSource c;
    private final CoroutineDispatcher d;
    private final CoroutineDispatcher e;
    private final b f;
    private final a g;
    private final AtomicBoolean h;
    private PagedList.d i;

    public interface a {
        Object e();

        Object g();
    }

    public interface b {
        boolean g(LoadType loadType, PagingSource.b.C0106b c0106b);

        void k(LoadType loadType, androidx.paging.d dVar);
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class d extends PagedList.d {
        d() {
        }

        @Override // androidx.paging.PagedList.d
        public void d(LoadType loadType, androidx.paging.d dVar) {
            zq3.h(loadType, TransferTable.COLUMN_TYPE);
            zq3.h(dVar, TransferTable.COLUMN_STATE);
            LegacyPageFetcher.this.f().k(loadType, dVar);
        }
    }

    public LegacyPageFetcher(CoroutineScope coroutineScope, PagedList.c cVar, PagingSource pagingSource, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, b bVar, a aVar) {
        zq3.h(coroutineScope, "pagedListScope");
        zq3.h(cVar, "config");
        zq3.h(pagingSource, "source");
        zq3.h(coroutineDispatcher, "notifyDispatcher");
        zq3.h(coroutineDispatcher2, "fetchDispatcher");
        zq3.h(bVar, "pageConsumer");
        zq3.h(aVar, "keyProvider");
        this.a = coroutineScope;
        this.b = cVar;
        this.c = pagingSource;
        this.d = coroutineDispatcher;
        this.e = coroutineDispatcher2;
        this.f = bVar;
        this.g = aVar;
        this.h = new AtomicBoolean(false);
        this.i = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(LoadType loadType, Throwable th) {
        if (h()) {
            return;
        }
        this.i.e(loadType, new d.a(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(LoadType loadType, PagingSource.b.C0106b c0106b) {
        if (h()) {
            return;
        }
        if (!this.f.g(loadType, c0106b)) {
            this.i.e(loadType, c0106b.c().isEmpty() ? d.c.b.a() : d.c.b.b());
            return;
        }
        int i = c.a[loadType.ordinal()];
        if (i == 1) {
            m();
        } else {
            if (i != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            k();
        }
    }

    private final void k() {
        Object e = this.g.e();
        if (e == null) {
            j(LoadType.APPEND, PagingSource.b.C0106b.f.a());
            return;
        }
        PagedList.d dVar = this.i;
        LoadType loadType = LoadType.APPEND;
        dVar.e(loadType, d.b.b);
        PagedList.c cVar = this.b;
        l(loadType, new PagingSource.a.C0104a(e, cVar.a, cVar.c));
    }

    private final void l(LoadType loadType, PagingSource.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.a, this.e, null, new LegacyPageFetcher$scheduleLoad$1(this, aVar, loadType, null), 2, null);
    }

    private final void m() {
        Object g = this.g.g();
        if (g == null) {
            j(LoadType.PREPEND, PagingSource.b.C0106b.f.a());
            return;
        }
        PagedList.d dVar = this.i;
        LoadType loadType = LoadType.PREPEND;
        dVar.e(loadType, d.b.b);
        PagedList.c cVar = this.b;
        l(loadType, new PagingSource.a.c(g, cVar.a, cVar.c));
    }

    public final void d() {
        this.h.set(true);
    }

    public final PagedList.d e() {
        return this.i;
    }

    public final b f() {
        return this.f;
    }

    public final PagingSource g() {
        return this.c;
    }

    public final boolean h() {
        return this.h.get();
    }

    public final void n() {
        androidx.paging.d b2 = this.i.b();
        if (!(b2 instanceof d.c) || b2.a()) {
            return;
        }
        k();
    }

    public final void o() {
        androidx.paging.d c2 = this.i.c();
        if (!(c2 instanceof d.c) || c2.a()) {
            return;
        }
        m();
    }
}
