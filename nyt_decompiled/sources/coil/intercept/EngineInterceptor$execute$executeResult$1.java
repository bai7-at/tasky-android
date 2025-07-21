package coil.intercept;

import defpackage.by0;
import defpackage.d42;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nd2;
import defpackage.or0;
import defpackage.sx7;
import defpackage.uk5;
import defpackage.vg3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<or0> $components;
    final /* synthetic */ d42 $eventListener;
    final /* synthetic */ Ref$ObjectRef<nd2> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<uk5> $options;
    final /* synthetic */ vg3 $request;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, vg3 vg3Var, Object obj, Ref$ObjectRef ref$ObjectRef3, d42 d42Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = engineInterceptor;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = vg3Var;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = d42Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            EngineInterceptor engineInterceptor = this.this$0;
            sx7 sx7Var = (sx7) this.$fetchResult.element;
            or0 or0Var = this.$components.element;
            vg3 vg3Var = this.$request;
            Object obj2 = this.$mappedData;
            uk5 uk5Var = this.$options.element;
            d42 d42Var = this.$eventListener;
            this.label = 1;
            obj = engineInterceptor.h(sx7Var, or0Var, vg3Var, obj2, uk5Var, d42Var, this);
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
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
