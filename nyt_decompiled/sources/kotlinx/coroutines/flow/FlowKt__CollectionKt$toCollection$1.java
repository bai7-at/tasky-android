package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
/* loaded from: classes5.dex */
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FlowKt__CollectionKt$toCollection$1(by0<? super FlowKt__CollectionKt$toCollection$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return FlowKt.toCollection(null, null, this);
    }
}
