package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.erf;
import defpackage.n1a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class n5 implements Callable {
    final /* synthetic */ zzaw a;
    final /* synthetic */ String b;
    final /* synthetic */ t5 c;

    n5(t5 t5Var, zzaw zzawVar, String str) {
        this.c = t5Var;
        this.a = zzawVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r9 r9Var;
        r9 r9Var2;
        byte[] bArr;
        r9 r9Var3;
        v9 v9Var;
        com.google.android.gms.internal.measurement.s0 s0Var;
        q5 q5Var;
        String str;
        Bundle bundle;
        q c;
        long j;
        r9Var = this.c.a;
        r9Var.a();
        r9Var2 = this.c.a;
        d7 b0 = r9Var2.b0();
        zzaw zzawVar = this.a;
        String str2 = this.b;
        b0.c();
        a5.s();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str2);
        if (!b0.a.y().A(str2, m3.V)) {
            b0.a.o().m().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            b0.a.o().m().c("Generating a payload for this event is not available. package_name, event_name", str2, zzawVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.q0 r = com.google.android.gms.internal.measurement.r0.r();
        b0.b.U().d0();
        try {
            q5 Q = b0.b.U().Q(str2);
            if (Q == null) {
                b0.a.o().m().b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                r9Var3 = b0.b;
            } else if (Q.K()) {
                com.google.android.gms.internal.measurement.s0 O1 = com.google.android.gms.internal.measurement.t0.O1();
                O1.X(1);
                O1.T("android");
                if (!TextUtils.isEmpty(Q.e0())) {
                    O1.q(Q.e0());
                }
                if (!TextUtils.isEmpty(Q.g0())) {
                    O1.s((String) Preconditions.checkNotNull(Q.g0()));
                }
                if (!TextUtils.isEmpty(Q.h0())) {
                    O1.t((String) Preconditions.checkNotNull(Q.h0()));
                }
                if (Q.M() != -2147483648L) {
                    O1.u((int) Q.M());
                }
                O1.J(Q.X());
                O1.D(Q.V());
                String j0 = Q.j0();
                String c0 = Q.c0();
                if (!TextUtils.isEmpty(j0)) {
                    O1.I(j0);
                } else if (!TextUtils.isEmpty(c0)) {
                    O1.o(c0);
                }
                n1a T = b0.b.T(str2);
                O1.z(Q.U());
                if (b0.a.k() && b0.a.y().B(O1.l0()) && T.i(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    O1.B(null);
                }
                O1.y(T.h());
                if (T.i(zzah.AD_STORAGE)) {
                    Pair j2 = b0.b.c0().j(Q.e0(), T);
                    if (Q.J() && !TextUtils.isEmpty((CharSequence) j2.first)) {
                        try {
                            O1.Y(d7.a((String) j2.first, Long.toString(zzawVar.zzd)));
                            Object obj = j2.second;
                            if (obj != null) {
                                O1.M(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e) {
                            b0.a.o().m().b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            r9Var3 = b0.b;
                        }
                    }
                }
                b0.a.z().g();
                O1.A(Build.MODEL);
                b0.a.z().g();
                O1.N(Build.VERSION.RELEASE);
                O1.d0((int) b0.a.z().l());
                O1.j0(b0.a.z().m());
                try {
                    if (T.i(zzah.ANALYTICS_STORAGE) && Q.f0() != null) {
                        O1.r(d7.a((String) Preconditions.checkNotNull(Q.f0()), Long.toString(zzawVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(Q.i0())) {
                        O1.H((String) Preconditions.checkNotNull(Q.i0()));
                    }
                    String e0 = Q.e0();
                    List b02 = b0.b.U().b0(e0);
                    Iterator it2 = b02.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            v9Var = null;
                            break;
                        }
                        v9Var = (v9) it2.next();
                        if ("_lte".equals(v9Var.c)) {
                            break;
                        }
                    }
                    if (v9Var == null || v9Var.e == null) {
                        v9 v9Var2 = new v9(e0, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", b0.a.p().currentTimeMillis(), 0L);
                        b02.add(v9Var2);
                        b0.b.U().w(v9Var2);
                    }
                    t9 e02 = b0.b.e0();
                    e02.a.o().u().a("Checking account type status for ad personalization signals");
                    if (e02.a.z().r()) {
                        String e03 = Q.e0();
                        Preconditions.checkNotNull(e03);
                        if (Q.J() && e02.b.Y().A(e03)) {
                            e02.a.o().m().a("Turning off ad personalization due to account type");
                            Iterator it3 = b02.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((v9) it3.next()).c)) {
                                    it3.remove();
                                    break;
                                }
                            }
                            b02.add(new v9(e03, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", e02.a.p().currentTimeMillis(), 1L));
                        }
                    }
                    com.google.android.gms.internal.measurement.c1[] c1VarArr = new com.google.android.gms.internal.measurement.c1[b02.size()];
                    for (int i = 0; i < b02.size(); i++) {
                        com.google.android.gms.internal.measurement.b1 u = com.google.android.gms.internal.measurement.c1.u();
                        u.r(((v9) b02.get(i)).c);
                        u.s(((v9) b02.get(i)).d);
                        b0.b.e0().J(u, ((v9) b02.get(i)).e);
                        c1VarArr[i] = (com.google.android.gms.internal.measurement.c1) u.i();
                    }
                    O1.z0(Arrays.asList(c1VarArr));
                    y3 b = y3.b(zzawVar);
                    b0.a.M().y(b.d, b0.b.U().P(str2));
                    b0.a.M().z(b, b0.a.y().j(str2));
                    Bundle bundle2 = b.d;
                    bundle2.putLong("_c", 1L);
                    b0.a.o().m().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzawVar.zzc);
                    if (b0.a.M().S(O1.l0())) {
                        b0.a.M().B(bundle2, "_dbg", 1L);
                        b0.a.M().B(bundle2, "_r", 1L);
                    }
                    q U = b0.b.U().U(str2, zzawVar.zza);
                    if (U == null) {
                        s0Var = O1;
                        q5Var = Q;
                        str = str2;
                        bundle = bundle2;
                        c = new q(str2, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        s0Var = O1;
                        q5Var = Q;
                        str = str2;
                        bundle = bundle2;
                        long j3 = U.f;
                        c = U.c(zzawVar.zzd);
                        j = j3;
                    }
                    b0.b.U().m(c);
                    p pVar = new p(b0.a, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle);
                    com.google.android.gms.internal.measurement.i0 v = com.google.android.gms.internal.measurement.j0.v();
                    v.y(pVar.d);
                    v.u(pVar.b);
                    v.x(pVar.e);
                    r rVar = new r(pVar.f);
                    while (rVar.hasNext()) {
                        String next = rVar.next();
                        com.google.android.gms.internal.measurement.m0 v2 = com.google.android.gms.internal.measurement.n0.v();
                        v2.v(next);
                        Object X0 = pVar.f.X0(next);
                        if (X0 != null) {
                            b0.b.e0().I(v2, X0);
                            v.q(v2);
                        }
                    }
                    com.google.android.gms.internal.measurement.s0 s0Var2 = s0Var;
                    s0Var2.A0(v);
                    com.google.android.gms.internal.measurement.u0 r2 = com.google.android.gms.internal.measurement.w0.r();
                    com.google.android.gms.internal.measurement.k0 r3 = com.google.android.gms.internal.measurement.l0.r();
                    r3.m(c.c);
                    r3.n(zzawVar.zza);
                    r2.m(r3);
                    s0Var2.U(r2);
                    s0Var2.v0(b0.b.R().i(q5Var.e0(), Collections.emptyList(), s0Var2.p0(), Long.valueOf(v.o()), Long.valueOf(v.o())));
                    if (v.D()) {
                        s0Var2.c0(v.o());
                        s0Var2.E(v.o());
                    }
                    long Y = q5Var.Y();
                    if (Y != 0) {
                        s0Var2.V(Y);
                    }
                    long a0 = q5Var.a0();
                    if (a0 != 0) {
                        s0Var2.W(a0);
                    } else if (Y != 0) {
                        s0Var2.W(Y);
                    }
                    String b2 = q5Var.b();
                    erf.b();
                    if (b0.a.y().A(null, m3.J0) && b2 != null) {
                        s0Var2.b0(b2);
                    }
                    q5Var.e();
                    s0Var2.v((int) q5Var.Z());
                    b0.a.y().m();
                    s0Var2.h0(64000L);
                    s0Var2.g0(b0.a.p().currentTimeMillis());
                    s0Var2.a0(true);
                    r.m(s0Var2);
                    q5 q5Var2 = q5Var;
                    q5Var2.D(s0Var2.s0());
                    q5Var2.B(s0Var2.r0());
                    b0.b.U().l(q5Var2);
                    b0.b.U().k();
                    try {
                        return b0.b.e0().N(((com.google.android.gms.internal.measurement.r0) r.i()).e());
                    } catch (IOException e2) {
                        b0.a.o().n().c("Data loss. Failed to bundle and serialize. appId", x3.y(str), e2);
                        return null;
                    }
                } catch (SecurityException e3) {
                    b0.a.o().m().b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    r9Var3 = b0.b;
                }
            } else {
                b0.a.o().m().b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                r9Var3 = b0.b;
            }
            r9Var3.U().e0();
            return bArr;
        } finally {
            b0.b.U().e0();
        }
    }
}
