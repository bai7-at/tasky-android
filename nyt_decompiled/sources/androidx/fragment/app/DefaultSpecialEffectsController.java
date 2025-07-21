package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import defpackage.du8;
import defpackage.ih5;
import defpackage.k99;
import defpackage.lh4;
import defpackage.mh0;
import defpackage.so;
import defpackage.ss2;
import defpackage.y99;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends b {
        private final boolean c;
        private boolean d;
        private g.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpecialEffectsController.Operation operation, mh0 mh0Var, boolean z) {
            super(operation, mh0Var);
            zq3.h(operation, "operation");
            zq3.h(mh0Var, "signal");
            this.c = z;
        }

        public final g.a e(Context context) {
            zq3.h(context, "context");
            if (this.d) {
                return this.e;
            }
            g.a b = g.b(context, b().h(), b().g() == SpecialEffectsController.Operation.State.VISIBLE, this.c);
            this.e = b;
            this.d = true;
            return b;
        }
    }

    private static class b {
        private final SpecialEffectsController.Operation a;
        private final mh0 b;

        public b(SpecialEffectsController.Operation operation, mh0 mh0Var) {
            zq3.h(operation, "operation");
            zq3.h(mh0Var, "signal");
            this.a = operation;
            this.b = mh0Var;
        }

        public final void a() {
            this.a.f(this.b);
        }

        public final SpecialEffectsController.Operation b() {
            return this.a;
        }

        public final mh0 c() {
            return this.b;
        }

        public final boolean d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            View view = this.a.h().mView;
            zq3.g(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State a = aVar.a(view);
            SpecialEffectsController.Operation.State g = this.a.g();
            return a == g || !(a == (state = SpecialEffectsController.Operation.State.VISIBLE) || g == state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends b {
        private final Object c;
        private final boolean d;
        private final Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SpecialEffectsController.Operation operation, mh0 mh0Var, boolean z, boolean z2) {
            super(operation, mh0Var);
            Object returnTransition;
            zq3.h(operation, "operation");
            zq3.h(mh0Var, "signal");
            SpecialEffectsController.Operation.State g = operation.g();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (g == state) {
                Fragment h = operation.h();
                returnTransition = z ? h.getReenterTransition() : h.getEnterTransition();
            } else {
                Fragment h2 = operation.h();
                returnTransition = z ? h2.getReturnTransition() : h2.getExitTransition();
            }
            this.c = returnTransition;
            this.d = operation.g() == state ? z ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.e = z2 ? z ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final u f(Object obj) {
            if (obj == null) {
                return null;
            }
            u uVar = s.b;
            if (uVar != null && uVar.e(obj)) {
                return uVar;
            }
            u uVar2 = s.c;
            if (uVar2 != null && uVar2.e(obj)) {
                return uVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final u e() {
            u f = f(this.c);
            u f2 = f(this.e);
            if (f == null || f2 == null || f == f2) {
                return f == null ? f2 : f;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e).toString());
        }

        public final Object g() {
            return this.e;
        }

        public final Object h() {
            return this.c;
        }

        public final boolean i() {
            return this.e != null;
        }

        public final boolean j() {
            return this.d;
        }
    }

    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;
        final /* synthetic */ SpecialEffectsController.Operation d;
        final /* synthetic */ a e;

        d(View view, boolean z, SpecialEffectsController.Operation operation, a aVar) {
            this.b = view;
            this.c = z;
            this.d = operation;
            this.e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zq3.h(animator, "anim");
            DefaultSpecialEffectsController.this.q().endViewTransition(this.b);
            if (this.c) {
                SpecialEffectsController.Operation.State g = this.d.g();
                View view = this.b;
                zq3.g(view, "viewToAnimate");
                g.applyState(view);
            }
            this.e.a();
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
            }
        }
    }

    public static final class e implements Animation.AnimationListener {
        final /* synthetic */ SpecialEffectsController.Operation a;
        final /* synthetic */ DefaultSpecialEffectsController b;
        final /* synthetic */ View c;
        final /* synthetic */ a d;

        e(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, a aVar) {
            this.a = operation;
            this.b = defaultSpecialEffectsController;
            this.c = view;
            this.d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DefaultSpecialEffectsController defaultSpecialEffectsController, View view, a aVar) {
            zq3.h(defaultSpecialEffectsController, "this$0");
            zq3.h(aVar, "$animationInfo");
            defaultSpecialEffectsController.q().endViewTransition(view);
            aVar.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            zq3.h(animation, "animation");
            ViewGroup q = this.b.q();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.b;
            final View view = this.c;
            final a aVar = this.d;
            q.post(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.e.b(DefaultSpecialEffectsController.this, view, aVar);
                }
            });
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            zq3.h(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            zq3.h(animation, "animation");
            if (FragmentManager.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
        zq3.h(viewGroup, "container");
    }

    private final void D(SpecialEffectsController.Operation operation) {
        View view = operation.h().mView;
        SpecialEffectsController.Operation.State g = operation.g();
        zq3.g(view, "view");
        g.applyState(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (y99.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                zq3.g(childAt, "child");
                E(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List list, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController) {
        zq3.h(list, "$awaitingContainerChanges");
        zq3.h(operation, "$operation");
        zq3.h(defaultSpecialEffectsController, "this$0");
        if (list.contains(operation)) {
            list.remove(operation);
            defaultSpecialEffectsController.D(operation);
        }
    }

    private final void G(Map map, View view) {
        String G = k99.G(view);
        if (G != null) {
            map.put(G, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    zq3.g(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    private final void H(so soVar, final Collection collection) {
        Set entrySet = soVar.entrySet();
        zq3.g(entrySet, "entries");
        kotlin.collections.i.N(entrySet, new ss2() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Map.Entry entry) {
                zq3.h(entry, "entry");
                return Boolean.valueOf(kotlin.collections.i.c0(collection, k99.G((View) entry.getValue())));
            }
        });
    }

    private final void I(List list, List list2, boolean z, Map map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                zq3.g(context, "context");
                g.a e2 = aVar.e(context);
                if (e2 == null) {
                    aVar.a();
                } else {
                    final Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final SpecialEffectsController.Operation b2 = aVar.b();
                        Fragment h = b2.h();
                        if (zq3.c(map.get(b2), Boolean.TRUE)) {
                            if (FragmentManager.L0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + h + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z3 = b2.g() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(b2);
                            }
                            View view = h.mView;
                            q().startViewTransition(view);
                            animator.addListener(new d(view, z3, b2, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.L0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b2 + " has started.");
                            }
                            aVar.c().b(new mh0.a() { // from class: qj1
                                @Override // mh0.a
                                public final void b() {
                                    DefaultSpecialEffectsController.J(animator, b2);
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final SpecialEffectsController.Operation b3 = aVar2.b();
            Fragment h2 = b3.h();
            if (z) {
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z2) {
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = h2.mView;
                zq3.g(context, "context");
                g.a e3 = aVar2.e(context);
                if (e3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = e3.a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (b3.g() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    g.b bVar = new g.b(animation, q(), view2);
                    bVar.setAnimationListener(new e(b3, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (FragmentManager.L0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b3 + " has started.");
                    }
                }
                aVar2.c().b(new mh0.a() { // from class: androidx.fragment.app.b
                    @Override // mh0.a
                    public final void b() {
                        DefaultSpecialEffectsController.K(view2, this, aVar2, b3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, SpecialEffectsController.Operation operation) {
        zq3.h(operation, "$operation");
        animator.end();
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, DefaultSpecialEffectsController defaultSpecialEffectsController, a aVar, SpecialEffectsController.Operation operation) {
        zq3.h(defaultSpecialEffectsController, "this$0");
        zq3.h(aVar, "$animationInfo");
        zq3.h(operation, "$operation");
        view.clearAnimation();
        defaultSpecialEffectsController.q().endViewTransition(view);
        aVar.a();
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map L(List list, List list2, boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        String str;
        String str2;
        View view;
        Object obj;
        String str3;
        boolean z2;
        Object obj2;
        Object obj3;
        View view2;
        final ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object obj4;
        SpecialEffectsController.Operation operation3;
        View view3;
        Rect rect;
        Pair a2;
        View view4;
        final View view5;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        final boolean z3 = z;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list) {
            if (!((c) obj5).d()) {
                arrayList2.add(obj5);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (((c) obj6).e() != null) {
                arrayList3.add(obj6);
            }
        }
        final u uVar = null;
        for (c cVar : arrayList3) {
            u e2 = cVar.e();
            if (uVar != null && e2 != uVar) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar.b().h() + " returned Transition " + cVar.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            uVar = e2;
        }
        if (uVar == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c cVar2 = (c) it2.next();
                linkedHashMap2.put(cVar2.b(), Boolean.FALSE);
                cVar2.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        final Rect rect2 = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        so soVar = new so();
        Iterator it3 = list.iterator();
        View view7 = null;
        Object obj7 = null;
        boolean z4 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            c cVar3 = (c) it3.next();
            if (!cVar3.i() || operation == null || operation2 == null) {
                rect = rect2;
                view6 = view6;
                arrayList4 = arrayList4;
                linkedHashMap2 = linkedHashMap2;
                soVar = soVar;
                view7 = view7;
                arrayList5 = arrayList5;
            } else {
                Object u = uVar.u(uVar.f(cVar3.g()));
                ArrayList<String> sharedElementSourceNames = operation2.h().getSharedElementSourceNames();
                zq3.g(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.h().getSharedElementSourceNames();
                View view8 = view7;
                zq3.g(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.h().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                zq3.g(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                int i = 0;
                while (i < size) {
                    int i2 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList6 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    size = i2;
                    sharedElementTargetNames = arrayList6;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.h().getSharedElementTargetNames();
                zq3.g(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (z3) {
                    operation.h().getEnterTransitionCallback();
                    operation2.h().getExitTransitionCallback();
                    a2 = du8.a(null, null);
                } else {
                    operation.h().getExitTransitionCallback();
                    operation2.h().getEnterTransitionCallback();
                    a2 = du8.a(null, null);
                }
                lh4.a(a2.a());
                lh4.a(a2.b());
                int i3 = 0;
                for (int size2 = sharedElementSourceNames.size(); i3 < size2; size2 = size2) {
                    soVar.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                }
                if (FragmentManager.L0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it4 = sharedElementTargetNames2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + it4.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + it5.next());
                    }
                }
                so soVar2 = new so();
                View view10 = operation.h().mView;
                zq3.g(view10, "firstOut.fragment.mView");
                defaultSpecialEffectsController.G(soVar2, view10);
                soVar2.s(sharedElementSourceNames);
                soVar.s(soVar2.keySet());
                final so soVar3 = new so();
                View view11 = operation2.h().mView;
                zq3.g(view11, "lastIn.fragment.mView");
                defaultSpecialEffectsController.G(soVar3, view11);
                soVar3.s(sharedElementTargetNames2);
                soVar3.s(soVar.values());
                s.c(soVar, soVar3);
                Set keySet = soVar.keySet();
                zq3.g(keySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.H(soVar2, keySet);
                Collection values = soVar.values();
                zq3.g(values, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.H(soVar3, values);
                if (soVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    obj7 = null;
                } else {
                    so soVar4 = soVar;
                    s.a(operation2.h(), operation.h(), z3, soVar2, true);
                    ih5.a(q(), new Runnable() { // from class: rj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.P(SpecialEffectsController.Operation.this, operation, z3, soVar3);
                        }
                    });
                    arrayList4.addAll(soVar2.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view4 = view8;
                    } else {
                        view4 = (View) soVar2.get(sharedElementSourceNames.get(0));
                        uVar.p(u, view4);
                    }
                    arrayList5.addAll(soVar3.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) soVar3.get(sharedElementTargetNames2.get(0))) != null) {
                        ih5.a(q(), new Runnable() { // from class: sj1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.M(u.this, view5, rect2);
                            }
                        });
                        z4 = true;
                    }
                    uVar.s(u, view9, arrayList4);
                    ArrayList arrayList7 = arrayList5;
                    rect = rect2;
                    uVar.n(u, null, null, null, null, u, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(operation, bool);
                    linkedHashMap3.put(operation2, bool);
                    view7 = view4;
                    arrayList4 = arrayList4;
                    soVar = soVar4;
                    obj7 = u;
                    arrayList5 = arrayList7;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                }
            }
            rect2 = rect;
            z3 = z;
        }
        View view12 = view7;
        so soVar5 = soVar;
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList4;
        Rect rect3 = rect2;
        boolean z5 = true;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view13 = view6;
        ArrayList arrayList10 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj8 = null;
        Object obj9 = null;
        while (it6.hasNext()) {
            c cVar4 = (c) it6.next();
            if (cVar4.d()) {
                linkedHashMap4.put(cVar4.b(), Boolean.FALSE);
                cVar4.a();
            } else {
                Object f = uVar.f(cVar4.h());
                SpecialEffectsController.Operation b2 = cVar4.b();
                boolean z6 = (obj7 == null || !(b2 == operation || b2 == operation2)) ? false : z5;
                if (f != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList arrayList11 = new ArrayList();
                    View view14 = b2.h().mView;
                    Object obj10 = obj7;
                    zq3.g(view14, "operation.fragment.mView");
                    defaultSpecialEffectsController.E(arrayList11, view14);
                    if (z6) {
                        if (b2 == operation) {
                            arrayList11.removeAll(kotlin.collections.i.c1(arrayList9));
                        } else {
                            arrayList11.removeAll(kotlin.collections.i.c1(arrayList8));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        uVar.a(f, view13);
                        view2 = view13;
                        obj4 = f;
                        str3 = str;
                        obj2 = obj8;
                        obj3 = obj9;
                        arrayList = arrayList11;
                        view = view12;
                        linkedHashMap = linkedHashMap5;
                        obj = obj10;
                        z2 = true;
                        operation3 = b2;
                    } else {
                        uVar.b(f, arrayList11);
                        view = view12;
                        obj = obj10;
                        str3 = str;
                        z2 = true;
                        obj2 = obj8;
                        obj3 = obj9;
                        view2 = view13;
                        arrayList = arrayList11;
                        linkedHashMap = linkedHashMap5;
                        uVar.n(f, f, arrayList11, null, null, null, null);
                        if (b2.g() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = b2;
                            list2.remove(operation3);
                            ArrayList arrayList12 = new ArrayList(arrayList);
                            arrayList12.remove(operation3.h().mView);
                            obj4 = f;
                            uVar.m(obj4, operation3.h().mView, arrayList12);
                            ih5.a(q(), new Runnable() { // from class: tj1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.N(arrayList);
                                }
                            });
                        } else {
                            obj4 = f;
                            operation3 = b2;
                        }
                    }
                    if (operation3.g() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z4) {
                            uVar.o(obj4, rect3);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        uVar.p(obj4, view3);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (cVar4.j()) {
                        obj9 = uVar.k(obj3, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        view13 = view2;
                        z5 = z2;
                        obj7 = obj;
                        str = str3;
                        obj8 = obj2;
                    } else {
                        obj9 = obj3;
                        obj8 = uVar.k(obj2, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        view13 = view2;
                        z5 = z2;
                        obj7 = obj;
                        str = str3;
                    }
                    defaultSpecialEffectsController = this;
                } else if (!z6) {
                    linkedHashMap4.put(b2, Boolean.FALSE);
                    cVar4.a();
                }
            }
        }
        String str4 = str;
        boolean z7 = z5;
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object j = uVar.j(obj9, obj8, obj7);
        if (j == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList13 = new ArrayList();
        for (Object obj11 : list) {
            if (!((c) obj11).d()) {
                arrayList13.add(obj11);
            }
        }
        for (final c cVar5 : arrayList13) {
            Object h = cVar5.h();
            final SpecialEffectsController.Operation b3 = cVar5.b();
            boolean z8 = (obj7 == null || !(b3 == operation || b3 == operation2)) ? false : z7;
            if (h == null && !z8) {
                str2 = str4;
            } else if (k99.P(q())) {
                str2 = str4;
                uVar.q(cVar5.b().h(), j, cVar5.c(), new Runnable() { // from class: androidx.fragment.app.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.O(DefaultSpecialEffectsController.c.this, b3);
                    }
                });
            } else {
                if (FragmentManager.L0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + b3);
                } else {
                    str2 = str4;
                }
                cVar5.a();
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!k99.P(q())) {
            return linkedHashMap6;
        }
        s.d(arrayList10, 4);
        ArrayList l = uVar.l(arrayList8);
        if (FragmentManager.L0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                Object next = it7.next();
                zq3.g(next, "sharedElementFirstOutViews");
                View view15 = (View) next;
                Log.v(str5, "View: " + view15 + " Name: " + k99.G(view15));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it8 = arrayList8.iterator();
            while (it8.hasNext()) {
                Object next2 = it8.next();
                zq3.g(next2, "sharedElementLastInViews");
                View view16 = (View) next2;
                Log.v(str5, "View: " + view16 + " Name: " + k99.G(view16));
            }
        }
        uVar.c(q(), j);
        uVar.r(q(), arrayList9, arrayList8, l, soVar5);
        s.d(arrayList10, 0);
        uVar.t(obj7, arrayList9, arrayList8);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(u uVar, View view, Rect rect) {
        zq3.h(uVar, "$impl");
        zq3.h(rect, "$lastInEpicenterRect");
        uVar.h(view, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList arrayList) {
        zq3.h(arrayList, "$transitioningViews");
        s.d(arrayList, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c cVar, SpecialEffectsController.Operation operation) {
        zq3.h(cVar, "$transitionInfo");
        zq3.h(operation, "$operation");
        cVar.a();
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, so soVar) {
        zq3.h(soVar, "$lastInViews");
        s.a(operation.h(), operation2.h(), z, soVar, false);
    }

    private final void Q(List list) {
        Fragment h = ((SpecialEffectsController.Operation) kotlin.collections.i.w0(list)).h();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) it2.next();
            operation.h().mAnimationInfo.c = h.mAnimationInfo.c;
            operation.h().mAnimationInfo.d = h.mAnimationInfo.d;
            operation.h().mAnimationInfo.e = h.mAnimationInfo.e;
            operation.h().mAnimationInfo.f = h.mAnimationInfo.f;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void j(List list, boolean z) {
        Object obj;
        Object obj2;
        zq3.h(list, "operations");
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj2;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            View view = operation.h().mView;
            zq3.g(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State a2 = aVar.a(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (a2 == state && operation.g() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) previous;
            SpecialEffectsController.Operation.State.a aVar2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation3.h().mView;
            zq3.g(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State a3 = aVar2.a(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (a3 != state2 && operation3.g() == state2) {
                obj = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj;
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation2 + " to " + operation4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List a1 = kotlin.collections.i.a1(list);
        Q(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            final SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it3.next();
            mh0 mh0Var = new mh0();
            operation5.l(mh0Var);
            arrayList.add(new a(operation5, mh0Var, z));
            mh0 mh0Var2 = new mh0();
            operation5.l(mh0Var2);
            boolean z2 = false;
            if (z) {
                if (operation5 != operation2) {
                    arrayList2.add(new c(operation5, mh0Var2, z, z2));
                    operation5.c(new Runnable() { // from class: pj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.F(a1, operation5, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new c(operation5, mh0Var2, z, z2));
                operation5.c(new Runnable() { // from class: pj1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.F(a1, operation5, this);
                    }
                });
            } else {
                if (operation5 != operation4) {
                    arrayList2.add(new c(operation5, mh0Var2, z, z2));
                    operation5.c(new Runnable() { // from class: pj1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.F(a1, operation5, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new c(operation5, mh0Var2, z, z2));
                operation5.c(new Runnable() { // from class: pj1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.F(a1, operation5, this);
                    }
                });
            }
        }
        Map L = L(arrayList2, a1, z, operation2, operation4);
        I(arrayList, a1, L.containsValue(Boolean.TRUE), L);
        Iterator it4 = a1.iterator();
        while (it4.hasNext()) {
            D((SpecialEffectsController.Operation) it4.next());
        }
        a1.clear();
        if (FragmentManager.L0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + operation2 + " to " + operation4);
        }
    }
}
