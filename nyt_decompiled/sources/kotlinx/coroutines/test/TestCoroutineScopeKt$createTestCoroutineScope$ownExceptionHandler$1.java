package kotlinx.coroutines.test;

import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 extends kotlin.coroutines.a implements TestCoroutineScopeExceptionHandler {
    final /* synthetic */ Ref$ObjectRef<TestCoroutineScopeImpl> $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1(Ref$ObjectRef<TestCoroutineScopeImpl> ref$ObjectRef, CoroutineExceptionHandler.Key key) {
        super(key);
        this.$scope = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        TestCoroutineScopeImpl testCoroutineScopeImpl = this.$scope.element;
        zq3.e(testCoroutineScopeImpl);
        if (!testCoroutineScopeImpl.reportException(th)) {
            throw th;
        }
    }
}
