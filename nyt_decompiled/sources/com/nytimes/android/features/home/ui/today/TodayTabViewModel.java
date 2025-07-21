package com.nytimes.android.features.home.ui.today;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.features.home.domain.HomeUseCase;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.logging.NYTLogger;
import defpackage.bn8;
import defpackage.l93;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TodayTabViewModel extends q {
    private final HomeUseCase a;
    private final DestinationTabState b;
    private final bn8 c;
    private final CoroutineExceptionHandler d;
    private final MutableStateFlow e;
    private final StateFlow f;

    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            NYTLogger.g("BreadCrumb", "Exception Handler HomeViewModel", th);
        }
    }

    public TodayTabViewModel(HomeUseCase homeUseCase, DestinationTabState destinationTabState, bn8 bn8Var) {
        zq3.h(homeUseCase, "homeUseCase");
        zq3.h(destinationTabState, "tabState");
        zq3.h(bn8Var, "todayLoadObserver");
        this.a = homeUseCase;
        this.b = destinationTabState;
        this.c = bn8Var;
        this.d = new a(CoroutineExceptionHandler.Key);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final void k(ParallelDownloadStrategy parallelDownloadStrategy, l93 l93Var) {
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.a.g(parallelDownloadStrategy, l93Var), new TodayTabViewModel$refresh$1(this, null)), new TodayTabViewModel$refresh$2(this, null)), CoroutineScopeKt.plus(r.a(this), this.d));
    }

    public final StateFlow g() {
        return this.f;
    }

    public final boolean i(String str) {
        zq3.h(str, "todayTitle");
        return this.b.d(str);
    }

    public final void j(boolean z, l93 l93Var) {
        k(z ? ParallelDownloadStrategy.FETCH_ALWAYS : ParallelDownloadStrategy.FETCH_IF_STALE, l93Var);
    }
}
