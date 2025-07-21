package kotlinx.coroutines.internal;

import defpackage.v1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public abstract class AtomicOp<T> extends OpDescriptor {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _consensus$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AtomicKt.NO_DECISION;

    private final Object decide(Object obj) {
        Object obj2 = _consensus$volatile$FU.get(this);
        Object obj3 = AtomicKt.NO_DECISION;
        return obj2 != obj3 ? obj2 : v1.a(_consensus$volatile$FU, this, obj3, obj) ? obj : _consensus$volatile$FU.get(this);
    }

    private final /* synthetic */ Object get_consensus$volatile() {
        return this._consensus$volatile;
    }

    private final /* synthetic */ void set_consensus$volatile(Object obj) {
        this._consensus$volatile = obj;
    }

    public abstract void complete(T t, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public AtomicOp<?> getAtomicOp() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final Object perform(Object obj) {
        Object obj2 = _consensus$volatile$FU.get(this);
        if (obj2 == AtomicKt.NO_DECISION) {
            obj2 = decide(prepare(obj));
        }
        complete(obj, obj2);
        return obj2;
    }

    public abstract Object prepare(T t);
}
