package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.m8f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class m7 extends w3 {
    private volatile e7 c;
    private volatile e7 d;
    protected e7 e;
    private final Map f;
    private Activity g;
    private volatile boolean h;
    private volatile e7 i;
    private e7 j;
    private boolean k;
    private final Object l;
    private e7 m;
    private String n;

    public m7(a5 a5Var) {
        super(a5Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    private final e7 G(Activity activity) {
        Preconditions.checkNotNull(activity);
        e7 e7Var = (e7) this.f.get(activity);
        if (e7Var == null) {
            e7 e7Var2 = new e7(null, t(activity.getClass(), "Activity"), this.a.M().q0());
            this.f.put(activity, e7Var2);
            e7Var = e7Var2;
        }
        return this.i != null ? this.i : e7Var;
    }

    private final void k(Activity activity, e7 e7Var, boolean z) {
        e7 e7Var2;
        e7 e7Var3 = this.c == null ? this.d : this.c;
        if (e7Var.b == null) {
            e7Var2 = new e7(e7Var.a, activity != null ? t(activity.getClass(), "Activity") : null, e7Var.c, e7Var.e, e7Var.f);
        } else {
            e7Var2 = e7Var;
        }
        this.d = this.c;
        this.c = e7Var2;
        this.a.e().y(new g7(this, e7Var2, e7Var3, this.a.p().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(e7 e7Var, e7 e7Var2, long j, boolean z, Bundle bundle) {
        long j2;
        long j3;
        c();
        boolean z2 = false;
        boolean z3 = (e7Var2 != null && e7Var2.c == e7Var.c && m8f.a(e7Var2.b, e7Var.b) && m8f.a(e7Var2.a, e7Var.a)) ? false : true;
        if (z && this.e != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            x9.x(e7Var, bundle2, true);
            if (e7Var2 != null) {
                String str = e7Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = e7Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", e7Var2.c);
            }
            if (z2) {
                z8 z8Var = this.a.L().e;
                long j4 = j - z8Var.b;
                z8Var.b = j;
                if (j4 > 0) {
                    this.a.M().v(bundle2, j4);
                }
            }
            if (!this.a.y().C()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != e7Var.e ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long currentTimeMillis = this.a.p().currentTimeMillis();
            if (e7Var.e) {
                j2 = currentTimeMillis;
                long j5 = e7Var.f;
                if (j5 != 0) {
                    j3 = j5;
                    this.a.H().v(str3, "_vs", j3, bundle2);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            this.a.H().v(str3, "_vs", j3, bundle2);
        }
        if (z2) {
            m(this.e, true, j);
        }
        this.e = e7Var;
        if (e7Var.e) {
            this.j = e7Var;
        }
        this.a.K().t(e7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(e7 e7Var, boolean z, long j) {
        this.a.x().j(this.a.p().elapsedRealtime());
        if (!this.a.L().e.d(e7Var != null && e7Var.d, z, j) || e7Var == null) {
            return;
        }
        e7Var.d = false;
    }

    static /* bridge */ /* synthetic */ void w(m7 m7Var, Bundle bundle, e7 e7Var, e7 e7Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        m7Var.l(e7Var, e7Var2, j, true, m7Var.a.M().u0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long elapsedRealtime = this.a.p().elapsedRealtime();
        if (!this.a.y().C()) {
            this.c = null;
            this.a.e().y(new j7(this, elapsedRealtime));
        } else {
            e7 G = G(activity);
            this.d = this.c;
            this.c = null;
            this.a.e().y(new k7(this, G, elapsedRealtime));
        }
    }

    public final void B(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (this.a.y().C()) {
                    this.i = null;
                    this.a.e().y(new l7(this));
                }
            }
        }
        if (!this.a.y().C()) {
            this.c = this.i;
            this.a.e().y(new i7(this));
        } else {
            k(activity, G(activity), false);
            y1 x = this.a.x();
            x.a.e().y(new x0(x, x.a.p().elapsedRealtime()));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        e7 e7Var;
        if (!this.a.y().C() || bundle == null || (e7Var = (e7) this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", e7Var.c);
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, e7Var.a);
        bundle2.putString("referrer_name", e7Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.a5 r0 = r3.a
            com.google.android.gms.measurement.internal.g r0 = r0.y()
            boolean r0 = r0.C()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.a(r4)
            return
        L1c:
            com.google.android.gms.measurement.internal.e7 r0 = r3.c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.a(r4)
            return
        L30:
            java.util.Map r1 = r3.f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.a(r4)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.t(r6, r1)
        L54:
            java.lang.String r1 = r0.b
            boolean r1 = defpackage.m8f.a(r1, r6)
            java.lang.String r0 = r0.a
            boolean r0 = defpackage.m8f.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.a(r4)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.a5 r1 = r3.a
            r1.y()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.a5 r1 = r3.a
            r1.y()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.w()
            int r4 = r6.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.b(r5, r4)
            return
        Lcf:
            com.google.android.gms.measurement.internal.a5 r0 = r3.a
            com.google.android.gms.measurement.internal.x3 r0 = r0.o()
            com.google.android.gms.measurement.internal.u3 r0 = r0.u()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.e7 r0 = new com.google.android.gms.measurement.internal.e7
            com.google.android.gms.measurement.internal.a5 r1 = r3.a
            com.google.android.gms.measurement.internal.x9 r1 = r1.M()
            long r1 = r1.q0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f
            r5.put(r4, r0)
            r5 = 1
            r3.k(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m7.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m7.E(android.os.Bundle, long):void");
    }

    public final void F(String str, e7 e7Var) {
        c();
        synchronized (this) {
            try {
                String str2 = this.n;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        if (e7Var != null) {
                        }
                    }
                }
                this.n = str;
                this.m = e7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean j() {
        return false;
    }

    public final e7 r() {
        return this.c;
    }

    public final e7 s(boolean z) {
        d();
        c();
        if (!z) {
            return this.e;
        }
        e7 e7Var = this.e;
        return e7Var != null ? e7Var : this.j;
    }

    final String t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.a.y();
        if (length2 <= 100) {
            return str2;
        }
        this.a.y();
        return str2.substring(0, 100);
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.y().C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new e7(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.a.y().C()) {
            this.f.remove(activity);
        }
    }
}
