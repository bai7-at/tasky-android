package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import defpackage.gu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class o33 extends RecyclerView.Adapter implements p33 {
    private final List d = new ArrayList();
    private int e = 1;
    private gr3 f;
    private gu.a g;
    private gu h;
    private final GridLayoutManager.c i;

    class a implements gu.a {
        a() {
        }

        @Override // defpackage.d64
        public void a(int i, int i2) {
            o33.this.w(i, i2);
        }

        @Override // defpackage.d64
        public void b(int i, int i2) {
            o33.this.x(i, i2);
        }

        @Override // defpackage.d64
        public void c(int i, int i2, Object obj) {
            o33.this.v(i, i2, obj);
        }

        @Override // defpackage.d64
        public void d(int i, int i2) {
            o33.this.u(i, i2);
        }
    }

    class b extends GridLayoutManager.c {
        b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            try {
                return o33.this.L(i).p(o33.this.e, i);
            } catch (IndexOutOfBoundsException unused) {
                return o33.this.e;
            }
        }
    }

    public o33() {
        a aVar = new a();
        this.g = aVar;
        this.h = new gu(aVar);
        this.i = new b();
    }

    private gr3 N(int i) {
        gr3 gr3Var = this.f;
        if (gr3Var != null && gr3Var.q() == i) {
            return this.f;
        }
        for (int i2 = 0; i2 < m(); i2++) {
            gr3 L = L(i2);
            if (L.q() == i) {
                return L;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i);
    }

    private void V(Collection collection) {
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((n33) it2.next()).i(this);
        }
        this.d.clear();
        this.d.addAll(collection);
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            ((n33) it3.next()).f(this);
        }
    }

    public gr3 L(int i) {
        return r33.a(this.d, i);
    }

    public gr3 M(t33 t33Var) {
        return t33Var.Z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void z(t33 t33Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void A(t33 t33Var, int i, List list) {
        L(i).k(t33Var, i, list, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public t33 B(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        gr3 N = N(i);
        return N.l(from.inflate(N.o(), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public boolean D(t33 t33Var) {
        return t33Var.Z().u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void E(t33 t33Var) {
        super.E(t33Var);
        M(t33Var).w(t33Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void F(t33 t33Var) {
        super.F(t33Var);
        M(t33Var).x(t33Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void G(t33 t33Var) {
        t33Var.Z().y(t33Var);
    }

    public void W(Collection collection, boolean z) {
        f.e b2 = f.b(new gq1(new ArrayList(this.d), collection), z);
        V(collection);
        b2.c(this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return r33.b(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long n(int i) {
        return L(i).n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        gr3 L = L(i);
        this.f = L;
        if (L != null) {
            return L.q();
        }
        throw new RuntimeException("Invalid position " + i);
    }
}
