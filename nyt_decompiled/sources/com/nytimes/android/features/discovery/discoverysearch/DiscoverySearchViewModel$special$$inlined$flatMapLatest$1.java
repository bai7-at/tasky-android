package com.nytimes.android.features.discovery.discoverysearch;

import androidx.lifecycle.r;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.nytimes.android.features.discovery.discoverysearch.a;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ae7;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.xn5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$special$$inlined$flatMapLatest$1", f = "DiscoverySearchViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DiscoverySearchViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiscoverySearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverySearchViewModel$special$$inlined$flatMapLatest$1(by0 by0Var, DiscoverySearchViewModel discoverySearchViewModel) {
        super(3, by0Var);
        this.this$0 = discoverySearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetworkStatus networkStatus;
        Flow asFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            networkStatus = this.this$0.b;
            if (networkStatus.g()) {
                this.this$0.l().setValue(a.d.b);
                xn5 xn5Var = new xn5(10, 0, false, 0, 0, 0, 62, null);
                final DiscoverySearchViewModel discoverySearchViewModel = this.this$0;
                asFlow = CachedPagingDataKt.a(new Pager(xn5Var, null, new qs2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$searchModels$3$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final PagingSource mo865invoke() {
                        ae7 ae7Var;
                        ae7Var = DiscoverySearchViewModel.this.a;
                        return ae7Var.create((String) DiscoverySearchViewModel.this.k().getValue());
                    }
                }, 2, null).a(), r.a(this.this$0));
            } else {
                this.this$0.l().setValue(a.c.b);
                asFlow = FlowKt.asFlow(new PagingData[0]);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, asFlow, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        DiscoverySearchViewModel$special$$inlined$flatMapLatest$1 discoverySearchViewModel$special$$inlined$flatMapLatest$1 = new DiscoverySearchViewModel$special$$inlined$flatMapLatest$1(by0Var, this.this$0);
        discoverySearchViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        discoverySearchViewModel$special$$inlined$flatMapLatest$1.L$1 = obj;
        return discoverySearchViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(ww8.a);
    }
}
