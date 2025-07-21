package kotlinx.coroutines.test;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.test.TestCoroutineDispatcher", f = "TestCoroutineDispatcher.kt", l = {68}, m = "pauseDispatcher")
/* loaded from: classes5.dex */
final class TestCoroutineDispatcher$pauseDispatcher$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TestCoroutineDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestCoroutineDispatcher$pauseDispatcher$1(TestCoroutineDispatcher testCoroutineDispatcher, by0<? super TestCoroutineDispatcher$pauseDispatcher$1> by0Var) {
        super(by0Var);
        this.this$0 = testCoroutineDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.pauseDispatcher(null, this);
    }
}
