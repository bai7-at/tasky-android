package defpackage;

import com.nytimes.android.push.BreakingNewsAlert;
import com.nytimes.android.push.BreakingNewsAlertManager;
import defpackage.l95;

/* loaded from: classes4.dex */
public final class d9 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (kotlin.text.h.d0(r4) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(defpackage.e9 r5, l95.e r6, com.nytimes.android.push.BreakingNewsAlert r7) {
        /*
            r4 = this;
            long r0 = r7.d()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L16
            java.lang.String r4 = r7.n()
            if (r4 != 0) goto L12
            java.lang.String r4 = ""
        L12:
            r5.b(r6, r4)
            goto L3c
        L16:
            java.lang.String r4 = r7.l()
            r0 = 0
            if (r4 == 0) goto L2a
            boolean r1 = kotlin.text.h.d0(r4)
            if (r1 != 0) goto L24
            goto L25
        L24:
            r4 = r0
        L25:
            if (r4 != 0) goto L28
            goto L2a
        L28:
            r0 = r4
            goto L37
        L2a:
            java.lang.String r4 = r7.o()
            if (r4 == 0) goto L37
            boolean r7 = kotlin.text.h.d0(r4)
            if (r7 != 0) goto L37
            goto L28
        L37:
            if (r0 == 0) goto L3c
            r5.c(r6, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9.a(e9, l95$e, com.nytimes.android.push.BreakingNewsAlert):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (kotlin.text.h.d0(r2) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.e9 r3, l95.e r4, com.nytimes.android.push.BreakingNewsAlert r5) {
        /*
            r2 = this;
            java.lang.String r2 = r5.l()
            r0 = 0
            if (r2 == 0) goto L14
            boolean r1 = kotlin.text.h.d0(r2)
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 != 0) goto L12
            goto L14
        L12:
            r0 = r2
            goto L21
        L14:
            java.lang.String r2 = r5.o()
            if (r2 == 0) goto L21
            boolean r1 = kotlin.text.h.d0(r2)
            if (r1 != 0) goto L21
            goto L12
        L21:
            if (r0 == 0) goto L2a
            java.lang.String r2 = r5.f()
            r3.a(r4, r0, r2)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9.b(e9, l95$e, com.nytimes.android.push.BreakingNewsAlert):void");
    }

    public final void c(e9 e9Var, l95.e eVar, BreakingNewsAlert breakingNewsAlert) {
        zq3.h(e9Var, "provider");
        zq3.h(eVar, "builder");
        zq3.h(breakingNewsAlert, BreakingNewsAlertManager.SECTION_NAME);
        a(e9Var, eVar, breakingNewsAlert);
        b(e9Var, eVar, breakingNewsAlert);
    }
}
