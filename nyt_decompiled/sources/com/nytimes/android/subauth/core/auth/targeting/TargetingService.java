package com.nytimes.android.subauth.core.auth.targeting;

import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.auth.network.response.d;
import com.nytimes.android.subauth.core.auth.network.response.e;
import defpackage.by0;
import defpackage.c05;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.mg8;
import defpackage.ng8;
import defpackage.ul8;
import defpackage.w88;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TargetingService implements mg8 {
    private final NYTTargetingAPI a;
    private final c05 b;
    private final ng8 c;
    private final w88 d;
    private final CoroutineScope e;
    private MutableStateFlow f;
    private final StateFlow g;
    private boolean h;

    @fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingService$1", f = "TargetingService.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.targeting.TargetingService$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return TargetingService.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                ng8 ng8Var = TargetingService.this.c;
                this.label = 1;
                obj = ng8Var.b(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            e eVar = (e) obj;
            if (eVar instanceof e.b) {
                TargetingService.this.f.setValue(((e.b) eVar).a());
            } else if (eVar instanceof e.a) {
                ul8.a.f(((e.a) eVar).a(), "setting null targeting data", new Object[0]);
                TargetingService.this.f.setValue(null);
            }
            TargetingService.this.j(true);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public TargetingService(NYTTargetingAPI nYTTargetingAPI, c05 c05Var, ng8 ng8Var, w88 w88Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(nYTTargetingAPI, "targetingApi");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(ng8Var, "targetingStore");
        zq3.h(w88Var, "networkStatus");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = nYTTargetingAPI;
        this.b = c05Var;
        this.c = ng8Var;
        this.d = w88Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.e = CoroutineScope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f = MutableStateFlow;
        this.g = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: Exception -> 0x0032, TRY_ENTER, TryCatch #0 {Exception -> 0x0032, blocks: (B:12:0x002d, B:13:0x00b4, B:27:0x00a2), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.targeting.TargetingService.g(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Exception r8, boolean r9, boolean r10, defpackage.by0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.nytimes.android.subauth.core.auth.targeting.TargetingService$handleRefreshTargetingDataFailure$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.subauth.core.auth.targeting.TargetingService$handleRefreshTargetingDataFailure$1 r0 = (com.nytimes.android.subauth.core.auth.targeting.TargetingService$handleRefreshTargetingDataFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.targeting.TargetingService$handleRefreshTargetingDataFailure$1 r0 = new com.nytimes.android.subauth.core.auth.targeting.TargetingService$handleRefreshTargetingDataFailure$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.subauth.core.auth.targeting.TargetingService r7 = (com.nytimes.android.subauth.core.auth.targeting.TargetingService) r7
            kotlin.f.b(r11)
            goto L7e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.subauth.core.auth.targeting.TargetingService r7 = (com.nytimes.android.subauth.core.auth.targeting.TargetingService) r7
            kotlin.f.b(r11)
            goto L69
        L40:
            kotlin.f.b(r11)
            r11 = 0
            if (r8 == 0) goto L4f
            ul8$b r2 = defpackage.ul8.a
            java.lang.String r5 = "Get Targeting Data Failed. Error refreshing data"
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r2.f(r8, r5, r6)
        L4f:
            if (r10 == 0) goto L5a
            ul8$b r8 = defpackage.ul8.a
            java.lang.String r10 = "Get Targeting Data Failed. Internet Not Connected"
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r8.u(r10, r11)
        L5a:
            if (r9 == 0) goto L84
            ng8 r8 = r7.c
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r11 = r8.c(r0)
            if (r11 != r1) goto L69
            return r1
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            if (r8 == 0) goto L84
            ng8 r8 = r7.c
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.f
            r8 = 0
            r7.setValue(r8)
        L84:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.targeting.TargetingService.h(java.lang.Exception, boolean, boolean, by0):java.lang.Object");
    }

    static /* synthetic */ Object i(TargetingService targetingService, Exception exc, boolean z, boolean z2, by0 by0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return targetingService.h(exc, z, z2, by0Var);
    }

    @Override // defpackage.mg8
    public d a() {
        return (d) this.g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.mg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.targeting.TargetingService.b(boolean, by0):java.lang.Object");
    }

    public final void j(boolean z) {
        this.h = z;
    }

    public /* synthetic */ TargetingService(NYTTargetingAPI nYTTargetingAPI, c05 c05Var, ng8 ng8Var, w88 w88Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nYTTargetingAPI, c05Var, ng8Var, w88Var, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
