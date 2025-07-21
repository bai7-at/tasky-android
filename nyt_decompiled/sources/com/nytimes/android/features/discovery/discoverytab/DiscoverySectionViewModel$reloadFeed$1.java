package com.nytimes.android.features.discovery.discoverytab;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoverySectionViewModel$reloadFeed$1", f = "DiscoverySectionViewModel.kt", l = {36, 38}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DiscoverySectionViewModel$reloadFeed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ParallelDownloadStrategy $strategy;
    Object L$0;
    int label;
    final /* synthetic */ DiscoverySectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverySectionViewModel$reloadFeed$1(DiscoverySectionViewModel discoverySectionViewModel, ParallelDownloadStrategy parallelDownloadStrategy, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = discoverySectionViewModel;
        this.$strategy = parallelDownloadStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DiscoverySectionViewModel$reloadFeed$1(this.this$0, this.$strategy, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Exception exc;
        MutableStateFlow mutableStateFlow3;
        DiscoverySectionsUseCase discoverySectionsUseCase;
        MutableStateFlow mutableStateFlow4;
        Object h = a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            mutableStateFlow = this.this$0.b;
            DownloadState.Companion companion = DownloadState.Companion;
            mutableStateFlow2 = this.this$0.b;
            DownloadState a = companion.a(((DownloadState) mutableStateFlow2.getValue()).a(), e);
            this.L$0 = e;
            this.label = 2;
            if (mutableStateFlow.emit(a, this) == h) {
                return h;
            }
            exc = e;
        }
        if (i == 0) {
            f.b(obj);
            mutableStateFlow3 = this.this$0.b;
            discoverySectionsUseCase = this.this$0.a;
            ParallelDownloadStrategy parallelDownloadStrategy = this.$strategy;
            mutableStateFlow4 = this.this$0.b;
            Flow e2 = discoverySectionsUseCase.e(parallelDownloadStrategy, (Pair) ((DownloadState) mutableStateFlow4.getValue()).a());
            this.label = 1;
            Object emitAll = FlowKt.emitAll(mutableStateFlow3, e2, this);
            this = emitAll;
            if (emitAll == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc = (Exception) this.L$0;
                f.b(obj);
                NYTLogger.i(exc, "Failed to fetch discovery feed: " + exc, new Object[0]);
                return ww8.a;
            }
            f.b(obj);
            this = this;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DiscoverySectionViewModel$reloadFeed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
