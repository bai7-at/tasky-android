package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentDeliveryComposition;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {ContentDeliveryComposition.CLEAN}, m = "awaitScrollEvent")
/* loaded from: classes.dex */
final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ScrollableKt$awaitScrollEvent$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        f = ScrollableKt.f(null, this);
        return f;
    }
}
