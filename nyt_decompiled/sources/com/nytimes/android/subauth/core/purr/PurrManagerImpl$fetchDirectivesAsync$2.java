package com.nytimes.android.subauth.core.purr;

import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purr.PurrManagerImpl$fetchDirectivesAsync$2", f = "PurrManagerImpl.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrManagerImpl$fetchDirectivesAsync$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ AgentTCFInfo $agentTCFInfo;
    final /* synthetic */ List<UserPrivacyPreference> $prefs;
    int label;
    final /* synthetic */ PurrManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrManagerImpl$fetchDirectivesAsync$2(PurrManagerImpl purrManagerImpl, List list, AgentTCFInfo agentTCFInfo, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrManagerImpl;
        this.$prefs = list;
        this.$agentTCFInfo = agentTCFInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PurrManagerImpl$fetchDirectivesAsync$2(this.this$0, this.$prefs, this.$agentTCFInfo, by0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:2)|(1:(1:5)(2:18|19))(4:20|(2:22|(3:24|10|11))|25|(1:27))|6|7|8|9|10|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        r0 = "Fetch PURR Directives Failure: Unable to fetch purr data privacy directives " + r5;
        r8.this$0.n = r0;
        defpackage.ul8.a.z("PURR").d(r0, new java.lang.Object[0]);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 0
            java.lang.String r3 = "PURR"
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L20
            if (r1 != r4) goto L18
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L13
            goto L6a
        L13:
            r9 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
            goto L78
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L20:
            kotlin.f.b(r9)
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r9 = r8.this$0
            com.nytimes.android.subauth.core.purr.PurrManagerImpl.K(r9, r5)
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r9 = r8.this$0
            java.util.concurrent.atomic.AtomicBoolean r9 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.C(r9)
            boolean r9 = r9.get()
            if (r9 != 0) goto L51
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r9 = r8.this$0
            boolean r9 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.I(r9)
            if (r9 == 0) goto L3d
            goto L51
        L3d:
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r8 = r8.this$0
            java.lang.String r9 = "Fetch PURR Directives Skip: App is in background - skipping network call"
            com.nytimes.android.subauth.core.purr.PurrManagerImpl.K(r8, r9)
            ul8$b r8 = defpackage.ul8.a
            ul8$c r8 = r8.z(r3)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r8.l(r9, r0)
            r8 = r5
            goto L9a
        L51:
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r9 = r8.this$0     // Catch: java.lang.Exception -> L13
            s86 r9 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.F(r9)     // Catch: java.lang.Exception -> L13
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r1 = r8.this$0     // Catch: java.lang.Exception -> L13
            java.util.List<com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference> r6 = r8.$prefs     // Catch: java.lang.Exception -> L13
            java.util.List r1 = com.nytimes.android.subauth.core.purr.PurrManagerImpl.B(r1, r6)     // Catch: java.lang.Exception -> L13
            com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo r6 = r8.$agentTCFInfo     // Catch: java.lang.Exception -> L13
            r8.label = r4     // Catch: java.lang.Exception -> L13
            java.lang.Object r9 = r9.b(r1, r6, r8)     // Catch: java.lang.Exception -> L13
            if (r9 != r0) goto L6a
            return r0
        L6a:
            com.nytimes.android.subauth.core.purr.model.QueryPrivacyDirectivesResult r9 = (com.nytimes.android.subauth.core.purr.model.QueryPrivacyDirectivesResult) r9     // Catch: java.lang.Exception -> L13
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r0 = r8.this$0     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "Fetch PURR Directives Success!"
            com.nytimes.android.subauth.core.purr.PurrManagerImpl.K(r0, r1)     // Catch: java.lang.Exception -> L76
        L73:
            r8 = r5
            r5 = r9
            goto L9a
        L76:
            r0 = move-exception
            r5 = r0
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fetch PURR Directives Failure: Unable to fetch purr data privacy directives "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.nytimes.android.subauth.core.purr.PurrManagerImpl r8 = r8.this$0
            com.nytimes.android.subauth.core.purr.PurrManagerImpl.K(r8, r0)
            ul8$b r8 = defpackage.ul8.a
            ul8$c r8 = r8.z(r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r8.d(r0, r1)
            goto L73
        L9a:
            kotlin.Pair r8 = defpackage.du8.a(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purr.PurrManagerImpl$fetchDirectivesAsync$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PurrManagerImpl$fetchDirectivesAsync$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
