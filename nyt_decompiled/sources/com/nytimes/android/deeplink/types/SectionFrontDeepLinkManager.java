package com.nytimes.android.deeplink.types;

import android.net.Uri;
import defpackage.dd1;
import defpackage.ms;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class SectionFrontDeepLinkManager implements dd1 {
    private final ms a;
    private final String b;

    public SectionFrontDeepLinkManager(ms msVar, String str) {
        zq3.h(msVar, "wrapper");
        zq3.h(str, "prefix");
        this.a = msVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Context r4, android.net.Uri r5, java.lang.String r6, defpackage.b65 r7, boolean r8, defpackage.by0 r9) {
        /*
            r3 = this;
            boolean r7 = r9 instanceof com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager$getIntent$1
            if (r7 == 0) goto L13
            r7 = r9
            com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager$getIntent$1 r7 = (com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager$getIntent$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.label = r0
            goto L18
        L13:
            com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager$getIntent$1 r7 = new com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager$getIntent$1
            r7.<init>(r3, r9)
        L18:
            java.lang.Object r9 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 != r2) goto L3e
            boolean r8 = r7.Z$0
            java.lang.Object r3 = r7.L$3
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r7.L$2
            r5 = r3
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r3 = r7.L$1
            r4 = r3
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r7.L$0
            com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager r3 = (com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager) r3
            kotlin.f.b(r9)
            goto L7b
        L3e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L46:
            kotlin.f.b(r9)
            java.lang.String r9 = "Deeplinking - Section identified/assumed - path: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            com.nytimes.android.logging.NYTLogger.l(r9, r1)
            java.lang.String r9 = r5.getPath()
            if (r9 != 0) goto L5a
            java.lang.String r9 = ""
        L5a:
            java.lang.String r1 = r3.b
            java.lang.String r9 = defpackage.a48.b(r9, r1)
            boolean r1 = kotlin.text.h.d0(r9)
            if (r1 != 0) goto L7e
            ms r1 = r3.a
            r7.L$0 = r3
            r7.L$1 = r4
            r7.L$2 = r5
            r7.L$3 = r6
            r7.Z$0 = r8
            r7.label = r2
            java.lang.Object r9 = r1.f(r4, r9, r6, r7)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            android.content.Intent r9 = (android.content.Intent) r9
            goto L7f
        L7e:
            r9 = 0
        L7f:
            if (r9 != 0) goto L90
            ms r3 = r3.a
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "toString(...)"
            defpackage.zq3.g(r5, r7)
            android.content.Intent r9 = r3.e(r4, r5, r6, r8)
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.deeplink.types.SectionFrontDeepLinkManager.a(android.content.Context, android.net.Uri, java.lang.String, b65, boolean, by0):java.lang.Object");
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        String F = h.F(this.b, "/", "", false, 4, null);
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String F2 = h.F(path, "/", "", false, 4, null);
        return h.K(F2, F, false, 2, null) && !zq3.c(F2, "sections");
    }
}
