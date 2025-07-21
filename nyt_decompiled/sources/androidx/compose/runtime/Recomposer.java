package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.runtime.snapshots.f;
import defpackage.by0;
import defpackage.du8;
import defpackage.fy0;
import defpackage.g62;
import defpackage.gs5;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.it2;
import defpackage.it6;
import defpackage.kw4;
import defpackage.lw4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.v72;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class Recomposer extends androidx.compose.runtime.c {
    private long a;
    private final BroadcastFrameClock b;
    private final Object c;
    private Job d;
    private Throwable e;
    private final List f;
    private List g;
    private IdentityArraySet h;
    private final List i;
    private final List j;
    private final List k;
    private final Map l;
    private final Map m;
    private List n;
    private Set o;
    private CancellableContinuation p;
    private int q;
    private boolean r;
    private b s;
    private boolean t;
    private final MutableStateFlow u;
    private final CompletableJob v;
    private final CoroutineContext w;
    private final c x;
    public static final a y = new a(null);
    public static final int z = 8;
    private static final MutableStateFlow A = StateFlowKt.MutableStateFlow(v72.c());
    private static final AtomicReference B = new AtomicReference(Boolean.FALSE);

    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            gs5 gs5Var;
            gs5 add;
            do {
                gs5Var = (gs5) Recomposer.A.getValue();
                add = gs5Var.add((Object) cVar);
                if (gs5Var == add) {
                    return;
                }
            } while (!Recomposer.A.compareAndSet(gs5Var, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            gs5 gs5Var;
            gs5 remove;
            do {
                gs5Var = (gs5) Recomposer.A.getValue();
                remove = gs5Var.remove((Object) cVar);
                if (gs5Var == remove) {
                    return;
                }
            } while (!Recomposer.A.compareAndSet(gs5Var, remove));
        }

        private a() {
        }
    }

    private static final class b {
        private final boolean a;
        private final Exception b;

        public b(boolean z, Exception exc) {
            this.a = z;
            this.b = exc;
        }

        public Exception a() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {
        public c() {
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new qs2() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m54invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m54invoke() {
                CancellableContinuation Y;
                MutableStateFlow mutableStateFlow;
                Throwable th;
                Object obj = Recomposer.this.c;
                Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    Y = recomposer.Y();
                    mutableStateFlow = recomposer.u;
                    if (((Recomposer.State) mutableStateFlow.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        th = recomposer.e;
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", th);
                    }
                }
                if (Y != null) {
                    Result.a aVar = Result.a;
                    Y.resumeWith(Result.b(ww8.a));
                }
            }
        });
        this.b = broadcastFrameClock;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new IdentityArraySet();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.u = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob Job = JobKt.Job((Job) coroutineContext.get(Job.Key));
        Job.invokeOnCompletion(new ss2() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(final Throwable th) {
                Job job;
                CancellableContinuation cancellableContinuation;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                boolean z2;
                CancellableContinuation cancellableContinuation2;
                CancellableContinuation cancellableContinuation3;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                Object obj = Recomposer.this.c;
                final Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    try {
                        job = recomposer.d;
                        cancellableContinuation = null;
                        if (job != null) {
                            mutableStateFlow2 = recomposer.u;
                            mutableStateFlow2.setValue(Recomposer.State.ShuttingDown);
                            z2 = recomposer.r;
                            if (z2) {
                                cancellableContinuation2 = recomposer.p;
                                if (cancellableContinuation2 != null) {
                                    cancellableContinuation3 = recomposer.p;
                                    recomposer.p = null;
                                    job.invokeOnCompletion(new ss2() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((Throwable) obj2);
                                            return ww8.a;
                                        }

                                        public final void invoke(Throwable th2) {
                                            MutableStateFlow mutableStateFlow3;
                                            Object obj2 = Recomposer.this.c;
                                            Recomposer recomposer2 = Recomposer.this;
                                            Throwable th3 = th;
                                            synchronized (obj2) {
                                                if (th3 == null) {
                                                    th3 = null;
                                                } else if (th2 != null) {
                                                    try {
                                                        if (th2 instanceof CancellationException) {
                                                            th2 = null;
                                                        }
                                                        if (th2 != null) {
                                                            g62.a(th3, th2);
                                                        }
                                                    } catch (Throwable th4) {
                                                        throw th4;
                                                    }
                                                }
                                                recomposer2.e = th3;
                                                mutableStateFlow3 = recomposer2.u;
                                                mutableStateFlow3.setValue(Recomposer.State.ShutDown);
                                                ww8 ww8Var = ww8.a;
                                            }
                                        }
                                    });
                                    cancellableContinuation = cancellableContinuation3;
                                }
                            } else {
                                job.cancel(CancellationException);
                            }
                            cancellableContinuation3 = null;
                            recomposer.p = null;
                            job.invokeOnCompletion(new ss2() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((Throwable) obj2);
                                    return ww8.a;
                                }

                                public final void invoke(Throwable th2) {
                                    MutableStateFlow mutableStateFlow3;
                                    Object obj2 = Recomposer.this.c;
                                    Recomposer recomposer2 = Recomposer.this;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    g62.a(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.e = th3;
                                        mutableStateFlow3 = recomposer2.u;
                                        mutableStateFlow3.setValue(Recomposer.State.ShutDown);
                                        ww8 ww8Var = ww8.a;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation3;
                        } else {
                            recomposer.e = CancellationException;
                            mutableStateFlow = recomposer.u;
                            mutableStateFlow.setValue(Recomposer.State.ShutDown);
                            ww8 ww8Var = ww8.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.a aVar = Result.a;
                    cancellableContinuation.resumeWith(Result.b(ww8.a));
                }
            }
        });
        this.v = Job;
        this.w = coroutineContext.plus(broadcastFrameClock).plus(Job);
        this.x = new c();
    }

    private final void T(fy0 fy0Var) {
        this.f.add(fy0Var);
        this.g = null;
    }

    private final void U(androidx.compose.runtime.snapshots.a aVar) {
        try {
            if (aVar.C() instanceof f.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            aVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V(by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (f0()) {
            return ww8.a;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (this.c) {
            if (f0()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.p = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.a aVar = Result.a;
            cancellableContinuationImpl.resumeWith(Result.b(ww8.a));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
    }

    private final void X() {
        this.f.clear();
        this.g = kotlin.collections.i.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation Y() {
        State state;
        if (((State) this.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
            X();
            this.h = new IdentityArraySet();
            this.i.clear();
            this.j.clear();
            this.k.clear();
            this.n = null;
            CancellableContinuation cancellableContinuation = this.p;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.p = null;
            this.s = null;
            return null;
        }
        if (this.s != null) {
            state = State.Inactive;
        } else if (this.d == null) {
            this.h = new IdentityArraySet();
            this.i.clear();
            state = d0() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (!this.i.isEmpty() || this.h.n() || !this.j.isEmpty() || !this.k.isEmpty() || this.q > 0 || d0()) ? State.PendingWork : State.Idle;
        }
        this.u.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.p;
        this.p = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        int i;
        List l;
        synchronized (this.c) {
            try {
                if (this.l.isEmpty()) {
                    l = kotlin.collections.i.l();
                } else {
                    List y2 = kotlin.collections.i.y(this.l.values());
                    this.l.clear();
                    l = new ArrayList(y2.size());
                    int size = y2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        lw4 lw4Var = (lw4) y2.get(i2);
                        l.add(du8.a(lw4Var, this.m.get(lw4Var)));
                    }
                    this.m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = l.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) l.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0() {
        boolean d0;
        synchronized (this.c) {
            d0 = d0();
        }
        return d0;
    }

    private final boolean d0() {
        return !this.t && this.b.i();
    }

    private final boolean e0() {
        return !this.i.isEmpty() || d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f0() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.n() && this.i.isEmpty()) {
                z2 = d0();
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List g0() {
        List list = this.g;
        if (list == null) {
            List list2 = this.f;
            list = list2.isEmpty() ? kotlin.collections.i.l() : new ArrayList(list2);
            this.g = list;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.r;
        }
        if (z2) {
            Iterator it2 = this.v.getChildren().iterator();
            while (it2.hasNext()) {
                if (((Job) it2.next()).isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    private final void k0(fy0 fy0Var) {
        synchronized (this.c) {
            List list = this.k;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (zq3.c(((lw4) list.get(i)).b(), fy0Var)) {
                    ww8 ww8Var = ww8.a;
                    ArrayList arrayList = new ArrayList();
                    l0(arrayList, this, fy0Var);
                    while (!arrayList.isEmpty()) {
                        m0(arrayList, null);
                        l0(arrayList, this, fy0Var);
                    }
                    return;
                }
            }
        }
    }

    private static final void l0(List list, Recomposer recomposer, fy0 fy0Var) {
        list.clear();
        synchronized (recomposer.c) {
            try {
                Iterator it2 = recomposer.k.iterator();
                while (it2.hasNext()) {
                    lw4 lw4Var = (lw4) it2.next();
                    if (zq3.c(lw4Var.b(), fy0Var)) {
                        list.add(lw4Var);
                        it2.remove();
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List m0(List list, IdentityArraySet identityArraySet) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            fy0 b2 = ((lw4) obj).b();
            Object obj2 = hashMap.get(b2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(b2, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            fy0 fy0Var = (fy0) entry.getKey();
            List list2 = (List) entry.getValue();
            androidx.compose.runtime.b.Q(!fy0Var.n());
            androidx.compose.runtime.snapshots.a l = androidx.compose.runtime.snapshots.e.e.l(q0(fy0Var), x0(fy0Var, identityArraySet));
            try {
                androidx.compose.runtime.snapshots.e l2 = l.l();
                try {
                    synchronized (this.c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            lw4 lw4Var = (lw4) list2.get(i2);
                            Map map = this.l;
                            lw4Var.c();
                            arrayList.add(du8.a(lw4Var, it6.a(map, null)));
                        }
                    }
                    fy0Var.e(arrayList);
                    ww8 ww8Var = ww8.a;
                } finally {
                    l.s(l2);
                }
            } finally {
                U(l);
            }
        }
        return kotlin.collections.i.X0(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fy0 n0(final fy0 fy0Var, final IdentityArraySet identityArraySet) {
        Set set;
        if (fy0Var.n() || fy0Var.isDisposed() || ((set = this.o) != null && set.contains(fy0Var))) {
            return null;
        }
        androidx.compose.runtime.snapshots.a l = androidx.compose.runtime.snapshots.e.e.l(q0(fy0Var), x0(fy0Var, identityArraySet));
        try {
            androidx.compose.runtime.snapshots.e l2 = l.l();
            if (identityArraySet != null) {
                try {
                    if (identityArraySet.n()) {
                        fy0Var.p(new qs2() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m55invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m55invoke() {
                                IdentityArraySet identityArraySet2 = IdentityArraySet.this;
                                fy0 fy0Var2 = fy0Var;
                                Object[] j = identityArraySet2.j();
                                int size = identityArraySet2.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj = j[i];
                                    zq3.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    fy0Var2.o(obj);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    l.s(l2);
                    throw th;
                }
            }
            boolean i = fy0Var.i();
            l.s(l2);
            if (i) {
                return fy0Var;
            }
            return null;
        } finally {
            U(l);
        }
    }

    private final void o0(Exception exc, fy0 fy0Var, boolean z2) {
        if (!((Boolean) B.get()).booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                b bVar = this.s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.s = new b(false, exc);
                ww8 ww8Var = ww8.a;
            }
            throw exc;
        }
        synchronized (this.c) {
            try {
                ActualAndroid_androidKt.f("Error was captured in composition while live edit was enabled.", exc);
                this.j.clear();
                this.i.clear();
                this.h = new IdentityArraySet();
                this.k.clear();
                this.l.clear();
                this.m.clear();
                this.s = new b(z2, exc);
                if (fy0Var != null) {
                    List list = this.n;
                    if (list == null) {
                        list = new ArrayList();
                        this.n = list;
                    }
                    if (!list.contains(fy0Var)) {
                        list.add(fy0Var);
                    }
                    u0(fy0Var);
                }
                Y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void p0(Recomposer recomposer, Exception exc, fy0 fy0Var, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            fy0Var = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        recomposer.o0(exc, fy0Var, z2);
    }

    private final ss2 q0(final fy0 fy0Var) {
        return new ss2() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m56invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m56invoke(Object obj) {
                fy0.this.a(obj);
            }
        };
    }

    private final Object r0(it2 it2Var, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.b, new Recomposer$recompositionRunner$2(this, it2Var, m.a(by0Var.getContext()), null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s0() {
        List g0;
        boolean e0;
        synchronized (this.c) {
            if (this.h.isEmpty()) {
                return e0();
            }
            IdentityArraySet identityArraySet = this.h;
            this.h = new IdentityArraySet();
            synchronized (this.c) {
                g0 = g0();
            }
            try {
                int size = g0.size();
                for (int i = 0; i < size; i++) {
                    ((fy0) g0.get(i)).l(identityArraySet);
                    if (((State) this.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.h = new IdentityArraySet();
                synchronized (this.c) {
                    if (Y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    e0 = e0();
                }
                return e0;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.h.a(identityArraySet);
                    ww8 ww8Var = ww8.a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(Job job) {
        synchronized (this.c) {
            Throwable th = this.e;
            if (th != null) {
                throw th;
            }
            if (((State) this.u.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.d = job;
            Y();
        }
    }

    private final void u0(fy0 fy0Var) {
        this.f.remove(fy0Var);
        this.g = null;
    }

    private final ss2 x0(final fy0 fy0Var, final IdentityArraySet identityArraySet) {
        return new ss2() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m57invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m57invoke(Object obj) {
                fy0.this.o(obj);
                IdentityArraySet identityArraySet2 = identityArraySet;
                if (identityArraySet2 != null) {
                    identityArraySet2.add(obj);
                }
            }
        };
    }

    public final void W() {
        synchronized (this.c) {
            try {
                if (((State) this.u.getValue()).compareTo(State.Idle) >= 0) {
                    this.u.setValue(State.ShuttingDown);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.v, (CancellationException) null, 1, (Object) null);
    }

    @Override // androidx.compose.runtime.c
    public void a(fy0 fy0Var, gt2 gt2Var) {
        boolean n = fy0Var.n();
        try {
            e.a aVar = androidx.compose.runtime.snapshots.e.e;
            androidx.compose.runtime.snapshots.a l = aVar.l(q0(fy0Var), x0(fy0Var, null));
            try {
                androidx.compose.runtime.snapshots.e l2 = l.l();
                try {
                    fy0Var.j(gt2Var);
                    ww8 ww8Var = ww8.a;
                    if (!n) {
                        aVar.e();
                    }
                    synchronized (this.c) {
                        if (((State) this.u.getValue()).compareTo(State.ShuttingDown) > 0 && !g0().contains(fy0Var)) {
                            T(fy0Var);
                        }
                    }
                    try {
                        k0(fy0Var);
                        try {
                            fy0Var.m();
                            fy0Var.c();
                            if (n) {
                                return;
                            }
                            aVar.e();
                        } catch (Exception e) {
                            p0(this, e, null, false, 6, null);
                        }
                    } catch (Exception e2) {
                        o0(e2, fy0Var, true);
                    }
                } finally {
                    l.s(l2);
                }
            } finally {
                U(l);
            }
        } catch (Exception e3) {
            o0(e3, fy0Var, true);
        }
    }

    public final long a0() {
        return this.a;
    }

    public final StateFlow b0() {
        return this.u;
    }

    @Override // androidx.compose.runtime.c
    public boolean c() {
        return false;
    }

    @Override // androidx.compose.runtime.c
    public boolean d() {
        return false;
    }

    @Override // androidx.compose.runtime.c
    public int f() {
        return NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    }

    @Override // androidx.compose.runtime.c
    public CoroutineContext g() {
        return this.w;
    }

    @Override // androidx.compose.runtime.c
    public void i(lw4 lw4Var) {
        CancellableContinuation Y;
        synchronized (this.c) {
            this.k.add(lw4Var);
            Y = Y();
        }
        if (Y != null) {
            Result.a aVar = Result.a;
            Y.resumeWith(Result.b(ww8.a));
        }
    }

    public final Object i0(by0 by0Var) {
        Object first = FlowKt.first(b0(), new Recomposer$join$2(null), by0Var);
        return first == kotlin.coroutines.intrinsics.a.h() ? first : ww8.a;
    }

    @Override // androidx.compose.runtime.c
    public void j(fy0 fy0Var) {
        CancellableContinuation cancellableContinuation;
        synchronized (this.c) {
            if (this.i.contains(fy0Var)) {
                cancellableContinuation = null;
            } else {
                this.i.add(fy0Var);
                cancellableContinuation = Y();
            }
        }
        if (cancellableContinuation != null) {
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(ww8.a));
        }
    }

    public final void j0() {
        synchronized (this.c) {
            this.t = true;
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // androidx.compose.runtime.c
    public kw4 k(lw4 lw4Var) {
        kw4 kw4Var;
        synchronized (this.c) {
            kw4Var = (kw4) this.m.remove(lw4Var);
        }
        return kw4Var;
    }

    @Override // androidx.compose.runtime.c
    public void l(Set set) {
    }

    @Override // androidx.compose.runtime.c
    public void n(fy0 fy0Var) {
        synchronized (this.c) {
            try {
                Set set = this.o;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.o = set;
                }
                set.add(fy0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.c
    public void q(fy0 fy0Var) {
        synchronized (this.c) {
            u0(fy0Var);
            this.i.remove(fy0Var);
            this.j.remove(fy0Var);
            ww8 ww8Var = ww8.a;
        }
    }

    public final void v0() {
        CancellableContinuation cancellableContinuation;
        synchronized (this.c) {
            if (this.t) {
                this.t = false;
                cancellableContinuation = Y();
            } else {
                cancellableContinuation = null;
            }
        }
        if (cancellableContinuation != null) {
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(ww8.a));
        }
    }

    public final Object w0(by0 by0Var) {
        Object r0 = r0(new Recomposer$runRecomposeAndApplyChanges$2(this, null), by0Var);
        return r0 == kotlin.coroutines.intrinsics.a.h() ? r0 : ww8.a;
    }
}
