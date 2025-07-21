package kotlinx.coroutines.selects;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {438, 441}, m = "doSelectSuspend")
/* loaded from: classes5.dex */
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectImplementation$doSelectSuspend$1(SelectImplementation<R> selectImplementation, by0<? super SelectImplementation$doSelectSuspend$1> by0Var) {
        super(by0Var);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object doSelectSuspend;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        doSelectSuspend = this.this$0.doSelectSuspend(this);
        return doSelectSuspend;
    }
}
