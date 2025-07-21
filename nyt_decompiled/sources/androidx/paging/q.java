package androidx.paging;

import defpackage.gt2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class q extends PagedList {
    private final PagedList k;
    private final boolean l;
    private final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PagedList pagedList) {
        super(pagedList.y(), pagedList.v(), pagedList.x(), pagedList.C().D(), pagedList.u());
        zq3.h(pagedList, "pagedList");
        this.k = pagedList;
        this.l = true;
        this.m = true;
    }

    @Override // androidx.paging.PagedList
    public boolean D() {
        return this.m;
    }

    @Override // androidx.paging.PagedList
    public boolean E() {
        return this.l;
    }

    @Override // androidx.paging.PagedList
    public void I(int i) {
    }

    @Override // androidx.paging.PagedList
    public void q(gt2 gt2Var) {
        zq3.h(gt2Var, "callback");
    }

    @Override // androidx.paging.PagedList
    public Object w() {
        return this.k.w();
    }
}
