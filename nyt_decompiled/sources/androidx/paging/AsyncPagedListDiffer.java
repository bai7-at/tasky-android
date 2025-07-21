package androidx.paging;

import androidx.paging.AsyncPagedListDiffer;
import androidx.paging.PagedList;
import androidx.paging.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.au5;
import defpackage.d64;
import defpackage.gt2;
import defpackage.uo6;
import defpackage.vn;
import defpackage.xu3;
import defpackage.yt5;
import defpackage.zq3;
import defpackage.zt5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class AsyncPagedListDiffer {
    public d64 a;
    private final androidx.recyclerview.widget.c b;
    private Executor c;
    private final CopyOnWriteArrayList d;
    private PagedList e;
    private PagedList f;
    private int g;
    private final PagedList.d h;
    private final xu3 i;
    private final List j;
    private final PagedList.b k;

    private static final class a implements b {
        private final gt2 a;

        public a(gt2 gt2Var) {
            zq3.h(gt2Var, "callback");
            this.a = gt2Var;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.b
        public void a(PagedList pagedList, PagedList pagedList2) {
            this.a.invoke(pagedList, pagedList2);
        }
    }

    public interface b {
        void a(PagedList pagedList, PagedList pagedList2);
    }

    public static final class c extends PagedList.d {
        c() {
        }

        @Override // androidx.paging.PagedList.d
        public void d(LoadType loadType, androidx.paging.d dVar) {
            zq3.h(loadType, TransferTable.COLUMN_TYPE);
            zq3.h(dVar, TransferTable.COLUMN_STATE);
            Iterator it2 = AsyncPagedListDiffer.this.g().iterator();
            while (it2.hasNext()) {
                ((gt2) it2.next()).invoke(loadType, dVar);
            }
        }
    }

    public static final class d extends PagedList.b {
        d() {
        }

        @Override // androidx.paging.PagedList.b
        public void a(int i, int i2) {
            AsyncPagedListDiffer.this.h().c(i, i2, null);
        }

        @Override // androidx.paging.PagedList.b
        public void b(int i, int i2) {
            AsyncPagedListDiffer.this.h().a(i, i2);
        }

        @Override // androidx.paging.PagedList.b
        public void c(int i, int i2) {
            AsyncPagedListDiffer.this.h().b(i, i2);
        }
    }

    public AsyncPagedListDiffer(RecyclerView.Adapter adapter, f.AbstractC0113f abstractC0113f) {
        zq3.h(adapter, "adapter");
        zq3.h(abstractC0113f, "diffCallback");
        Executor h = vn.h();
        zq3.g(h, "getMainThreadExecutor()");
        this.c = h;
        this.d = new CopyOnWriteArrayList();
        c cVar = new c();
        this.h = cVar;
        this.i = new AsyncPagedListDiffer$loadStateListener$1(cVar);
        this.j = new CopyOnWriteArrayList();
        this.k = new d();
        k(new androidx.recyclerview.widget.b(adapter));
        androidx.recyclerview.widget.c a2 = new c.a(abstractC0113f).a();
        zq3.g(a2, "Builder(diffCallback).build()");
        this.b = a2;
    }

    private final void j(PagedList pagedList, PagedList pagedList2, Runnable runnable) {
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).a(pagedList, pagedList2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final PagedList pagedList, final PagedList pagedList2, final AsyncPagedListDiffer asyncPagedListDiffer, final int i, final PagedList pagedList3, final o oVar, final Runnable runnable) {
        zq3.h(pagedList2, "$newSnapshot");
        zq3.h(asyncPagedListDiffer, "this$0");
        zq3.h(oVar, "$recordingCallback");
        zt5 z = pagedList.z();
        zt5 z2 = pagedList2.z();
        f.AbstractC0113f b2 = asyncPagedListDiffer.b.b();
        zq3.g(b2, "config.diffCallback");
        final yt5 a2 = au5.a(z, z2, b2);
        asyncPagedListDiffer.c.execute(new Runnable() { // from class: ku
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.o(AsyncPagedListDiffer.this, i, pagedList3, pagedList2, a2, oVar, pagedList, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AsyncPagedListDiffer asyncPagedListDiffer, int i, PagedList pagedList, PagedList pagedList2, yt5 yt5Var, o oVar, PagedList pagedList3, Runnable runnable) {
        zq3.h(asyncPagedListDiffer, "this$0");
        zq3.h(pagedList2, "$newSnapshot");
        zq3.h(yt5Var, "$result");
        zq3.h(oVar, "$recordingCallback");
        if (asyncPagedListDiffer.g == i) {
            asyncPagedListDiffer.i(pagedList, pagedList2, yt5Var, oVar, pagedList3.F(), runnable);
        }
    }

    public final void c(gt2 gt2Var) {
        zq3.h(gt2Var, "callback");
        this.d.add(new a(gt2Var));
    }

    public PagedList d() {
        PagedList pagedList = this.f;
        return pagedList == null ? this.e : pagedList;
    }

    public Object e(int i) {
        PagedList pagedList = this.f;
        PagedList pagedList2 = this.e;
        if (pagedList != null) {
            return pagedList.get(i);
        }
        if (pagedList2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList2.H(i);
        return pagedList2.get(i);
    }

    public int f() {
        PagedList d2 = d();
        if (d2 != null) {
            return d2.size();
        }
        return 0;
    }

    public final List g() {
        return this.j;
    }

    public final d64 h() {
        d64 d64Var = this.a;
        if (d64Var != null) {
            return d64Var;
        }
        zq3.z("updateCallback");
        return null;
    }

    public final void i(PagedList pagedList, PagedList pagedList2, yt5 yt5Var, o oVar, int i, Runnable runnable) {
        zq3.h(pagedList, "newList");
        zq3.h(pagedList2, "diffSnapshot");
        zq3.h(yt5Var, "diffResult");
        zq3.h(oVar, "recordingCallback");
        PagedList pagedList3 = this.f;
        if (pagedList3 == null || this.e != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.e = pagedList;
        pagedList.p((gt2) this.i);
        this.f = null;
        au5.b(pagedList3.z(), h(), pagedList2.z(), yt5Var);
        oVar.d(this.k);
        pagedList.o(this.k);
        if (!pagedList.isEmpty()) {
            pagedList.H(uo6.m(au5.c(pagedList3.z(), yt5Var, pagedList2.z(), i), 0, pagedList.size() - 1));
        }
        j(pagedList3, this.e, runnable);
    }

    public final void k(d64 d64Var) {
        zq3.h(d64Var, "<set-?>");
        this.a = d64Var;
    }

    public void l(PagedList pagedList) {
        m(pagedList, null);
    }

    public void m(final PagedList pagedList, final Runnable runnable) {
        final int i = this.g + 1;
        this.g = i;
        PagedList pagedList2 = this.e;
        if (pagedList == pagedList2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (pagedList2 != null && (pagedList instanceof androidx.paging.c)) {
            pagedList2.N(this.k);
            pagedList2.O((gt2) this.i);
            this.h.e(LoadType.REFRESH, d.b.b);
            this.h.e(LoadType.PREPEND, new d.c(false));
            this.h.e(LoadType.APPEND, new d.c(false));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        PagedList d2 = d();
        if (pagedList == null) {
            int f = f();
            if (pagedList2 != null) {
                pagedList2.N(this.k);
                pagedList2.O((gt2) this.i);
                this.e = null;
            } else if (this.f != null) {
                this.f = null;
            }
            h().b(0, f);
            j(d2, null, runnable);
            return;
        }
        if (d() == null) {
            this.e = pagedList;
            pagedList.p((gt2) this.i);
            pagedList.o(this.k);
            h().a(0, pagedList.size());
            j(null, pagedList, runnable);
            return;
        }
        PagedList pagedList3 = this.e;
        if (pagedList3 != null) {
            pagedList3.N(this.k);
            pagedList3.O((gt2) this.i);
            List S = pagedList3.S();
            zq3.f(S, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
            this.f = (PagedList) S;
            this.e = null;
        }
        final PagedList pagedList4 = this.f;
        if (pagedList4 == null || this.e != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List S2 = pagedList.S();
        zq3.f(S2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
        final PagedList pagedList5 = (PagedList) S2;
        final o oVar = new o();
        pagedList.o(oVar);
        this.b.a().execute(new Runnable() { // from class: lu
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.n(PagedList.this, pagedList5, this, i, pagedList, oVar, runnable);
            }
        });
    }
}
