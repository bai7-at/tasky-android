package kotlinx.coroutines;

import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.p01;
import defpackage.qs2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes5.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean hasCopyableElements = hasCopyableElements(coroutineContext);
        boolean hasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!hasCopyableElements && !hasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new gt2() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // defpackage.gt2
            public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                if (!(aVar instanceof CopyableThreadContextElement)) {
                    return coroutineContext4.plus(aVar);
                }
                CoroutineContext.a aVar2 = ref$ObjectRef.element.get(aVar.getKey());
                if (aVar2 == null) {
                    return coroutineContext4.plus(z ? ((CopyableThreadContextElement) aVar).copyForChild() : (CopyableThreadContextElement) aVar);
                }
                Ref$ObjectRef<CoroutineContext> ref$ObjectRef2 = ref$ObjectRef;
                ref$ObjectRef2.element = ref$ObjectRef2.element.minusKey(aVar.getKey());
                return coroutineContext4.plus(((CopyableThreadContextElement) aVar).mergeForChild(aVar2));
            }
        });
        if (hasCopyableElements2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new gt2() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // defpackage.gt2
                public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                    return aVar instanceof CopyableThreadContextElement ? coroutineContext4.plus(((CopyableThreadContextElement) aVar).copyForChild()) : coroutineContext4.plus(aVar);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean hasCopyableElements(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new gt2() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            public final Boolean invoke(boolean z, CoroutineContext.a aVar) {
                return Boolean.valueOf(z || (aVar instanceof CopyableThreadContextElement));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (CoroutineContext.a) obj2);
            }
        })).booleanValue();
    }

    @ExperimentalCoroutinesApi
    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext foldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        return (foldCopies == Dispatchers.getDefault() || foldCopies.get(c.P) != null) ? foldCopies : foldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(p01 p01Var) {
        while (!(p01Var instanceof DispatchedCoroutine) && (p01Var = p01Var.getCallerFrame()) != null) {
            if (p01Var instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) p01Var;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(by0<?> by0Var, CoroutineContext coroutineContext, Object obj) {
        if (!(by0Var instanceof p01) || coroutineContext.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCompletion = undispatchedCompletion((p01) by0Var);
        if (undispatchedCompletion != null) {
            undispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCompletion;
    }

    public static final <T> T withContinuationContext(by0<?> by0Var, Object obj, qs2 qs2Var) {
        CoroutineContext context = by0Var.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(by0Var, context, updateThreadContext) : null;
        try {
            return (T) qs2Var.mo865invoke();
        } finally {
            bk3.b(1);
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
            bk3.a(1);
        }
    }

    public static final <T> T withCoroutineContext(CoroutineContext coroutineContext, Object obj, qs2 qs2Var) {
        Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return (T) qs2Var.mo865invoke();
        } finally {
            bk3.b(1);
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            bk3.a(1);
        }
    }

    @InternalCoroutinesApi
    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }
}
