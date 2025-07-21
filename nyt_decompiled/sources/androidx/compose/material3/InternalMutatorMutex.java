package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import defpackage.by0;
import defpackage.kz4;
import defpackage.qs2;
import defpackage.ss2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class InternalMutatorMutex {
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
            Job.DefaultImpls.cancel$default(this.b, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a aVar) {
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
        return CoroutineScopeKt.coroutineScope(new InternalMutatorMutex$mutate$2(mutatePriority, this, ss2Var, null), by0Var);
    }

    public final boolean e(qs2 qs2Var) {
        boolean tryLock$default = Mutex.DefaultImpls.tryLock$default(this.b, null, 1, null);
        if (tryLock$default) {
            try {
                qs2Var.mo865invoke();
            } finally {
                Mutex.DefaultImpls.unlock$default(this.b, null, 1, null);
            }
        }
        return tryLock$default;
    }
}
