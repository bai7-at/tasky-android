package com.nytimes.android.subauth.core.purr;

import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl$queryPrivacyDirectivesFromPURRBackend$queryDirectivesResult$1", f = "PurrManagerImpl.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerImpl$queryPrivacyDirectivesFromPURRBackend$queryDirectivesResult$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ AgentTCFInfo $cachedAgentTCF;
    final /* synthetic */ List<UserPrivacyPreference> $cachedPrivacyPrefs;
    int label;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$queryPrivacyDirectivesFromPURRBackend$queryDirectivesResult$1(PurrManagerImpl purrManagerImpl, List list, AgentTCFInfo agentTCFInfo, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = purrManagerImpl;
        this.$cachedPrivacyPrefs = list;
        this.$cachedAgentTCF = agentTCFInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PurrManagerImpl$queryPrivacyDirectivesFromPURRBackend$queryDirectivesResult$1(this.this$0, this.$cachedPrivacyPrefs, this.$cachedAgentTCF, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PurrManagerImpl$queryPrivacyDirectivesFromPURRBackend$queryDirectivesResult$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PurrManagerImpl purrManagerImpl = this.this$0;
            List<UserPrivacyPreference> list = this.$cachedPrivacyPrefs;
            AgentTCFInfo agentTCFInfo = this.$cachedAgentTCF;
            this.label = 1;
            obj = purrManagerImpl.N(list, agentTCFInfo, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }
}
