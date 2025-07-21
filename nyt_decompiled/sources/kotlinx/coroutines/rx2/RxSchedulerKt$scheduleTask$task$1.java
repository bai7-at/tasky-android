package kotlinx.coroutines.rx2;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.rx2.RxSchedulerKt", f = "RxScheduler.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND}, m = "scheduleTask$task")
/* loaded from: classes5.dex */
final class RxSchedulerKt$scheduleTask$task$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RxSchedulerKt$scheduleTask$task$1(by0<? super RxSchedulerKt$scheduleTask$task$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object scheduleTask$task;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        scheduleTask$task = RxSchedulerKt.scheduleTask$task(null, null, null, this);
        return scheduleTask$task;
    }
}
