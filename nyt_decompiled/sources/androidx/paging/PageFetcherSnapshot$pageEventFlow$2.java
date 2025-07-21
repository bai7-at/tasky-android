package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {646, 179}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, by0Var);
        pageFetcherSnapshot$pageEventFlow$2.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        PageFetcherSnapshotState.a aVar;
        Mutex mutex;
        Mutex mutex2;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                flowCollector = (FlowCollector) this.L$0;
                aVar = this.this$0.k;
                mutex = aVar.b;
                this.L$0 = aVar;
                this.L$1 = mutex;
                this.L$2 = flowCollector;
                this.label = 1;
                if (mutex.lock(null, this) == h) {
                    return h;
                }
                mutex2 = mutex;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
                flowCollector = (FlowCollector) this.L$2;
                mutex2 = (Mutex) this.L$1;
                aVar = (PageFetcherSnapshotState.a) this.L$0;
                kotlin.f.b(obj);
            }
            pageFetcherSnapshotState = aVar.c;
            e d = pageFetcherSnapshotState.p().d();
            mutex2.unlock(null);
            PageEvent.b bVar = new PageEvent.b(d, null, 2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (flowCollector.emit(bVar, this) == h) {
                return h;
            }
            return ww8.a;
        } catch (Throwable th) {
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
