package defpackage;

import android.view.View;
import kotlin.collections.d;

/* loaded from: classes.dex */
public final class e35 implements d35 {
    private final View a;
    private final i35 b;
    private final int[] c;

    public e35(View view) {
        this.a = view;
        i35 i35Var = new i35(view);
        i35Var.n(true);
        this.b = i35Var;
        this.c = new int[2];
        k99.z0(view, true);
    }

    private final void a() {
        if (this.b.l(0)) {
            this.b.s(0);
        }
        if (this.b.l(1)) {
            this.b.s(1);
        }
    }

    @Override // defpackage.d35
    public Object Q0(long j, long j2, by0 by0Var) {
        float l;
        float l2;
        i35 i35Var = this.b;
        l = f35.l(u49.h(j2));
        l2 = f35.l(u49.i(j2));
        if (!i35Var.a(l, l2, true)) {
            j2 = u49.b.a();
        }
        a();
        return u49.b(j2);
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        int g;
        int k;
        int k2;
        long j2;
        i35 i35Var = this.b;
        g = f35.g(j);
        k = f35.k(i);
        if (!i35Var.q(g, k)) {
            return fd5.b.c();
        }
        d.u(this.c, 0, 0, 0, 6, null);
        i35 i35Var2 = this.b;
        int f = f35.f(fd5.o(j));
        int f2 = f35.f(fd5.p(j));
        int[] iArr = this.c;
        k2 = f35.k(i);
        i35Var2.d(f, f2, iArr, null, k2);
        j2 = f35.j(this.c, j);
        return j2;
    }

    @Override // defpackage.d35
    public Object o0(long j, by0 by0Var) {
        float l;
        float l2;
        i35 i35Var = this.b;
        l = f35.l(u49.h(j));
        l2 = f35.l(u49.i(j));
        if (!i35Var.b(l, l2)) {
            j = u49.b.a();
        }
        a();
        return u49.b(j);
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        int g;
        int k;
        int k2;
        long j3;
        i35 i35Var = this.b;
        g = f35.g(j2);
        k = f35.k(i);
        if (!i35Var.q(g, k)) {
            return fd5.b.c();
        }
        d.u(this.c, 0, 0, 0, 6, null);
        i35 i35Var2 = this.b;
        int f = f35.f(fd5.o(j));
        int f2 = f35.f(fd5.p(j));
        int f3 = f35.f(fd5.o(j2));
        int f4 = f35.f(fd5.p(j2));
        k2 = f35.k(i);
        i35Var2.e(f, f2, f3, f4, null, k2, this.c);
        j3 = f35.j(this.c, j2);
        return j3;
    }
}
