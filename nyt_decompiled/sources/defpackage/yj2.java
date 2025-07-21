package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.t;
import defpackage.gi5;
import defpackage.si5;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class yj2 {
    private final si5 a = new si5();
    private final si5 b = new si5();

    public final void a() {
        this.b.m();
        this.a.m();
    }

    public final void b(qs2 qs2Var, int i, hd hdVar) {
        int n;
        int i2;
        int n2;
        int n3;
        si5 si5Var;
        int n4;
        si5 si5Var2 = this.a;
        gi5.m mVar = gi5.m.c;
        si5Var2.y(mVar);
        si5 a = si5.c.a(si5Var2);
        int i3 = 0;
        si5.c.d(a, gi5.s.a(0), qs2Var);
        si5.c.c(a, gi5.p.a(0), i);
        si5.c.d(a, gi5.s.a(1), hdVar);
        int i4 = si5Var2.g;
        n = si5Var2.n(mVar.b());
        if (i4 == n) {
            int i5 = si5Var2.h;
            n2 = si5Var2.n(mVar.d());
            if (i5 == n2) {
                si5 si5Var3 = this.b;
                gi5.t tVar = gi5.t.c;
                si5Var3.y(tVar);
                si5 a2 = si5.c.a(si5Var3);
                si5.c.c(a2, gi5.p.a(0), i);
                si5.c.d(a2, gi5.s.a(0), hdVar);
                int i6 = si5Var3.g;
                n3 = si5Var3.n(tVar.b());
                if (i6 == n3) {
                    int i7 = si5Var3.h;
                    n4 = si5Var3.n(tVar.d());
                    if (i7 == n4) {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int b = tVar.b();
                int i8 = 0;
                for (int i9 = 0; i9 < b; i9++) {
                    if (((1 << i9) & si5Var3.g) != 0) {
                        if (i8 > 0) {
                            sb.append(", ");
                        }
                        sb.append(tVar.e(gi5.p.a(i9)));
                        i8++;
                    }
                }
                String sb2 = sb.toString();
                zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder();
                int d = tVar.d();
                int i10 = 0;
                while (i3 < d) {
                    if (((1 << i3) & si5Var3.h) != 0) {
                        if (i8 > 0) {
                            sb3.append(", ");
                        }
                        si5Var = si5Var3;
                        sb3.append(tVar.f(gi5.s.a(i3)));
                        i10++;
                    } else {
                        si5Var = si5Var3;
                    }
                    i3++;
                    si5Var3 = si5Var;
                }
                String sb4 = sb3.toString();
                zq3.g(sb4, "StringBuilder().apply(builderAction).toString()");
                throw new IllegalStateException(("Error while pushing " + tVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
            }
        }
        StringBuilder sb5 = new StringBuilder();
        int b2 = mVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b2; i12++) {
            if (((1 << i12) & si5Var2.g) != 0) {
                if (i11 > 0) {
                    sb5.append(", ");
                }
                sb5.append(mVar.e(gi5.p.a(i12)));
                i11++;
            }
        }
        String sb6 = sb5.toString();
        zq3.g(sb6, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb7 = new StringBuilder();
        int d2 = mVar.d();
        int i13 = 0;
        while (i3 < d2) {
            if (((1 << i3) & si5Var2.h) != 0) {
                if (i11 > 0) {
                    sb7.append(", ");
                }
                i2 = d2;
                sb7.append(mVar.f(gi5.s.a(i3)));
                i13++;
            } else {
                i2 = d2;
            }
            i3++;
            d2 = i2;
        }
        String sb8 = sb7.toString();
        zq3.g(sb8, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + mVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb6 + ") and " + i13 + " object arguments (" + sb8 + ").").toString());
    }

    public final void c() {
        if (this.b.u()) {
            this.b.w(this.a);
        } else {
            b.t("Cannot end node insertion, there are no pending operations that can be realized.");
            throw new KotlinNothingValueException();
        }
    }

    public final void d(ln lnVar, t tVar, nv6 nv6Var) {
        if (this.b.t()) {
            this.a.r(lnVar, tVar, nv6Var);
        } else {
            b.t("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw new KotlinNothingValueException();
        }
    }

    public final boolean e() {
        return this.a.t();
    }

    public final void f(Object obj, gt2 gt2Var) {
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
}
