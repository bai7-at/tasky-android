package coil;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lb9;
import defpackage.s;
import defpackage.vg3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

@fc1(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RealImageLoader$execute$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ vg3 $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2(vg3 vg3Var, RealImageLoader realImageLoader, by0 by0Var) {
        super(2, by0Var);
        this.$request = vg3Var;
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.$request, this.this$0, by0Var);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
            if (this.$request.M() instanceof lb9) {
                s.l(((lb9) this.$request.M()).getView()).b(async$default);
            }
            this.label = 1;
            obj = async$default.await(this);
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
        return ((RealImageLoader$execute$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
