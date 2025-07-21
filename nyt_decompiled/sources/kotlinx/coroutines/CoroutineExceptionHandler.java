package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.a {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r, gt2 gt2Var) {
            return (R) CoroutineContext.a.C0497a.a(coroutineExceptionHandler, r, gt2Var);
        }

        public static <E extends CoroutineContext.a> E get(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.b bVar) {
            return (E) CoroutineContext.a.C0497a.b(coroutineExceptionHandler, bVar);
        }

        public static CoroutineContext minusKey(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.c(coroutineExceptionHandler, bVar);
        }

        public static CoroutineContext plus(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0497a.d(coroutineExceptionHandler, coroutineContext);
        }
    }

    public static final class Key implements CoroutineContext.b {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    void handleException(CoroutineContext coroutineContext, Throwable th);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
