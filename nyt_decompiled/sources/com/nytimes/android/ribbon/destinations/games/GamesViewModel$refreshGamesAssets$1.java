package com.nytimes.android.ribbon.destinations.games;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.coroutinesutils.ParallelStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.wv2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.games.GamesViewModel$refreshGamesAssets$1", f = "GamesViewModel.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesViewModel$refreshGamesAssets$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ wv2 $data;
    int label;
    final /* synthetic */ GamesViewModel this$0;

    @fc1(c = "com.nytimes.android.ribbon.destinations.games.GamesViewModel$refreshGamesAssets$1$1", f = "GamesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.destinations.games.GamesViewModel$refreshGamesAssets$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements ss2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(1, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass1(by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass1) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return ww8.a;
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ GamesViewModel a;

        a(GamesViewModel gamesViewModel) {
            this.a = gamesViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            DownloadState downloadState2;
            mutableStateFlow = this.a.k;
            if (!(downloadState instanceof DownloadState.a)) {
                if (downloadState instanceof DownloadState.b) {
                    DownloadState.b bVar = (DownloadState.b) downloadState;
                    downloadState2 = new DownloadState.b(bVar.a(), bVar.d(), bVar.c());
                } else {
                    downloadState2 = DownloadState.c.b;
                    if (!zq3.c(downloadState, downloadState2)) {
                        if (downloadState instanceof DownloadState.d) {
                            downloadState2 = new DownloadState.d(((DownloadState.d) downloadState).a());
                        } else {
                            if (!(downloadState instanceof DownloadState.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            downloadState2 = new DownloadState.e(((DownloadState.e) downloadState).a());
                        }
                    }
                }
                downloadState = downloadState2;
            }
            mutableStateFlow.setValue(downloadState);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesViewModel$refreshGamesAssets$1(GamesViewModel gamesViewModel, wv2 wv2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gamesViewModel;
        this.$data = wv2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GamesViewModel$refreshGamesAssets$1(this.this$0, this.$data, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ParallelStore parallelStore;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            parallelStore = this.this$0.j;
            Flow p = parallelStore.p(ParallelDownloadStrategy.FETCH_IF_STALE, new AnonymousClass1(null), this.$data);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (p.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GamesViewModel$refreshGamesAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
