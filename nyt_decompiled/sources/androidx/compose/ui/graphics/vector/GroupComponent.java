package androidx.compose.ui.graphics.vector;

import defpackage.aq5;
import defpackage.c49;
import defpackage.cg;
import defpackage.fv1;
import defpackage.ip5;
import defpackage.iv1;
import defpackage.kg4;
import defpackage.nn0;
import defpackage.ox7;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class GroupComponent extends a {
    private float[] b;
    private final List c;
    private boolean d;
    private long e;
    private List f;
    private boolean g;
    private ip5 h;
    private ss2 i;
    private final ss2 j;
    private String k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private boolean s;

    public GroupComponent() {
        super(null);
        this.c = new ArrayList();
        this.d = true;
        this.e = nn0.b.g();
        this.f = c49.e();
        this.g = true;
        this.j = new ss2() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            public final void b(a aVar) {
                GroupComponent.this.n(aVar);
                ss2 b = GroupComponent.this.b();
                if (b != null) {
                    b.invoke(aVar);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a) obj);
                return ww8.a;
            }
        };
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    private final boolean h() {
        return !this.f.isEmpty();
    }

    private final void k() {
        this.d = false;
        this.e = nn0.b.g();
    }

    private final void l(yc0 yc0Var) {
        if (this.d && yc0Var != null) {
            if (yc0Var instanceof ox7) {
                m(((ox7) yc0Var).b());
            } else {
                k();
            }
        }
    }

    private final void m(long j) {
        if (this.d) {
            nn0.a aVar = nn0.b;
            if (j != aVar.g()) {
                if (this.e == aVar.g()) {
                    this.e = j;
                } else {
                    if (c49.f(this.e, j)) {
                        return;
                    }
                    k();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a aVar) {
        if (aVar instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) aVar;
            l(pathComponent.e());
            l(pathComponent.g());
        } else if (aVar instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) aVar;
            if (groupComponent.d && this.d) {
                m(groupComponent.e);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            ip5 ip5Var = this.h;
            if (ip5Var == null) {
                ip5Var = cg.a();
                this.h = ip5Var;
            }
            aq5.c(this.f, ip5Var);
        }
    }

    private final void y() {
        float[] fArr = this.b;
        if (fArr == null) {
            fArr = kg4.c(null, 1, null);
            this.b = fArr;
        } else {
            kg4.h(fArr);
        }
        kg4.n(fArr, this.m + this.q, this.n + this.r, 0.0f, 4, null);
        kg4.i(fArr, this.l);
        kg4.j(fArr, this.o, this.p, 1.0f);
        kg4.n(fArr, -this.m, -this.n, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void a(fv1 fv1Var) {
        if (this.s) {
            y();
            this.s = false;
        }
        if (this.g) {
            x();
            this.g = false;
        }
        zu1 i1 = fv1Var.i1();
        long b = i1.b();
        i1.c().t();
        iv1 a = i1.a();
        float[] fArr = this.b;
        if (fArr != null) {
            a.a(kg4.a(fArr).o());
        }
        ip5 ip5Var = this.h;
        if (h() && ip5Var != null) {
            iv1.g(a, ip5Var, 0, 2, null);
        }
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((a) list.get(i)).a(fv1Var);
        }
        i1.c().k();
        i1.d(b);
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public ss2 b() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void d(ss2 ss2Var) {
        this.i = ss2Var;
    }

    public final int f() {
        return this.c.size();
    }

    public final long g() {
        return this.e;
    }

    public final void i(int i, a aVar) {
        if (i < f()) {
            this.c.set(i, aVar);
        } else {
            this.c.add(aVar);
        }
        n(aVar);
        aVar.d(this.j);
        c();
    }

    public final boolean j() {
        return this.d;
    }

    public final void o(List list) {
        this.f = list;
        this.g = true;
        c();
    }

    public final void p(String str) {
        this.k = str;
        c();
    }

    public final void q(float f) {
        this.m = f;
        this.s = true;
        c();
    }

    public final void r(float f) {
        this.n = f;
        this.s = true;
        c();
    }

    public final void s(float f) {
        this.l = f;
        this.s = true;
        c();
    }

    public final void t(float f) {
        this.o = f;
        this.s = true;
        c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.k);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) list.get(i);
            sb.append("\t");
            sb.append(aVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void u(float f) {
        this.p = f;
        this.s = true;
        c();
    }

    public final void v(float f) {
        this.q = f;
        this.s = true;
        c();
    }

    public final void w(float f) {
        this.r = f;
        this.s = true;
        c();
    }
}
