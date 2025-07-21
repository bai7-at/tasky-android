package kotlinx.coroutines.test;

import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class TestScopeImpl$enter$exceptions$1$2 extends FunctionReferenceImpl implements ss2 {
    TestScopeImpl$enter$exceptions$1$2(Object obj) {
        super(1, obj, TestScopeImpl.class, "reportException", "reportException(Ljava/lang/Throwable;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    public final void invoke(Throwable th) {
        ((TestScopeImpl) this.receiver).reportException(th);
    }
}
