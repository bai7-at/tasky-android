package defpackage;

import android.os.RemoteException;
import defpackage.p15;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class z6b extends p15 {
    private final pva a;
    private final y6b c;
    private final p15.a d;
    private final List b = new ArrayList();
    private final List e = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|(2:36|37)|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        defpackage.fgb.e("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: RemoteException -> 0x00a9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a9, blocks: (B:42:0x0094, B:44:0x009c), top: B:41:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z6b(defpackage.pva r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.e = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.c()     // Catch: android.os.RemoteException -> L35
            if (r6 == 0) goto L48
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L35
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L35
            if (r2 == 0) goto L48
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L35
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L35
            if (r3 == 0) goto L37
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L35
            mta r2 = defpackage.lta.w6(r2)     // Catch: android.os.RemoteException -> L35
            goto L38
        L35:
            r6 = move-exception
            goto L45
        L37:
            r2 = r1
        L38:
            if (r2 == 0) goto L20
            java.util.List r3 = r5.b     // Catch: android.os.RemoteException -> L35
            y6b r4 = new y6b     // Catch: android.os.RemoteException -> L35
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L35
            r3.add(r4)     // Catch: android.os.RemoteException -> L35
            goto L20
        L45:
            defpackage.fgb.e(r0, r6)
        L48:
            pva r6 = r5.a     // Catch: android.os.RemoteException -> L69
            java.util.List r6 = r6.a()     // Catch: android.os.RemoteException -> L69
            if (r6 == 0) goto L7c
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L69
        L54:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L69
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L69
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L69
            if (r3 == 0) goto L6b
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L69
            m0c r2 = defpackage.kzb.w6(r2)     // Catch: android.os.RemoteException -> L69
            goto L6c
        L69:
            r6 = move-exception
            goto L79
        L6b:
            r2 = r1
        L6c:
            if (r2 == 0) goto L54
            java.util.List r3 = r5.e     // Catch: android.os.RemoteException -> L69
            q1c r4 = new q1c     // Catch: android.os.RemoteException -> L69
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L69
            r3.add(r4)     // Catch: android.os.RemoteException -> L69
            goto L54
        L79:
            defpackage.fgb.e(r0, r6)
        L7c:
            pva r6 = r5.a     // Catch: android.os.RemoteException -> L8a
            mta r6 = r6.zzk()     // Catch: android.os.RemoteException -> L8a
            if (r6 == 0) goto L8c
            y6b r2 = new y6b     // Catch: android.os.RemoteException -> L8a
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L8a
            goto L92
        L8a:
            r6 = move-exception
            goto L8e
        L8c:
            r2 = r1
            goto L92
        L8e:
            defpackage.fgb.e(r0, r6)
            goto L8c
        L92:
            r5.c = r2
            pva r6 = r5.a     // Catch: android.os.RemoteException -> La9
            fta r6 = r6.zzi()     // Catch: android.os.RemoteException -> La9
            if (r6 == 0) goto Lad
            s6b r6 = new s6b     // Catch: android.os.RemoteException -> La9
            pva r2 = r5.a     // Catch: android.os.RemoteException -> La9
            fta r2 = r2.zzi()     // Catch: android.os.RemoteException -> La9
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La9
            r1 = r6
            goto Lad
        La9:
            r6 = move-exception
            defpackage.fgb.e(r0, r6)
        Lad:
            r5.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6b.<init>(pva):void");
    }

    @Override // defpackage.p15
    public final String a() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.p15
    public final String b() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }

    @Override // defpackage.p15
    public final r07 c() {
        qkc qkcVar;
        try {
            qkcVar = this.a.zzg();
        } catch (RemoteException e) {
            fgb.e("", e);
            qkcVar = null;
        }
        return r07.d(qkcVar);
    }

    @Override // defpackage.p15
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.a.zzm();
        } catch (RemoteException e) {
            fgb.e("", e);
            return null;
        }
    }
}
