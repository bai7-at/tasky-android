package com.nytimes.android.entitlements.purr.client;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrGDPROptOutStatus;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrOptOutStatus;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrTrackerType;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrAdvertisingConfigurationDirectiveV3;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.directive.PurrShowDataProcessingPreferenceDirective;
import defpackage.by0;
import defpackage.d96;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.q86;
import defpackage.q96;
import defpackage.s96;
import defpackage.ww8;
import defpackage.x86;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@FlowPreview
/* loaded from: classes4.dex */
public final class PurrManagerClientImpl implements d96, ei1 {
    private final com.nytimes.android.subauth.core.purr.a a;
    private final s96 b;
    private final PurrCookiePersister c;
    private final PurrDirectiveOverrider d;
    private final q86 e;
    private final CoroutineDispatcher f;
    private final CoroutineScope g;
    private PrivacyConfiguration h;
    private PrivacyConfiguration i;
    private boolean j;
    private final Flow k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PurrTrackerType.values().length];
            try {
                iArr[PurrTrackerType.CONTROLLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurrTrackerType.PROCESSOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurrTrackerType.ESSENTIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[DataProcessingPreferenceDirectiveValue.values().length];
            try {
                iArr2[DataProcessingPreferenceDirectiveValue.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DataProcessingPreferenceDirectiveValue.ALLOW_OPT_IN_OR_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public PurrManagerClientImpl(com.nytimes.android.subauth.core.purr.a aVar, s96 s96Var, PurrCookiePersister purrCookiePersister, PurrDirectiveOverrider purrDirectiveOverrider, q86 q86Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        PrivacyConfiguration applyOverrides;
        zq3.h(aVar, "purrManager");
        zq3.h(s96Var, "purrUIClientAPI");
        zq3.h(purrCookiePersister, "cookiePersister");
        zq3.h(q86Var, "analyticsHelper");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = aVar;
        this.b = s96Var;
        this.c = purrCookiePersister;
        this.d = purrDirectiveOverrider;
        this.e = q86Var;
        this.f = coroutineDispatcher;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.g = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        PrivacyConfiguration n = aVar.n();
        this.h = n;
        this.i = (purrDirectiveOverrider == null || (applyOverrides = purrDirectiveOverrider.applyOverrides(n)) == null) ? this.h : applyOverrides;
        final Flow l = aVar.l();
        this.k = new Flow() { // from class: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ PurrManagerClientImpl b;

                @fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2", f = "PurrManagerClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, PurrManagerClientImpl purrManagerClientImpl) {
                    this.a = flowCollector;
                    this.b = purrManagerClientImpl;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r4 = r4.b
                        com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider r4 = r4.s()
                        if (r4 == 0) goto L48
                        com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r4 = r4.applyOverrides(r5)
                        if (r4 != 0) goto L47
                        goto L48
                    L47:
                        r5 = r4
                    L48:
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r5, r0)
                        if (r4 != r1) goto L51
                        return r1
                    L51:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        z();
        A();
    }

    private final void A() {
        FlowKt.launchIn(FlowKt.onEach(this.b.c(), new PurrManagerClientImpl$setupTCFAnalytics$1(this, null)), this.g);
    }

    private final PurrGDPROptOutStatus C(DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue) {
        int i = a.b[dataProcessingPreferenceDirectiveValue.ordinal()];
        if (i == 1) {
            return PurrGDPROptOutStatus.HIDE;
        }
        if (i == 2) {
            return PurrGDPROptOutStatus.ALLOW_OPT_IN;
        }
        if (i == 3) {
            return PurrGDPROptOutStatus.ALLOW_OPT_OUT;
        }
        if (i == 4) {
            return PurrGDPROptOutStatus.ALLOW_OPT_IN_OR_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(PrivacyConfiguration privacyConfiguration) {
        PrivacyConfiguration applyOverrides;
        this.h = privacyConfiguration;
        PurrDirectiveOverrider purrDirectiveOverrider = this.d;
        if (purrDirectiveOverrider != null && (applyOverrides = purrDirectiveOverrider.applyOverrides(privacyConfiguration)) != null) {
            privacyConfiguration = applyOverrides;
        }
        this.i = privacyConfiguration;
        this.j = true;
        this.c.b(privacyConfiguration);
    }

    private final PurrOptOutStatus t(PrivacyConfiguration privacyConfiguration) {
        DataSaleOptOutDirectiveValueV2 value;
        PurrOptOutStatus d;
        PurrDataSaleOptOutDirectiveV2 purrDataSaleOptOutDirectiveV2 = (PurrDataSaleOptOutDirectiveV2) privacyConfiguration.getDirective(PurrDataSaleOptOutDirectiveV2.class);
        if (purrDataSaleOptOutDirectiveV2 != null && (value = purrDataSaleOptOutDirectiveV2.getValue()) != null && (d = x86.d(value)) != null) {
            return d;
        }
        PurrOptOutStatus purrOptOutStatus = PurrOptOutStatus.HIDE;
        NYTLogger.g("Opt out directive not found", new Object[0]);
        return purrOptOutStatus;
    }

    private final boolean u(PrivacyConfiguration privacyConfiguration, AcceptableTracker acceptableTracker) {
        PurrAcceptableTrackersDirectiveV2 purrAcceptableTrackersDirectiveV2 = (PurrAcceptableTrackersDirectiveV2) privacyConfiguration.getDirective(PurrAcceptableTrackersDirectiveV2.class);
        if (purrAcceptableTrackersDirectiveV2 != null) {
            return purrAcceptableTrackersDirectiveV2.getValue() == acceptableTracker;
        }
        NYTLogger.g("Tracker directive not found", new Object[0]);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(PrivacyConfiguration privacyConfiguration) {
        PurrAdvertisingConfigurationDirectiveV3 purrAdvertisingConfigurationDirectiveV3 = (PurrAdvertisingConfigurationDirectiveV3) privacyConfiguration.getDirective(PurrAdvertisingConfigurationDirectiveV3.class);
        if (purrAdvertisingConfigurationDirectiveV3 != null) {
            return purrAdvertisingConfigurationDirectiveV3.getValue() == AdConfiguration.NPA;
        }
        NYTLogger.g("Ad directive not found", new Object[0]);
        return false;
    }

    private final DataProcessingPreferenceDirectiveValue w(PrivacyConfiguration privacyConfiguration) {
        DataProcessingPreferenceDirectiveValue value;
        PurrShowDataProcessingPreferenceDirective purrShowDataProcessingPreferenceDirective = (PurrShowDataProcessingPreferenceDirective) privacyConfiguration.getDirective(PurrShowDataProcessingPreferenceDirective.class);
        if (purrShowDataProcessingPreferenceDirective != null && (value = purrShowDataProcessingPreferenceDirective.getValue()) != null) {
            return value;
        }
        DataProcessingPreferenceDirectiveValue dataProcessingPreferenceDirectiveValue = DataProcessingPreferenceDirectiveValue.HIDE;
        NYTLogger.g("GDPR Privacy Control Status directive not found", new Object[0]);
        return dataProcessingPreferenceDirectiveValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(PrivacyConfiguration privacyConfiguration, PurrTrackerType purrTrackerType) {
        int i = a.a[purrTrackerType.ordinal()];
        if (i == 1) {
            return u(privacyConfiguration, AcceptableTracker.CONTROLLERS);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (u(privacyConfiguration, AcceptableTracker.ESSENTIALS) || u(privacyConfiguration, AcceptableTracker.PROCESSORS) || u(privacyConfiguration, AcceptableTracker.CONTROLLERS)) {
                return true;
            }
        } else if (u(privacyConfiguration, AcceptableTracker.PROCESSORS) || u(privacyConfiguration, AcceptableTracker.CONTROLLERS)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(q96 q96Var) {
        if (q96Var instanceof q96.b.a) {
            if (((q96.b.a) q96Var).d()) {
                Embrace.getInstance().logInfo("TCF Accept All - Success");
                return;
            } else {
                Embrace.getInstance().logInfo("TCF Accept All - Failure");
                return;
            }
        }
        if (zq3.c(q96Var, q96.a.C0515a.c)) {
            Embrace.getInstance().addBreadcrumb("TCF Blocker Card Shown to user");
            return;
        }
        if (q96Var instanceof q96.c) {
            if (((q96.c) q96Var).c()) {
                Embrace.getInstance().logInfo("TCF Custom Save - Success");
                return;
            } else {
                Embrace.getInstance().logInfo("TCF Custom Save - Failure");
                return;
            }
        }
        if (zq3.c(q96Var, q96.b.d.d)) {
            Embrace.getInstance().addBreadcrumb("TCF Manage Settings Page Shown to user");
        } else if (q96Var instanceof q96.b.g) {
            if (((q96.b.g) q96Var).d()) {
                Embrace.getInstance().logInfo("TCF Reject All - Success");
            } else {
                Embrace.getInstance().logInfo("TCF Reject All - Failure");
            }
        }
    }

    private final void z() {
        BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new PurrManagerClientImpl$setupPurrManagerClient$1(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(B(), new PurrManagerClientImpl$setupPurrManagerClient$2(this, null)), this.g);
    }

    public Flow B() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$getDirectives$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$getDirectives$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$getDirectives$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$getDirectives$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$getDirectives$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r4 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl) r4
            kotlin.f.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.nytimes.android.subauth.core.purr.a r5 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
            r4.D(r5)
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r4 = r4.i
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl.a(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$activeUserHasChanged$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$activeUserHasChanged$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$activeUserHasChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$activeUserHasChanged$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$activeUserHasChanged$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r4 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl) r4
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.nytimes.android.subauth.core.purr.a r6 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r6 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r6
            r4.D(r6)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl.b(boolean, by0):java.lang.Object");
    }

    @Override // defpackage.d96
    public Flow c(final List list) {
        zq3.h(list, "keys");
        final Flow B = B();
        return new Flow() { // from class: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ List b;

                @fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2", f = "PurrManagerClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, List list) {
                    this.a = flowCollector;
                    this.b = list;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
                        java.util.List r4 = r4.b
                        java.util.Map r4 = defpackage.x86.a(r5, r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamStringifiedDirectives$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, list), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // defpackage.d96
    public PrivacyConfiguration d() {
        return this.i;
    }

    @Override // defpackage.r86
    public Flow e(final PurrTrackerType purrTrackerType) {
        zq3.h(purrTrackerType, "trackerType");
        final Flow B = B();
        return new Flow() { // from class: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ PurrManagerClientImpl b;
                final /* synthetic */ PurrTrackerType c;

                @fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2", f = "PurrManagerClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, PurrManagerClientImpl purrManagerClientImpl, PurrTrackerType purrTrackerType) {
                    this.a = flowCollector;
                    this.b = purrManagerClientImpl;
                    this.c = purrTrackerType;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4d
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r2 = r4.b
                        com.nytimes.android.entitlements.purr.client.contracts.models.PurrTrackerType r4 = r4.c
                        boolean r4 = com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl.o(r2, r5, r4)
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L4d
                        return r1
                    L4d:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsTrackerAllowed$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, purrTrackerType), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // defpackage.r86
    public boolean f(PurrTrackerType purrTrackerType) {
        zq3.h(purrTrackerType, "trackerType");
        return x(this.i, purrTrackerType);
    }

    @Override // defpackage.d96
    public String g() {
        return this.a.v().getTcfString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.r86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$isAdsNPA$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$isAdsNPA$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$isAdsNPA$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$isAdsNPA$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$isAdsNPA$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r4 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl) r4
            kotlin.f.b(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
            boolean r4 = r4.v(r5)
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl.i(by0):java.lang.Object");
    }

    @Override // defpackage.r86
    public boolean j() {
        return f(PurrTrackerType.PROCESSOR);
    }

    @Override // defpackage.y86
    public PurrGDPROptOutStatus k() {
        return C(w(this.i));
    }

    @Override // defpackage.d96
    public PurrOptOutStatus l() {
        return t(this.i);
    }

    @Override // defpackage.r86
    public Flow m() {
        final Flow B = B();
        return new Flow() { // from class: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ PurrManagerClientImpl b;

                @fc1(c = "com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2", f = "PurrManagerClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, PurrManagerClientImpl purrManagerClientImpl) {
                    this.a = flowCollector;
                    this.b = purrManagerClientImpl;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r5 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r5
                        com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl r4 = r4.b
                        boolean r4 = com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl.n(r4, r5)
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L4b
                        return r1
                    L4b:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.purr.client.PurrManagerClientImpl$streamIsAdsNPA$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    public final q86 r() {
        return this.e;
    }

    public final PurrDirectiveOverrider s() {
        return this.d;
    }
}
