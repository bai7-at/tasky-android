package com.dropbox.android.external.store4.impl;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$acquireFetcher$2", f = "FetcherController.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FetcherController$acquireFetcher$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $key;
    int label;
    final /* synthetic */ FetcherController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetcherController$acquireFetcher$2(FetcherController fetcherController, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fetcherController;
        this.$key = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FetcherController$acquireFetcher$2(this.this$0, this.$key, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RefCountedResource refCountedResource;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            refCountedResource = this.this$0.d;
            Object obj2 = this.$key;
            this.label = 1;
            obj = refCountedResource.a(obj2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FetcherController$acquireFetcher$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
