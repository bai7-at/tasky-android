package kotlinx.coroutines.rx2;

import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@fc1(c = "kotlinx.coroutines.rx2.RxConvertKt$asCompletable$1", f = "RxConvert.kt", l = {EventType.CDN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RxConvertKt$asCompletable$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Job $this_asCompletable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxConvertKt$asCompletable$1(Job job, by0<? super RxConvertKt$asCompletable$1> by0Var) {
        super(2, by0Var);
        this.$this_asCompletable = job;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new RxConvertKt$asCompletable$1(this.$this_asCompletable, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Job job = this.$this_asCompletable;
            this.label = 1;
            if (job.join(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((RxConvertKt$asCompletable$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
