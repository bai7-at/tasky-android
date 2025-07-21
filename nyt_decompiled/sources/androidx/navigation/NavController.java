package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.c;
import androidx.navigation.e;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.c35;
import defpackage.c44;
import defpackage.ce5;
import defpackage.d44;
import defpackage.du8;
import defpackage.hl2;
import defpackage.ku8;
import defpackage.le0;
import defpackage.lh4;
import defpackage.no;
import defpackage.p25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public abstract class NavController {
    public static final a H = new a(null);
    private static boolean I = true;
    private ss2 A;
    private final Map B;
    private int C;
    private final List D;
    private final c04 E;
    private final MutableSharedFlow F;
    private final Flow G;
    private final Context a;
    private Activity b;
    private g c;
    private NavGraph d;
    private Bundle e;
    private Parcelable[] f;
    private boolean g;
    private final kotlin.collections.c h;
    private final MutableStateFlow i;
    private final StateFlow j;
    private final MutableStateFlow k;
    private final StateFlow l;
    private final Map m;
    private final Map n;
    private final Map o;
    private final Map p;
    private d44 q;
    private c r;
    private final CopyOnWriteArrayList s;
    private Lifecycle.State t;
    private final c44 u;
    private final ce5 v;
    private boolean w;
    private k x;
    private final Map y;
    private ss2 z;

    /* JADX INFO: Access modifiers changed from: private */
    final class NavControllerNavigatorState extends c35 {
        private final Navigator g;
        final /* synthetic */ NavController h;

        public NavControllerNavigatorState(NavController navController, Navigator navigator) {
            zq3.h(navigator, "navigator");
            this.h = navController;
            this.g = navigator;
        }

        @Override // defpackage.c35
        public NavBackStackEntry a(NavDestination navDestination, Bundle bundle) {
            zq3.h(navDestination, "destination");
            return NavBackStackEntry.a.b(NavBackStackEntry.r, this.h.B(), navDestination, bundle, this.h.H(), this.h.r, null, null, 96, null);
        }

        @Override // defpackage.c35
        public void e(NavBackStackEntry navBackStackEntry) {
            c cVar;
            zq3.h(navBackStackEntry, "entry");
            boolean c = zq3.c(this.h.B.get(navBackStackEntry), Boolean.TRUE);
            super.e(navBackStackEntry);
            this.h.B.remove(navBackStackEntry);
            if (this.h.h.contains(navBackStackEntry)) {
                if (d()) {
                    return;
                }
                this.h.s0();
                this.h.i.tryEmit(kotlin.collections.i.a1(this.h.h));
                this.h.k.tryEmit(this.h.h0());
                return;
            }
            this.h.r0(navBackStackEntry);
            if (navBackStackEntry.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                navBackStackEntry.k(Lifecycle.State.DESTROYED);
            }
            kotlin.collections.c cVar2 = this.h.h;
            if (cVar2 == null || !cVar2.isEmpty()) {
                Iterator<E> it2 = cVar2.iterator();
                while (it2.hasNext()) {
                    if (zq3.c(((NavBackStackEntry) it2.next()).f(), navBackStackEntry.f())) {
                        break;
                    }
                }
            }
            if (!c && (cVar = this.h.r) != null) {
                cVar.f(navBackStackEntry.f());
            }
            this.h.s0();
            this.h.k.tryEmit(this.h.h0());
        }

        @Override // defpackage.c35
        public void g(final NavBackStackEntry navBackStackEntry, final boolean z) {
            zq3.h(navBackStackEntry, "popUpTo");
            Navigator e = this.h.x.e(navBackStackEntry.e().t());
            if (!zq3.c(e, this.g)) {
                Object obj = this.h.y.get(e);
                zq3.e(obj);
                ((NavControllerNavigatorState) obj).g(navBackStackEntry, z);
            } else {
                ss2 ss2Var = this.h.A;
                if (ss2Var == null) {
                    this.h.a0(navBackStackEntry, new qs2() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m119invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m119invoke() {
                            super/*c35*/.g(navBackStackEntry, z);
                        }
                    });
                } else {
                    ss2Var.invoke(navBackStackEntry);
                    super.g(navBackStackEntry, z);
                }
            }
        }

        @Override // defpackage.c35
        public void h(NavBackStackEntry navBackStackEntry, boolean z) {
            zq3.h(navBackStackEntry, "popUpTo");
            super.h(navBackStackEntry, z);
            this.h.B.put(navBackStackEntry, Boolean.valueOf(z));
        }

        @Override // defpackage.c35
        public void i(NavBackStackEntry navBackStackEntry) {
            zq3.h(navBackStackEntry, "backStackEntry");
            Navigator e = this.h.x.e(navBackStackEntry.e().t());
            if (!zq3.c(e, this.g)) {
                Object obj = this.h.y.get(e);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).i(navBackStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.e().t() + " should already be created").toString());
            }
            ss2 ss2Var = this.h.z;
            if (ss2Var != null) {
                ss2Var.invoke(navBackStackEntry);
                m(navBackStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.e() + " outside of the call to navigate(). ");
        }

        public final void m(NavBackStackEntry navBackStackEntry) {
            zq3.h(navBackStackEntry, "backStackEntry");
            super.i(navBackStackEntry);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ce5 {
        b() {
            super(false);
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            NavController.this.X();
        }
    }

    public NavController(Context context) {
        Object obj;
        zq3.h(context, "context");
        this.a = context;
        Iterator it2 = kotlin.sequences.d.f(context, new ss2() { // from class: androidx.navigation.NavController$activity$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context context2) {
                zq3.h(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) obj;
        this.h = new kotlin.collections.c();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(kotlin.collections.i.l());
        this.i = MutableStateFlow;
        this.j = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(kotlin.collections.i.l());
        this.k = MutableStateFlow2;
        this.l = FlowKt.asStateFlow(MutableStateFlow2);
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.s = new CopyOnWriteArrayList();
        this.t = Lifecycle.State.INITIALIZED;
        this.u = new androidx.lifecycle.g() { // from class: k25
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var, Lifecycle.Event event) {
                NavController.N(NavController.this, d44Var, event);
            }
        };
        this.v = new b();
        this.w = true;
        this.x = new k();
        this.y = new LinkedHashMap();
        this.B = new LinkedHashMap();
        k kVar = this.x;
        kVar.b(new f(kVar));
        this.x.b(new ActivityNavigator(this.a));
        this.D = new ArrayList();
        this.E = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g mo865invoke() {
                g gVar;
                gVar = NavController.this.c;
                return gVar == null ? new g(NavController.this.B(), NavController.this.x) : gVar;
            }
        });
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.F = MutableSharedFlow$default;
        this.G = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    private final int F() {
        kotlin.collections.c cVar = this.h;
        int i = 0;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<E> it2 = cVar.iterator();
            while (it2.hasNext()) {
                if (!(((NavBackStackEntry) it2.next()).e() instanceof NavGraph) && (i = i + 1) < 0) {
                    kotlin.collections.i.u();
                }
            }
        }
        return i;
    }

    private final List L(kotlin.collections.c cVar) {
        NavDestination G;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.h.q();
        if (navBackStackEntry == null || (G = navBackStackEntry.e()) == null) {
            G = G();
        }
        if (cVar != null) {
            Iterator<E> it2 = cVar.iterator();
            while (it2.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it2.next();
                NavDestination x = x(G, navBackStackEntryState.a());
                if (x == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.j.b(this.a, navBackStackEntryState.a()) + " cannot be found from the current destination " + G).toString());
                }
                arrayList.add(navBackStackEntryState.c(this.a, x, H(), this.r));
                G = x;
            }
        }
        return arrayList;
    }

    private final boolean M(NavDestination navDestination, Bundle bundle) {
        NavDestination e;
        int i;
        NavBackStackEntry C = C();
        int q = navDestination instanceof NavGraph ? NavGraph.s.a((NavGraph) navDestination).q() : navDestination.q();
        if (C == null || (e = C.e()) == null || q != e.q()) {
            return false;
        }
        kotlin.collections.c<NavBackStackEntry> cVar = new kotlin.collections.c();
        kotlin.collections.c cVar2 = this.h;
        ListIterator<E> listIterator = cVar2.listIterator(cVar2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (((NavBackStackEntry) listIterator.previous()).e() == navDestination) {
                i = listIterator.nextIndex();
                break;
            }
        }
        while (kotlin.collections.i.n(this.h) >= i) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.h.removeLast();
            r0(navBackStackEntry);
            cVar.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.e().j(bundle)));
        }
        for (NavBackStackEntry navBackStackEntry2 : cVar) {
            NavGraph u = navBackStackEntry2.e().u();
            if (u != null) {
                O(navBackStackEntry2, z(u.q()));
            }
            this.h.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : cVar) {
            this.x.e(navBackStackEntry3.e().t()).g(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(NavController navController, d44 d44Var, Lifecycle.Event event) {
        zq3.h(navController, "this$0");
        zq3.h(d44Var, "<anonymous parameter 0>");
        zq3.h(event, "event");
        navController.t = event.getTargetState();
        if (navController.d != null) {
            Iterator<E> it2 = navController.h.iterator();
            while (it2.hasNext()) {
                ((NavBackStackEntry) it2.next()).h(event);
            }
        }
    }

    private final void O(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.m.put(navBackStackEntry, navBackStackEntry2);
        if (this.n.get(navBackStackEntry2) == null) {
            this.n.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = this.n.get(navBackStackEntry2);
        zq3.e(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee A[LOOP:1: B:20:0x00e8->B:22:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q(final androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.h r24, androidx.navigation.Navigator.a r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.Q(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.h, androidx.navigation.Navigator$a):void");
    }

    public static /* synthetic */ void T(NavController navController, String str, h hVar, Navigator.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            hVar = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        navController.S(str, hVar, aVar);
    }

    private final void U(Navigator navigator, List list, h hVar, Navigator.a aVar, ss2 ss2Var) {
        this.z = ss2Var;
        navigator.e(list, hVar, aVar);
        this.z = null;
    }

    private final void W(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it2 = stringArrayList.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                k kVar = this.x;
                zq3.g(next, AuthenticationTokenClaims.JSON_KEY_NAME);
                Navigator e = kVar.e(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    e.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                zq3.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination w = w(navBackStackEntryState.a());
                if (w == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.j.b(this.a, navBackStackEntryState.a()) + " cannot be found from the current destination " + E());
                }
                NavBackStackEntry c = navBackStackEntryState.c(this.a, w, H(), this.r);
                Navigator e2 = this.x.e(w.t());
                Map map = this.y;
                Object obj = map.get(e2);
                if (obj == null) {
                    obj = new NavControllerNavigatorState(this, e2);
                    map.put(e2, obj);
                }
                this.h.add(c);
                ((NavControllerNavigatorState) obj).m(c);
                NavGraph u = c.e().u();
                if (u != null) {
                    O(c, z(u.q()));
                }
            }
            t0();
            this.f = null;
        }
        Collection values = this.x.f().values();
        ArrayList<Navigator> arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (!((Navigator) obj2).c()) {
                arrayList.add(obj2);
            }
        }
        for (Navigator navigator : arrayList) {
            Map map2 = this.y;
            Object obj3 = map2.get(navigator);
            if (obj3 == null) {
                obj3 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, obj3);
            }
            navigator.f((NavControllerNavigatorState) obj3);
        }
        if (this.d == null || !this.h.isEmpty()) {
            t();
            return;
        }
        if (!this.g && (activity = this.b) != null) {
            zq3.e(activity);
            if (K(activity.getIntent())) {
                return;
            }
        }
        NavGraph navGraph = this.d;
        zq3.e(navGraph);
        Q(navGraph, bundle, null, null);
    }

    private final void b0(Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z, ss2 ss2Var) {
        this.A = ss2Var;
        navigator.j(navBackStackEntry, z);
        this.A = null;
    }

    private final boolean c0(int i, boolean z, boolean z2) {
        NavDestination navDestination;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = kotlin.collections.i.H0(this.h).iterator();
        while (true) {
            if (!it2.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it2.next()).e();
            Navigator e = this.x.e(navDestination.t());
            if (z || navDestination.q() != i) {
                arrayList.add(e);
            }
            if (navDestination.q() == i) {
                break;
            }
        }
        if (navDestination != null) {
            return u(arrayList, navDestination, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.j.b(this.a, i) + " as it was not found on the current back stack");
        return false;
    }

    private final boolean d0(String str, boolean z, boolean z2) {
        Object obj;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        kotlin.collections.c cVar = this.h;
        ListIterator<E> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            boolean x = navBackStackEntry.e().x(str, navBackStackEntry.c());
            if (z || !x) {
                arrayList.add(this.x.e(navBackStackEntry.e().t()));
            }
            if (x) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        NavDestination e = navBackStackEntry2 != null ? navBackStackEntry2.e() : null;
        if (e != null) {
            return u(arrayList, e, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean e0(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return navController.c0(i, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(NavBackStackEntry navBackStackEntry, boolean z, kotlin.collections.c cVar) {
        c cVar2;
        StateFlow c;
        Set set;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.h.last();
        if (!zq3.c(navBackStackEntry2, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.e() + ", which is not the top of the back stack (" + navBackStackEntry2.e() + ')').toString());
        }
        this.h.removeLast();
        NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.y.get(I().e(navBackStackEntry2.e().t()));
        boolean z2 = true;
        if ((navControllerNavigatorState == null || (c = navControllerNavigatorState.c()) == null || (set = (Set) c.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.n.containsKey(navBackStackEntry2)) {
            z2 = false;
        }
        Lifecycle.State b2 = navBackStackEntry2.getLifecycle().b();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (b2.isAtLeast(state)) {
            if (z) {
                navBackStackEntry2.k(state);
                cVar.addFirst(new NavBackStackEntryState(navBackStackEntry2));
            }
            if (z2) {
                navBackStackEntry2.k(state);
            } else {
                navBackStackEntry2.k(Lifecycle.State.DESTROYED);
                r0(navBackStackEntry2);
            }
        }
        if (z || z2 || (cVar2 = this.r) == null) {
            return;
        }
        cVar2.f(navBackStackEntry2.f());
    }

    static /* synthetic */ void g0(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, kotlin.collections.c cVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            cVar = new kotlin.collections.c();
        }
        navController.f0(navBackStackEntry, z, cVar);
    }

    private final boolean j0(int i, Bundle bundle, h hVar, Navigator.a aVar) {
        if (!this.o.containsKey(Integer.valueOf(i))) {
            return false;
        }
        final String str = (String) this.o.get(Integer.valueOf(i));
        kotlin.collections.i.G(this.o.values(), new ss2() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(zq3.c(str2, str));
            }
        });
        return v(L((kotlin.collections.c) ku8.d(this.p).remove(str)), bundle, hVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list) {
        kotlin.collections.c<NavBackStackEntry> cVar;
        NavDestination navDestination2;
        List list2;
        NavBackStackEntry navBackStackEntry2;
        Bundle bundle2;
        Object obj;
        NavGraph navGraph;
        Object obj2;
        List list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        List list4 = list;
        NavDestination e = navBackStackEntry.e();
        if (!(e instanceof hl2)) {
            while (!this.h.isEmpty() && (((NavBackStackEntry) this.h.last()).e() instanceof hl2) && e0(this, ((NavBackStackEntry) this.h.last()).e().q(), true, false, 4, null)) {
            }
        }
        kotlin.collections.c cVar2 = new kotlin.collections.c();
        Object obj3 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination3 = e;
            while (true) {
                zq3.e(navDestination3);
                NavGraph u = navDestination3.u();
                if (u != null) {
                    ListIterator listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (zq3.c(((NavBackStackEntry) obj2).e(), u)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj2;
                    if (navBackStackEntry4 == null) {
                        navDestination2 = e;
                        list3 = list4;
                        bundle3 = bundle4;
                        navBackStackEntry2 = navBackStackEntry3;
                        navBackStackEntry4 = NavBackStackEntry.a.b(NavBackStackEntry.r, this.a, u, bundle, H(), this.r, null, null, 96, null);
                    } else {
                        navDestination2 = e;
                        list3 = list4;
                        navBackStackEntry2 = navBackStackEntry3;
                        bundle3 = bundle4;
                    }
                    cVar2.addFirst(navBackStackEntry4);
                    if (this.h.isEmpty() || ((NavBackStackEntry) this.h.last()).e() != u) {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = u;
                        cVar = cVar2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = u;
                        cVar = cVar2;
                        g0(this, (NavBackStackEntry) this.h.last(), false, null, 6, null);
                    }
                } else {
                    navGraph = u;
                    cVar = cVar2;
                    navDestination2 = e;
                    list2 = list4;
                    navBackStackEntry2 = navBackStackEntry3;
                    bundle2 = bundle4;
                }
                if (navGraph == null || navGraph == navDestination) {
                    break;
                }
                navBackStackEntry3 = navBackStackEntry2;
                cVar2 = cVar;
                navDestination3 = navGraph;
                bundle4 = bundle2;
                list4 = list2;
                e = navDestination2;
            }
        } else {
            cVar = cVar2;
            navDestination2 = e;
            list2 = list4;
            navBackStackEntry2 = navBackStackEntry3;
            bundle2 = bundle4;
        }
        NavDestination e2 = cVar.isEmpty() ? navDestination2 : ((NavBackStackEntry) cVar.first()).e();
        while (e2 != null && w(e2.q()) != e2) {
            e2 = e2.u();
            if (e2 != null) {
                Bundle bundle5 = (bundle2 == null || !bundle.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (zq3.c(((NavBackStackEntry) obj).e(), e2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry) obj;
                if (navBackStackEntry5 == null) {
                    navBackStackEntry5 = NavBackStackEntry.a.b(NavBackStackEntry.r, this.a, e2, e2.j(bundle5), H(), this.r, null, null, 96, null);
                }
                cVar.addFirst(navBackStackEntry5);
            }
        }
        if (!cVar.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) cVar.first()).e();
        }
        while (!this.h.isEmpty() && (((NavBackStackEntry) this.h.last()).e() instanceof NavGraph)) {
            NavDestination e3 = ((NavBackStackEntry) this.h.last()).e();
            zq3.f(e3, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) e3).K(navDestination2.q(), false) != null) {
                break;
            } else {
                g0(this, (NavBackStackEntry) this.h.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntry6 = (NavBackStackEntry) this.h.o();
        if (navBackStackEntry6 == null) {
            navBackStackEntry6 = (NavBackStackEntry) cVar.o();
        }
        if (!zq3.c(navBackStackEntry6 != null ? navBackStackEntry6.e() : null, this.d)) {
            ListIterator listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                NavDestination e4 = ((NavBackStackEntry) previous).e();
                NavGraph navGraph2 = this.d;
                zq3.e(navGraph2);
                if (zq3.c(e4, navGraph2)) {
                    obj3 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry7 = (NavBackStackEntry) obj3;
            if (navBackStackEntry7 == null) {
                NavBackStackEntry.a aVar = NavBackStackEntry.r;
                Context context = this.a;
                NavGraph navGraph3 = this.d;
                zq3.e(navGraph3);
                NavGraph navGraph4 = this.d;
                zq3.e(navGraph4);
                navBackStackEntry7 = NavBackStackEntry.a.b(aVar, context, navGraph3, navGraph4.j(bundle2), H(), this.r, null, null, 96, null);
            }
            cVar.addFirst(navBackStackEntry7);
        }
        for (NavBackStackEntry navBackStackEntry8 : cVar) {
            Object obj4 = this.y.get(this.x.e(navBackStackEntry8.e().t()));
            if (obj4 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.t() + " should already be created").toString());
            }
            ((NavControllerNavigatorState) obj4).m(navBackStackEntry8);
        }
        this.h.addAll(cVar);
        this.h.add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry9 : kotlin.collections.i.G0(cVar, navBackStackEntry2)) {
            NavGraph u2 = navBackStackEntry9.e().u();
            if (u2 != null) {
                O(navBackStackEntry9, z(u2.q()));
            }
        }
    }

    private final boolean p0() {
        int i = 0;
        if (!this.g) {
            return false;
        }
        Activity activity = this.b;
        zq3.e(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        zq3.e(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        zq3.e(intArray);
        List D0 = kotlin.collections.d.D0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int intValue = ((Number) kotlin.collections.i.L(D0)).intValue();
        if (parcelableArrayList != null) {
        }
        if (D0.isEmpty()) {
            return false;
        }
        NavDestination x = x(G(), intValue);
        if (x instanceof NavGraph) {
            intValue = NavGraph.s.a((NavGraph) x).q();
        }
        NavDestination E = E();
        if (E == null || intValue != E.q()) {
            return false;
        }
        d s = s();
        Bundle a2 = le0.a(du8.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle != null) {
            a2.putAll(bundle);
        }
        s.e(a2);
        for (Object obj : D0) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.i.v();
            }
            s.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null);
            i = i2;
        }
        s.b().q();
        Activity activity2 = this.b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    static /* synthetic */ void q(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i & 8) != 0) {
            list = kotlin.collections.i.l();
        }
        navController.p(navDestination, bundle, navBackStackEntry, list);
    }

    private final boolean q0() {
        NavDestination E = E();
        zq3.e(E);
        int q = E.q();
        for (NavGraph u = E.u(); u != null; u = u.u()) {
            if (u.Q() != q) {
                Bundle bundle = new Bundle();
                Activity activity = this.b;
                if (activity != null) {
                    zq3.e(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.b;
                        zq3.e(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.b;
                            zq3.e(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            NavGraph navGraph = this.d;
                            zq3.e(navGraph);
                            Activity activity4 = this.b;
                            zq3.e(activity4);
                            Intent intent = activity4.getIntent();
                            zq3.g(intent, "activity!!.intent");
                            NavDestination.a y = navGraph.y(new e(intent));
                            if ((y != null ? y.c() : null) != null) {
                                bundle.putAll(y.b().j(y.c()));
                            }
                        }
                    }
                }
                d.g(new d(this), u.q(), null, 2, null).e(bundle).b().q();
                Activity activity5 = this.b;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            q = u.q();
        }
        return false;
    }

    private final boolean r(int i) {
        Iterator it2 = this.y.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).k(true);
        }
        boolean j0 = j0(i, null, p25.a(new ss2() { // from class: androidx.navigation.NavController$clearBackStackInternal$restored$1
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((i) obj);
                return ww8.a;
            }

            public final void invoke(i iVar) {
                zq3.h(iVar, "$this$navOptions");
                iVar.h(true);
            }
        }), null);
        Iterator it3 = this.y.values().iterator();
        while (it3.hasNext()) {
            ((NavControllerNavigatorState) it3.next()).k(false);
        }
        return j0 && c0(i, true, false);
    }

    private final boolean t() {
        while (!this.h.isEmpty() && (((NavBackStackEntry) this.h.last()).e() instanceof NavGraph)) {
            g0(this, (NavBackStackEntry) this.h.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.h.q();
        if (navBackStackEntry != null) {
            this.D.add(navBackStackEntry);
        }
        this.C++;
        s0();
        int i = this.C - 1;
        this.C = i;
        if (i == 0) {
            List<NavBackStackEntry> a1 = kotlin.collections.i.a1(this.D);
            this.D.clear();
            for (NavBackStackEntry navBackStackEntry2 : a1) {
                Iterator it2 = this.s.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    navBackStackEntry2.e();
                    navBackStackEntry2.c();
                    throw null;
                }
                this.F.tryEmit(navBackStackEntry2);
            }
            this.i.tryEmit(kotlin.collections.i.a1(this.h));
            this.k.tryEmit(h0());
        }
        return navBackStackEntry != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (F() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t0() {
        /*
            r2 = this;
            ce5 r0 = r2.v
            boolean r1 = r2.w
            if (r1 == 0) goto Le
            int r2 = r2.F()
            r1 = 1
            if (r2 <= r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.t0():void");
    }

    private final boolean u(List list, NavDestination navDestination, boolean z, final boolean z2) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final kotlin.collections.c cVar = new kotlin.collections.c();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Navigator navigator = (Navigator) it2.next();
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            b0(navigator, (NavBackStackEntry) this.h.last(), z2, new ss2() { // from class: androidx.navigation.NavController$executePopOperations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(NavBackStackEntry navBackStackEntry) {
                    zq3.h(navBackStackEntry, "entry");
                    Ref$BooleanRef.this.element = true;
                    ref$BooleanRef.element = true;
                    this.f0(navBackStackEntry, z2, cVar);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((NavBackStackEntry) obj);
                    return ww8.a;
                }
            });
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                for (NavDestination navDestination2 : kotlin.sequences.d.u(kotlin.sequences.d.f(navDestination, new ss2() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination navDestination3) {
                        zq3.h(navDestination3, "destination");
                        NavGraph u = navDestination3.u();
                        if (u == null || u.Q() != navDestination3.q()) {
                            return null;
                        }
                        return navDestination3.u();
                    }
                }), new ss2() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination navDestination3) {
                        Map map;
                        zq3.h(navDestination3, "destination");
                        map = NavController.this.o;
                        return Boolean.valueOf(!map.containsKey(Integer.valueOf(navDestination3.q())));
                    }
                })) {
                    Map map = this.o;
                    Integer valueOf = Integer.valueOf(navDestination2.q());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) cVar.o();
                    map.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.b() : null);
                }
            }
            if (!cVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) cVar.first();
                Iterator it3 = kotlin.sequences.d.u(kotlin.sequences.d.f(w(navBackStackEntryState2.a()), new ss2() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination navDestination3) {
                        zq3.h(navDestination3, "destination");
                        NavGraph u = navDestination3.u();
                        if (u == null || u.Q() != navDestination3.q()) {
                            return null;
                        }
                        return navDestination3.u();
                    }
                }), new ss2() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination navDestination3) {
                        Map map2;
                        zq3.h(navDestination3, "destination");
                        map2 = NavController.this.o;
                        return Boolean.valueOf(!map2.containsKey(Integer.valueOf(navDestination3.q())));
                    }
                }).iterator();
                while (it3.hasNext()) {
                    this.o.put(Integer.valueOf(((NavDestination) it3.next()).q()), navBackStackEntryState2.b());
                }
                this.p.put(navBackStackEntryState2.b(), cVar);
            }
        }
        t0();
        return ref$BooleanRef.element;
    }

    private final boolean v(final List list, final Bundle bundle, h hVar, Navigator.a aVar) {
        NavBackStackEntry navBackStackEntry;
        NavDestination e;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).e() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list2 = (List) kotlin.collections.i.y0(arrayList);
            if (zq3.c((list2 == null || (navBackStackEntry = (NavBackStackEntry) kotlin.collections.i.w0(list2)) == null || (e = navBackStackEntry.e()) == null) ? null : e.t(), navBackStackEntry2.e().t())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(kotlin.collections.i.r(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List list3 : arrayList) {
            Navigator e2 = this.x.e(((NavBackStackEntry) kotlin.collections.i.k0(list3)).e().t());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            U(e2, list3, hVar, aVar, new ss2() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> l;
                    zq3.h(navBackStackEntry3, "entry");
                    Ref$BooleanRef.this.element = true;
                    int indexOf = list.indexOf(navBackStackEntry3);
                    if (indexOf != -1) {
                        int i = indexOf + 1;
                        l = list.subList(ref$IntRef.element, i);
                        ref$IntRef.element = i;
                    } else {
                        l = kotlin.collections.i.l();
                    }
                    this.p(navBackStackEntry3.e(), bundle, navBackStackEntry3, l);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((NavBackStackEntry) obj2);
                    return ww8.a;
                }
            });
        }
        return ref$BooleanRef.element;
    }

    private final NavDestination x(NavDestination navDestination, int i) {
        NavGraph u;
        if (navDestination.q() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            u = (NavGraph) navDestination;
        } else {
            u = navDestination.u();
            zq3.e(u);
        }
        return u.J(i);
    }

    private final String y(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this.d;
                zq3.e(navGraph3);
                if (navGraph3.q() == i2) {
                    navDestination = this.d;
                }
            } else {
                zq3.e(navGraph2);
                navDestination = navGraph2.J(i2);
            }
            if (navDestination == null) {
                return NavDestination.j.b(this.a, i2);
            }
            if (i != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    zq3.e(navGraph);
                    if (!(navGraph.J(navGraph.Q()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.J(navGraph.Q());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    public final NavBackStackEntry A(String str) {
        Object obj;
        zq3.h(str, "route");
        kotlin.collections.c cVar = this.h;
        ListIterator<E> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry.e().x(str, navBackStackEntry.c())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + str + " is on the NavController's back stack. The current destination is " + E()).toString());
    }

    public final Context B() {
        return this.a;
    }

    public NavBackStackEntry C() {
        return (NavBackStackEntry) this.h.q();
    }

    public final Flow D() {
        return this.G;
    }

    public NavDestination E() {
        NavBackStackEntry C = C();
        if (C != null) {
            return C.e();
        }
        return null;
    }

    public NavGraph G() {
        NavGraph navGraph = this.d;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        zq3.f(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    public final Lifecycle.State H() {
        return this.q == null ? Lifecycle.State.CREATED : this.t;
    }

    public k I() {
        return this.x;
    }

    public final StateFlow J() {
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.K(android.content.Intent):boolean");
    }

    public void P(e eVar, h hVar, Navigator.a aVar) {
        zq3.h(eVar, "request");
        NavGraph navGraph = this.d;
        if (navGraph == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + eVar + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        zq3.e(navGraph);
        NavDestination.a y = navGraph.y(eVar);
        if (y == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + eVar + " cannot be found in the navigation graph " + this.d);
        }
        Bundle j = y.b().j(y.c());
        if (j == null) {
            j = new Bundle();
        }
        NavDestination b2 = y.b();
        Intent intent = new Intent();
        intent.setDataAndType(eVar.c(), eVar.b());
        intent.setAction(eVar.a());
        j.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        Q(b2, j, hVar, aVar);
    }

    public final void R(String str, ss2 ss2Var) {
        zq3.h(str, "route");
        zq3.h(ss2Var, "builder");
        T(this, str, p25.a(ss2Var), null, 4, null);
    }

    public final void S(String str, h hVar, Navigator.a aVar) {
        zq3.h(str, "route");
        e.a.C0098a c0098a = e.a.d;
        Uri parse = Uri.parse(NavDestination.j.a(str));
        zq3.d(parse, "Uri.parse(this)");
        P(c0098a.a(parse).a(), hVar, aVar);
    }

    public boolean V() {
        Intent intent;
        if (F() != 1) {
            return X();
        }
        Activity activity = this.b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) != null ? p0() : q0();
    }

    public boolean X() {
        if (this.h.isEmpty()) {
            return false;
        }
        NavDestination E = E();
        zq3.e(E);
        return Y(E.q(), true);
    }

    public boolean Y(int i, boolean z) {
        return Z(i, z, false);
    }

    public boolean Z(int i, boolean z, boolean z2) {
        return c0(i, z, z2) && t();
    }

    public final void a0(NavBackStackEntry navBackStackEntry, qs2 qs2Var) {
        zq3.h(navBackStackEntry, "popUpTo");
        zq3.h(qs2Var, "onComplete");
        int indexOf = this.h.indexOf(navBackStackEntry);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != this.h.size()) {
            c0(((NavBackStackEntry) this.h.get(i)).e().q(), true, false);
        }
        g0(this, navBackStackEntry, false, null, 6, null);
        qs2Var.mo865invoke();
        t0();
        t();
    }

    public final List h0() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.y.values().iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it2.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.g().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.i.B(arrayList, arrayList2);
        }
        kotlin.collections.c cVar = this.h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : cVar) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.g().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        kotlin.collections.i.B(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((NavBackStackEntry) obj3).e() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public void i0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.o.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    Map map = this.p;
                    zq3.g(str, "id");
                    kotlin.collections.c cVar = new kotlin.collections.c(parcelableArray.length);
                    Iterator a2 = no.a(parcelableArray);
                    while (a2.hasNext()) {
                        Parcelable parcelable = (Parcelable) a2.next();
                        zq3.f(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        cVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, cVar);
                }
            }
        }
        this.g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle k0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.x.f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle i = ((Navigator) entry.getValue()).i();
            if (i != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.h.size()];
            Iterator<E> it2 = this.h.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState((NavBackStackEntry) it2.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i3 = 0;
            for (Map.Entry entry2 : this.o.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i3] = intValue;
                arrayList2.add(str2);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.p.entrySet()) {
                String str3 = (String) entry3.getKey();
                kotlin.collections.c cVar = (kotlin.collections.c) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[cVar.size()];
                int i4 = 0;
                for (Object obj : cVar) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        kotlin.collections.i.v();
                    }
                    parcelableArr2[i4] = (NavBackStackEntryState) obj;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle;
    }

    public void l0(NavGraph navGraph) {
        zq3.h(navGraph, "graph");
        m0(navGraph, null);
    }

    public void m0(NavGraph navGraph, Bundle bundle) {
        zq3.h(navGraph, "graph");
        if (!zq3.c(this.d, navGraph)) {
            NavGraph navGraph2 = this.d;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.o.keySet())) {
                    zq3.g(num, "id");
                    r(num.intValue());
                }
                e0(this, navGraph2.q(), true, false, 4, null);
            }
            this.d = navGraph;
            W(bundle);
            return;
        }
        int m = navGraph.N().m();
        for (int i = 0; i < m; i++) {
            NavDestination navDestination = (NavDestination) navGraph.N().n(i);
            NavGraph navGraph3 = this.d;
            zq3.e(navGraph3);
            int h = navGraph3.N().h(i);
            NavGraph navGraph4 = this.d;
            zq3.e(navGraph4);
            navGraph4.N().l(h, navDestination);
        }
        for (NavBackStackEntry navBackStackEntry : this.h) {
            List<NavDestination> S = kotlin.collections.i.S(kotlin.sequences.d.w(NavDestination.j.c(navBackStackEntry.e())));
            NavDestination navDestination2 = this.d;
            zq3.e(navDestination2);
            for (NavDestination navDestination3 : S) {
                if (!zq3.c(navDestination3, this.d) || !zq3.c(navDestination2, navGraph)) {
                    if (navDestination2 instanceof NavGraph) {
                        navDestination2 = ((NavGraph) navDestination2).J(navDestination3.q());
                        zq3.e(navDestination2);
                    }
                }
            }
            navBackStackEntry.j(navDestination2);
        }
    }

    public void n0(d44 d44Var) {
        Lifecycle lifecycle;
        zq3.h(d44Var, "owner");
        if (zq3.c(d44Var, this.q)) {
            return;
        }
        d44 d44Var2 = this.q;
        if (d44Var2 != null && (lifecycle = d44Var2.getLifecycle()) != null) {
            lifecycle.d(this.u);
        }
        this.q = d44Var;
        d44Var.getLifecycle().a(this.u);
    }

    public void o0(u uVar) {
        zq3.h(uVar, "viewModelStore");
        c cVar = this.r;
        c.b bVar = c.b;
        if (zq3.c(cVar, bVar.a(uVar))) {
            return;
        }
        if (!this.h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.r = bVar.a(uVar);
    }

    public final NavBackStackEntry r0(NavBackStackEntry navBackStackEntry) {
        zq3.h(navBackStackEntry, "child");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.m.remove(navBackStackEntry);
        if (navBackStackEntry2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.n.get(navBackStackEntry2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.y.get(this.x.e(navBackStackEntry2.e().t()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.e(navBackStackEntry2);
            }
            this.n.remove(navBackStackEntry2);
        }
        return navBackStackEntry2;
    }

    public d s() {
        return new d(this);
    }

    public final void s0() {
        AtomicInteger atomicInteger;
        StateFlow c;
        Set set;
        List<NavBackStackEntry> a1 = kotlin.collections.i.a1(this.h);
        if (a1.isEmpty()) {
            return;
        }
        NavDestination e = ((NavBackStackEntry) kotlin.collections.i.w0(a1)).e();
        ArrayList arrayList = new ArrayList();
        if (e instanceof hl2) {
            Iterator it2 = kotlin.collections.i.H0(a1).iterator();
            while (it2.hasNext()) {
                NavDestination e2 = ((NavBackStackEntry) it2.next()).e();
                arrayList.add(e2);
                if (!(e2 instanceof hl2) && !(e2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : kotlin.collections.i.H0(a1)) {
            Lifecycle.State g = navBackStackEntry.g();
            NavDestination e3 = navBackStackEntry.e();
            if (e != null && e3.q() == e.q()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (g != state) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.y.get(I().e(navBackStackEntry.e().t()));
                    if (zq3.c((navControllerNavigatorState == null || (c = navControllerNavigatorState.c()) == null || (set = (Set) c.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.n.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        hashMap.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination = (NavDestination) kotlin.collections.i.m0(arrayList);
                if (navDestination != null && navDestination.q() == e3.q()) {
                    kotlin.collections.i.J(arrayList);
                }
                e = e.u();
            } else if (arrayList.isEmpty() || e3.q() != ((NavDestination) kotlin.collections.i.k0(arrayList)).q()) {
                navBackStackEntry.k(Lifecycle.State.CREATED);
            } else {
                NavDestination navDestination2 = (NavDestination) kotlin.collections.i.J(arrayList);
                if (g == Lifecycle.State.RESUMED) {
                    navBackStackEntry.k(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (g != state2) {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                NavGraph u = navDestination2.u();
                if (u != null && !arrayList.contains(u)) {
                    arrayList.add(u);
                }
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : a1) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.k(state3);
            } else {
                navBackStackEntry2.l();
            }
        }
    }

    public final NavDestination w(int i) {
        NavDestination navDestination;
        NavGraph navGraph = this.d;
        if (navGraph == null) {
            return null;
        }
        zq3.e(navGraph);
        if (navGraph.q() == i) {
            return this.d;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.h.q();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.e()) == null) {
            navDestination = this.d;
            zq3.e(navDestination);
        }
        return x(navDestination, i);
    }

    public NavBackStackEntry z(int i) {
        Object obj;
        kotlin.collections.c cVar = this.h;
        ListIterator<E> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).e().q() == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + E()).toString());
    }
}
