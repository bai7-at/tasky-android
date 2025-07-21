package com.nytimes.android.features.home.ui;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.abtests.BarOneVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.designsystem.uiview.ProgressVisibility;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.features.home.domain.HomeUseCase;
import com.nytimes.android.features.home.ui.b;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.fy4;
import defpackage.gt2;
import defpackage.l93;
import defpackage.ot7;
import defpackage.p94;
import defpackage.t93;
import defpackage.u93;
import defpackage.vb2;
import defpackage.ww8;
import defpackage.z58;
import defpackage.z93;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.t;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class HomeViewModel extends q {
    public static final a Companion = new a(null);
    public static final int k = 8;
    private final HomeUseCase a;
    private final vb2 b;
    private final u93 c;
    private final t93 d;
    private final AbraManager e;
    private final CoroutineExceptionHandler f;
    private final fy4 g;
    private final ot7 h;
    private final MutableStateFlow i;
    private final StateFlow j;

    @fc1(c = "com.nytimes.android.features.home.ui.HomeViewModel$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.home.ui.HomeViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ z58 $subauthClient;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(z58 z58Var, by0 by0Var) {
            super(2, by0Var);
            this.$subauthClient = z58Var;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
            return ((AnonymousClass2) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return HomeViewModel.this.new AnonymousClass2(this.$subauthClient, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            HomeViewModel.this.p(this.$subauthClient.h().a());
            return ww8.a;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            NYTLogger.g("BreadCrumb", "Exception Handler HomeViewModel", th);
        }
    }

    public HomeViewModel(HomeUseCase homeUseCase, vb2 vb2Var, u93 u93Var, t93 t93Var, z58 z58Var, AbraManager abraManager) {
        zq3.h(homeUseCase, "homeUseCase");
        zq3.h(vb2Var, "feedPerformanceTracker");
        zq3.h(u93Var, "homePerformanceTracker");
        zq3.h(t93Var, "navigationStateHolder");
        zq3.h(z58Var, "subauthClient");
        zq3.h(abraManager, "abraManager");
        this.a = homeUseCase;
        this.b = vb2Var;
        this.c = u93Var;
        this.d = t93Var;
        this.e = abraManager;
        this.f = new b(CoroutineExceptionHandler.Key);
        this.g = new fy4(new z93(null, ProgressVisibility.INDICATOR_ONLY));
        this.h = new ot7();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.i = MutableStateFlow;
        this.j = FlowKt.asStateFlow(MutableStateFlow);
        final SharedFlow h = z58Var.h().h();
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(new Flow() { // from class: com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1

            /* renamed from: com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2", f = "HomeViewModel.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2$1 r0 = (com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2$1 r0 = new com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r6 = (com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType) r6
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.ENTITLEMENTS_CHANGED
                        if (r6 == r2) goto L41
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED
                        if (r6 != r2) goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4a
                        return r1
                    L4a:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.ui.HomeViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, Dispatchers.getIO()), new AnonymousClass2(z58Var, null)), r.a(this));
    }

    private final void l(ParallelDownloadStrategy parallelDownloadStrategy) {
        HomeUseCase homeUseCase = this.a;
        z93 z93Var = (z93) this.g.f();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(homeUseCase.g(parallelDownloadStrategy, z93Var != null ? z93Var.c() : null), new HomeViewModel$refresh$1(this, null)), new HomeViewModel$refresh$2(this, null)), CoroutineScopeKt.plus(r.a(this), this.f));
    }

    private final void n() {
        this.c.l();
        this.b.l("One Webview Today Tab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z93 o(z93 z93Var, DownloadState downloadState) {
        if (zq3.c(downloadState, DownloadState.c.b)) {
            return z93.b(z93Var, null, ProgressVisibility.INDICATOR_ONLY, 1, null);
        }
        if (downloadState instanceof DownloadState.e) {
            n();
            return z93Var.a((l93) ((DownloadState.e) downloadState).a(), ProgressVisibility.INVISIBLE);
        }
        if (downloadState instanceof DownloadState.d) {
            n();
            return z93Var.a((l93) ((DownloadState.d) downloadState).a(), ProgressVisibility.INDICATOR_WITH_TEXT);
        }
        if (downloadState instanceof DownloadState.b) {
            DownloadState.b bVar = (DownloadState.b) downloadState;
            p94.a(NYTLogger.a, "One Webview Today Tab", bVar.c());
            this.h.p(new b.a(((l93) bVar.a()).a()));
            return z93Var.a((l93) bVar.a(), ProgressVisibility.INVISIBLE);
        }
        if (!(downloadState instanceof DownloadState.a)) {
            throw new NoWhenBranchMatchedException();
        }
        DownloadState.a aVar = (DownloadState.a) downloadState;
        this.b.m("One Webview Today Tab", aVar.c(), HomeViewModel.class.getName());
        p94.a(NYTLogger.a, "One Webview Today Tab", aVar.c());
        this.h.p(b.C0286b.a);
        return z93.b(z93Var, null, ProgressVisibility.INVISIBLE, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z) {
        String str = null;
        if (!z) {
            AbraManager abraManager = this.e;
            BarOneVariants.a aVar = BarOneVariants.Companion;
            abraManager.exposeTest(aVar.a().getTestName(), t.f(du8.a("pageContext", new PageContext(null, null, null, null, 0, 31, null))));
            AbraTest test = this.e.getTest(aVar.a().getTestName());
            if (test != null) {
                str = test.getVariant();
            }
        }
        this.i.setValue(Boolean.valueOf(!z && zq3.c(str, BarOneVariants.DISPLAY_BAR_ONE.getVariantName())));
    }

    public final void g() {
        l(ParallelDownloadStrategy.FETCH_ALWAYS);
        this.b.o("One Webview Today Tab");
    }

    public final ot7 i() {
        return this.h;
    }

    public final StateFlow j() {
        return this.j;
    }

    public final fy4 k() {
        return this.g;
    }

    public final void m() {
        l(ParallelDownloadStrategy.FETCH_ALWAYS);
    }

    public final void onResume() {
        l(this.d.a() ? ParallelDownloadStrategy.GET : ParallelDownloadStrategy.FETCH_IF_STALE);
        this.d.c();
        this.b.n("One Webview Today Tab");
        this.c.m();
    }
}
