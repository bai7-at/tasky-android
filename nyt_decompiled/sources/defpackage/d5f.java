package defpackage;

import com.google.android.gms.internal.measurement.zzid;

/* loaded from: classes3.dex */
public abstract class d5f {
    static volatile zzid a = zzid.c();
    private static final Object b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(6:33|(2:35|(1:37))|27|28|29|30)(1:20)|21|22|23|24|(1:26)|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r4, android.net.Uri r5) {
        /*
            java.lang.String r5 = r5.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 != 0) goto L1d
            java.lang.String r4 = "PhenotypeClientHelper"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r5 = r5.concat(r0)
            android.util.Log.e(r4, r5)
            return r1
        L1d:
            com.google.android.gms.internal.measurement.zzid r5 = defpackage.d5f.a
            boolean r5 = r5.b()
            if (r5 == 0) goto L32
            com.google.android.gms.internal.measurement.zzid r4 = defpackage.d5f.a
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L32:
            java.lang.Object r5 = defpackage.d5f.b
            monitor-enter(r5)
            com.google.android.gms.internal.measurement.zzid r0 = defpackage.d5f.a     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.measurement.zzid r4 = defpackage.d5f.a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L4b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            return r4
        L4b:
            r4 = move-exception
            goto L9c
        L4d:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L5a
            goto L73
        L5a:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "com.google.android.gms.phenotype"
            r3 = 268435456(0x10000000, float:2.524355E-29)
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L84
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L73
            goto L84
        L73:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L4b android.content.pm.PackageManager.NameNotFoundException -> L84
            int r4 = r4.flags     // Catch: java.lang.Throwable -> L4b
            r4 = r4 & 129(0x81, float:1.81E-43)
            if (r4 == 0) goto L84
            r1 = 1
        L84:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.measurement.zzid r4 = com.google.android.gms.internal.measurement.zzid.d(r4)     // Catch: java.lang.Throwable -> L4b
            defpackage.d5f.a = r4     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.measurement.zzid r4 = defpackage.d5f.a
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L9c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5f.a(android.content.Context, android.net.Uri):boolean");
    }
}
