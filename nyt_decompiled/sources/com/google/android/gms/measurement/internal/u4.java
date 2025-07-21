package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.measurement.internal.u4;
import defpackage.cvf;
import defpackage.dqf;
import defpackage.hd4;
import defpackage.nhf;
import defpackage.q3f;
import defpackage.qxf;
import defpackage.so;
import defpackage.uab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class u4 extends g9 implements f {
    private final Map d;
    final Map e;
    final Map f;
    final Map g;
    private final Map h;
    private final Map i;
    final hd4 j;
    final cvf k;
    private final Map l;
    private final Map m;
    private final Map n;

    u4(r9 r9Var) {
        super(r9Var);
        this.d = new so();
        this.e = new so();
        this.f = new so();
        this.g = new so();
        this.h = new so();
        this.l = new so();
        this.m = new so();
        this.n = new so();
        this.i = new so();
        this.j = new r4(this, 20);
        this.k = new s4(this);
    }

    private final com.google.android.gms.internal.measurement.v i(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.v.x();
        }
        try {
            com.google.android.gms.internal.measurement.v vVar = (com.google.android.gms.internal.measurement.v) ((com.google.android.gms.internal.measurement.u) t9.B(com.google.android.gms.internal.measurement.v.v(), bArr)).i();
            this.a.o().u().c("Parsed config. version, gmp_app_id", vVar.I() ? Long.valueOf(vVar.t()) : null, vVar.H() ? vVar.y() : null);
            return vVar;
        } catch (zzkm e) {
            this.a.o().v().c("Unable to merge remote config. appId", x3.y(str), e);
            return com.google.android.gms.internal.measurement.v.x();
        } catch (RuntimeException e2) {
            this.a.o().v().c("Unable to merge remote config. appId", x3.y(str), e2);
            return com.google.android.gms.internal.measurement.v.x();
        }
    }

    private final void j(String str, com.google.android.gms.internal.measurement.u uVar) {
        HashSet hashSet = new HashSet();
        so soVar = new so();
        so soVar2 = new so();
        so soVar3 = new so();
        if (uVar != null) {
            dqf.b();
            if (this.a.y().A(null, m3.D0)) {
                Iterator it2 = uVar.s().iterator();
                while (it2.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.r) it2.next()).s());
                }
            }
            for (int i = 0; i < uVar.m(); i++) {
                com.google.android.gms.internal.measurement.s sVar = (com.google.android.gms.internal.measurement.s) uVar.n(i).g();
                if (sVar.o().isEmpty()) {
                    this.a.o().v().a("EventConfig contained null event name");
                } else {
                    String o = sVar.o();
                    String b = q3f.b(sVar.o());
                    if (!TextUtils.isEmpty(b)) {
                        sVar.n(b);
                        uVar.p(i, sVar);
                    }
                    if (sVar.r() && sVar.p()) {
                        soVar.put(o, Boolean.TRUE);
                    }
                    if (sVar.s() && sVar.q()) {
                        soVar2.put(sVar.o(), Boolean.TRUE);
                    }
                    if (sVar.t()) {
                        if (sVar.m() < 2 || sVar.m() > 65535) {
                            this.a.o().v().c("Invalid sampling rate. Event name, sample rate", sVar.o(), Integer.valueOf(sVar.m()));
                        } else {
                            soVar3.put(sVar.o(), Integer.valueOf(sVar.m()));
                        }
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, soVar);
        this.g.put(str, soVar2);
        this.i.put(str, soVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u4.k(java.lang.String):void");
    }

    private final void l(final String str, com.google.android.gms.internal.measurement.v vVar) {
        if (vVar.r() == 0) {
            this.j.g(str);
            return;
        }
        this.a.o().u().b("EES programs found", Integer.valueOf(vVar.r()));
        com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) vVar.C().get(0);
        try {
            uab uabVar = new uab();
            uabVar.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.p4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new nhf("internal.remoteConfig", new t4(u4.this, str));
                }
            });
            uabVar.d("internal.appMetadata", new Callable() { // from class: ofe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final u4 u4Var = u4.this;
                    final String str2 = str;
                    return new azf("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.o4
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            u4 u4Var2 = u4.this;
                            String str3 = str2;
                            q5 Q = u4Var2.b.U().Q(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            u4Var2.a.y().m();
                            hashMap.put("gmp_version", 64000L);
                            if (Q != null) {
                                String h0 = Q.h0();
                                if (h0 != null) {
                                    hashMap.put("app_version", h0);
                                }
                                hashMap.put("app_version_int", Long.valueOf(Q.M()));
                                hashMap.put("dynamite_version", Long.valueOf(Q.V()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            uabVar.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.q4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new qxf(u4.this.k);
                }
            });
            uabVar.c(j1Var);
            this.j.f(str, uabVar);
            this.a.o().u().c("EES program loaded for appId, activities", str, Integer.valueOf(j1Var.r().r()));
            Iterator it2 = j1Var.r().u().iterator();
            while (it2.hasNext()) {
                this.a.o().u().b("EES program activity", ((com.google.android.gms.internal.measurement.h1) it2.next()).s());
            }
        } catch (zzd unused) {
            this.a.o().n().b("Failed to load EES program. appId", str);
        }
    }

    private static final Map m(com.google.android.gms.internal.measurement.v vVar) {
        so soVar = new so();
        if (vVar != null) {
            for (com.google.android.gms.internal.measurement.z zVar : vVar.D()) {
                soVar.put(zVar.s(), zVar.t());
            }
        }
        return soVar;
    }

    static /* bridge */ /* synthetic */ uab r(u4 u4Var, String str) {
        u4Var.d();
        Preconditions.checkNotEmpty(str);
        if (!u4Var.B(str)) {
            return null;
        }
        if (!u4Var.h.containsKey(str) || u4Var.h.get(str) == null) {
            u4Var.k(str);
        } else {
            u4Var.l(str, (com.google.android.gms.internal.measurement.v) u4Var.h.get(str));
        }
        return (uab) u4Var.j.k().get(str);
    }

    final boolean A(String str) {
        c();
        com.google.android.gms.internal.measurement.v s = s(str);
        if (s == null) {
            return false;
        }
        return s.G();
    }

    public final boolean B(String str) {
        com.google.android.gms.internal.measurement.v vVar;
        return (TextUtils.isEmpty(str) || (vVar = (com.google.android.gms.internal.measurement.v) this.h.get(str)) == null || vVar.r() == 0) ? false : true;
    }

    final boolean C(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(a(str, "measurement.upload.blacklist_internal"));
    }

    final boolean D(String str, String str2) {
        Boolean bool;
        c();
        k(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) {
        Boolean bool;
        c();
        k(str);
        if (C(str) && x9.V(str2)) {
            return true;
        }
        if (F(str) && x9.W(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean F(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(a(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean G(String str, byte[] bArr, String str2, String str3) {
        d();
        c();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.u uVar = (com.google.android.gms.internal.measurement.u) i(str, bArr).g();
        if (uVar == null) {
            return false;
        }
        j(str, uVar);
        l(str, (com.google.android.gms.internal.measurement.v) uVar.i());
        this.h.put(str, (com.google.android.gms.internal.measurement.v) uVar.i());
        this.l.put(str, uVar.q());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, m((com.google.android.gms.internal.measurement.v) uVar.i()));
        this.b.U().j(str, new ArrayList(uVar.r()));
        try {
            uVar.o();
            bArr = ((com.google.android.gms.internal.measurement.v) uVar.i()).e();
        } catch (RuntimeException e) {
            this.a.o().v().c("Unable to serialize reduced-size config. Storing full config instead. appId", x3.y(str), e);
        }
        k U = this.b.U();
        Preconditions.checkNotEmpty(str);
        U.c();
        U.d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (U.a.y().A(null, m3.O0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (U.O().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                U.a.o().n().b("Failed to update remote config (got 0). appId", x3.y(str));
            }
        } catch (SQLiteException e2) {
            U.a.o().n().c("Error storing remote config. appId", x3.y(str), e2);
        }
        this.h.put(str, (com.google.android.gms.internal.measurement.v) uVar.i());
        return true;
    }

    final boolean H(String str) {
        c();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("app_instance_id");
    }

    final boolean I(String str) {
        c();
        k(str);
        if (this.e.get(str) != null) {
            return ((Set) this.e.get(str)).contains("device_model") || ((Set) this.e.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean J(String str) {
        c();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("enhanced_user_id");
    }

    final boolean K(String str) {
        c();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("google_signals");
    }

    final boolean L(String str) {
        c();
        k(str);
        if (this.e.get(str) != null) {
            return ((Set) this.e.get(str)).contains("os_version") || ((Set) this.e.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean M(String str) {
        c();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains(AccessToken.USER_ID_KEY);
    }

    @Override // com.google.android.gms.measurement.internal.f
    public final String a(String str, String str2) {
        c();
        k(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    final int n(String str, String str2) {
        Integer num;
        c();
        k(str);
        Map map = (Map) this.i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    protected final com.google.android.gms.internal.measurement.v s(String str) {
        d();
        c();
        Preconditions.checkNotEmpty(str);
        k(str);
        return (com.google.android.gms.internal.measurement.v) this.h.get(str);
    }

    protected final String t(String str) {
        c();
        return (String) this.n.get(str);
    }

    protected final String u(String str) {
        c();
        return (String) this.m.get(str);
    }

    final String v(String str) {
        c();
        k(str);
        return (String) this.l.get(str);
    }

    final Set x(String str) {
        c();
        k(str);
        return (Set) this.e.get(str);
    }

    protected final void y(String str) {
        c();
        this.m.put(str, null);
    }

    final void z(String str) {
        c();
        this.h.remove(str);
    }
}
