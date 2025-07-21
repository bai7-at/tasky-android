package androidx.compose.foundation.text.selection;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {225}, m = "awaitDown")
/* loaded from: classes.dex */
final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SelectionGesturesKt$awaitDown$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = SelectionGesturesKt.d(null, this);
        return d;
    }
}
