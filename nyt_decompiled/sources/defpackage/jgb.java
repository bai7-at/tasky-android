package defpackage;

/* loaded from: classes3.dex */
public final class jgb implements sfb {
    private final String a;

    public jgb(String str) {
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L39;
     */
    @Override // defpackage.sfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ". "
            r1 = 0
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            if (r2 == 0) goto L12
            r2 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            goto L12
        Lf:
            r5 = move-exception
            goto Le6
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            java.lang.String r3 = "Pinging URL: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            r2.append(r6)     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            defpackage.fgb.b(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            defpackage.kia.b()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r5.a     // Catch: java.lang.Throwable -> L4b
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L4b
            r4 = 1
            r2.setInstanceFollowRedirects(r4)     // Catch: java.lang.Throwable -> L4b
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L4d
            java.lang.String r3 = "User-Agent"
            r2.setRequestProperty(r3, r5)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r5 = move-exception
            goto L95
        L4d:
            r2.setUseCaches(r1)     // Catch: java.lang.Throwable -> L4b
            egb r5 = new egb     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4b
            r5.c(r2, r3)     // Catch: java.lang.Throwable -> L4b
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L4b
            r5.e(r2, r3)     // Catch: java.lang.Throwable -> L4b
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 < r5) goto L6b
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r5) goto L69
            goto L6b
        L69:
            r1 = r4
            goto L87
        L6b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r5.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "Received non-success response code "
            r5.append(r4)     // Catch: java.lang.Throwable -> L4b
            r5.append(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = " from pinging URL: "
            r5.append(r3)     // Catch: java.lang.Throwable -> L4b
            r5.append(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4b
            defpackage.fgb.g(r5)     // Catch: java.lang.Throwable -> L4b
        L87:
            r2.disconnect()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            boolean r5 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r5 == 0) goto Le5
            goto Le2
        L91:
            r5 = move-exception
            goto L99
        L93:
            r5 = move-exception
            goto Lbe
        L95:
            r2.disconnect()     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
            throw r5     // Catch: java.lang.Throwable -> Lf java.lang.Throwable -> L91 java.lang.Throwable -> L91 java.lang.IndexOutOfBoundsException -> L93
        L99:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Error while pinging URL: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r6)     // Catch: java.lang.Throwable -> Lf
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            defpackage.fgb.g(r5)     // Catch: java.lang.Throwable -> Lf
            boolean r5 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r5 == 0) goto Le5
            goto Le2
        Lbe:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Error while parsing ping URL: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r6)     // Catch: java.lang.Throwable -> Lf
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            defpackage.fgb.g(r5)     // Catch: java.lang.Throwable -> Lf
            boolean r5 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r5 == 0) goto Le5
        Le2:
            android.net.TrafficStats.clearThreadStatsTag()
        Le5:
            return r1
        Le6:
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r6 == 0) goto Lef
            android.net.TrafficStats.clearThreadStatsTag()
        Lef:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgb.a(java.lang.String):boolean");
    }
}
