package kotlinx.coroutines;

import defpackage.ss2;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes5.dex */
public abstract class CompletionHandlerBase extends LockFreeLinkedListNode implements ss2 {
    public abstract /* synthetic */ Object invoke(Object obj);

    public abstract void invoke(Throwable th);
}
