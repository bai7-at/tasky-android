package kotlinx.coroutines.test;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractCoroutine;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt", f = "TestBuilders.kt", l = {614, 518, 518}, m = "runTestCoroutineLegacy-SYHnMyU")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1<T extends AbstractCoroutine<? super ww8>> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1(by0<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1> by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TestBuildersKt.m960runTestCoroutineLegacySYHnMyU(null, null, 0L, null, null, null, this);
    }
}
