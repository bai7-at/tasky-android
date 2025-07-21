package com.dropbox.android.external.store4.impl;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$diskNetworkCombined$diskFlow$1", f = "RealStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RealStore$diskNetworkCombined$diskFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CompletableDeferred<ww8> $networkLock;
    final /* synthetic */ boolean $skipDiskCache;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealStore$diskNetworkCombined$diskFlow$1(boolean z, CompletableDeferred completableDeferred, by0 by0Var) {
        super(2, by0Var);
        this.$skipDiskCache = z;
        this.$networkLock = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RealStore$diskNetworkCombined$diskFlow$1(this.$skipDiskCache, this.$networkLock, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.$skipDiskCache) {
            this.$networkLock.complete(ww8.a);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((RealStore$diskNetworkCombined$diskFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
