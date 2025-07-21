package com.nytimes.android.abra.io;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.abra.io.AbraNetworkUpdater$checkForUpdates$1", f = "AbraNetworkUpdater.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraNetworkUpdater$checkForUpdates$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AbraNetworkUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraNetworkUpdater$checkForUpdates$1(AbraNetworkUpdater abraNetworkUpdater, by0<? super AbraNetworkUpdater$checkForUpdates$1> by0Var) {
        super(2, by0Var);
        this.this$0 = abraNetworkUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new AbraNetworkUpdater$checkForUpdates$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AbraNetworkUpdater abraNetworkUpdater = this.this$0;
            this.label = 1;
            if (abraNetworkUpdater.updateAbra(this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((AbraNetworkUpdater$checkForUpdates$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
