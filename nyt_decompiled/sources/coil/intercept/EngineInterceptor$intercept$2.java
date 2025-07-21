package coil.intercept;

import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import defpackage.by0;
import defpackage.cc8;
import defpackage.d42;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qp4;
import defpackage.s;
import defpackage.uk5;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.yo3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ MemoryCache.Key $cacheKey;
    final /* synthetic */ yo3.a $chain;
    final /* synthetic */ d42 $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ uk5 $options;
    final /* synthetic */ vg3 $request;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, vg3 vg3Var, Object obj, uk5 uk5Var, d42 d42Var, MemoryCache.Key key, yo3.a aVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = engineInterceptor;
        this.$request = vg3Var;
        this.$mappedData = obj;
        this.$options = uk5Var;
        this.$eventListener = d42Var;
        this.$cacheKey = key;
        this.$chain = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qp4 qp4Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            EngineInterceptor engineInterceptor = this.this$0;
            vg3 vg3Var = this.$request;
            Object obj2 = this.$mappedData;
            uk5 uk5Var = this.$options;
            d42 d42Var = this.$eventListener;
            this.label = 1;
            obj = engineInterceptor.i(vg3Var, obj2, uk5Var, d42Var, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        EngineInterceptor.b bVar = (EngineInterceptor.b) obj;
        qp4Var = this.this$0.c;
        return new cc8(bVar.e(), this.$request, bVar.c(), qp4Var.h(this.$cacheKey, this.$request, bVar) ? this.$cacheKey : null, bVar.d(), bVar.f(), s.t(this.$chain));
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((EngineInterceptor$intercept$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
