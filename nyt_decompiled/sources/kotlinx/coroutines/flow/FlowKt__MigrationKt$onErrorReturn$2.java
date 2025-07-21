package kotlinx.coroutines.flow;

import com.comscore.streaming.ContentFeedType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", l = {ContentFeedType.WEST_HD}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements it2 {
    final /* synthetic */ T $fallback;
    final /* synthetic */ ss2 $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$onErrorReturn$2(ss2 ss2Var, T t, by0<? super FlowKt__MigrationKt$onErrorReturn$2> by0Var) {
        super(3, by0Var);
        this.$predicate = ss2Var;
        this.$fallback = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (!((Boolean) this.$predicate.invoke(th)).booleanValue()) {
                throw th;
            }
            T t = this.$fallback;
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(t, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, by0<? super ww8> by0Var) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, by0Var);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = flowCollector;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(ww8.a);
    }
}
