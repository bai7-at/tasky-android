package com.nytimes.android.features.discovery.discoverytab;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import org.threeten.bp.Instant;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$1", f = "DiscoverySectionsUseCase.kt", l = {56, 56, 56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DiscoverySectionsUseCase$load$1 extends SuspendLambda implements it2 {
    final /* synthetic */ ParallelDownloadStrategy $strategy;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiscoverySectionsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverySectionsUseCase$load$1(DiscoverySectionsUseCase discoverySectionsUseCase, ParallelDownloadStrategy parallelDownloadStrategy, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = discoverySectionsUseCase;
        this.$strategy = parallelDownloadStrategy;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Set set, DownloadState downloadState, by0 by0Var) {
        DiscoverySectionsUseCase$load$1 discoverySectionsUseCase$load$1 = new DiscoverySectionsUseCase$load$1(this.this$0, this.$strategy, by0Var);
        discoverySectionsUseCase$load$1.L$0 = set;
        discoverySectionsUseCase$load$1.L$1 = downloadState;
        return discoverySectionsUseCase$load$1.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DownloadState downloadState;
        Instant instant;
        Instant instant2;
        Instant instant3;
        Object h = a.h();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                instant3 = (Instant) this.L$0;
                f.b(obj);
                return new DownloadState.e(du8.a(obj, instant3));
            }
            if (i == 2) {
                instant2 = (Instant) this.L$0;
                f.b(obj);
                return new DownloadState.d(du8.a(obj, instant2));
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instant = (Instant) this.L$1;
            downloadState = (DownloadState) this.L$0;
            f.b(obj);
            DownloadState.b bVar = (DownloadState.b) downloadState;
            return new DownloadState.b(du8.a(obj, instant), bVar.d(), bVar.c());
        }
        f.b(obj);
        Set set = (Set) this.L$0;
        DownloadState downloadState2 = (DownloadState) this.L$1;
        DiscoverySectionsUseCase discoverySectionsUseCase = this.this$0;
        ParallelDownloadStrategy parallelDownloadStrategy = this.$strategy;
        DownloadState.c cVar = DownloadState.c.b;
        if (zq3.c(downloadState2, cVar)) {
            return cVar;
        }
        if (downloadState2 instanceof DownloadState.e) {
            Pair pair = (Pair) ((DownloadState.e) downloadState2).a();
            List list = (List) pair.a();
            Instant instant4 = (Instant) pair.b();
            this.L$0 = instant4;
            this.label = 1;
            obj = discoverySectionsUseCase.c(list, set, parallelDownloadStrategy, this);
            if (obj == h) {
                return h;
            }
            instant3 = instant4;
            return new DownloadState.e(du8.a(obj, instant3));
        }
        if (downloadState2 instanceof DownloadState.d) {
            Pair pair2 = (Pair) ((DownloadState.d) downloadState2).a();
            List list2 = (List) pair2.a();
            Instant instant5 = (Instant) pair2.b();
            this.L$0 = instant5;
            this.label = 2;
            obj = discoverySectionsUseCase.c(list2, set, parallelDownloadStrategy, this);
            if (obj == h) {
                return h;
            }
            instant2 = instant5;
            return new DownloadState.d(du8.a(obj, instant2));
        }
        if (!(downloadState2 instanceof DownloadState.b)) {
            if (downloadState2 instanceof DownloadState.a) {
                return downloadState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        Pair pair3 = (Pair) ((DownloadState.b) downloadState2).a();
        List list3 = (List) pair3.a();
        Instant instant6 = (Instant) pair3.b();
        this.L$0 = downloadState2;
        this.L$1 = instant6;
        this.label = 3;
        obj = discoverySectionsUseCase.c(list3, set, parallelDownloadStrategy, this);
        if (obj == h) {
            return h;
        }
        downloadState = downloadState2;
        instant = instant6;
        DownloadState.b bVar2 = (DownloadState.b) downloadState;
        return new DownloadState.b(du8.a(obj, instant), bVar2.d(), bVar2.c());
    }
}
