package coil.intercept;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {EventType.SUBS}, m = "proceed")
/* loaded from: classes.dex */
final class RealInterceptorChain$proceed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealInterceptorChain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, by0 by0Var) {
        super(by0Var);
        this.this$0 = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.h(null, this);
    }
}
