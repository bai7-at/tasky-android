package androidx.datastore.core;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.WindowState;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {WindowState.MINIMIZED, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore singleProcessDataStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        y = this.this$0.y(null, null, this);
        return y;
    }
}
