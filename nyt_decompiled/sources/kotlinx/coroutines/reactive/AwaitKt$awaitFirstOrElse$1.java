package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", l = {52}, m = "awaitFirstOrElse")
/* loaded from: classes5.dex */
final class AwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    AwaitKt$awaitFirstOrElse$1(by0<? super AwaitKt$awaitFirstOrElse$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return AwaitKt.awaitFirstOrElse(null, null, this);
    }
}
