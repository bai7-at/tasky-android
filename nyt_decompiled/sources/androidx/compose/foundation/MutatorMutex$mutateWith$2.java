package androidx.compose.foundation;

import androidx.compose.foundation.MutatorMutex;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kz4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {220, 173}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, gt2 gt2Var, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = gt2Var;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, by0Var);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex.a aVar;
        Mutex mutex;
        gt2 gt2Var;
        MutatorMutex mutatorMutex;
        Object obj2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        MutatorMutex.a aVar2;
        Mutex mutex2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.f.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    CoroutineContext.a aVar3 = coroutineScope.getCoroutineContext().get(Job.Key);
                    zq3.e(aVar3);
                    aVar = new MutatorMutex.a(mutatePriority, (Job) aVar3);
                    this.this$0.g(aVar);
                    mutex = this.this$0.b;
                    gt2Var = this.$block;
                    Object obj3 = this.$receiver;
                    mutatorMutex = this.this$0;
                    this.L$0 = aVar;
                    this.L$1 = mutex;
                    this.L$2 = gt2Var;
                    this.L$3 = obj3;
                    this.L$4 = mutatorMutex;
                    this.label = 1;
                    if (mutex.lock(null, this) == h) {
                        return h;
                    }
                    obj2 = obj3;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        mutex2 = (Mutex) this.L$1;
                        aVar2 = (MutatorMutex.a) this.L$0;
                        try {
                            kotlin.f.b(obj);
                            atomicReference2 = mutatorMutex2.a;
                            kz4.a(atomicReference2, aVar2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.a;
                            kz4.a(atomicReference, aVar2, null);
                            throw th;
                        }
                    }
                    MutatorMutex mutatorMutex3 = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    gt2Var = (gt2) this.L$2;
                    Mutex mutex3 = (Mutex) this.L$1;
                    MutatorMutex.a aVar4 = (MutatorMutex.a) this.L$0;
                    kotlin.f.b(obj);
                    mutex = mutex3;
                    mutatorMutex = mutatorMutex3;
                    aVar = aVar4;
                }
                this.L$0 = aVar;
                this.L$1 = mutex;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = gt2Var.invoke(obj2, this);
                if (invoke == h) {
                    return h;
                }
                mutatorMutex2 = mutatorMutex;
                Mutex mutex4 = mutex;
                obj = invoke;
                aVar2 = aVar;
                mutex2 = mutex4;
                atomicReference2 = mutatorMutex2.a;
                kz4.a(atomicReference2, aVar2, null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th3) {
                mutatorMutex2 = mutatorMutex;
                th = th3;
                aVar2 = aVar;
                atomicReference = mutatorMutex2.a;
                kz4.a(atomicReference, aVar2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MutatorMutex$mutateWith$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
