package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxObservableCoroutine", f = "RxObservable.kt", l = {ContentType.LIVE}, m = "send")
/* loaded from: classes5.dex */
final class RxObservableCoroutine$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RxObservableCoroutine<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxObservableCoroutine$send$1(RxObservableCoroutine<T> rxObservableCoroutine, by0<? super RxObservableCoroutine$send$1> by0Var) {
        super(by0Var);
        this.this$0 = rxObservableCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.send(null, this);
    }
}
