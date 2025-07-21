package defpackage;

import android.net.Uri;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class pf8 implements dd1 {
    public static final int b = if8.d;
    private final if8 a;

    public pf8(if8 if8Var) {
        zq3.h(if8Var, "tabFragmentProxy");
        this.a = if8Var;
    }

    private final Pair c(Uri uri) {
        Object obj;
        Iterator it2 = this.a.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((de4) ((Pair) obj).b()).e(uri)) {
                break;
            }
        }
        return (Pair) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r9 == null) goto L10;
     */
    @Override // defpackage.dd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, defpackage.b65 r13, boolean r14, defpackage.by0 r15) {
        /*
            r9 = this;
            kotlin.Pair r9 = r9.c(r11)
            if (r9 == 0) goto L6c
            java.lang.Object r12 = r9.a()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r9.b()
            de4 r9 = (defpackage.de4) r9
            sn3 r14 = new sn3
            java.lang.Class<com.nytimes.android.MainActivity> r15 = com.nytimes.android.MainActivity.class
            r14.<init>(r15, r10)
            sn3 r10 = r14.o(r12)
            boolean r9 = r9 instanceof com.nytimes.android.ribbon.RibbonTabFactory
            if (r9 == 0) goto L37
            java.lang.String r9 = r11.getPath()
            if (r9 == 0) goto L32
            defpackage.zq3.e(r9)
            java.lang.String r12 = "/"
            java.lang.String r9 = kotlin.text.h.v0(r9, r12)
            if (r9 != 0) goto L34
        L32:
            java.lang.String r9 = "today"
        L34:
            r10.v(r9)
        L37:
            if (r13 == 0) goto L60
            java.lang.String r1 = r13.j()
            java.lang.String r2 = r13.f()
            java.lang.String r3 = r13.d()
            java.lang.String r4 = r13.h()
            java.lang.String r5 = r13.i()
            java.lang.String r6 = r13.e()
            java.lang.String r7 = r13.l()
            java.lang.String r8 = r13.k()
            r0 = r10
            sn3 r9 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L67
        L60:
            java.lang.String r9 = r11.toString()
            r10.d(r9)
        L67:
            android.content.Intent r9 = r10.e()
            return r9
        L6c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf8.a(android.content.Context, android.net.Uri, java.lang.String, b65, boolean, by0):java.lang.Object");
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        return c(uri) != null;
    }
}
