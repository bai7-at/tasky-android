package kotlinx.coroutines.debug.internal;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", l = {167}, m = "yieldFrames")
/* loaded from: classes5.dex */
final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, by0<? super DebugCoroutineInfoImpl$yieldFrames$1> by0Var) {
        super(by0Var);
        this.this$0 = debugCoroutineInfoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object yieldFrames;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        yieldFrames = this.this$0.yieldFrames(null, null, this);
        return yieldFrames;
    }
}
