package androidx.paging;

import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import androidx.paging.j;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gt2;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public class ContiguousPagedList extends PagedList implements j.a, LegacyPageFetcher.b {
    public static final a B = new a(null);
    private final PagingSource k;
    private final Object l;
    private int m;
    private int n;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private final boolean x;
    private final LegacyPageFetcher y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i, int i2, int i3) {
            return ((i2 + i) + 1) - i3;
        }

        public final int b(int i, int i2, int i3) {
            return i - (i2 - i3);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource pagingSource, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, PagedList.a aVar, PagedList.c cVar, PagingSource.b.C0106b c0106b, Object obj) {
        super(pagingSource, coroutineScope, coroutineDispatcher, new j(), cVar);
        zq3.h(pagingSource, "pagingSource");
        zq3.h(coroutineScope, "coroutineScope");
        zq3.h(coroutineDispatcher, "notifyDispatcher");
        zq3.h(coroutineDispatcher2, "backgroundDispatcher");
        zq3.h(cVar, "config");
        zq3.h(c0106b, "initialPage");
        this.k = pagingSource;
        this.l = obj;
        this.t = Integer.MAX_VALUE;
        this.u = RecyclerView.UNDEFINED_DURATION;
        this.x = cVar.e != Integer.MAX_VALUE;
        j C = C();
        zq3.f(C, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.y = new LegacyPageFetcher(coroutineScope, cVar, pagingSource, coroutineDispatcher, coroutineDispatcher2, this, C);
        if (cVar.c) {
            C().u(c0106b.g() != Integer.MIN_VALUE ? c0106b.g() : 0, c0106b, c0106b.f() != Integer.MIN_VALUE ? c0106b.f() : 0, 0, this, (c0106b.g() == Integer.MIN_VALUE || c0106b.f() == Integer.MIN_VALUE) ? false : true);
        } else {
            C().u(0, c0106b, 0, c0106b.g() != Integer.MIN_VALUE ? c0106b.g() : 0, this, false);
        }
        V(LoadType.REFRESH, c0106b.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(boolean z, boolean z2) {
        if (z) {
            zq3.e(null);
            C().n();
            throw null;
        }
        if (z2) {
            zq3.e(null);
            C().p();
            throw null;
        }
    }

    private final void V(LoadType loadType, List list) {
    }

    private final void W(boolean z) {
        boolean z2 = this.r && this.t <= u().b;
        boolean z3 = this.s && this.u >= (size() - 1) - u().b;
        if (z2 || z3) {
            if (z2) {
                this.r = false;
            }
            if (z3) {
                this.s = false;
            }
            if (z) {
                BuildersKt__Builders_commonKt.launch$default(v(), x(), null, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z2, z3, null), 2, null);
            } else {
                U(z2, z3);
            }
        }
    }

    @Override // androidx.paging.PagedList
    public boolean D() {
        return this.y.h();
    }

    @Override // androidx.paging.PagedList
    public void I(int i) {
        a aVar = B;
        int b = aVar.b(u().b, i, C().f());
        int a2 = aVar.a(u().b, i, C().f() + C().c());
        int max = Math.max(b, this.m);
        this.m = max;
        if (max > 0) {
            this.y.o();
        }
        int max2 = Math.max(a2, this.n);
        this.n = max2;
        if (max2 > 0) {
            this.y.n();
        }
        this.t = Math.min(this.t, i);
        this.u = Math.max(this.u, i);
        W(true);
    }

    @Override // androidx.paging.PagedList
    public void Q(LoadType loadType, d dVar) {
        zq3.h(loadType, "loadType");
        zq3.h(dVar, "loadState");
        this.y.e().e(loadType, dVar);
    }

    @Override // androidx.paging.j.a
    public void a(int i, int i2) {
        J(i, i2);
    }

    @Override // androidx.paging.j.a
    public void c(int i, int i2) {
        L(i, i2);
    }

    @Override // androidx.paging.j.a
    public void e(int i, int i2, int i3) {
        J(i, i2);
        K(i + i2, i3);
    }

    @Override // androidx.paging.j.a
    public void f(int i, int i2, int i3) {
        J(i, i2);
        K(0, i3);
        this.t += i3;
        this.u += i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // androidx.paging.LegacyPageFetcher.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(androidx.paging.LoadType r9, androidx.paging.PagingSource.b.C0106b r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ContiguousPagedList.g(androidx.paging.LoadType, androidx.paging.PagingSource$b$b):boolean");
    }

    @Override // androidx.paging.j.a
    public void j(int i) {
        K(0, i);
        this.w = C().f() > 0 || C().j() > 0;
    }

    @Override // androidx.paging.LegacyPageFetcher.b
    public void k(LoadType loadType, d dVar) {
        zq3.h(loadType, TransferTable.COLUMN_TYPE);
        zq3.h(dVar, TransferTable.COLUMN_STATE);
        t(loadType, dVar);
    }

    @Override // androidx.paging.PagedList
    public void q(gt2 gt2Var) {
        zq3.h(gt2Var, "callback");
        this.y.e().a(gt2Var);
    }

    @Override // androidx.paging.PagedList
    public Object w() {
        Object refreshKey;
        m t = C().t(u());
        return (t == null || (refreshKey = this.k.getRefreshKey(t)) == null) ? this.l : refreshKey;
    }

    @Override // androidx.paging.PagedList
    public final PagingSource y() {
        return this.k;
    }
}
