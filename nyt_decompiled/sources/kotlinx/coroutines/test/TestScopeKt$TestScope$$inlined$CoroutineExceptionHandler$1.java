package kotlinx.coroutines.test;

import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class TestScopeKt$TestScope$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements CoroutineExceptionHandler {
    final /* synthetic */ Ref$ObjectRef $scope$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestScopeKt$TestScope$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, Ref$ObjectRef ref$ObjectRef) {
        super(key);
        this.$scope$inlined = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        T t = this.$scope$inlined.element;
        zq3.e(t);
        ((TestScopeImpl) t).reportException(th);
    }
}
