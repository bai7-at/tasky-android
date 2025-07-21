package com.nytimes.android.features.home.domain;

import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.coroutinesutils.ParallelStore;
import com.nytimes.android.coroutinesutils.b;
import com.nytimes.android.features.home.data.GraphQLIdRetriever;
import com.nytimes.android.features.home.data.HomeCacheManager;
import com.nytimes.android.features.home.data.HomeRepository;
import defpackage.by0;
import defpackage.l93;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.Pair;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class HomeUseCase {
    private final HomeRepository a;
    private final HomeCacheManager b;
    private final CoroutineDispatcher c;
    private final GraphQLIdRetriever d;
    private final b e;
    private final b f;
    private final ParallelStore g;

    public HomeUseCase(HomeRepository homeRepository, HomeCacheManager homeCacheManager, CoroutineDispatcher coroutineDispatcher, GraphQLIdRetriever graphQLIdRetriever, b bVar, b bVar2) {
        zq3.h(homeRepository, "homeRepository");
        zq3.h(homeCacheManager, "cacheManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(graphQLIdRetriever, "graphQLIdRetriever");
        zq3.h(bVar, "homeContentLoadJourney");
        zq3.h(bVar2, "parallelStoreTracer");
        this.a = homeRepository;
        this.b = homeCacheManager;
        this.c = coroutineDispatcher;
        this.d = graphQLIdRetriever;
        this.e = bVar;
        this.f = bVar2;
        this.g = new ParallelStore(new ss2() { // from class: com.nytimes.android.features.home.domain.HomeUseCase$parallelStore$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                HomeCacheManager homeCacheManager2;
                zq3.h(str, "it");
                homeCacheManager2 = HomeUseCase.this.b;
                return Boolean.valueOf(homeCacheManager2.e());
            }
        }, new HomeUseCase$parallelStore$2(this, null), new HomeUseCase$parallelStore$3(this, null), bVar2, 0L, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(String str, by0 by0Var) {
        return BuildersKt.withContext(this.c, new HomeUseCase$fetchFromServer$2(this, str, null), by0Var);
    }

    public final Flow g(ParallelDownloadStrategy parallelDownloadStrategy, l93 l93Var) {
        zq3.h(parallelDownloadStrategy, "strategy");
        b.a.a(this.e, false, new Pair[0], 1, null);
        return FlowKt.onEach(this.g.p(parallelDownloadStrategy, new HomeUseCase$retrieveData$1(this, parallelDownloadStrategy, null), l93Var), new HomeUseCase$retrieveData$2(this, null));
    }
}
