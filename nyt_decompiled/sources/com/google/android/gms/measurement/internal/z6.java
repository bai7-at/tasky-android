package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import defpackage.bmf;
import defpackage.cnf;
import defpackage.erf;
import defpackage.lef;
import defpackage.n1a;
import defpackage.q3f;
import defpackage.slf;
import defpackage.so;
import defpackage.v4f;
import defpackage.vqf;
import defpackage.w2f;
import defpackage.x4f;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class z6 extends w3 {
    protected y6 c;
    private v4f d;
    private final Set e;
    private boolean f;
    private final AtomicReference g;
    private final Object h;
    private n1a i;
    private int j;
    private final AtomicLong k;
    private long l;
    private int m;
    final da n;
    protected boolean o;
    private final w9 p;

    protected z6(a5 a5Var) {
        super(a5Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.o = true;
        this.p = new o6(this);
        this.g = new AtomicReference();
        this.i = new n1a(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new da(a5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void m(Bundle bundle, long j) {
        if (TextUtils.isEmpty(this.a.A().s())) {
            F(bundle, 0, j);
        } else {
            this.a.o().w().a("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Boolean bool, boolean z) {
        c();
        d();
        this.a.o().m().b("Setting app measurement enabled (FE)", bool);
        this.a.E().r(bool);
        if (z) {
            k4 E = this.a.E();
            a5 a5Var = E.a;
            E.c();
            SharedPreferences.Editor edit = E.k().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.a.l() || !(bool == null || bool.booleanValue())) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        c();
        String a = this.a.E().m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                N("app", "_npa", null, this.a.p().currentTimeMillis());
            } else {
                N("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0L : 1L), this.a.p().currentTimeMillis());
            }
        }
        if (!this.a.k() || !this.o) {
            this.a.o().m().a("Updating Scion state (FE)");
            this.a.K().v();
            return;
        }
        this.a.o().m().a("Recording app launch after enabling measurement for the first time (FE)");
        h0();
        cnf.b();
        if (this.a.y().A(null, m3.g0)) {
            this.a.L().d.a();
        }
        this.a.e().y(new d6(this));
    }

    static /* bridge */ /* synthetic */ void d0(z6 z6Var, n1a n1aVar, n1a n1aVar2) {
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            zzah zzahVar = zzahVarArr[i];
            if (!n1aVar2.i(zzahVar) && n1aVar.i(zzahVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = n1aVar.l(n1aVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || l) {
            z6Var.a.A().u();
        }
    }

    static /* synthetic */ void e0(z6 z6Var, n1a n1aVar, int i, long j, boolean z, boolean z2) {
        z6Var.c();
        z6Var.d();
        if (j <= z6Var.l && n1a.j(z6Var.m, i)) {
            z6Var.a.o().t().b("Dropped out-of-date consent setting, proposed settings", n1aVar);
            return;
        }
        k4 E = z6Var.a.E();
        a5 a5Var = E.a;
        E.c();
        if (!E.v(i)) {
            z6Var.a.o().t().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor edit = E.k().edit();
        edit.putString("consent_settings", n1aVar.h());
        edit.putInt("consent_source", i);
        edit.apply();
        z6Var.l = j;
        z6Var.m = i;
        z6Var.a.K().s(z);
        if (z2) {
            z6Var.a.K().R(new AtomicReference());
        }
    }

    protected final void A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.a.e().y(new f6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    final void B(String str, String str2, long j, Object obj) {
        this.a.e().y(new g6(this, str, str2, obj, j));
    }

    final void C(String str) {
        this.g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.a.p().currentTimeMillis());
    }

    public final void E(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.o().v().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        w2f.a(bundle2, "app_id", String.class, null);
        w2f.a(bundle2, "origin", String.class, null);
        w2f.a(bundle2, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null);
        w2f.a(bundle2, "value", Object.class, null);
        w2f.a(bundle2, "trigger_event_name", String.class, null);
        w2f.a(bundle2, "trigger_timeout", Long.class, 0L);
        w2f.a(bundle2, "timed_out_event_name", String.class, null);
        w2f.a(bundle2, "timed_out_event_params", Bundle.class, null);
        w2f.a(bundle2, "triggered_event_name", String.class, null);
        w2f.a(bundle2, "triggered_event_params", Bundle.class, null);
        w2f.a(bundle2, "time_to_live", Long.class, 0L);
        w2f.a(bundle2, "expired_event_name", String.class, null);
        w2f.a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        Object obj = bundle2.get("value");
        if (this.a.M().m0(string) != 0) {
            this.a.o().n().b("Invalid conditional user property name", this.a.C().f(string));
            return;
        }
        if (this.a.M().i0(string, obj) != 0) {
            this.a.o().n().c("Invalid conditional user property value", this.a.C().f(string), obj);
            return;
        }
        Object l = this.a.M().l(string, obj);
        if (l == null) {
            this.a.o().n().c("Unable to normalize conditional user property value", this.a.C().f(string), obj);
            return;
        }
        w2f.b(bundle2, l);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.a.y();
            if (j2 > 15552000000L || j2 < 1) {
                this.a.o().n().c("Invalid conditional user property timeout", this.a.C().f(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong("time_to_live");
        this.a.y();
        if (j3 > 15552000000L || j3 < 1) {
            this.a.o().n().c("Invalid conditional user property time to live", this.a.C().f(string), Long.valueOf(j3));
        } else {
            this.a.e().y(new i6(this, bundle2));
        }
    }

    public final void F(Bundle bundle, int i, long j) {
        d();
        String g = n1a.g(bundle);
        if (g != null) {
            this.a.o().w().b("Ignoring invalid consent setting", g);
            this.a.o().w().a("Valid consent values are 'granted', 'denied'");
        }
        G(n1a.a(bundle), i, j);
    }

    public final void G(n1a n1aVar, int i, long j) {
        n1a n1aVar2;
        boolean z;
        n1a n1aVar3;
        boolean z2;
        boolean z3;
        d();
        if (i != -10 && n1aVar.e() == null && n1aVar.f() == null) {
            this.a.o().w().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            try {
                n1aVar2 = this.i;
                z = false;
                if (n1a.j(i, this.j)) {
                    boolean k = n1aVar.k(this.i);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (n1aVar.i(zzahVar) && !this.i.i(zzahVar)) {
                        z = true;
                    }
                    n1a d = n1aVar.d(this.i);
                    this.i = d;
                    this.j = i;
                    z3 = z;
                    z = true;
                    n1aVar3 = d;
                    z2 = k;
                } else {
                    n1aVar3 = n1aVar;
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.a.o().t().b("Ignoring lower-priority consent settings, proposed settings", n1aVar3);
            return;
        }
        long andIncrement = this.k.getAndIncrement();
        if (z2) {
            this.g.set(null);
            this.a.e().z(new u6(this, n1aVar3, j, i, andIncrement, z3, n1aVar2));
            return;
        }
        v6 v6Var = new v6(this, n1aVar3, i, andIncrement, z3, n1aVar2);
        if (i == 30 || i == -10) {
            this.a.e().z(v6Var);
        } else {
            this.a.e().y(v6Var);
        }
    }

    public final void H(final Bundle bundle, final long j) {
        bmf.b();
        if (this.a.y().A(null, m3.n0)) {
            this.a.e().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.z5
                @Override // java.lang.Runnable
                public final void run() {
                    z6.this.m(bundle, j);
                }
            });
        } else {
            m(bundle, j);
        }
    }

    public final void I(v4f v4fVar) {
        v4f v4fVar2;
        c();
        d();
        if (v4fVar != null && v4fVar != (v4fVar2 = this.d)) {
            Preconditions.checkState(v4fVar2 == null, "EventInterceptor already set.");
        }
        this.d = v4fVar;
    }

    public final void J(Boolean bool) {
        d();
        this.a.e().y(new t6(this, bool));
    }

    final void K(n1a n1aVar) {
        c();
        boolean z = (n1aVar.i(zzah.ANALYTICS_STORAGE) && n1aVar.i(zzah.AD_STORAGE)) || this.a.K().z();
        if (z != this.a.l()) {
            this.a.h(z);
            k4 E = this.a.E();
            a5 a5Var = E.a;
            E.c();
            Boolean valueOf = E.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(E.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                Q(Boolean.valueOf(z), false);
            }
        }
    }

    public final void L(String str, String str2, Object obj, boolean z) {
        M(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.a.p().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z6.M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.c()
            r8.d()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L37
            r4 = 0
            goto L38
        L37:
            r4 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.a5 r0 = r8.a
            com.google.android.gms.measurement.internal.k4 r0 = r0.E()
            com.google.android.gms.measurement.internal.j4 r0 = r0.m
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            java.lang.String r11 = "true"
        L4a:
            r0.b(r11)
            r6 = r10
        L4e:
            r3 = r1
            goto L63
        L50:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.a5 r10 = r8.a
            com.google.android.gms.measurement.internal.k4 r10 = r10.E()
            com.google.android.gms.measurement.internal.j4 r10 = r10.m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            goto L4e
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.google.android.gms.measurement.internal.a5 r10 = r8.a
            boolean r10 = r10.k()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.a5 r8 = r8.a
            com.google.android.gms.measurement.internal.x3 r8 = r8.o()
            com.google.android.gms.measurement.internal.u3 r8 = r8.u()
            java.lang.String r9 = "User property not set since app measurement is disabled"
            r8.a(r9)
            return
        L7b:
            com.google.android.gms.measurement.internal.a5 r10 = r8.a
            boolean r10 = r10.n()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.zzlo r10 = new com.google.android.gms.measurement.internal.zzlo
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.a5 r8 = r8.a
            com.google.android.gms.measurement.internal.m8 r8 = r8.K()
            r8.x(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z6.N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void O(x4f x4fVar) {
        d();
        Preconditions.checkNotNull(x4fVar);
        if (this.e.remove(x4fVar)) {
            return;
        }
        this.a.o().v().a("OnEventListener had not been registered");
    }

    public final int S(String str) {
        Preconditions.checkNotEmpty(str);
        this.a.y();
        return 25;
    }

    public final Boolean T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.a.e().n(atomicReference, 15000L, "boolean test flag value", new m6(this, atomicReference));
    }

    public final Double U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.a.e().n(atomicReference, 15000L, "double test flag value", new s6(this, atomicReference));
    }

    public final Integer V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.a.e().n(atomicReference, 15000L, "int test flag value", new r6(this, atomicReference));
    }

    public final Long W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.a.e().n(atomicReference, 15000L, "long test flag value", new q6(this, atomicReference));
    }

    public final String X() {
        return (String) this.g.get();
    }

    public final String Y() {
        e7 r = this.a.J().r();
        if (r != null) {
            return r.b;
        }
        return null;
    }

    public final String Z() {
        e7 r = this.a.J().r();
        if (r != null) {
            return r.a;
        }
        return null;
    }

    public final String a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.a.e().n(atomicReference, 15000L, "String test flag value", new p6(this, atomicReference));
    }

    public final ArrayList b0(String str, String str2) {
        if (this.a.e().B()) {
            this.a.o().n().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.a.q();
        if (c.a()) {
            this.a.o().n().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.e().n(atomicReference, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, "get conditional user properties", new l6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return x9.u(list);
        }
        this.a.o().n().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map c0(String str, String str2, boolean z) {
        if (this.a.e().B()) {
            this.a.o().n().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.a.q();
        if (c.a()) {
            this.a.o().n().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.e().n(atomicReference, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, "get user properties", new n6(this, atomicReference, null, str, str2, z));
        List<zzlo> list = (List) atomicReference.get();
        if (list == null) {
            this.a.o().n().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        so soVar = new so(list.size());
        for (zzlo zzloVar : list) {
            Object t0 = zzloVar.t0();
            if (t0 != null) {
                soVar.put(zzloVar.zzb, t0);
            }
        }
        return soVar;
    }

    public final void h0() {
        c();
        d();
        if (this.a.n()) {
            if (this.a.y().A(null, m3.a0)) {
                g y = this.a.y();
                y.a.q();
                Boolean s = y.s("google_analytics_deferred_deep_link_enabled");
                if (s != null && s.booleanValue()) {
                    this.a.o().m().a("Deferred Deep Link feature enabled.");
                    this.a.e().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            z6 z6Var = z6.this;
                            z6Var.c();
                            if (z6Var.a.E().r.b()) {
                                z6Var.a.o().m().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long a = z6Var.a.E().s.a();
                            z6Var.a.E().s.b(1 + a);
                            z6Var.a.y();
                            if (a < 5) {
                                z6Var.a.f();
                            } else {
                                z6Var.a.o().v().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                z6Var.a.E().r.a(true);
                            }
                        }
                    });
                }
            }
            this.a.K().N();
            this.o = false;
            k4 E = this.a.E();
            E.c();
            String string = E.k().getString("previous_os_version", null);
            E.a.z().g();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = E.k().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.a.z().g();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean j() {
        return false;
    }

    public final void k(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.a.p().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.e().y(new j6(this, bundle2));
    }

    public final void l() {
        if (!(this.a.zzau().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) this.a.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    final /* synthetic */ void n(Bundle bundle) {
        if (bundle == null) {
            this.a.E().w.b(new Bundle());
            return;
        }
        Bundle a = this.a.E().w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.a.M().T(obj)) {
                    this.a.M().A(this.p, null, 27, null, null, 0);
                }
                this.a.o().w().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (x9.V(str)) {
                this.a.o().w().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                x9 M = this.a.M();
                this.a.y();
                if (M.O("param", str, 100, obj)) {
                    this.a.M().B(a, str, obj);
                }
            }
        }
        this.a.M();
        int i = this.a.y().i();
        if (a.size() > i) {
            int i2 = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i2++;
                if (i2 > i) {
                    a.remove(str2);
                }
            }
            this.a.M().A(this.p, null, 26, null, null, 0);
            this.a.o().w().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.a.E().w.b(a);
        this.a.K().u(a);
    }

    public final void r(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, this.a.p().currentTimeMillis());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.a.J().E(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.d != null && !x9.V(str2)) {
            z3 = false;
        }
        A(str3, str2, j, bundle2, z2, z3, z, null);
    }

    public final void t(String str, String str2, Bundle bundle, String str3) {
        a5.s();
        A(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.a.p().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void u(String str, String str2, Bundle bundle) {
        c();
        v(str, str2, this.a.p().currentTimeMillis(), bundle);
    }

    final void v(String str, String str2, long j, Bundle bundle) {
        c();
        w(str, str2, j, bundle, true, this.d == null || x9.V(str2), true, null);
    }

    protected final void w(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        long j2;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        c();
        d();
        if (!this.a.k()) {
            this.a.o().m().a("Event not sent since app measurement is disabled");
            return;
        }
        List t = this.a.A().t();
        if (t != null && !t.contains(str2)) {
            this.a.o().m().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.r() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.a.zzau());
                } catch (Exception e) {
                    this.a.o().v().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.a.o().t().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.a.q();
            N(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.a.p().currentTimeMillis());
        }
        this.a.q();
        if (z && x9.Z(str2)) {
            this.a.M().y(bundle, this.a.E().w.a());
        }
        if (!z3) {
            this.a.q();
            if (!"_iap".equals(str2)) {
                x9 M = this.a.M();
                int i = 2;
                if (M.Q("event", str2)) {
                    if (M.M("event", q3f.a, q3f.b, str2)) {
                        M.a.y();
                        if (M.L("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.a.o().r().b("Invalid public event name. Event will not be logged (FE)", this.a.C().d(str2));
                    x9 M2 = this.a.M();
                    this.a.y();
                    this.a.M().A(this.p, null, i, "_ev", M2.n(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        vqf.b();
        if (this.a.y().A(null, m3.v0)) {
            this.a.q();
            e7 s = this.a.J().s(false);
            if (s != null && !bundle.containsKey("_sc")) {
                s.d = true;
            }
            x9.x(s, bundle, z && !z3);
        } else {
            this.a.q();
            e7 s2 = this.a.J().s(false);
            if (s2 != null && !bundle.containsKey("_sc")) {
                s2.d = true;
            }
            x9.x(s2, bundle, z && !z3);
        }
        boolean equals = "am".equals(str);
        boolean V = x9.V(str2);
        if (!z || this.d == null || V) {
            z4 = equals;
        } else {
            if (!equals) {
                this.a.o().m().c("Passing event to registered event handler (FE)", this.a.C().d(str2), this.a.C().b(bundle));
                Preconditions.checkNotNull(this.d);
                this.d.a(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (this.a.n()) {
            int j0 = this.a.M().j0(str2);
            if (j0 != 0) {
                this.a.o().r().b("Invalid event name. Event will not be logged (FE)", this.a.C().d(str2));
                x9 M3 = this.a.M();
                this.a.y();
                this.a.M().A(this.p, str3, j0, "_ev", M3.n(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle u0 = this.a.M().u0(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(u0);
            this.a.q();
            if (this.a.J().s(false) != null && "_ae".equals(str2)) {
                z8 z8Var = this.a.L().e;
                long elapsedRealtime = z8Var.d.a.p().elapsedRealtime();
                long j3 = elapsedRealtime - z8Var.b;
                z8Var.b = elapsedRealtime;
                if (j3 > 0) {
                    this.a.M().v(u0, j3);
                }
            }
            slf.b();
            if (this.a.y().A(null, m3.f0)) {
                if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                    x9 M4 = this.a.M();
                    String string = u0.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (lef.a(string, M4.a.E().t.a())) {
                        M4.a.o().m().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    M4.a.E().t.b(string);
                } else if ("_ae".equals(str2)) {
                    String a = this.a.M().a.E().t.a();
                    if (!TextUtils.isEmpty(a)) {
                        u0.putString("_ffr", a);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(u0);
            if (this.a.E().o.a() > 0 && this.a.E().u(j) && this.a.E().q.b()) {
                this.a.o().u().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j2 = 0;
                N(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, this.a.p().currentTimeMillis());
                N(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, this.a.p().currentTimeMillis());
                N(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, this.a.p().currentTimeMillis());
            } else {
                str4 = "_ae";
                j2 = 0;
            }
            if (u0.getLong("extend_session", j2) == 1) {
                this.a.o().u().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.a.L().d.b(j, true);
            }
            ArrayList arrayList2 = new ArrayList(u0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str7 = (String) arrayList2.get(i2);
                if (str7 != null) {
                    this.a.M();
                    Object obj = u0.get(str7);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        u0.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) arrayList.get(i3);
                if (i3 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = this.a.M().t0(bundle2);
                }
                Bundle bundle3 = bundle2;
                this.a.K().k(new zzaw(str6, new zzau(bundle3), str, j), str3);
                if (!z4) {
                    Iterator it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        ((x4f) it2.next()).a(str, str2, new Bundle(bundle3), j);
                    }
                }
            }
            this.a.q();
            if (this.a.J().s(false) == null || !str4.equals(str2)) {
                return;
            }
            this.a.L().e.d(true, true, this.a.p().elapsedRealtime());
        }
    }

    public final void x(x4f x4fVar) {
        d();
        Preconditions.checkNotNull(x4fVar);
        if (this.e.add(x4fVar)) {
            return;
        }
        this.a.o().v().a("OnEventListener already registered");
    }

    public final void y(long j) {
        this.g.set(null);
        this.a.e().y(new h6(this, j));
    }

    final void z(long j, boolean z) {
        c();
        d();
        this.a.o().m().a("Resetting analytics data (FE)");
        b9 L = this.a.L();
        L.c();
        L.e.a();
        erf.b();
        if (this.a.y().A(null, m3.K0)) {
            this.a.A().u();
        }
        boolean k = this.a.k();
        k4 E = this.a.E();
        E.e.b(j);
        if (!TextUtils.isEmpty(E.a.E().t.a())) {
            E.t.b(null);
        }
        cnf.b();
        g y = E.a.y();
        l3 l3Var = m3.g0;
        if (y.A(null, l3Var)) {
            E.o.b(0L);
        }
        if (!E.a.y().D()) {
            E.s(!k);
        }
        E.u.b(null);
        E.v.b(0L);
        E.w.b(null);
        if (z) {
            this.a.K().m();
        }
        cnf.b();
        if (this.a.y().A(null, l3Var)) {
            this.a.L().d.a();
        }
        this.o = !k;
    }
}
