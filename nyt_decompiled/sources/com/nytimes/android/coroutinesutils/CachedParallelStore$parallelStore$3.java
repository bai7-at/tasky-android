package com.nytimes.android.coroutinesutils;

import defpackage.at3;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j91;
import defpackage.lf2;
import defpackage.ww8;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.serialization.KSerializer;

@fc1(c = "com.nytimes.android.coroutinesutils.CachedParallelStore$parallelStore$3", f = "CachedParallelStore.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CachedParallelStore$parallelStore$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $fetch;
    final /* synthetic */ KSerializer $serializer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedParallelStore$parallelStore$3(gt2 gt2Var, CachedParallelStore cachedParallelStore, KSerializer kSerializer, by0 by0Var) {
        super(2, by0Var);
        this.$fetch = gt2Var;
        this.this$0 = cachedParallelStore;
        this.$serializer = kSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CachedParallelStore$parallelStore$3 cachedParallelStore$parallelStore$3 = new CachedParallelStore$parallelStore$3(this.$fetch, this.this$0, this.$serializer, by0Var);
        cachedParallelStore$parallelStore$3.L$0 = obj;
        return cachedParallelStore$parallelStore$3;
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((CachedParallelStore$parallelStore$3) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        at3 at3Var;
        j91 j91Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Object obj2 = this.L$0;
            gt2 gt2Var = this.$fetch;
            this.label = 1;
            obj = gt2Var.invoke(obj2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        CachedParallelStore cachedParallelStore = this.this$0;
        KSerializer kSerializer = this.$serializer;
        file = cachedParallelStore.c;
        at3Var = cachedParallelStore.b;
        lf2.i(file, at3Var.b(kSerializer, obj), null, 2, null);
        j91Var = this.this$0.a;
        return du8.a(obj, j91Var.b());
    }
}
