package com.nytimes.subauth.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider;
import defpackage.by0;
import defpackage.fc1;
import defpackage.o98;
import defpackage.p78;
import defpackage.t98;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes4.dex */
public final class SubauthUserUIManager implements t98, SubauthUserUIDebugAPI {
    public static final a l = new a(null);
    public static final int m = 8;
    private final NYTUser a;
    private final o98 b;
    private final p78 c;
    private final com.nytimes.android.subauth.core.purr.a d;
    private final PurrDirectiveOverrider e;
    private final MutableSharedFlow f;
    private final Flow g;
    private final Flow h;
    private boolean i;
    private LIREErrorStateOverride j;
    private DeleteAccountStatusOverride k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SubauthUserUIManager(NYTUser nYTUser, o98 o98Var, p78 p78Var, com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, MutableSharedFlow mutableSharedFlow, Flow flow, Flow flow2) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(o98Var, "subauthUser");
        zq3.h(p78Var, "subauthLoginLinkingAPI");
        zq3.h(aVar, "purrManager");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(mutableSharedFlow, "lireResultFlow");
        zq3.h(flow, "lireAnalyticsFlow");
        zq3.h(flow2, "accountDeleteAnalyticsFlow");
        this.a = nYTUser;
        this.b = o98Var;
        this.c = p78Var;
        this.d = aVar;
        this.e = purrDirectiveOverrider;
        this.f = mutableSharedFlow;
        this.g = flow;
        this.h = flow2;
        this.j = LIREErrorStateOverride.NoOverride;
        this.k = DeleteAccountStatusOverride.NoOverride;
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void a(LIREErrorStateOverride lIREErrorStateOverride) {
        zq3.h(lIREErrorStateOverride, "errorState");
        this.j = lIREErrorStateOverride;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.t98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.content.Context r19, com.nytimes.subauth.ui.models.SubauthUiParams r20, defpackage.by0 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.subauth.ui.SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1 r2 = (com.nytimes.subauth.ui.SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.subauth.ui.SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1 r2 = new com.nytimes.subauth.ui.SubauthUserUIManager$getOpenAccountDeleteFlowIntent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            java.lang.Object r0 = r2.L$2
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r3 = r2.L$1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r2.L$0
            com.nytimes.subauth.ui.SubauthUserUIManager r2 = (com.nytimes.subauth.ui.SubauthUserUIManager) r2
            kotlin.f.b(r1)
            r17 = r1
            r1 = r0
            r0 = r2
            r2 = r17
            goto L66
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.f.b(r1)
            android.content.SharedPreferences r1 = androidx.preference.g.b(r19)
            com.nytimes.android.subauth.core.purr.a r4 = r0.d
            com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider r6 = r0.e
            r2.L$0 = r0
            r7 = r19
            r2.L$1 = r7
            r2.L$2 = r1
            r2.label = r5
            r5 = r20
            java.lang.Object r2 = com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt.c(r5, r4, r6, r2)
            if (r2 != r3) goto L65
            return r3
        L65:
            r3 = r7
        L66:
            com.nytimes.subauth.ui.models.SubauthUiParams r2 = (com.nytimes.subauth.ui.models.SubauthUiParams) r2
            defpackage.zq3.e(r1)
            com.nytimes.subauth.ui.models.SubauthUiParams r4 = com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt.e(r2, r3, r1)
            com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride r13 = r0.k
            r15 = 767(0x2ff, float:1.075E-42)
            r16 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            com.nytimes.subauth.ui.models.SubauthUiParams r0 = com.nytimes.subauth.ui.models.SubauthUiParams.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity> r2 = com.nytimes.subauth.ui.accountdelete.AccountDeleteActivity.class
            r1.<init>(r3, r2)
            java.lang.String r2 = "subauth_ui_params"
            r1.putExtra(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager.b(android.content.Context, com.nytimes.subauth.ui.models.SubauthUiParams, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.t98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(android.content.Context r6, boolean r7, com.nytimes.subauth.ui.models.SubauthUiParams r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$openAccountReadyFlow$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.subauth.ui.SubauthUserUIManager$openAccountReadyFlow$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$openAccountReadyFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.SubauthUserUIManager$openAccountReadyFlow$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$openAccountReadyFlow$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r7 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            kotlin.f.b(r9)
            goto L58
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.f.b(r9)
            ul8$b r9 = defpackage.ul8.a
            java.lang.String r2 = "SUBAUTH"
            ul8$c r9 = r9.z(r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Open Account Ready Flow"
            r9.a(r4, r2)
            r0.L$0 = r6
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r9 = r5.j(r6, r8, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.String r5 = "is_email_opt_in_register_flow"
            r9.putExtra(r5, r7)
            r5 = r7 ^ 1
            java.lang.String r7 = "is_email_opt_in_reglite_flow"
            r9.putExtra(r7, r5)
            r6.startActivity(r9)
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager.c(android.content.Context, boolean, com.nytimes.subauth.ui.models.SubauthUiParams, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void d(SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS overrideCustomLoginWithNYTS) {
        zq3.h(overrideCustomLoginWithNYTS, TransferTable.COLUMN_STATE);
        CustomLoginWithNYTSProvider.a.e(overrideCustomLoginWithNYTS);
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public boolean e() {
        return this.b.H();
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void f(DeleteAccountStatusOverride deleteAccountStatusOverride) {
        zq3.h(deleteAccountStatusOverride, TransferTable.COLUMN_STATE);
        this.k = deleteAccountStatusOverride;
    }

    public Flow g() {
        return this.h;
    }

    public Flow h() {
        return this.g;
    }

    public Flow i() {
        final Flow flow = this.g;
        final Flow flow2 = new Flow() { // from class: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1

            /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2", f = "SubauthUserUIManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        i78 r6 = (defpackage.i78) r6
                        boolean r6 = r6 instanceof i78.d
                        if (r6 == 0) goto L46
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L46
                        return r1
                    L46:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        return new Flow() { // from class: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1

            /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2", f = "SubauthUserUIManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        i78 r5 = (defpackage.i78) r5
                        java.lang.String r6 = "null cannot be cast to non-null type com.nytimes.subauth.ui.analytics.SubauthLIREAnalyticsEvent.OnLIREFlowExitEvent"
                        defpackage.zq3.f(r5, r6)
                        i78$d r5 = (i78.d) r5
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L48
                        return r1
                    L48:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager$getLIREFlowExitEventFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(android.content.Context r19, com.nytimes.subauth.ui.models.SubauthUiParams r20, defpackage.by0 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getOpenLoginFlowIntent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.subauth.ui.SubauthUserUIManager$getOpenLoginFlowIntent$1 r2 = (com.nytimes.subauth.ui.SubauthUserUIManager$getOpenLoginFlowIntent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.subauth.ui.SubauthUserUIManager$getOpenLoginFlowIntent$1 r2 = new com.nytimes.subauth.ui.SubauthUserUIManager$getOpenLoginFlowIntent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            java.lang.Object r0 = r2.L$2
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r3 = r2.L$1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r2.L$0
            com.nytimes.subauth.ui.SubauthUserUIManager r2 = (com.nytimes.subauth.ui.SubauthUserUIManager) r2
            kotlin.f.b(r1)
            r17 = r1
            r1 = r0
            r0 = r2
            r2 = r17
            goto L66
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.f.b(r1)
            android.content.SharedPreferences r1 = androidx.preference.g.b(r19)
            com.nytimes.android.subauth.core.purr.a r4 = r0.d
            com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider r6 = r0.e
            r2.L$0 = r0
            r7 = r19
            r2.L$1 = r7
            r2.L$2 = r1
            r2.label = r5
            r5 = r20
            java.lang.Object r2 = com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt.c(r5, r4, r6, r2)
            if (r2 != r3) goto L65
            return r3
        L65:
            r3 = r7
        L66:
            com.nytimes.subauth.ui.models.SubauthUiParams r2 = (com.nytimes.subauth.ui.models.SubauthUiParams) r2
            defpackage.zq3.e(r1)
            com.nytimes.subauth.ui.models.SubauthUiParams r4 = com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt.e(r2, r3, r1)
            boolean r10 = r0.i
            com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride r12 = r0.j
            com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride r13 = r0.k
            r15 = 607(0x25f, float:8.5E-43)
            r16 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r14 = 0
            com.nytimes.subauth.ui.models.SubauthUiParams r0 = com.nytimes.subauth.ui.models.SubauthUiParams.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.nytimes.subauth.ui.login.SubauthLoginActivity> r2 = com.nytimes.subauth.ui.login.SubauthLoginActivity.class
            r1.<init>(r3, r2)
            java.lang.String r2 = "subauth_ui_params"
            r1.putExtra(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager.j(android.content.Context, com.nytimes.subauth.ui.models.SubauthUiParams, by0):java.lang.Object");
    }

    public Flow k() {
        final Flow flow = this.g;
        final Flow flow2 = new Flow() { // from class: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1

            /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2", f = "SubauthUserUIManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        i78 r6 = (defpackage.i78) r6
                        boolean r6 = r6 instanceof i78.c
                        if (r6 == 0) goto L46
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L46
                        return r1
                    L46:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        return new Flow() { // from class: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1

            /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2", f = "SubauthUserUIManager.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        i78 r5 = (defpackage.i78) r5
                        java.lang.String r6 = "null cannot be cast to non-null type com.nytimes.subauth.ui.analytics.SubauthLIREAnalyticsEvent.OnEmailSupportRequestedEvent"
                        defpackage.zq3.f(r5, r6)
                        i78$c r5 = (i78.c) r5
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L48
                        return r1
                    L48:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager$getUserRequestedEmailSupportEventFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(android.content.Context r6, com.nytimes.subauth.ui.models.SubauthUiParams r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.subauth.ui.SubauthUserUIManager$openLoginFlow$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.subauth.ui.SubauthUserUIManager$openLoginFlow$1 r0 = (com.nytimes.subauth.ui.SubauthUserUIManager$openLoginFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.SubauthUserUIManager$openLoginFlow$1 r0 = new com.nytimes.subauth.ui.SubauthUserUIManager$openLoginFlow$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.nytimes.subauth.ui.SubauthUserUIManager r5 = (com.nytimes.subauth.ui.SubauthUserUIManager) r5
            kotlin.f.b(r8)
            goto L6f
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.subauth.ui.SubauthUserUIManager r5 = (com.nytimes.subauth.ui.SubauthUserUIManager) r5
            kotlin.f.b(r8)
            goto L55
        L45:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r5.j(r6, r7, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            android.content.Intent r8 = (android.content.Intent) r8
            kotlinx.coroutines.flow.MutableSharedFlow r7 = r5.f
            r7.resetReplayCache()
            r6.startActivity(r8)
            kotlinx.coroutines.flow.MutableSharedFlow r6 = r5.f
            r0.L$0 = r5
            r7 = 0
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            q54 r8 = (defpackage.q54) r8
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.f
            r5.resetReplayCache()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.SubauthUserUIManager.l(android.content.Context, com.nytimes.subauth.ui.models.SubauthUiParams, by0):java.lang.Object");
    }
}
