package com.nytimes.android.subauth.core.auth.sessionRefresh;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1", f = "SessionRefreshV2Manager.kt", l = {ContentType.LIVE, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 131, 133, 134}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ boolean $isForceRefresh;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SessionRefreshV2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1(SessionRefreshV2Manager sessionRefreshV2Manager, boolean z, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = sessionRefreshV2Manager;
        this.$isForceRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1(this.this$0, this.$isForceRefresh, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager$sessionRefresh$sessionRefreshResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
