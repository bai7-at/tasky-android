package com.apollographql.apollo.internal;

import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.internal.a;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.db3;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sd0;
import defpackage.wa3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MultipartKt$multipartBodyFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<a> $multipartReader;
    final /* synthetic */ db3 $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$1(Ref$ObjectRef ref$ObjectRef, db3 db3Var, by0 by0Var) {
        super(2, by0Var);
        this.$multipartReader = ref$ObjectRef;
        this.$response = db3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new MultipartKt$multipartBodyFlow$1(this.$multipartReader, this.$response, by0Var);
        multipartKt$multipartBodyFlow$1.L$0 = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.apollographql.apollo.internal.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String b;
        FlowCollector flowCollector;
        sd0 a;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Ref$ObjectRef<a> ref$ObjectRef = this.$multipartReader;
            sd0 a2 = this.$response.a();
            zq3.e(a2);
            b = MultipartKt.b(wa3.a(this.$response.b(), "Content-Type"));
            if (b == null) {
                throw new DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
            }
            ref$ObjectRef.element = new a(a2, b);
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        do {
            a aVar = this.$multipartReader.element;
            zq3.e(aVar);
            a.b j = aVar.j();
            if (j == null) {
                return ww8.a;
            }
            a = j.a();
            this.L$0 = flowCollector;
            this.label = 1;
        } while (flowCollector.emit(a, this) != h);
        return h;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((MultipartKt$multipartBodyFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
