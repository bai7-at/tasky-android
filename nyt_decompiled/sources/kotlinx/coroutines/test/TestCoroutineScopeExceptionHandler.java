package kotlinx.coroutines.test;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
interface TestCoroutineScopeExceptionHandler extends CoroutineExceptionHandler {

    public static final class DefaultImpls {
        public static <R> R fold(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, R r, gt2 gt2Var) {
            return (R) CoroutineExceptionHandler.DefaultImpls.fold(testCoroutineScopeExceptionHandler, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, CoroutineContext.b bVar) {
            return (E) CoroutineExceptionHandler.DefaultImpls.get(testCoroutineScopeExceptionHandler, bVar);
        }

        public static CoroutineContext minusKey(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, CoroutineContext.b bVar) {
            return CoroutineExceptionHandler.DefaultImpls.minusKey(testCoroutineScopeExceptionHandler, bVar);
        }

        public static CoroutineContext plus(TestCoroutineScopeExceptionHandler testCoroutineScopeExceptionHandler, CoroutineContext coroutineContext) {
            return CoroutineExceptionHandler.DefaultImpls.plus(testCoroutineScopeExceptionHandler, coroutineContext);
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
