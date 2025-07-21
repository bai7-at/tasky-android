package defpackage;

import defpackage.up5;
import java.util.List;

/* loaded from: classes.dex */
public abstract class aq5 {
    private static final float[] a = new float[0];

    private static final void a(ip5 ip5Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            ip5Var.s((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d11;
            d22 = d28;
            cos = cos;
            ceil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    private static final void b(ip5 ip5Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d * cos) + (d2 * sin)) / d5;
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = ((d3 * cos) + (d4 * sin)) / d5;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            b(ip5Var, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        a(ip5Var, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d5, d6, d, d2, d10, atan2, atan22);
    }

    public static final ip5 c(List list, ip5 ip5Var) {
        up5 up5Var;
        float f;
        int i;
        int i2;
        up5 up5Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float d;
        float e;
        float d2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float c;
        List list2 = list;
        ip5 ip5Var2 = ip5Var;
        int F = ip5Var.F();
        ip5Var.q();
        ip5Var2.A(F);
        up5 up5Var3 = list.isEmpty() ? up5.b.c : (up5) list2.get(0);
        int size = list.size();
        float f11 = 0.0f;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i3 < size) {
            up5 up5Var4 = (up5) list2.get(i3);
            if (up5Var4 instanceof up5.b) {
                ip5Var.close();
                ip5Var2.r(f16, f17);
                up5Var2 = up5Var4;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else if (up5Var4 instanceof up5.n) {
                up5.n nVar = (up5.n) up5Var4;
                f14 += nVar.c();
                f15 += nVar.d();
                ip5Var2.v(nVar.c(), nVar.d());
                up5Var2 = up5Var4;
                f16 = f14;
                f17 = f15;
            } else {
                if (up5Var4 instanceof up5.f) {
                    up5.f fVar = (up5.f) up5Var4;
                    float c2 = fVar.c();
                    float d3 = fVar.d();
                    ip5Var2.r(fVar.c(), fVar.d());
                    f14 = c2;
                    f16 = f14;
                    f15 = d3;
                    f17 = f15;
                } else {
                    if (up5Var4 instanceof up5.m) {
                        up5.m mVar = (up5.m) up5Var4;
                        ip5Var2.H(mVar.c(), mVar.d());
                        f14 += mVar.c();
                        c = mVar.d();
                    } else if (up5Var4 instanceof up5.e) {
                        up5.e eVar = (up5.e) up5Var4;
                        ip5Var2.t(eVar.c(), eVar.d());
                        float c3 = eVar.c();
                        f15 = eVar.d();
                        f14 = c3;
                    } else if (up5Var4 instanceof up5.l) {
                        up5.l lVar = (up5.l) up5Var4;
                        ip5Var2.H(lVar.c(), f11);
                        f14 += lVar.c();
                    } else if (up5Var4 instanceof up5.d) {
                        up5.d dVar = (up5.d) up5Var4;
                        ip5Var2.t(dVar.c(), f15);
                        f14 = dVar.c();
                    } else if (up5Var4 instanceof up5.r) {
                        up5.r rVar = (up5.r) up5Var4;
                        ip5Var2.H(f11, rVar.c());
                        c = rVar.c();
                    } else if (up5Var4 instanceof up5.s) {
                        up5.s sVar = (up5.s) up5Var4;
                        ip5Var2.t(f14, sVar.c());
                        f15 = sVar.c();
                    } else {
                        if (up5Var4 instanceof up5.k) {
                            up5.k kVar = (up5.k) up5Var4;
                            up5Var = up5Var4;
                            ip5Var.w(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                            f4 = kVar.d() + f14;
                            f5 = kVar.g() + f15;
                            f14 += kVar.e();
                            d = kVar.h();
                        } else {
                            up5Var = up5Var4;
                            if (up5Var instanceof up5.c) {
                                up5.c cVar = (up5.c) up5Var;
                                ip5Var.s(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                f4 = cVar.d();
                                e = cVar.g();
                                d2 = cVar.e();
                                f6 = cVar.h();
                            } else if (up5Var instanceof up5.p) {
                                if (up5Var3.a()) {
                                    f10 = f15 - f13;
                                    f9 = f14 - f12;
                                } else {
                                    f9 = f11;
                                    f10 = f9;
                                }
                                up5.p pVar = (up5.p) up5Var;
                                ip5Var.w(f9, f10, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                f4 = pVar.c() + f14;
                                f5 = pVar.e() + f15;
                                f14 += pVar.d();
                                d = pVar.f();
                            } else if (up5Var instanceof up5.h) {
                                if (up5Var3.a()) {
                                    float f18 = 2;
                                    f8 = (f18 * f15) - f13;
                                    f7 = (f14 * f18) - f12;
                                } else {
                                    f7 = f14;
                                    f8 = f15;
                                }
                                up5.h hVar = (up5.h) up5Var;
                                ip5Var.s(f7, f8, hVar.c(), hVar.e(), hVar.d(), hVar.f());
                                f4 = hVar.c();
                                e = hVar.e();
                                d2 = hVar.d();
                                f6 = hVar.f();
                            } else if (up5Var instanceof up5.o) {
                                up5.o oVar = (up5.o) up5Var;
                                ip5Var2.z(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                f4 = oVar.c() + f14;
                                f5 = oVar.e() + f15;
                                f14 += oVar.d();
                                d = oVar.f();
                            } else if (up5Var instanceof up5.g) {
                                up5.g gVar = (up5.g) up5Var;
                                ip5Var2.x(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                f4 = gVar.c();
                                e = gVar.e();
                                d2 = gVar.d();
                                f6 = gVar.f();
                            } else if (up5Var instanceof up5.q) {
                                if (up5Var3.b()) {
                                    f2 = f14 - f12;
                                    f3 = f15 - f13;
                                } else {
                                    f2 = f11;
                                    f3 = f2;
                                }
                                up5.q qVar = (up5.q) up5Var;
                                ip5Var2.z(f2, f3, qVar.c(), qVar.d());
                                f4 = f2 + f14;
                                f5 = f3 + f15;
                                f14 += qVar.c();
                                d = qVar.d();
                            } else {
                                if (up5Var instanceof up5.i) {
                                    if (up5Var3.b()) {
                                        float f19 = 2;
                                        f14 = (f14 * f19) - f12;
                                        f15 = (f19 * f15) - f13;
                                    }
                                    up5.i iVar = (up5.i) up5Var;
                                    ip5Var2.x(f14, f15, iVar.c(), iVar.d());
                                    float c4 = iVar.c();
                                    up5Var2 = up5Var;
                                    f13 = f15;
                                    f = f11;
                                    i = i3;
                                    i2 = size;
                                    f15 = iVar.d();
                                    f12 = f14;
                                    f14 = c4;
                                } else if (up5Var instanceof up5.j) {
                                    up5.j jVar = (up5.j) up5Var;
                                    float c5 = jVar.c() + f14;
                                    float d4 = jVar.d() + f15;
                                    up5Var2 = up5Var;
                                    i = i3;
                                    f = 0.0f;
                                    i2 = size;
                                    b(ip5Var, f14, f15, c5, d4, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                    f12 = c5;
                                    f14 = f12;
                                    f16 = f16;
                                    f17 = f17;
                                    f13 = d4;
                                    f15 = f13;
                                } else {
                                    float f20 = f16;
                                    float f21 = f17;
                                    f = f11;
                                    i = i3;
                                    i2 = size;
                                    if (up5Var instanceof up5.a) {
                                        up5.a aVar = (up5.a) up5Var;
                                        up5Var2 = up5Var;
                                        b(ip5Var, f14, f15, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                        f14 = aVar.c();
                                        f13 = aVar.d();
                                        f15 = f13;
                                        f16 = f20;
                                        f17 = f21;
                                        f12 = f14;
                                    } else {
                                        up5Var2 = up5Var;
                                        f16 = f20;
                                        f17 = f21;
                                    }
                                }
                                i3 = i + 1;
                                ip5Var2 = ip5Var;
                                size = i2;
                                up5Var3 = up5Var2;
                                f11 = f;
                                list2 = list;
                            }
                            up5Var2 = up5Var;
                            f14 = d2;
                            f15 = f6;
                            f = f11;
                            i = i3;
                            i2 = size;
                            f13 = e;
                            f12 = f4;
                            i3 = i + 1;
                            ip5Var2 = ip5Var;
                            size = i2;
                            up5Var3 = up5Var2;
                            f11 = f;
                            list2 = list;
                        }
                        f15 += d;
                        up5Var2 = up5Var;
                        f13 = f5;
                        f = f11;
                        i = i3;
                        i2 = size;
                        f12 = f4;
                        i3 = i + 1;
                        ip5Var2 = ip5Var;
                        size = i2;
                        up5Var3 = up5Var2;
                        f11 = f;
                        list2 = list;
                    }
                    f15 += c;
                }
                up5Var2 = up5Var4;
            }
            f = f11;
            i = i3;
            i2 = size;
            i3 = i + 1;
            ip5Var2 = ip5Var;
            size = i2;
            up5Var3 = up5Var2;
            f11 = f;
            list2 = list;
        }
        return ip5Var;
    }
}
