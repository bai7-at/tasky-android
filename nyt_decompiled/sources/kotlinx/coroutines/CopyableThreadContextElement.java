package kotlinx.coroutines;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r, gt2 gt2Var) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, gt2Var);
        }

        public static <S, E extends CoroutineContext.a> E get(CopyableThreadContextElement<S> copyableThreadContextElement, CoroutineContext.b bVar) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, bVar);
        }

        public static <S> CoroutineContext minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, CoroutineContext.b bVar) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, bVar);
        }

        public static <S> CoroutineContext plus(CopyableThreadContextElement<S> copyableThreadContextElement, CoroutineContext coroutineContext) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, coroutineContext);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, gt2 gt2Var);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    CoroutineContext mergeForChild(CoroutineContext.a aVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
}
