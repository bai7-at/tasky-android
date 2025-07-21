package com.dropbox.android.external.store4.impl;

import com.dropbox.flow.multicast.Multicaster;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$2", f = "FetcherController.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FetcherController$fetchers$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    FetcherController$fetchers$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, Multicaster multicaster, by0 by0Var) {
        FetcherController$fetchers$2 fetcherController$fetchers$2 = new FetcherController$fetchers$2(by0Var);
        fetcherController$fetchers$2.L$0 = multicaster;
        return fetcherController$fetchers$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Multicaster multicaster = (Multicaster) this.L$0;
            this.label = 1;
            if (multicaster.g(this) == h) {
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
}
