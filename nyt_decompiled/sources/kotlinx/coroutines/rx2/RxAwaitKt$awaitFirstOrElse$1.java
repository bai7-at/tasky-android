package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", l = {196}, m = "awaitFirstOrElse")
/* loaded from: classes5.dex */
final class RxAwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RxAwaitKt$awaitFirstOrElse$1(by0<? super RxAwaitKt$awaitFirstOrElse$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return RxAwaitKt.awaitFirstOrElse(null, null, this);
    }
}
