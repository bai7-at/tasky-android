package com.nytimes.android.features.discovery.discoverytab;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DiscoverySectionViewModel extends q {
    private final DiscoverySectionsUseCase a;
    private final MutableStateFlow b;
    private final StateFlow c;
    private Job d;

    public DiscoverySectionViewModel(DiscoverySectionsUseCase discoverySectionsUseCase) {
        zq3.h(discoverySectionsUseCase, "homeUseCase");
        this.a = discoverySectionsUseCase;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        j(this, null, 1, null);
    }

    public static /* synthetic */ void j(DiscoverySectionViewModel discoverySectionViewModel, ParallelDownloadStrategy parallelDownloadStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            parallelDownloadStrategy = ParallelDownloadStrategy.FETCH_IF_STALE;
        }
        discoverySectionViewModel.i(parallelDownloadStrategy);
    }

    public final StateFlow g() {
        return this.c;
    }

    public final void i(ParallelDownloadStrategy parallelDownloadStrategy) {
        Job launch$default;
        zq3.h(parallelDownloadStrategy, "strategy");
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DiscoverySectionViewModel$reloadFeed$1(this, parallelDownloadStrategy, null), 3, null);
        this.d = launch$default;
    }
}
