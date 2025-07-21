package androidx.compose.foundation.lazy.layout;

import defpackage.by0;
import defpackage.cz3;
import defpackage.ve5;
import defpackage.ww8;
import kotlin.Result;

/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements ve5 {
    private boolean b;
    private by0 c;

    @Override // defpackage.ve5
    public void k(cz3 cz3Var) {
        if (this.b) {
            return;
        }
        this.b = true;
        by0 by0Var = this.c;
        if (by0Var != null) {
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(ww8.a));
        }
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            by0 r4 = (defpackage.by0) r4
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.f.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.f.b(r5)
            boolean r5 = r4.b
            if (r5 != 0) goto L71
            by0 r5 = r4.c
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            k77 r2 = new k77
            by0 r3 = kotlin.coroutines.intrinsics.a.d(r0)
            r2.<init>(r3)
            r4.c = r2
            java.lang.Object r4 = r2.a()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.h()
            if (r4 != r2) goto L60
            defpackage.hc1.c(r0)
        L60:
            if (r4 != r1) goto L63
            return r1
        L63:
            r4 = r5
        L64:
            if (r4 == 0) goto L71
            kotlin.Result$a r5 = kotlin.Result.a
            ww8 r5 = defpackage.ww8.a
            java.lang.Object r5 = kotlin.Result.b(r5)
            r4.resumeWith(r5)
        L71:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.l(by0):java.lang.Object");
    }
}
