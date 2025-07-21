package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kz4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, 99}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, by0Var);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InternalMutatorMutex.a aVar;
        Mutex mutex;
        InternalMutatorMutex internalMutatorMutex;
        ss2 ss2Var;
        InternalMutatorMutex internalMutatorMutex2;
        Throwable th;
        InternalMutatorMutex.a aVar2;
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
                    aVar = new InternalMutatorMutex.a(mutatePriority, (Job) aVar3);
                    this.this$0.f(aVar);
                    mutex = this.this$0.b;
                    ss2 ss2Var2 = this.$block;
                    internalMutatorMutex = this.this$0;
                    this.L$0 = aVar;
                    this.L$1 = mutex;
                    this.L$2 = ss2Var2;
                    this.L$3 = internalMutatorMutex;
                    this.label = 1;
                    if (mutex.lock(null, this) == h) {
                        return h;
                    }
                    ss2Var = ss2Var2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                        mutex2 = (Mutex) this.L$1;
                        aVar2 = (InternalMutatorMutex.a) this.L$0;
                        try {
                            kotlin.f.b(obj);
                            atomicReference2 = internalMutatorMutex2.a;
                            kz4.a(atomicReference2, aVar2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = internalMutatorMutex2.a;
                            kz4.a(atomicReference, aVar2, null);
                            throw th;
                        }
                    }
                    InternalMutatorMutex internalMutatorMutex3 = (InternalMutatorMutex) this.L$3;
                    ss2Var = (ss2) this.L$2;
                    Mutex mutex3 = (Mutex) this.L$1;
                    InternalMutatorMutex.a aVar4 = (InternalMutatorMutex.a) this.L$0;
                    kotlin.f.b(obj);
                    mutex = mutex3;
                    internalMutatorMutex = internalMutatorMutex3;
                    aVar = aVar4;
                }
                this.L$0 = aVar;
                this.L$1 = mutex;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = ss2Var.invoke(this);
                if (invoke == h) {
                    return h;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                Mutex mutex4 = mutex;
                obj = invoke;
                aVar2 = aVar;
                mutex2 = mutex4;
                atomicReference2 = internalMutatorMutex2.a;
                kz4.a(atomicReference2, aVar2, null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th3) {
                internalMutatorMutex2 = internalMutatorMutex;
                th = th3;
                aVar2 = aVar;
                atomicReference = internalMutatorMutex2.a;
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
        return ((InternalMutatorMutex$mutate$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
