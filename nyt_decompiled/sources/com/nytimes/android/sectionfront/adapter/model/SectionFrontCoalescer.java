package com.nytimes.android.sectionfront.adapter.model;

import com.nytimes.android.api.cms.SectionFront;
import defpackage.ef7;
import defpackage.ir3;
import defpackage.ue7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class SectionFrontCoalescer extends ir3 {
    private a g;
    protected GetMoreItemsCoalescerSource getMoreItemsSource;
    private boolean h;
    protected SectionCoalescerSource sectionSource;

    public static class a {
        public boolean a;
        public boolean b;
        public boolean c;
        public int d;
        public int e;
        public boolean f;
        public int g;
    }

    private ue7 o(a aVar) {
        ue7 ue7Var = new ue7();
        ue7Var.b = aVar.b;
        ue7Var.a = aVar.a;
        ue7Var.c = aVar.d;
        ue7Var.d = aVar.c;
        ue7Var.e = aVar.g;
        return ue7Var;
    }

    @Override // defpackage.ir3
    protected List f(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(new ef7(this.g.g).b(this.sectionSource.a()));
        arrayList.addAll(this.getMoreItemsSource.a());
        return arrayList;
    }

    public void k(a aVar) {
        this.g = aVar;
        this.h = false;
        this.sectionSource.k(o(aVar));
        c(this.sectionSource);
        c(this.getMoreItemsSource);
    }

    public boolean l() {
        return this.g != null;
    }

    public void m(boolean z) {
        if (this.h != z) {
            this.h = z;
            i();
        }
    }

    public void n(SectionFront sectionFront) {
        this.sectionSource.r(sectionFront);
        this.getMoreItemsSource.e(sectionFront);
    }

    public void p(a aVar) {
        this.g = aVar;
        this.sectionSource.s(o(aVar));
    }
}
