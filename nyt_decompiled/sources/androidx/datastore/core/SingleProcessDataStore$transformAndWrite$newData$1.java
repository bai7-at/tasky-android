package androidx.datastore.core;

import com.comscore.streaming.WindowState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {WindowState.MINIMIZED}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $curData;
    final /* synthetic */ gt2 $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$transformAndWrite$newData$1(gt2 gt2Var, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.$transform = gt2Var;
        this.$curData = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gt2 gt2Var = this.$transform;
            Object obj2 = this.$curData;
            this.label = 1;
            obj = gt2Var.invoke(obj2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
