package kotlinx.coroutines.reactive;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", l = {166}, m = "awaitSingleOrElse")
/* loaded from: classes5.dex */
final class AwaitKt$awaitSingleOrElse$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    AwaitKt$awaitSingleOrElse$1(by0<? super AwaitKt$awaitSingleOrElse$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return AwaitKt.awaitSingleOrElse(null, null, this);
    }
}
