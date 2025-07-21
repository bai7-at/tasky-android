package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import io.reactivex.MaybeSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxChannelKt", f = "RxChannel.kt", l = {99}, m = "collect")
/* loaded from: classes5.dex */
final class RxChannelKt$collect$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    RxChannelKt$collect$1(by0<? super RxChannelKt$collect$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return RxChannelKt.collect((MaybeSource) null, (ss2) null, this);
    }
}
