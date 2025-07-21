package defpackage;

import com.google.android.gms.internal.ads.zzbvg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hsc {
    private final Map a = new HashMap();

    hsc() {
    }

    public final synchronized gsc a(String str) {
        return (gsc) this.a.get(str);
    }

    public final gsc b(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gsc a = a((String) it2.next());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final String c(String str) {
        zzbvg zzbvgVar;
        gsc a = a(str);
        return (a == null || (zzbvgVar = a.b) == null) ? "" : zzbvgVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void d(java.lang.String r6, defpackage.s2e r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            gsc r0 = new gsc     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.zzbvg r2 = r7.j()     // Catch: com.google.android.gms.internal.ads.zzfho -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.zzbvg r1 = r7.k()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfho -> L20
        L20:
            zoa r3 = defpackage.mpa.k9     // Catch: java.lang.Throwable -> L17
            kpa r4 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.c()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfho -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsc.d(java.lang.String, s2e):void");
    }

    final synchronized void e(String str, o5b o5bVar) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new gsc(str, o5bVar.zzf(), o5bVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
