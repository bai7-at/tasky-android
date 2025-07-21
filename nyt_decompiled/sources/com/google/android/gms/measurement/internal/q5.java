package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.zhe;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class q5 {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final a5 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private String r;
    private Boolean s;
    private long t;
    private List u;
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;

    q5(a5 a5Var, String str) {
        Preconditions.checkNotNull(a5Var);
        Preconditions.checkNotEmpty(str);
        this.a = a5Var;
        this.b = str;
        a5Var.e().c();
    }

    public final long A() {
        this.a.e().c();
        return this.p;
    }

    public final void B(long j) {
        this.a.e().c();
        this.D |= this.i != j;
        this.i = j;
    }

    public final void C(long j) {
        Preconditions.checkArgument(j >= 0);
        this.a.e().c();
        this.D |= this.g != j;
        this.g = j;
    }

    public final void D(long j) {
        this.a.e().c();
        this.D |= this.h != j;
        this.h = j;
    }

    public final void E(boolean z) {
        this.a.e().c();
        this.D |= this.o != z;
        this.o = z;
    }

    public final void F(Boolean bool) {
        this.a.e().c();
        this.D |= !zhe.a(this.s, bool);
        this.s = bool;
    }

    public final void G(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.e, str);
        this.e = str;
    }

    public final void H(List list) {
        this.a.e().c();
        if (zhe.a(this.u, list)) {
            return;
        }
        this.D = true;
        this.u = list != null ? new ArrayList(list) : null;
    }

    public final void I(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.v, str);
        this.v = str;
    }

    public final boolean J() {
        this.a.e().c();
        return this.q;
    }

    public final boolean K() {
        this.a.e().c();
        return this.o;
    }

    public final boolean L() {
        this.a.e().c();
        return this.D;
    }

    public final long M() {
        this.a.e().c();
        return this.k;
    }

    public final long N() {
        this.a.e().c();
        return this.E;
    }

    public final long O() {
        this.a.e().c();
        return this.z;
    }

    public final long P() {
        this.a.e().c();
        return this.A;
    }

    public final long Q() {
        this.a.e().c();
        return this.y;
    }

    public final long R() {
        this.a.e().c();
        return this.x;
    }

    public final long S() {
        this.a.e().c();
        return this.B;
    }

    public final long T() {
        this.a.e().c();
        return this.w;
    }

    public final long U() {
        this.a.e().c();
        return this.n;
    }

    public final long V() {
        this.a.e().c();
        return this.t;
    }

    public final long W() {
        this.a.e().c();
        return this.F;
    }

    public final long X() {
        this.a.e().c();
        return this.m;
    }

    public final long Y() {
        this.a.e().c();
        return this.i;
    }

    public final long Z() {
        this.a.e().c();
        return this.g;
    }

    public final String a() {
        this.a.e().c();
        return this.e;
    }

    public final long a0() {
        this.a.e().c();
        return this.h;
    }

    public final String b() {
        this.a.e().c();
        return this.v;
    }

    public final Boolean b0() {
        this.a.e().c();
        return this.s;
    }

    public final List c() {
        this.a.e().c();
        return this.u;
    }

    public final String c0() {
        this.a.e().c();
        return this.r;
    }

    public final void d() {
        this.a.e().c();
        this.D = false;
    }

    public final String d0() {
        this.a.e().c();
        String str = this.C;
        z(null);
        return str;
    }

    public final void e() {
        this.a.e().c();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.o().v().b("Bundle index overflow. appId", x3.y(this.b));
            j = 0;
        }
        this.D = true;
        this.g = j;
    }

    public final String e0() {
        this.a.e().c();
        return this.b;
    }

    public final void f(String str) {
        this.a.e().c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ zhe.a(this.r, str);
        this.r = str;
    }

    public final String f0() {
        this.a.e().c();
        return this.c;
    }

    public final void g(boolean z) {
        this.a.e().c();
        this.D |= this.q != z;
        this.q = z;
    }

    public final String g0() {
        this.a.e().c();
        return this.l;
    }

    public final void h(long j) {
        this.a.e().c();
        this.D |= this.p != j;
        this.p = j;
    }

    public final String h0() {
        this.a.e().c();
        return this.j;
    }

    public final void i(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.c, str);
        this.c = str;
    }

    public final String i0() {
        this.a.e().c();
        return this.f;
    }

    public final void j(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.l, str);
        this.l = str;
    }

    public final String j0() {
        this.a.e().c();
        return this.d;
    }

    public final void k(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.j, str);
        this.j = str;
    }

    public final String k0() {
        this.a.e().c();
        return this.C;
    }

    public final void l(long j) {
        this.a.e().c();
        this.D |= this.k != j;
        this.k = j;
    }

    public final void m(long j) {
        this.a.e().c();
        this.D |= this.E != j;
        this.E = j;
    }

    public final void n(long j) {
        this.a.e().c();
        this.D |= this.z != j;
        this.z = j;
    }

    public final void o(long j) {
        this.a.e().c();
        this.D |= this.A != j;
        this.A = j;
    }

    public final void p(long j) {
        this.a.e().c();
        this.D |= this.y != j;
        this.y = j;
    }

    public final void q(long j) {
        this.a.e().c();
        this.D |= this.x != j;
        this.x = j;
    }

    public final void r(long j) {
        this.a.e().c();
        this.D |= this.B != j;
        this.B = j;
    }

    public final void s(long j) {
        this.a.e().c();
        this.D |= this.w != j;
        this.w = j;
    }

    public final void t(long j) {
        this.a.e().c();
        this.D |= this.n != j;
        this.n = j;
    }

    public final void u(long j) {
        this.a.e().c();
        this.D |= this.t != j;
        this.t = j;
    }

    public final void v(long j) {
        this.a.e().c();
        this.D |= this.F != j;
        this.F = j;
    }

    public final void w(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.f, str);
        this.f = str;
    }

    public final void x(String str) {
        this.a.e().c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ zhe.a(this.d, str);
        this.d = str;
    }

    public final void y(long j) {
        this.a.e().c();
        this.D |= this.m != j;
        this.m = j;
    }

    public final void z(String str) {
        this.a.e().c();
        this.D |= !zhe.a(this.C, str);
        this.C = str;
    }
}
