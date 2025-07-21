package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.gh6;
import defpackage.k99;
import defpackage.mh0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {
    public static final a f = new a(null);
    private final ViewGroup a;
    private final List b;
    private final List c;
    private boolean d;
    private boolean e;

    public static class Operation {
        private State a;
        private LifecycleImpact b;
        private final Fragment c;
        private final List d;
        private final Set e;
        private boolean f;
        private boolean g;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a(null);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final State a(View view) {
                    zq3.h(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : b(view.getVisibility());
                }

                public final State b(int i) {
                    if (i == 0) {
                        return State.VISIBLE;
                    }
                    if (i == 4) {
                        return State.INVISIBLE;
                    }
                    if (i == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }

                private a() {
                }
            }

            public /* synthetic */ class b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final State from(int i) {
                return Companion.b(i);
            }

            public final void applyState(View view) {
                zq3.h(view, "view");
                int i = b.a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, mh0 mh0Var) {
            zq3.h(state, "finalState");
            zq3.h(lifecycleImpact, "lifecycleImpact");
            zq3.h(fragment, "fragment");
            zq3.h(mh0Var, "cancellationSignal");
            this.a = state;
            this.b = lifecycleImpact;
            this.c = fragment;
            this.d = new ArrayList();
            this.e = new LinkedHashSet();
            mh0Var.b(new mh0.a() { // from class: sy7
                @Override // mh0.a
                public final void b() {
                    SpecialEffectsController.Operation.b(SpecialEffectsController.Operation.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Operation operation) {
            zq3.h(operation, "this$0");
            operation.d();
        }

        public final void c(Runnable runnable) {
            zq3.h(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.d.add(runnable);
        }

        public final void d() {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                e();
                return;
            }
            Iterator it2 = kotlin.collections.i.b1(this.e).iterator();
            while (it2.hasNext()) {
                ((mh0) it2.next()).a();
            }
        }

        public void e() {
            if (this.g) {
                return;
            }
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }

        public final void f(mh0 mh0Var) {
            zq3.h(mh0Var, "signal");
            if (this.e.remove(mh0Var) && this.e.isEmpty()) {
                e();
            }
        }

        public final State g() {
            return this.a;
        }

        public final Fragment h() {
            return this.c;
        }

        public final LifecycleImpact i() {
            return this.b;
        }

        public final boolean j() {
            return this.f;
        }

        public final boolean k() {
            return this.g;
        }

        public final void l(mh0 mh0Var) {
            zq3.h(mh0Var, "signal");
            n();
            this.e.add(mh0Var);
        }

        public final void m(State state, LifecycleImpact lifecycleImpact) {
            zq3.h(state, "finalState");
            zq3.h(lifecycleImpact, "lifecycleImpact");
            int i = a.a[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.a == State.REMOVED) {
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = State.VISIBLE;
                    this.b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = State.REMOVED;
                this.b = LifecycleImpact.REMOVING;
                return;
            }
            if (i == 3 && this.a != State.REMOVED) {
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + state + '.');
                }
                this.a = state;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpecialEffectsController a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            zq3.h(viewGroup, "container");
            zq3.h(fragmentManager, "fragmentManager");
            z D0 = fragmentManager.D0();
            zq3.g(D0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, D0);
        }

        public final SpecialEffectsController b(ViewGroup viewGroup, z zVar) {
            zq3.h(viewGroup, "container");
            zq3.h(zVar, "factory");
            Object tag = viewGroup.getTag(gh6.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController a = zVar.a(viewGroup);
            zq3.g(a, "factory.createController(container)");
            viewGroup.setTag(gh6.special_effects_controller_view_tag, a);
            return a;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends Operation {
        private final o h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.o r5, defpackage.mh0 r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                defpackage.zq3.h(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                defpackage.zq3.h(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                defpackage.zq3.h(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                defpackage.zq3.h(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                defpackage.zq3.g(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.b.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.o, mh0):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void e() {
            super.e();
            this.h.m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void n() {
            if (i() != Operation.LifecycleImpact.ADDING) {
                if (i() == Operation.LifecycleImpact.REMOVING) {
                    Fragment k = this.h.k();
                    zq3.g(k, "fragmentStateManager.fragment");
                    View requireView = k.requireView();
                    zq3.g(requireView, "fragment.requireView()");
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k2 = this.h.k();
            zq3.g(k2, "fragmentStateManager.fragment");
            View findFocus = k2.mView.findFocus();
            if (findFocus != null) {
                k2.setFocusedView(findFocus);
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                }
            }
            View requireView2 = h().requireView();
            zq3.g(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k2.getPostOnViewCreatedAlpha());
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        zq3.h(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    private final void c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, o oVar) {
        synchronized (this.b) {
            mh0 mh0Var = new mh0();
            Fragment k = oVar.k();
            zq3.g(k, "fragmentStateManager.fragment");
            Operation l = l(k);
            if (l != null) {
                l.m(state, lifecycleImpact);
                return;
            }
            final b bVar = new b(state, lifecycleImpact, oVar, mh0Var);
            this.b.add(bVar);
            bVar.c(new Runnable() { // from class: androidx.fragment.app.x
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.d(SpecialEffectsController.this, bVar);
                }
            });
            bVar.c(new Runnable() { // from class: androidx.fragment.app.y
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.e(SpecialEffectsController.this, bVar);
                }
            });
            ww8 ww8Var = ww8.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SpecialEffectsController specialEffectsController, b bVar) {
        zq3.h(specialEffectsController, "this$0");
        zq3.h(bVar, "$operation");
        if (specialEffectsController.b.contains(bVar)) {
            Operation.State g = bVar.g();
            View view = bVar.h().mView;
            zq3.g(view, "operation.fragment.mView");
            g.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SpecialEffectsController specialEffectsController, b bVar) {
        zq3.h(specialEffectsController, "this$0");
        zq3.h(bVar, "$operation");
        specialEffectsController.b.remove(bVar);
        specialEffectsController.c.remove(bVar);
    }

    private final Operation l(Fragment fragment) {
        Object obj;
        Iterator it2 = this.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Operation operation = (Operation) obj;
            if (zq3.c(operation.h(), fragment) && !operation.j()) {
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation m(Fragment fragment) {
        Object obj;
        Iterator it2 = this.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Operation operation = (Operation) obj;
            if (zq3.c(operation.h(), fragment) && !operation.j()) {
                break;
            }
        }
        return (Operation) obj;
    }

    public static final SpecialEffectsController r(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f.a(viewGroup, fragmentManager);
    }

    public static final SpecialEffectsController s(ViewGroup viewGroup, z zVar) {
        return f.b(viewGroup, zVar);
    }

    private final void u() {
        for (Operation operation : this.b) {
            if (operation.i() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.h().requireView();
                zq3.g(requireView, "fragment.requireView()");
                operation.m(Operation.State.Companion.b(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void f(Operation.State state, o oVar) {
        zq3.h(state, "finalState");
        zq3.h(oVar, "fragmentStateManager");
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar.k());
        }
        c(state, Operation.LifecycleImpact.ADDING, oVar);
    }

    public final void g(o oVar) {
        zq3.h(oVar, "fragmentStateManager");
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar.k());
        }
        c(Operation.State.GONE, Operation.LifecycleImpact.NONE, oVar);
    }

    public final void h(o oVar) {
        zq3.h(oVar, "fragmentStateManager");
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar.k());
        }
        c(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, oVar);
    }

    public final void i(o oVar) {
        zq3.h(oVar, "fragmentStateManager");
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar.k());
        }
        c(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, oVar);
    }

    public abstract void j(List list, boolean z);

    public final void k() {
        if (this.e) {
            return;
        }
        if (!k99.O(this.a)) {
            n();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    List<Operation> a1 = kotlin.collections.i.a1(this.c);
                    this.c.clear();
                    for (Operation operation : a1) {
                        if (FragmentManager.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.d();
                        if (!operation.k()) {
                            this.c.add(operation);
                        }
                    }
                    u();
                    List a12 = kotlin.collections.i.a1(this.b);
                    this.b.clear();
                    this.c.addAll(a12);
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = a12.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).n();
                    }
                    j(a12, this.d);
                    this.d = false;
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean O = k99.O(this.a);
        synchronized (this.b) {
            try {
                u();
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).n();
                }
                for (Operation operation : kotlin.collections.i.a1(this.c)) {
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (O ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling running operation " + operation);
                    }
                    operation.d();
                }
                for (Operation operation2 : kotlin.collections.i.a1(this.b)) {
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (O ? "" : "Container " + this.a + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                    }
                    operation2.d();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.e) {
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            k();
        }
    }

    public final Operation.LifecycleImpact p(o oVar) {
        zq3.h(oVar, "fragmentStateManager");
        Fragment k = oVar.k();
        zq3.g(k, "fragmentStateManager.fragment");
        Operation l = l(k);
        Operation.LifecycleImpact i = l != null ? l.i() : null;
        Operation m = m(k);
        Operation.LifecycleImpact i2 = m != null ? m.i() : null;
        int i3 = i == null ? -1 : c.a[i.ordinal()];
        return (i3 == -1 || i3 == 1) ? i2 : i;
    }

    public final ViewGroup q() {
        return this.a;
    }

    public final void t() {
        Object obj;
        synchronized (this.b) {
            try {
                u();
                List list = this.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    Operation operation = (Operation) obj;
                    Operation.State.a aVar = Operation.State.Companion;
                    View view = operation.h().mView;
                    zq3.g(view, "operation.fragment.mView");
                    Operation.State a2 = aVar.a(view);
                    Operation.State g = operation.g();
                    Operation.State state = Operation.State.VISIBLE;
                    if (g == state && a2 != state) {
                        break;
                    }
                }
                Operation operation2 = (Operation) obj;
                Fragment h = operation2 != null ? operation2.h() : null;
                this.e = h != null ? h.isPostponed() : false;
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z) {
        this.d = z;
    }
}
