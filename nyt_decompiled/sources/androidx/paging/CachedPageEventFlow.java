package androidx.paging;

import androidx.paging.PageEvent;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes.dex */
public final class CachedPageEventFlow {
    private final FlattenedPageController a;
    private final MutableSharedFlow b;
    private final SharedFlow c;
    private final Job d;
    private final Flow e;

    public CachedPageEventFlow(Flow flow, CoroutineScope coroutineScope) {
        Job launch$default;
        zq3.h(flow, "src");
        zq3.h(coroutineScope, "scope");
        this.a = new FlattenedPageController();
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.b = MutableSharedFlow;
        this.c = FlowKt.onSubscription(MutableSharedFlow, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.LAZY, new CachedPageEventFlow$job$1(flow, this, null), 1, null);
        launch$default.invokeOnCompletion(new ss2() { // from class: androidx.paging.CachedPageEventFlow$job$2$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                MutableSharedFlow mutableSharedFlow;
                mutableSharedFlow = CachedPageEventFlow.this.b;
                mutableSharedFlow.tryEmit(null);
            }
        });
        this.d = launch$default;
        this.e = FlowKt.flow(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }

    public final void e() {
        Job.DefaultImpls.cancel$default(this.d, (CancellationException) null, 1, (Object) null);
    }

    public final PageEvent.Insert f() {
        return this.a.a();
    }

    public final Flow g() {
        return this.e;
    }
}
