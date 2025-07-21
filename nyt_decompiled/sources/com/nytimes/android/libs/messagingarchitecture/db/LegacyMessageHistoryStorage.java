package com.nytimes.android.libs.messagingarchitecture.db;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.by0;
import defpackage.fr4;
import defpackage.gr4;
import defpackage.kr4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class LegacyMessageHistoryStorage implements kr4 {
    private final gr4 a;

    public LegacyMessageHistoryStorage(gr4 gr4Var) {
        zq3.h(gr4Var, "legacyMessageHistoryDao");
        this.a = gr4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.kr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage$getAll$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage$getAll$1 r0 = (com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage$getAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage$getAll$1 r0 = new com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage$getAll$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            gr4 r4 = r4.a
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.i.w(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            fr4 r0 = (defpackage.fr4) r0
            pg0 r0 = r0.f()
            r4.add(r0)
            goto L50
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage.a(by0):java.lang.Object");
    }

    @Override // defpackage.kr4
    public Object b(by0 by0Var) {
        Object b = this.a.b(by0Var);
        return b == a.h() ? b : ww8.a;
    }

    @Override // defpackage.kr4
    public Object c(Message message, by0 by0Var) {
        Object c = this.a.c(new fr4(message), by0Var);
        return c == a.h() ? c : ww8.a;
    }
}
