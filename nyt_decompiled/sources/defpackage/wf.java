package defpackage;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wf {
    public static final lo5 a(String str, j jVar, List list, List list2, fm1 fm1Var, e.b bVar) {
        return new AndroidParagraphIntrinsics(str, jVar, list, list2, bVar, fm1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(j jVar) {
        uu5 a;
        zu5 A = jVar.A();
        return !(((A == null || (a = A.a()) == null) ? null : b02.c(a.b())) == null ? false : b02.f(r1.i(), b02.b.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(int r6, defpackage.l74 r7) {
        /*
            uh8$a r0 = defpackage.uh8.b
            int r1 = r0.b()
            boolean r1 = defpackage.uh8.j(r6, r1)
            r2 = 2
            if (r1 == 0) goto Le
            goto L6e
        Le:
            int r1 = r0.c()
            boolean r1 = defpackage.uh8.j(r6, r1)
            r3 = 3
            if (r1 == 0) goto L1b
        L19:
            r2 = r3
            goto L6e
        L1b:
            int r1 = r0.d()
            boolean r1 = defpackage.uh8.j(r6, r1)
            r4 = 0
            if (r1 == 0) goto L28
            r2 = r4
            goto L6e
        L28:
            int r1 = r0.e()
            boolean r1 = defpackage.uh8.j(r6, r1)
            r5 = 1
            if (r1 == 0) goto L35
            r2 = r5
            goto L6e
        L35:
            int r1 = r0.a()
            boolean r1 = defpackage.uh8.j(r6, r1)
            if (r1 == 0) goto L41
            r6 = r5
            goto L49
        L41:
            int r0 = r0.f()
            boolean r6 = defpackage.uh8.j(r6, r0)
        L49:
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L62
            i74 r6 = r7.c(r4)
            ou5 r6 = r6.a()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            defpackage.zq3.f(r6, r7)
            pf r6 = (defpackage.pf) r6
            java.util.Locale r6 = r6.b()
            if (r6 != 0) goto L66
        L62:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L66:
            int r6 = defpackage.gk8.a(r6)
            if (r6 == 0) goto L6e
            if (r6 == r5) goto L19
        L6e:
            return r2
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.d(int, l74):int");
    }
}
