package kotlinx.coroutines.internal;

import defpackage.gt2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* loaded from: classes5.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final gt2 countAll = new gt2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // defpackage.gt2
        public final Object invoke(Object obj, CoroutineContext.a aVar) {
            if (!(aVar instanceof ThreadContextElement)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    };
    private static final gt2 findOne = new gt2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // defpackage.gt2
        public final ThreadContextElement<?> invoke(ThreadContextElement<?> threadContextElement, CoroutineContext.a aVar) {
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (aVar instanceof ThreadContextElement) {
                return (ThreadContextElement) aVar;
            }
            return null;
        }
    };
    private static final gt2 updateState = new gt2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // defpackage.gt2
        public final ThreadState invoke(ThreadState threadState, CoroutineContext.a aVar) {
            if (aVar instanceof ThreadContextElement) {
                ThreadContextElement<?> threadContextElement = (ThreadContextElement) aVar;
                threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
            }
            return threadState;
        }
    };

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, findOne);
        zq3.f(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
    }

    public static final Object threadContextElements(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, countAll);
        zq3.e(fold);
        return fold;
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new ThreadState(coroutineContext, ((Number) obj).intValue()), updateState);
        }
        zq3.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }
}
