package kotlinx.coroutines.channels;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {80, 84, 90, 92}, m = "fixedPeriodTicker")
/* loaded from: classes5.dex */
final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TickerChannelsKt$fixedPeriodTicker$1(by0<? super TickerChannelsKt$fixedPeriodTicker$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fixedPeriodTicker;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        fixedPeriodTicker = TickerChannelsKt.fixedPeriodTicker(0L, 0L, null, this);
        return fixedPeriodTicker;
    }
}
