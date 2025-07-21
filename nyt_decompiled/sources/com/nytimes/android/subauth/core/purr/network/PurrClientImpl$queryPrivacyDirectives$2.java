package com.nytimes.android.subauth.core.purr.network;

import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.purr.network.PurrClientImpl$queryPrivacyDirectives$2", f = "PurrClientImpl.kt", l = {69, 82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrClientImpl$queryPrivacyDirectives$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ AgentTCFInfo $agentTCFInfo;
    final /* synthetic */ List<UserPrivacyPreference> $params;
    int label;
    final /* synthetic */ PurrClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrClientImpl$queryPrivacyDirectives$2(PurrClientImpl purrClientImpl, AgentTCFInfo agentTCFInfo, List list, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = purrClientImpl;
        this.$agentTCFInfo = agentTCFInfo;
        this.$params = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PurrClientImpl$queryPrivacyDirectives$2(this.this$0, this.$agentTCFInfo, this.$params, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PurrClientImpl$queryPrivacyDirectives$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00df A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0010, B:7:0x00ad, B:9:0x00b3, B:11:0x00c9, B:12:0x00cf, B:14:0x00d3, B:15:0x00d7, B:16:0x00de, B:19:0x00df, B:23:0x0020, B:24:0x0050, B:26:0x005a, B:27:0x0069, B:28:0x0082, B:30:0x0088, B:32:0x0096, B:40:0x0041), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b3 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0010, B:7:0x00ad, B:9:0x00b3, B:11:0x00c9, B:12:0x00cf, B:14:0x00d3, B:15:0x00d7, B:16:0x00de, B:19:0x00df, B:23:0x0020, B:24:0x0050, B:26:0x005a, B:27:0x0069, B:28:0x0082, B:30:0x0088, B:32:0x0096, B:40:0x0041), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.network.PurrClientImpl$queryPrivacyDirectives$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
