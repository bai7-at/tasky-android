package androidx.compose.foundation.gestures;

import defpackage.d35;
import defpackage.fd5;
import defpackage.g35;

/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements d35 {
    private final ScrollingLogic a;
    private boolean b;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.a = scrollingLogic;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q0(long r3, long r5, defpackage.by0 r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            long r5 = r3.J$0
            java.lang.Object r2 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r2 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) r2
            kotlin.f.b(r4)
            goto L4d
        L2f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L37:
            kotlin.f.b(r4)
            boolean r4 = r2.b
            if (r4 == 0) goto L58
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r2.a
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.d(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            u49 r4 = (defpackage.u49) r4
            long r3 = r4.o()
            long r3 = defpackage.u49.k(r5, r3)
            goto L5e
        L58:
            u49$a r3 = defpackage.u49.b
            long r3 = r3.a()
        L5e:
            u49 r3 = defpackage.u49.b(r3)
            r3.o()
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r2.a
            r4 = 0
            r2.i(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.Q0(long, long, by0):java.lang.Object");
    }

    public final void a(boolean z) {
        this.b = z;
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        if (g35.e(i, g35.a.b())) {
            this.a.i(true);
        }
        return fd5.b.c();
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        return this.b ? this.a.h(j2) : fd5.b.c();
    }
}
