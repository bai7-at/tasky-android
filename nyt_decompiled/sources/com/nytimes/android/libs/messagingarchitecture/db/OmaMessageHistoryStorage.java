package com.nytimes.android.libs.messagingarchitecture.db;

import defpackage.by0;
import defpackage.cr4;
import defpackage.kr4;
import defpackage.qg0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class OmaMessageHistoryStorage implements kr4 {
    private final qg0 a;
    private final cr4 b;

    public OmaMessageHistoryStorage(qg0 qg0Var, cr4 cr4Var) {
        zq3.h(qg0Var, "messageHistoryDao");
        zq3.h(cr4Var, "messageDao");
        this.a = qg0Var;
        this.b = cr4Var;
    }

    @Override // defpackage.kr4
    public Object a(by0 by0Var) {
        return this.a.a(by0Var);
    }

    @Override // defpackage.kr4
    public Object b(by0 by0Var) {
        Object b = this.a.b(by0Var);
        return b == a.h() ? b : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.kr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.nytimes.android.libs.messagingarchitecture.model.Message r18, defpackage.by0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage$insert$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage$insert$1 r2 = (com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage$insert$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage$insert$1 r2 = new com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage$insert$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L46
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            kotlin.f.b(r1)
            goto L8b
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            java.lang.Object r0 = r2.L$1
            com.nytimes.android.libs.messagingarchitecture.model.Message r0 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r0
            java.lang.Object r4 = r2.L$0
            com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage r4 = (com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage) r4
            kotlin.f.b(r1)
            r7 = r0
            r0 = r4
            goto L77
        L46:
            kotlin.f.b(r1)
            qg0 r1 = r0.a
            java.lang.String r8 = r18.n()
            java.lang.String r10 = r18.q()
            java.lang.String r9 = r18.j()
            java.lang.String r11 = r18.t()
            pg0 r4 = new pg0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.L$0 = r0
            r7 = r18
            r2.L$1 = r7
            r2.label = r6
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            cr4 r0 = r0.b
            java.lang.String r1 = r7.n()
            r4 = 0
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r0 = r0.f(r1, r2)
            if (r0 != r3) goto L8b
            return r3
        L8b:
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage.c(com.nytimes.android.libs.messagingarchitecture.model.Message, by0):java.lang.Object");
    }
}
