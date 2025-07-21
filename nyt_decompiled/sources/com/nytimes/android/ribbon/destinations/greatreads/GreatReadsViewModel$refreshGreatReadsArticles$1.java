package com.nytimes.android.ribbon.destinations.greatreads;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.e33;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i33;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsViewModel$refreshGreatReadsArticles$1", f = "GreatReadsViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GreatReadsViewModel$refreshGreatReadsArticles$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ i33 $currentData;
    final /* synthetic */ boolean $forceRefresh;
    int label;
    final /* synthetic */ GreatReadsViewModel this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ GreatReadsViewModel a;

        a(GreatReadsViewModel greatReadsViewModel) {
            this.a = greatReadsViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            Object value;
            DownloadState downloadState2;
            mutableStateFlow = this.a.e;
            do {
                value = mutableStateFlow.getValue();
                if (downloadState instanceof DownloadState.a) {
                    downloadState2 = new DownloadState.a(((DownloadState.a) downloadState).c());
                } else if (downloadState instanceof DownloadState.b) {
                    DownloadState.b bVar = (DownloadState.b) downloadState;
                    downloadState2 = new DownloadState.b(new i33((List) ((Pair) bVar.a()).c()), bVar.d(), bVar.c());
                } else {
                    downloadState2 = DownloadState.c.b;
                    if (!zq3.c(downloadState, downloadState2)) {
                        if (downloadState instanceof DownloadState.d) {
                            downloadState2 = new DownloadState.d(new i33((List) ((Pair) ((DownloadState.d) downloadState).a()).c()));
                        } else {
                            if (!(downloadState instanceof DownloadState.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            downloadState2 = new DownloadState.e(new i33((List) ((Pair) ((DownloadState.e) downloadState).a()).c()));
                        }
                    }
                }
            } while (!mutableStateFlow.compareAndSet(value, downloadState2));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GreatReadsViewModel$refreshGreatReadsArticles$1(GreatReadsViewModel greatReadsViewModel, i33 i33Var, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = greatReadsViewModel;
        this.$currentData = i33Var;
        this.$forceRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GreatReadsViewModel$refreshGreatReadsArticles$1(this.this$0, this.$currentData, this.$forceRefresh, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e33 e33Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            e33Var = this.this$0.a;
            i33 i33Var = this.$currentData;
            Flow a2 = e33Var.a(i33Var != null ? i33Var.a() : null, this.$forceRefresh);
            a aVar = new a(this.this$0);
            this.label = 1;
            if (a2.collect(aVar, this) == h) {
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
        return ((GreatReadsViewModel$refreshGreatReadsArticles$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
