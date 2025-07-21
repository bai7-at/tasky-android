package kotlinx.coroutines.internal;

import defpackage.qs2;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes5.dex */
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends LockFreeLinkedListNode.CondAddOp {
    final /* synthetic */ qs2 $condition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$makeCondAddOp$1(LockFreeLinkedListNode lockFreeLinkedListNode, qs2 qs2Var) {
        super(lockFreeLinkedListNode);
        this.$condition = qs2Var;
    }

    @Override // kotlinx.coroutines.internal.AtomicOp
    public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (((Boolean) this.$condition.mo865invoke()).booleanValue()) {
            return null;
        }
        return LockFreeLinkedListKt.getCONDITION_FALSE();
    }
}
