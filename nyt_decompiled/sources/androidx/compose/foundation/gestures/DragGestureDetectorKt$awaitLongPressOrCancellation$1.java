package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {ContentDeliveryAdvertisementCapability.LINEAR_6DAY}, m = "awaitLongPressOrCancellation-rnUCldI")
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return DragGestureDetectorKt.c(null, 0L, this);
    }
}
