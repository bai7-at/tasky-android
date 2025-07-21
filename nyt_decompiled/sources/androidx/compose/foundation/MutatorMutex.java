package androidx.compose.foundation;

import defpackage.by0;
import defpackage.gt2;
import defpackage.kz4;
import defpackage.ss2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class MutatorMutex {
    private final AtomicReference a = new AtomicReference(null);
    private final Mutex b = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final MutatePriority a;
        private final Job b;

        public a(MutatePriority mutatePriority, Job job) {
            this.a = mutatePriority;
            this.b = job;
        }

        public final boolean a(a aVar) {
            return this.a.compareTo(aVar.a) >= 0;
        }

        public final void b() {
            this.b.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, ss2 ss2Var, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, ss2Var, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!kz4.a(this.a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(MutatePriority mutatePriority, ss2 ss2Var, by0 by0Var) {
        return CoroutineScopeKt.coroutineScope(new MutatorMutex$mutate$2(mutatePriority, this, ss2Var, null), by0Var);
    }

    public final Object f(Object obj, MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        return CoroutineScopeKt.coroutineScope(new MutatorMutex$mutateWith$2(mutatePriority, this, gt2Var, obj, null), by0Var);
    }
}
