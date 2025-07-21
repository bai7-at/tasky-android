package rx.internal.schedulers;

import defpackage.gb8;
import defpackage.jb8;
import defpackage.v3;
import defpackage.vs0;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, gb8 {
    private static final long serialVersionUID = -3962399486978279857L;
    final v3 action;
    final jb8 cancel;

    private static final class Remover extends AtomicBoolean implements gb8 {
        private static final long serialVersionUID = 247232374289553518L;
        final vs0 parent;
        final ScheduledAction s;

        public Remover(ScheduledAction scheduledAction, vs0 vs0Var) {
            this.s = scheduledAction;
            this.parent = vs0Var;
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.s.isUnsubscribed();
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.b(this.s);
            }
        }
    }

    private static final class Remover2 extends AtomicBoolean implements gb8 {
        private static final long serialVersionUID = 247232374289553518L;
        final jb8 parent;
        final ScheduledAction s;

        public Remover2(ScheduledAction scheduledAction, jb8 jb8Var) {
            this.s = scheduledAction;
            this.parent = jb8Var;
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.s.isUnsubscribed();
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.parent.b(this.s);
            }
        }
    }

    private final class a implements gb8 {
        private final Future a;

        a(Future future) {
            this.a = future;
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.a.isCancelled();
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.a.cancel(true);
            } else {
                this.a.cancel(false);
            }
        }
    }

    public ScheduledAction(v3 v3Var) {
        this.action = v3Var;
        this.cancel = new jb8();
    }

    public void a(Future future) {
        this.cancel.a(new a(future));
    }

    public void b(vs0 vs0Var) {
        this.cancel.a(new Remover(this, vs0Var));
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.action.call();
        } finally {
            try {
                unsubscribe();
            } catch (Throwable th) {
            }
        }
        unsubscribe();
    }

    @Override // defpackage.gb8
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public ScheduledAction(v3 v3Var, vs0 vs0Var) {
        this.action = v3Var;
        this.cancel = new jb8(new Remover(this, vs0Var));
    }

    public ScheduledAction(v3 v3Var, jb8 jb8Var) {
        this.action = v3Var;
        this.cancel = new jb8(new Remover2(this, jb8Var));
    }
}
