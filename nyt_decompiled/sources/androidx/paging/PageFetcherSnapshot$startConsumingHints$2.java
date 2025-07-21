package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {646, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$startConsumingHints$2 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$2(PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PageFetcherSnapshot$startConsumingHints$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PageFetcherSnapshot pageFetcherSnapshot;
        PageFetcherSnapshotState.a aVar;
        Mutex mutex;
        Mutex mutex2;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        Object q;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                pageFetcherSnapshot = this.this$0;
                aVar = pageFetcherSnapshot.k;
                mutex = aVar.b;
                this.L$0 = aVar;
                this.L$1 = mutex;
                this.L$2 = pageFetcherSnapshot;
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
                pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
                mutex2 = (Mutex) this.L$1;
                aVar = (PageFetcherSnapshotState.a) this.L$0;
                kotlin.f.b(obj);
            }
            pageFetcherSnapshotState = aVar.c;
            Flow f = pageFetcherSnapshotState.f();
            mutex2.unlock(null);
            LoadType loadType = LoadType.PREPEND;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            q = pageFetcherSnapshot.q(f, loadType, this);
            if (q == h) {
                return h;
            }
            return ww8.a;
        } catch (Throwable th) {
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PageFetcherSnapshot$startConsumingHints$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
