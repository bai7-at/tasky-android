package androidx.compose.foundation.gestures.snapping;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {AdvertisementType.ON_DEMAND_POST_ROLL}, m = "tryApproach")
/* loaded from: classes.dex */
final class SnapFlingBehavior$tryApproach$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, by0 by0Var) {
        super(by0Var);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        j = this.this$0.j(null, 0.0f, 0.0f, null, this);
        return j;
    }
}
