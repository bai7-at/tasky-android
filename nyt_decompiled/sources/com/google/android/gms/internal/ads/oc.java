package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class oc implements Runnable {
    pc a;

    oc(pc pcVar) {
        this.a = pcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r1 = r0.h;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.pc r0 = r9.a
            if (r0 != 0) goto L6
            goto L84
        L6:
            j64 r1 = com.google.android.gms.internal.ads.pc.D(r0)
            if (r1 == 0) goto L84
            r2 = 0
            r9.a = r2
            boolean r9 = r1.isDone()
            if (r9 == 0) goto L19
            r0.u(r1)
            return
        L19:
            r9 = 1
            java.util.concurrent.ScheduledFuture r3 = com.google.android.gms.internal.ads.pc.F(r0)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.internal.ads.pc.G(r0, r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Timed out"
            if (r3 == 0) goto L51
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4f
            long r5 = r3.getDelay(r5)     // Catch: java.lang.Throwable -> L4f
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L4f
            r7 = 10
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = " (timeout delayed by "
            r3.append(r7)     // Catch: java.lang.Throwable -> L4f
            r3.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = " ms after scheduled time)"
            r3.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r3 = move-exception
            goto L77
        L51:
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzgfj r4 = new com.google.android.gms.internal.ads.zzgfj     // Catch: java.lang.Throwable -> L75
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L75
            r0.g(r4)     // Catch: java.lang.Throwable -> L75
            r1.cancel(r9)
            return
        L75:
            r0 = move-exception
            goto L80
        L77:
            com.google.android.gms.internal.ads.zzgfj r5 = new com.google.android.gms.internal.ads.zzgfj     // Catch: java.lang.Throwable -> L75
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L75
            r0.g(r5)     // Catch: java.lang.Throwable -> L75
            throw r3     // Catch: java.lang.Throwable -> L75
        L80:
            r1.cancel(r9)
            throw r0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oc.run():void");
    }
}
