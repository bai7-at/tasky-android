package coil;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.vg3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ vg3 $request;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2$job$1(RealImageLoader realImageLoader, vg3 vg3Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = realImageLoader;
        this.$request = vg3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RealImageLoader$execute$2$job$1(this.this$0, this.$request, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            RealImageLoader realImageLoader = this.this$0;
            vg3 vg3Var = this.$request;
            this.label = 1;
            obj = realImageLoader.g(vg3Var, 1, this);
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
        return ((RealImageLoader$execute$2$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
