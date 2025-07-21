package androidx.compose.material.pullrefresh;

import defpackage.d35;
import defpackage.fd5;
import defpackage.g35;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.ss2;

/* loaded from: classes.dex */
final class PullRefreshNestedScrollConnection implements d35 {
    private final ss2 a;
    private final gt2 b;
    private final boolean c;

    public PullRefreshNestedScrollConnection(ss2 ss2Var, gt2 gt2Var, boolean z) {
        this.a = ss2Var;
        this.b = gt2Var;
        this.c = z;
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        return !this.c ? fd5.b.c() : (!g35.e(i, g35.a.a()) || fd5.p(j) >= 0.0f) ? fd5.b.c() : hd5.a(0.0f, ((Number) this.a.invoke(Float.valueOf(fd5.p(j)))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o0(long r5, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r4 = r0.F$0
            kotlin.f.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r7)
            gt2 r4 = r4.b
            float r5 = defpackage.u49.i(r5)
            java.lang.Float r5 = defpackage.cc0.b(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r4.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r4 = r6
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            long r4 = defpackage.v49.a(r4, r5)
            u49 r4 = defpackage.u49.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.o0(long, by0):java.lang.Object");
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        return !this.c ? fd5.b.c() : (!g35.e(i, g35.a.a()) || fd5.p(j2) <= 0.0f) ? fd5.b.c() : hd5.a(0.0f, ((Number) this.a.invoke(Float.valueOf(fd5.p(j2)))).floatValue());
    }
}
