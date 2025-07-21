package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.r;
import androidx.compose.runtime.t;
import defpackage.gi5;
import defpackage.si5;
import java.util.List;

/* loaded from: classes.dex */
public final class ej0 {
    private final si5 a = new si5();

    public final void A(Object obj) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.a0 a0Var = gi5.a0.c;
        si5Var.y(a0Var);
        si5.c.d(si5.c.a(si5Var), gi5.s.a(0), obj);
        int i = si5Var.g;
        n = si5Var.n(a0Var.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(a0Var.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = a0Var.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(a0Var.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = a0Var.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(a0Var.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + a0Var + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void B(Object obj, gt2 gt2Var) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.b0 b0Var = gi5.b0.c;
        si5Var.y(b0Var);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), obj);
        int a2 = gi5.s.a(1);
        zq3.f(gt2Var, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        si5.c.d(a, a2, (gt2) ku8.f(gt2Var, 2));
        int i = si5Var.g;
        n = si5Var.n(b0Var.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(b0Var.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = b0Var.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(b0Var.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = b0Var.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(b0Var.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + b0Var + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void C(Object obj, int i) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.c0 c0Var = gi5.c0.c;
        si5Var.y(c0Var);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), obj);
        si5.c.c(a, gi5.p.a(0), i);
        int i2 = si5Var.g;
        n = si5Var.n(c0Var.b());
        if (i2 == n) {
            int i3 = si5Var.h;
            n2 = si5Var.n(c0Var.d());
            if (i3 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = c0Var.b();
        int i4 = 0;
        for (int i5 = 0; i5 < b; i5++) {
            if (((1 << i5) & si5Var.g) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(c0Var.e(gi5.p.a(i5)));
                i4++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = c0Var.d();
        int i6 = 0;
        for (int i7 = 0; i7 < d; i7++) {
            if (((1 << i7) & si5Var.h) != 0) {
                if (i4 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0Var.f(gi5.s.a(i7)));
                i6++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0Var + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + sb2 + ") and " + i6 + " object arguments (" + sb4 + ").").toString());
    }

    public final void D(int i) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.d0 d0Var = gi5.d0.c;
        si5Var.y(d0Var);
        si5.c.c(si5.c.a(si5Var), gi5.p.a(0), i);
        int i2 = si5Var.g;
        n = si5Var.n(d0Var.b());
        if (i2 == n) {
            int i3 = si5Var.h;
            n2 = si5Var.n(d0Var.d());
            if (i3 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = d0Var.b();
        int i4 = 0;
        for (int i5 = 0; i5 < b; i5++) {
            if (((1 << i5) & si5Var.g) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(d0Var.e(gi5.p.a(i5)));
                i4++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = d0Var.d();
        int i6 = 0;
        for (int i7 = 0; i7 < d; i7++) {
            if (((1 << i7) & si5Var.h) != 0) {
                if (i4 > 0) {
                    sb3.append(", ");
                }
                sb3.append(d0Var.f(gi5.s.a(i7)));
                i6++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + d0Var + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + sb2 + ") and " + i6 + " object arguments (" + sb4 + ").").toString());
    }

    public final void E(Object obj) {
        if (obj instanceof es0) {
            this.a.x(gi5.e0.c);
        }
    }

    public final void a() {
        this.a.m();
    }

    public final void b(ln lnVar, t tVar, nv6 nv6Var) {
        this.a.r(lnVar, tVar, nv6Var);
    }

    public final boolean c() {
        return this.a.t();
    }

    public final boolean d() {
        return this.a.u();
    }

    public final void e(int i) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.a aVar = gi5.a.c;
        si5Var.y(aVar);
        si5.c.c(si5.c.a(si5Var), gi5.p.a(0), i);
        int i2 = si5Var.g;
        n = si5Var.n(aVar.b());
        if (i2 == n) {
            int i3 = si5Var.h;
            n2 = si5Var.n(aVar.d());
            if (i3 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = aVar.b();
        int i4 = 0;
        for (int i5 = 0; i5 < b; i5++) {
            if (((1 << i5) & si5Var.g) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(aVar.e(gi5.p.a(i5)));
                i4++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = aVar.d();
        int i6 = 0;
        for (int i7 = 0; i7 < d; i7++) {
            if (((1 << i7) & si5Var.h) != 0) {
                if (i4 > 0) {
                    sb3.append(", ");
                }
                sb3.append(aVar.f(gi5.s.a(i7)));
                i6++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + aVar + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + sb2 + ") and " + i6 + " object arguments (" + sb4 + ").").toString());
    }

    public final void f(List list, dn3 dn3Var) {
        int n;
        int n2;
        if (list.isEmpty()) {
            return;
        }
        si5 si5Var = this.a;
        gi5.c cVar = gi5.c.c;
        si5Var.y(cVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(1), list);
        si5.c.d(a, gi5.s.a(0), dn3Var);
        int i = si5Var.g;
        n = si5Var.n(cVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(cVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = cVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(cVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = cVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(cVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void g(kw4 kw4Var, c cVar, lw4 lw4Var, lw4 lw4Var2) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.d dVar = gi5.d.c;
        si5Var.y(dVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), kw4Var);
        si5.c.d(a, gi5.s.a(1), cVar);
        si5.c.d(a, gi5.s.a(3), lw4Var2);
        si5.c.d(a, gi5.s.a(2), lw4Var);
        int i = si5Var.g;
        n = si5Var.n(dVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(dVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = dVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(dVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = dVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(dVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + dVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void h() {
        this.a.x(gi5.e.c);
    }

    public final void i(dn3 dn3Var, hd hdVar) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.f fVar = gi5.f.c;
        si5Var.y(fVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), dn3Var);
        si5.c.d(a, gi5.s.a(1), hdVar);
        int i = si5Var.g;
        n = si5Var.n(fVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(fVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = fVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(fVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = fVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(fVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + fVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void j(Object[] objArr) {
        int n;
        int n2;
        if (objArr.length == 0) {
            return;
        }
        si5 si5Var = this.a;
        gi5.g gVar = gi5.g.c;
        si5Var.y(gVar);
        si5.c.d(si5.c.a(si5Var), gi5.s.a(0), objArr);
        int i = si5Var.g;
        n = si5Var.n(gVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(gVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = gVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(gVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = gVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(gVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + gVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void k(ss2 ss2Var, ws0 ws0Var) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.h hVar = gi5.h.c;
        si5Var.y(hVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), ss2Var);
        si5.c.d(a, gi5.s.a(1), ws0Var);
        int i = si5Var.g;
        n = si5Var.n(hVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(hVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = hVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(hVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = hVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(hVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void l() {
        this.a.x(gi5.i.c);
    }

    public final void m() {
        this.a.x(gi5.j.c);
    }

    public final void n(hd hdVar) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.k kVar = gi5.k.c;
        si5Var.y(kVar);
        si5.c.d(si5.c.a(si5Var), gi5.s.a(0), hdVar);
        int i = si5Var.g;
        n = si5Var.n(kVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(kVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = kVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(kVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = kVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(kVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + kVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void o() {
        this.a.x(gi5.l.c);
    }

    public final void p(ej0 ej0Var, dn3 dn3Var) {
        int n;
        int n2;
        if (ej0Var.d()) {
            si5 si5Var = this.a;
            gi5.b bVar = gi5.b.c;
            si5Var.y(bVar);
            si5 a = si5.c.a(si5Var);
            si5.c.d(a, gi5.s.a(0), ej0Var);
            si5.c.d(a, gi5.s.a(1), dn3Var);
            int i = si5Var.g;
            n = si5Var.n(bVar.b());
            if (i == n) {
                int i2 = si5Var.h;
                n2 = si5Var.n(bVar.d());
                if (i2 == n2) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            int b = bVar.b();
            int i3 = 0;
            for (int i4 = 0; i4 < b; i4++) {
                if (((1 << i4) & si5Var.g) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(bVar.e(gi5.p.a(i4)));
                    i3++;
                }
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int d = bVar.d();
            int i5 = 0;
            for (int i6 = 0; i6 < d; i6++) {
                if (((1 << i6) & si5Var.h) != 0) {
                    if (i3 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(bVar.f(gi5.s.a(i6)));
                    i5++;
                }
            }
            String sb4 = sb3.toString();
            zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + bVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void q(hd hdVar, r rVar) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.n nVar = gi5.n.c;
        si5Var.y(nVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), hdVar);
        si5.c.d(a, gi5.s.a(1), rVar);
        int i = si5Var.g;
        n = si5Var.n(nVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(nVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = nVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(nVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = nVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(nVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void r(hd hdVar, r rVar, yj2 yj2Var) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.o oVar = gi5.o.c;
        si5Var.y(oVar);
        si5 a = si5.c.a(si5Var);
        si5.c.d(a, gi5.s.a(0), hdVar);
        si5.c.d(a, gi5.s.a(1), rVar);
        si5.c.d(a, gi5.s.a(2), yj2Var);
        int i = si5Var.g;
        n = si5Var.n(oVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(oVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = oVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(oVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = oVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(oVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void s(int i) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.q qVar = gi5.q.c;
        si5Var.y(qVar);
        si5.c.c(si5.c.a(si5Var), gi5.p.a(0), i);
        int i2 = si5Var.g;
        n = si5Var.n(qVar.b());
        if (i2 == n) {
            int i3 = si5Var.h;
            n2 = si5Var.n(qVar.d());
            if (i3 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = qVar.b();
        int i4 = 0;
        for (int i5 = 0; i5 < b; i5++) {
            if (((1 << i5) & si5Var.g) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(qVar.e(gi5.p.a(i5)));
                i4++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = qVar.d();
        int i6 = 0;
        for (int i7 = 0; i7 < d; i7++) {
            if (((1 << i7) & si5Var.h) != 0) {
                if (i4 > 0) {
                    sb3.append(", ");
                }
                sb3.append(qVar.f(gi5.s.a(i7)));
                i6++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + qVar + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + sb2 + ") and " + i6 + " object arguments (" + sb4 + ").").toString());
    }

    public final void t(int i, int i2, int i3) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.r rVar = gi5.r.c;
        si5Var.y(rVar);
        si5 a = si5.c.a(si5Var);
        si5.c.c(a, gi5.p.a(1), i);
        si5.c.c(a, gi5.p.a(0), i2);
        si5.c.c(a, gi5.p.a(2), i3);
        int i4 = si5Var.g;
        n = si5Var.n(rVar.b());
        if (i4 == n) {
            int i5 = si5Var.h;
            n2 = si5Var.n(rVar.d());
            if (i5 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = rVar.b();
        int i6 = 0;
        for (int i7 = 0; i7 < b; i7++) {
            if (((1 << i7) & si5Var.g) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(rVar.e(gi5.p.a(i7)));
                i6++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = rVar.d();
        int i8 = 0;
        for (int i9 = 0; i9 < d; i9++) {
            if (((1 << i9) & si5Var.h) != 0) {
                if (i6 > 0) {
                    sb3.append(", ");
                }
                sb3.append(rVar.f(gi5.s.a(i9)));
                i8++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i6 + " int arguments (" + sb2 + ") and " + i8 + " object arguments (" + sb4 + ").").toString());
    }

    public final void u(ov6 ov6Var) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.u uVar = gi5.u.c;
        si5Var.y(uVar);
        si5.c.d(si5.c.a(si5Var), gi5.s.a(0), ov6Var);
        int i = si5Var.g;
        n = si5Var.n(uVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(uVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = uVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(uVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = uVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(uVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void v() {
        this.a.x(gi5.v.c);
    }

    public final void w(int i, int i2) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.w wVar = gi5.w.c;
        si5Var.y(wVar);
        si5 a = si5.c.a(si5Var);
        si5.c.c(a, gi5.p.a(0), i);
        si5.c.c(a, gi5.p.a(1), i2);
        int i3 = si5Var.g;
        n = si5Var.n(wVar.b());
        if (i3 == n) {
            int i4 = si5Var.h;
            n2 = si5Var.n(wVar.d());
            if (i4 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = wVar.b();
        int i5 = 0;
        for (int i6 = 0; i6 < b; i6++) {
            if (((1 << i6) & si5Var.g) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(wVar.e(gi5.p.a(i6)));
                i5++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = wVar.d();
        int i7 = 0;
        for (int i8 = 0; i8 < d; i8++) {
            if (((1 << i8) & si5Var.h) != 0) {
                if (i5 > 0) {
                    sb3.append(", ");
                }
                sb3.append(wVar.f(gi5.s.a(i8)));
                i7++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + wVar + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + sb2 + ") and " + i7 + " object arguments (" + sb4 + ").").toString());
    }

    public final void x() {
        this.a.x(gi5.x.c);
    }

    public final void y(qs2 qs2Var) {
        int n;
        int n2;
        si5 si5Var = this.a;
        gi5.y yVar = gi5.y.c;
        si5Var.y(yVar);
        si5.c.d(si5.c.a(si5Var), gi5.s.a(0), qs2Var);
        int i = si5Var.g;
        n = si5Var.n(yVar.b());
        if (i == n) {
            int i2 = si5Var.h;
            n2 = si5Var.n(yVar.d());
            if (i2 == n2) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int b = yVar.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b; i4++) {
            if (((1 << i4) & si5Var.g) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(yVar.e(gi5.p.a(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int d = yVar.d();
        int i5 = 0;
        for (int i6 = 0; i6 < d; i6++) {
            if (((1 << i6) & si5Var.h) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(yVar.f(gi5.s.a(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + yVar + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void z() {
        this.a.x(gi5.z.c);
    }
}
