package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class gta extends q15 {
    private final fta a;
    private final List b = new ArrayList();
    private String c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r4.b.add(new defpackage.nta(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gta(defpackage.fta r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.b = r1
            r4.a = r5
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L15
            r4.c = r1     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r1 = move-exception
            defpackage.fgb.e(r0, r1)
            r4.c = r0
        L1b:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L45
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L45
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L45
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L45
            r3 = 0
            if (r2 == 0) goto L4c
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L45
            if (r1 != 0) goto L37
            goto L4c
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L45
            boolean r3 = r2 instanceof defpackage.mta     // Catch: android.os.RemoteException -> L45
            if (r3 == 0) goto L47
            r3 = r2
            mta r3 = (defpackage.mta) r3     // Catch: android.os.RemoteException -> L45
            goto L4c
        L45:
            r4 = move-exception
            goto L5a
        L47:
            kta r3 = new kta     // Catch: android.os.RemoteException -> L45
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L45
        L4c:
            if (r3 == 0) goto L23
            java.util.List r1 = r4.b     // Catch: android.os.RemoteException -> L45
            nta r2 = new nta     // Catch: android.os.RemoteException -> L45
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L45
            r1.add(r2)     // Catch: android.os.RemoteException -> L45
            goto L23
        L59:
            return
        L5a:
            defpackage.fgb.e(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gta.<init>(fta):void");
    }
}
