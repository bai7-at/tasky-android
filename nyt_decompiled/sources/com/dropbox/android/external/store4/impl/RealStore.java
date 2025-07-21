package com.dropbox.android.external.store4.impl;

import com.chartbeat.androidsdk.QueryKeys;
import com.dropbox.android.external.store4.CacheType;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.impl.RealStore;
import com.dropbox.android.external.store4.impl.operators.FlowMergeKt;
import com.nytimes.android.external.cache3.CacheBuilder;
import defpackage.a38;
import defpackage.cg9;
import defpackage.dg0;
import defpackage.m28;
import defpackage.rp4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.time.b;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class RealStore implements m28 {
    private final rp4 a;
    private final SourceOfTruthWithBarrier b;
    private final dg0 c;
    private final FetcherController d;

    public RealStore(CoroutineScope coroutineScope, Fetcher fetcher, SourceOfTruth sourceOfTruth, rp4 rp4Var) {
        zq3.h(coroutineScope, "scope");
        zq3.h(fetcher, "fetcher");
        this.a = rp4Var;
        dg0 dg0Var = null;
        SourceOfTruthWithBarrier sourceOfTruthWithBarrier = sourceOfTruth == null ? null : new SourceOfTruthWithBarrier(sourceOfTruth);
        this.b = sourceOfTruthWithBarrier;
        if (rp4Var != null) {
            CacheBuilder x = CacheBuilder.x();
            if (rp4Var.d()) {
                x.f(b.s(rp4Var.b()), TimeUnit.MILLISECONDS);
            }
            if (rp4Var.g()) {
                x.g(b.s(rp4Var.c()), TimeUnit.MILLISECONDS);
            }
            if (rp4Var.e()) {
                x.v(rp4Var.h());
            }
            if (rp4Var.f()) {
                x.w(rp4Var.i());
                x.D(new cg9() { // from class: or6
                    @Override // defpackage.cg9
                    public final int weigh(Object obj, Object obj2) {
                        int j;
                        j = RealStore.j(RealStore.this, obj, obj2);
                        return j;
                    }
                });
            }
            dg0Var = x.a();
        }
        this.c = dg0Var;
        this.d = new FetcherController(coroutineScope, fetcher, sourceOfTruthWithBarrier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow g(a38 a38Var, CompletableDeferred completableDeferred, boolean z) {
        return FlowKt.onStart(this.d.g(a38Var.b(), z), new RealStore$createNetworkFlow$1(completableDeferred, z, null));
    }

    static /* synthetic */ Flow h(RealStore realStore, a38 a38Var, CompletableDeferred completableDeferred, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return realStore.g(a38Var, completableDeferred, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow i(a38 a38Var, SourceOfTruthWithBarrier sourceOfTruthWithBarrier) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        Flow h = h(this, a38Var, CompletableDeferred$default2, false, 4, null);
        boolean d = a38Var.d(CacheType.DISK);
        if (!d) {
            CompletableDeferred$default.complete(ww8.a);
        }
        return FlowKt.flow(new RealStore$diskNetworkCombined$$inlined$transform$1(FlowMergeKt.a(h, FlowKt.onStart(sourceOfTruthWithBarrier.d(a38Var.b(), CompletableDeferred$default), new RealStore$diskNetworkCombined$diskFlow$1(d, CompletableDeferred$default2, null))), null, CompletableDeferred$default, a38Var, CompletableDeferred$default2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(RealStore realStore, Object obj, Object obj2) {
        zq3.h(realStore, "this$0");
        zq3.h(obj, "k");
        zq3.h(obj2, QueryKeys.INTERNAL_REFERRER);
        return realStore.a.j().weigh(obj, obj2);
    }

    @Override // defpackage.m28
    public Flow a(a38 a38Var) {
        zq3.h(a38Var, "request");
        return FlowKt.onEach(FlowKt.flow(new RealStore$stream$1(a38Var, this, null)), new RealStore$stream$2(this, a38Var, null));
    }
}
