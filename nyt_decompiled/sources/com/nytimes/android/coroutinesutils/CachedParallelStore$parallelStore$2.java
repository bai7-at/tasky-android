package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.serialization.KSerializer;

@fc1(c = "com.nytimes.android.coroutinesutils.CachedParallelStore$parallelStore$2", f = "CachedParallelStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CachedParallelStore$parallelStore$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ KSerializer $serializer;
    int label;
    final /* synthetic */ CachedParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedParallelStore$parallelStore$2(CachedParallelStore cachedParallelStore, KSerializer kSerializer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = cachedParallelStore;
        this.$serializer = kSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new CachedParallelStore$parallelStore$2(this.this$0, this.$serializer, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((CachedParallelStore$parallelStore$2) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.this$0.e(this.$serializer);
    }
}
