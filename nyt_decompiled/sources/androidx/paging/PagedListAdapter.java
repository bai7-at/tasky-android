package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class PagedListAdapter extends RecyclerView.Adapter {
    private final AsyncPagedListDiffer d;
    private final gt2 e;

    protected PagedListAdapter(f.AbstractC0113f abstractC0113f) {
        zq3.h(abstractC0113f, "diffCallback");
        gt2 gt2Var = new gt2() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            public final void b(PagedList pagedList, PagedList pagedList2) {
                PagedListAdapter.this.M(pagedList2);
                PagedListAdapter.this.N(pagedList, pagedList2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((PagedList) obj, (PagedList) obj2);
                return ww8.a;
            }
        };
        this.e = gt2Var;
        AsyncPagedListDiffer asyncPagedListDiffer = new AsyncPagedListDiffer(this, abstractC0113f);
        this.d = asyncPagedListDiffer;
        asyncPagedListDiffer.c(gt2Var);
    }

    public PagedList K() {
        return this.d.d();
    }

    protected Object L(int i) {
        return this.d.e(i);
    }

    public void M(PagedList pagedList) {
    }

    public void N(PagedList pagedList, PagedList pagedList2) {
    }

    public void O(PagedList pagedList) {
        this.d.l(pagedList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.f();
    }
}
