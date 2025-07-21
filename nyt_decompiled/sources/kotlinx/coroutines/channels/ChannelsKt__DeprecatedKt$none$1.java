package kotlinx.coroutines.channels;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {477}, m = "none")
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$none$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$none$1(by0<? super ChannelsKt__DeprecatedKt$none$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object none;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        none = ChannelsKt__DeprecatedKt.none(null, this);
        return none;
    }
}
