package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import io.reactivex.MaybeSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", l = {78}, m = "awaitSingle")
/* loaded from: classes5.dex */
final class RxAwaitKt$awaitSingle$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    RxAwaitKt$awaitSingle$1(by0<? super RxAwaitKt$awaitSingle$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return RxAwaitKt.awaitSingle((MaybeSource) null, this);
    }
}
