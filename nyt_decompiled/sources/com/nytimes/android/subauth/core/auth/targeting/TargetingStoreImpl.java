package com.nytimes.android.subauth.core.auth.targeting;

import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.ba1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ng8;
import defpackage.s16;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes4.dex */
public final class TargetingStoreImpl implements ng8 {
    private final ba1 a;
    private final s16.a b;

    public TargetingStoreImpl(ba1 ba1Var) {
        zq3.h(ba1Var, "dataStore");
        this.a = ba1Var;
        this.b = u16.f("targeting_data");
    }

    @Override // defpackage.ng8
    public Object a(by0 by0Var) {
        Object a = PreferencesKt.a(this.a, new TargetingStoreImpl$removeTargetingData$2(this, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ng8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$getSavedTargetingData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$getSavedTargetingData$1 r0 = (com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$getSavedTargetingData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$getSavedTargetingData$1 r0 = new com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$getSavedTargetingData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl r4 = (com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl) r4
            kotlin.f.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            ba1 r5 = r4.a
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            s16 r5 = (defpackage.s16) r5
            if (r5 == 0) goto L56
            s16$a r4 = r4.b
            java.lang.Object r4 = r5.c(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L57
        L56:
            r4 = 0
        L57:
            if (r4 == 0) goto L60
            com.nytimes.android.subauth.core.auth.network.response.d$a r5 = com.nytimes.android.subauth.core.auth.network.response.d.Companion
            com.nytimes.android.subauth.core.auth.network.response.e r4 = r5.a(r4)
            goto L62
        L60:
            com.nytimes.android.subauth.core.auth.network.response.e$a$a r4 = com.nytimes.android.subauth.core.auth.network.response.e.a.C0416a.c
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl.b(by0):java.lang.Object");
    }

    @Override // defpackage.ng8
    public Object c(by0 by0Var) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new TargetingStoreImpl$hasTargetingData$preferences$1(this, null), 1, null);
        s16 s16Var = (s16) runBlocking$default;
        return cc0.a(s16Var != null ? s16Var.b(this.b) : false);
    }

    @Override // defpackage.ng8
    public Object d(String str, by0 by0Var) {
        Object a = PreferencesKt.a(this.a, new TargetingStoreImpl$saveTargetingData$2(this, str, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }
}
