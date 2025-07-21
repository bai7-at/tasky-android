package androidx.lifecycle;

import defpackage.fy4;
import defpackage.l77;
import defpackage.vc5;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends fy4 {
    private l77 l = new l77();

    private static class a implements vc5 {
        final LiveData a;
        final vc5 b;
        int c = -1;

        a(LiveData liveData, vc5 vc5Var) {
            this.a = liveData;
            this.b = vc5Var;
        }

        @Override // defpackage.vc5
        public void a(Object obj) {
            if (this.c != this.a.g()) {
                this.c = this.a.g();
                this.b.a(obj);
            }
        }

        void b() {
            this.a.k(this);
        }

        void c() {
            this.a.o(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void l() {
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            ((a) ((Map.Entry) it2.next()).getValue()).b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void m() {
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            ((a) ((Map.Entry) it2.next()).getValue()).c();
        }
    }

    public void q(LiveData liveData, vc5 vc5Var) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(liveData, vc5Var);
        a aVar2 = (a) this.l.j(liveData, aVar);
        if (aVar2 != null && aVar2.b != vc5Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && h()) {
            aVar.b();
        }
    }
}
