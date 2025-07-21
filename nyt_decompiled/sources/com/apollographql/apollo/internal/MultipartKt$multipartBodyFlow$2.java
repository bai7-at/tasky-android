package com.apollographql.apollo.internal;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MultipartKt$multipartBodyFlow$2 extends SuspendLambda implements it2 {
    final /* synthetic */ Ref$ObjectRef<a> $multipartReader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$2(Ref$ObjectRef ref$ObjectRef, by0 by0Var) {
        super(3, by0Var);
        this.$multipartReader = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ww8 ww8Var;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Ref$ObjectRef<a> ref$ObjectRef = this.$multipartReader;
        try {
            Result.a aVar = Result.a;
            a aVar2 = ref$ObjectRef.element;
            if (aVar2 != null) {
                aVar2.close();
                ww8Var = ww8.a;
            } else {
                ww8Var = null;
            }
            Result.b(ww8Var);
        } catch (Throwable th) {
            Result.a aVar3 = Result.a;
            Result.b(f.a(th));
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new MultipartKt$multipartBodyFlow$2(this.$multipartReader, by0Var);
        multipartKt$multipartBodyFlow$2.L$0 = flowCollector;
        return multipartKt$multipartBodyFlow$2.invokeSuspend(ww8.a);
    }
}
