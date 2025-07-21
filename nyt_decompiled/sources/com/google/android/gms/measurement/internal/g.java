package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class g extends u5 {
    private Boolean b;
    private f c;
    private Boolean d;

    g(a5 a5Var) {
        super(a5Var);
        this.c = new f() { // from class: com.google.android.gms.measurement.internal.e
            @Override // com.google.android.gms.measurement.internal.f
            public final String a(String str, String str2) {
                return null;
            }
        };
    }

    public static final long H() {
        return ((Long) m3.e.a(null)).longValue();
    }

    public static final long d() {
        return ((Long) m3.E.a(null)).longValue();
    }

    private final String f(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.a.o().n().b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.a.o().n().b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.a.o().n().b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.a.o().n().b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final boolean A(String str, l3 l3Var) {
        if (str == null) {
            return ((Boolean) l3Var.a(null)).booleanValue();
        }
        String a = this.c.a(str, l3Var.b());
        return TextUtils.isEmpty(a) ? ((Boolean) l3Var.a(null)).booleanValue() : ((Boolean) l3Var.a(Boolean.valueOf(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(a)))).booleanValue();
    }

    public final boolean B(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.c.a(str, "gaia_collection_enabled"));
    }

    public final boolean C() {
        Boolean s = s("google_analytics_automatic_screen_reporting_enabled");
        return s == null || s.booleanValue();
    }

    public final boolean D() {
        this.a.q();
        Boolean s = s("firebase_analytics_collection_deactivated");
        return s != null && s.booleanValue();
    }

    public final boolean E(String str) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    final boolean F() {
        if (this.b == null) {
            Boolean s = s("app_measurement_lite");
            this.b = s;
            if (s == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.r();
    }

    public final boolean G() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        ApplicationInfo applicationInfo = this.a.zzau().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(myProcessName)) {
                                z = true;
                            }
                            this.d = Boolean.valueOf(z);
                        }
                        if (this.d == null) {
                            this.d = Boolean.TRUE;
                            this.a.o().n().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.d.booleanValue();
    }

    public final double g(String str, l3 l3Var) {
        if (str == null) {
            return ((Double) l3Var.a(null)).doubleValue();
        }
        String a = this.c.a(str, l3Var.b());
        if (TextUtils.isEmpty(a)) {
            return ((Double) l3Var.a(null)).doubleValue();
        }
        try {
            return ((Double) l3Var.a(Double.valueOf(Double.parseDouble(a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) l3Var.a(null)).doubleValue();
        }
    }

    final int h(String str) {
        return l(str, m3.I, 500, 2000);
    }

    public final int i() {
        x9 M = this.a.M();
        Boolean I = M.a.K().I();
        if (M.n0() < 201500) {
            return (I == null || I.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int j(String str) {
        return l(str, m3.J, 25, 100);
    }

    public final int k(String str, l3 l3Var) {
        if (str == null) {
            return ((Integer) l3Var.a(null)).intValue();
        }
        String a = this.c.a(str, l3Var.b());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) l3Var.a(null)).intValue();
        }
        try {
            return ((Integer) l3Var.a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) l3Var.a(null)).intValue();
        }
    }

    public final int l(String str, l3 l3Var, int i, int i2) {
        return Math.max(Math.min(k(str, l3Var), i2), i);
    }

    public final long m() {
        this.a.q();
        return 64000L;
    }

    public final long n(String str, l3 l3Var) {
        if (str == null) {
            return ((Long) l3Var.a(null)).longValue();
        }
        String a = this.c.a(str, l3Var.b());
        if (TextUtils.isEmpty(a)) {
            return ((Long) l3Var.a(null)).longValue();
        }
        try {
            return ((Long) l3Var.a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) l3Var.a(null)).longValue();
        }
    }

    final Bundle r() {
        try {
            if (this.a.zzau().getPackageManager() == null) {
                this.a.o().n().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.a.zzau()).getApplicationInfo(this.a.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.a.o().n().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.a.o().n().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    final Boolean s(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle r = r();
        if (r == null) {
            this.a.o().n().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (r.containsKey(str)) {
            return Boolean.valueOf(r.getBoolean(str));
        }
        return null;
    }

    public final String t() {
        return f("debug.firebase.analytics.app", "");
    }

    public final String u() {
        return f("debug.deferred.deeplink", "");
    }

    final String v() {
        this.a.q();
        return "FA";
    }

    public final String w(String str, l3 l3Var) {
        return str == null ? (String) l3Var.a(null) : (String) l3Var.a(this.c.a(str, l3Var.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List x(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.r()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.a5 r4 = r3.a
            com.google.android.gms.measurement.internal.x3 r4 = r4.o()
            com.google.android.gms.measurement.internal.u3 r4 = r4.n()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.a5 r0 = r3.a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzau()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r3 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r3
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.a5 r3 = r3.a
            com.google.android.gms.measurement.internal.x3 r3 = r3.o()
            com.google.android.gms.measurement.internal.u3 r3 = r3.n()
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r3.b(r0, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.x(java.lang.String):java.util.List");
    }

    final void y(f fVar) {
        this.c = fVar;
    }

    public final boolean z() {
        Boolean s = s("google_analytics_adid_collection_enabled");
        return s == null || s.booleanValue();
    }
}
