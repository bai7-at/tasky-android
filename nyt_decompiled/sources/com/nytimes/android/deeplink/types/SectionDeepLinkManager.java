package com.nytimes.android.deeplink.types;

import defpackage.id1;
import defpackage.ms;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SectionDeepLinkManager extends id1 {
    private final ms b;
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionDeepLinkManager(ms msVar, String str) {
        super(str);
        zq3.h(msVar, "wrapper");
        zq3.h(str, "sectionId");
        this.b = msVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
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
            boolean r7 = r9 instanceof com.nytimes.android.deeplink.types.SectionDeepLinkManager$getIntent$1
            if (r7 == 0) goto L13
            r7 = r9
            com.nytimes.android.deeplink.types.SectionDeepLinkManager$getIntent$1 r7 = (com.nytimes.android.deeplink.types.SectionDeepLinkManager$getIntent$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.label = r0
            goto L18
        L13:
            com.nytimes.android.deeplink.types.SectionDeepLinkManager$getIntent$1 r7 = new com.nytimes.android.deeplink.types.SectionDeepLinkManager$getIntent$1
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
            com.nytimes.android.deeplink.types.SectionDeepLinkManager r3 = (com.nytimes.android.deeplink.types.SectionDeepLinkManager) r3
            kotlin.f.b(r9)
            goto L71
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
            java.lang.String r9 = r3.c
            boolean r9 = kotlin.text.h.d0(r9)
            if (r9 != 0) goto L74
            ms r9 = r3.b
            java.lang.String r1 = r3.c
            r7.L$0 = r3
            r7.L$1 = r4
            r7.L$2 = r5
            r7.L$3 = r6
            r7.Z$0 = r8
            r7.label = r2
            java.lang.Object r9 = r9.f(r4, r1, r6, r7)
            if (r9 != r0) goto L71
            return r0
        L71:
            android.content.Intent r9 = (android.content.Intent) r9
            goto L75
        L74:
            r9 = 0
        L75:
            if (r9 != 0) goto L86
            ms r3 = r3.b
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "toString(...)"
            defpackage.zq3.g(r5, r7)
            android.content.Intent r9 = r3.e(r4, r5, r6, r8)
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.deeplink.types.SectionDeepLinkManager.a(android.content.Context, android.net.Uri, java.lang.String, b65, boolean, by0):java.lang.Object");
    }
}
