package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes4.dex */
public final class i84 {
    private final String a;
    private final String b;

    public i84(String str, String str2) {
        zq3.h(str, "datePrefix");
        zq3.h(str2, "uuid");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public String toString() {
        return this.a + QueryKeys.END_MARKER + this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i84(java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r6 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L1e
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.lang.String r10 = "yyyyMM"
            java.util.Locale r0 = java.util.Locale.US
            r7.<init>(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = r7.format(r10)
            java.lang.String r10 = "format(...)"
            defpackage.zq3.g(r7, r10)
        L1e:
            r9 = r9 & 2
            if (r9 == 0) goto L4c
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r0 = r8.toString()
            java.lang.String r8 = "toString(...)"
            defpackage.zq3.g(r0, r8)
            r4 = 4
            r5 = 0
            java.lang.String r1 = "-"
            java.lang.String r2 = "_"
            r3 = 0
            java.lang.String r8 = kotlin.text.h.F(r0, r1, r2, r3, r4, r5)
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = "getDefault(...)"
            defpackage.zq3.g(r9, r10)
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r9 = "toLowerCase(...)"
            defpackage.zq3.g(r8, r9)
        L4c:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i84.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
