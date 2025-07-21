package kotlinx.coroutines.channels;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {517}, m = "lastIndexOf")
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$lastIndexOf$1(by0<? super ChannelsKt__DeprecatedKt$lastIndexOf$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lastIndexOf;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        lastIndexOf = ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        return lastIndexOf;
    }
}
