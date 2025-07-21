package androidx.compose.ui;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import defpackage.gt2;
import defpackage.ql1;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.ss2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public interface Modifier {
    public static final a a = a.b;

    public static final class a implements Modifier {
        static final /* synthetic */ a b = new a();

        private a() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean a(ss2 ss2Var) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public Object b(Object obj, gt2 gt2Var) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier h(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends Modifier {
        @Override // androidx.compose.ui.Modifier
        default boolean a(ss2 ss2Var) {
            return ((Boolean) ss2Var.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object b(Object obj, gt2 gt2Var) {
            return gt2Var.invoke(obj, this);
        }
    }

    public static abstract class c implements ql1 {
        private CoroutineScope b;
        private int c;
        private c e;
        private c f;
        private ObserverNodeOwnerScope g;
        private NodeCoordinator h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private c a = this;
        private int d = -1;

        public final int B1() {
            return this.d;
        }

        public final c C1() {
            return this.f;
        }

        public final NodeCoordinator D1() {
            return this.h;
        }

        public final CoroutineScope E1() {
            CoroutineScope coroutineScope = this.b;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(rl1.l(this).getCoroutineContext().plus(JobKt.Job((Job) rl1.l(this).getCoroutineContext().get(Job.Key))));
            this.b = CoroutineScope;
            return CoroutineScope;
        }

        public final boolean F1() {
            return this.i;
        }

        public final int G1() {
            return this.c;
        }

        public final ObserverNodeOwnerScope H1() {
            return this.g;
        }

        public final c I1() {
            return this.e;
        }

        public boolean J1() {
            return true;
        }

        public final boolean K1() {
            return this.j;
        }

        public final boolean L1() {
            return this.m;
        }

        public void M1() {
            if (this.m) {
                throw new IllegalStateException("node attached multiple times");
            }
            if (this.h == null) {
                throw new IllegalStateException("attach invoked on a node without a coordinator");
            }
            this.m = true;
            this.k = true;
        }

        public void N1() {
            if (!this.m) {
                throw new IllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.k) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.l) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.m = false;
            CoroutineScope coroutineScope = this.b;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.b = null;
            }
        }

        public void O1() {
        }

        public void P1() {
        }

        public void Q1() {
        }

        public void R1() {
            if (!this.m) {
                throw new IllegalStateException("reset() called on an unattached node");
            }
            Q1();
        }

        public void S1() {
            if (!this.m) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.k) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.k = false;
            O1();
            this.l = true;
        }

        public void T1() {
            if (!this.m) {
                throw new IllegalStateException("node detached multiple times");
            }
            if (this.h == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.l) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.l = false;
            P1();
        }

        public final void U1(int i) {
            this.d = i;
        }

        public final void V1(c cVar) {
            this.a = cVar;
        }

        public final void W1(c cVar) {
            this.f = cVar;
        }

        public final void X1(boolean z) {
            this.i = z;
        }

        public final void Y1(int i) {
            this.c = i;
        }

        public final void Z1(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.g = observerNodeOwnerScope;
        }

        public final void a2(c cVar) {
            this.e = cVar;
        }

        public final void b2(boolean z) {
            this.j = z;
        }

        @Override // defpackage.ql1
        public final c c0() {
            return this.a;
        }

        public final void c2(qs2 qs2Var) {
            rl1.l(this).r(qs2Var);
        }

        public void d2(NodeCoordinator nodeCoordinator) {
            this.h = nodeCoordinator;
        }
    }

    boolean a(ss2 ss2Var);

    Object b(Object obj, gt2 gt2Var);

    default Modifier h(Modifier modifier) {
        return modifier == a ? this : new CombinedModifier(this, modifier);
    }
}
