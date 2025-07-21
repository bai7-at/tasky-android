package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND}, m = "awaitOrDefault")
/* loaded from: classes5.dex */
final class RxAwaitKt$awaitOrDefault$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RxAwaitKt$awaitOrDefault$1(by0<? super RxAwaitKt$awaitOrDefault$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return RxAwaitKt.awaitOrDefault(null, null, this);
    }
}
