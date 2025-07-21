package coil;

import android.graphics.Bitmap;
import coil.intercept.RealInterceptorChain;
import defpackage.au7;
import defpackage.by0;
import defpackage.d42;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.vg3;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ d42 $eventListener;
    final /* synthetic */ Bitmap $placeholderBitmap;
    final /* synthetic */ vg3 $request;
    final /* synthetic */ au7 $size;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$executeMain$result$1(vg3 vg3Var, RealImageLoader realImageLoader, au7 au7Var, d42 d42Var, Bitmap bitmap, by0 by0Var) {
        super(2, by0Var);
        this.$request = vg3Var;
        this.this$0 = realImageLoader;
        this.$size = au7Var;
        this.$eventListener = d42Var;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            vg3 vg3Var = this.$request;
            list = this.this$0.o;
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(vg3Var, list, 0, this.$request, this.$size, this.$eventListener, this.$placeholderBitmap != null);
            vg3 vg3Var2 = this.$request;
            this.label = 1;
            obj = realInterceptorChain.h(vg3Var2, this);
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
        return ((RealImageLoader$executeMain$result$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
