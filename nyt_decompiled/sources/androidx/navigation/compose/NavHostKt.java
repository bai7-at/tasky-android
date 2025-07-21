package androidx.navigation.compose;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigator;
import androidx.navigation.compose.a;
import androidx.navigation.compose.b;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import defpackage.cc7;
import defpackage.d44;
import defpackage.di;
import defpackage.ex0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.kt2;
import defpackage.m25;
import defpackage.ms1;
import defpackage.n25;
import defpackage.ns1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.u87;
import defpackage.uh;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class NavHostKt {
    public static final void a(final n25 n25Var, final NavGraph navGraph, Modifier modifier, Alignment alignment, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, Composer composer, final int i, final int i2) {
        final ss2 ss2Var5;
        int i3;
        final ss2 ss2Var6;
        ss2 ss2Var7;
        c cVar;
        int i4;
        Composer h = composer.h(-1818191915);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        final Alignment e = (i2 & 8) != 0 ? Alignment.a.e() : alignment;
        final ss2 ss2Var8 = (i2 & 16) != 0 ? new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$8
            @Override // defpackage.ss2
            public final androidx.compose.animation.c invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                return EnterExitTransitionKt.o(di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), 0.0f, 2, null);
            }
        } : ss2Var;
        final ss2 ss2Var9 = (i2 & 32) != 0 ? new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$9
            @Override // defpackage.ss2
            public final e invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                return EnterExitTransitionKt.q(di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), 0.0f, 2, null);
            }
        } : ss2Var2;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            ss2Var5 = ss2Var8;
        } else {
            ss2Var5 = ss2Var3;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i3 &= -29360129;
            ss2Var6 = ss2Var9;
        } else {
            ss2Var6 = ss2Var4;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1818191915, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        final d44 d44Var = (d44) h.m(AndroidCompositionLocals_androidKt.i());
        sa9 a = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
        if (a == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
        }
        n25Var.o0(a.getViewModelStore());
        n25Var.l0(navGraph);
        Navigator e2 = n25Var.I().e("composable");
        final b bVar = e2 instanceof b ? (b) e2 : null;
        if (bVar == null) {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            cc7 k = h.k();
            if (k == null) {
                return;
            }
            final ss2 ss2Var10 = ss2Var5;
            final ss2 ss2Var11 = ss2Var6;
            k.a(new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    NavHostKt.a(n25.this, navGraph, modifier2, e, ss2Var8, ss2Var9, ss2Var10, ss2Var11, composer2, gt6.a(i | 1), i2);
                }
            });
            return;
        }
        BackHandlerKt.a(d(y.b(bVar.m(), null, h, 8, 1)).size() > 1, new qs2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$10
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m121invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m121invoke() {
                n25.this.X();
            }
        }, h, 0, 0);
        py1.a(d44Var, new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$11

            public static final class a implements ms1 {
                @Override // defpackage.ms1
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                n25.this.n0(d44Var);
                return new a();
            }
        }, h, 8);
        final u87 a2 = SaveableStateHolderKt.a(h, 0);
        final x08 b = y.b(n25Var.J(), null, h, 8, 1);
        h.z(-492369756);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = y.d(new qs2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final List mo865invoke() {
                    List e3;
                    e3 = NavHostKt.e(x08.this);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : e3) {
                        if (zq3.c(((NavBackStackEntry) obj).e().t(), "composable")) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
            });
            h.q(A);
        }
        h.R();
        final x08 x08Var = (x08) A;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) i.y0(f(x08Var));
        h.z(-492369756);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = new LinkedHashMap();
            h.q(A2);
        }
        h.R();
        final Map map = (Map) A2;
        h.z(1822177954);
        if (navBackStackEntry != null) {
            h.z(1618982084);
            boolean S = h.S(bVar) | h.S(ss2Var5) | h.S(ss2Var8);
            Object A3 = h.A();
            if (S || A3 == aVar.a()) {
                A3 = new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final androidx.compose.animation.c invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                        androidx.compose.animation.c m;
                        androidx.compose.animation.c o;
                        NavDestination e3 = ((NavBackStackEntry) animatedContentTransitionScope.a()).e();
                        zq3.f(e3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        b.C0097b c0097b = (b.C0097b) e3;
                        androidx.compose.animation.c cVar2 = null;
                        if (((Boolean) b.this.n().getValue()).booleanValue()) {
                            Iterator it2 = NavDestination.j.c(c0097b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                o = NavHostKt.o((NavDestination) it2.next(), animatedContentTransitionScope);
                                if (o != null) {
                                    cVar2 = o;
                                    break;
                                }
                            }
                            return cVar2 == null ? (androidx.compose.animation.c) ss2Var5.invoke(animatedContentTransitionScope) : cVar2;
                        }
                        Iterator it3 = NavDestination.j.c(c0097b).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            m = NavHostKt.m((NavDestination) it3.next(), animatedContentTransitionScope);
                            if (m != null) {
                                cVar2 = m;
                                break;
                            }
                        }
                        return cVar2 == null ? (androidx.compose.animation.c) ss2Var8.invoke(animatedContentTransitionScope) : cVar2;
                    }
                };
                h.q(A3);
            }
            h.R();
            final ss2 ss2Var12 = (ss2) A3;
            h.z(1618982084);
            boolean S2 = h.S(bVar) | h.S(ss2Var6) | h.S(ss2Var9);
            Object A4 = h.A();
            if (S2 || A4 == aVar.a()) {
                A4 = new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final e invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                        e n;
                        e p;
                        NavDestination e3 = ((NavBackStackEntry) animatedContentTransitionScope.d()).e();
                        zq3.f(e3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        b.C0097b c0097b = (b.C0097b) e3;
                        e eVar = null;
                        if (((Boolean) b.this.n().getValue()).booleanValue()) {
                            Iterator it2 = NavDestination.j.c(c0097b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                p = NavHostKt.p((NavDestination) it2.next(), animatedContentTransitionScope);
                                if (p != null) {
                                    eVar = p;
                                    break;
                                }
                            }
                            return eVar == null ? (e) ss2Var6.invoke(animatedContentTransitionScope) : eVar;
                        }
                        Iterator it3 = NavDestination.j.c(c0097b).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            n = NavHostKt.n((NavDestination) it3.next(), animatedContentTransitionScope);
                            if (n != null) {
                                eVar = n;
                                break;
                            }
                        }
                        return eVar == null ? (e) ss2Var9.invoke(animatedContentTransitionScope) : eVar;
                    }
                };
                h.q(A4);
            }
            h.R();
            final ss2 ss2Var13 = (ss2) A4;
            ss2Var7 = ss2Var6;
            i4 = 0;
            Transition f = TransitionKt.f(navBackStackEntry, "entry", h, 56, 0);
            final b bVar2 = bVar;
            ss2 ss2Var14 = new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ex0 invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                    List f2;
                    float f3;
                    f2 = NavHostKt.f(x08Var);
                    if (!f2.contains(animatedContentTransitionScope.d())) {
                        return AnimatedContentKt.e(androidx.compose.animation.c.a.a(), e.a.a());
                    }
                    Float f4 = map.get(((NavBackStackEntry) animatedContentTransitionScope.d()).f());
                    if (f4 != null) {
                        f3 = f4.floatValue();
                    } else {
                        map.put(((NavBackStackEntry) animatedContentTransitionScope.d()).f(), Float.valueOf(0.0f));
                        f3 = 0.0f;
                    }
                    if (!zq3.c(((NavBackStackEntry) animatedContentTransitionScope.a()).f(), ((NavBackStackEntry) animatedContentTransitionScope.d()).f())) {
                        f3 = ((Boolean) bVar2.n().getValue()).booleanValue() ? f3 - 1.0f : f3 + 1.0f;
                    }
                    float f5 = f3;
                    map.put(((NavBackStackEntry) animatedContentTransitionScope.a()).f(), Float.valueOf(f5));
                    return new ex0((androidx.compose.animation.c) ss2Var12.invoke(animatedContentTransitionScope), (e) ss2Var13.invoke(animatedContentTransitionScope), f5, null, 8, null);
                }
            };
            NavHostKt$NavHost$13 navHostKt$NavHost$13 = new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$13
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                    return navBackStackEntry2.f();
                }
            };
            yr0 b2 = zr0.b(h, -1440061047, true, new kt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$14
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // defpackage.kt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }

                public final void invoke(final uh uhVar, NavBackStackEntry navBackStackEntry2, Composer composer2, int i5) {
                    List f2;
                    Object obj;
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-1440061047, i5, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:301)");
                    }
                    f2 = NavHostKt.f(x08Var);
                    ListIterator listIterator = f2.listIterator(f2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        } else {
                            obj = listIterator.previous();
                            if (zq3.c(navBackStackEntry2, (NavBackStackEntry) obj)) {
                                break;
                            }
                        }
                    }
                    final NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
                    if (navBackStackEntry3 != null) {
                        NavBackStackEntryProviderKt.a(navBackStackEntry3, u87.this, zr0.b(composer2, -1425390790, true, new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$14.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-1425390790, i6, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:306)");
                                }
                                NavDestination e3 = NavBackStackEntry.this.e();
                                zq3.f(e3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                ((b.C0097b) e3).H().invoke(uhVar, NavBackStackEntry.this, composer3, 72);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, 456);
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            });
            int i5 = ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 221184 | (i3 & 7168);
            cVar = null;
            final b bVar3 = bVar;
            AnimatedContentKt.a(f, modifier2, ss2Var14, e, navHostKt$NavHost$13, b2, h, i5, 0);
            py1.e(f.h(), f.n(), new NavHostKt$NavHost$15(f, map, x08Var, bVar3, null), h, 584);
            Boolean bool = Boolean.TRUE;
            h.z(511388516);
            boolean S3 = h.S(x08Var) | h.S(bVar3);
            Object A5 = h.A();
            if (S3 || A5 == aVar.a()) {
                A5 = new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16$1

                    public static final class a implements ms1 {
                        final /* synthetic */ x08 a;
                        final /* synthetic */ b b;

                        public a(x08 x08Var, b bVar) {
                            this.a = x08Var;
                            this.b = bVar;
                        }

                        @Override // defpackage.ms1
                        public void dispose() {
                            List f;
                            f = NavHostKt.f(this.a);
                            Iterator it2 = f.iterator();
                            while (it2.hasNext()) {
                                this.b.o((NavBackStackEntry) it2.next());
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ms1 invoke(ns1 ns1Var) {
                        return new a(x08.this, bVar3);
                    }
                };
                h.q(A5);
            }
            h.R();
            py1.a(bool, (ss2) A5, h, 6);
        } else {
            ss2Var7 = ss2Var6;
            cVar = null;
            i4 = 0;
        }
        h.R();
        Navigator e3 = n25Var.I().e("dialog");
        c cVar2 = e3 instanceof c ? (c) e3 : cVar;
        if (cVar2 == null) {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            cc7 k2 = h.k();
            if (k2 == null) {
                return;
            }
            final ss2 ss2Var15 = ss2Var5;
            final ss2 ss2Var16 = ss2Var7;
            k2.a(new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    NavHostKt.a(n25.this, navGraph, modifier2, e, ss2Var8, ss2Var9, ss2Var15, ss2Var16, composer2, gt6.a(i | 1), i2);
                }
            });
            return;
        }
        DialogHostKt.a(cVar2, h, i4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k3 = h.k();
        if (k3 == null) {
            return;
        }
        final ss2 ss2Var17 = ss2Var5;
        final ss2 ss2Var18 = ss2Var7;
        k3.a(new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$17
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i6) {
                NavHostKt.a(n25.this, navGraph, modifier2, e, ss2Var8, ss2Var9, ss2Var17, ss2Var18, composer2, gt6.a(i | 1), i2);
            }
        });
    }

    public static final void b(final n25 n25Var, final String str, Modifier modifier, Alignment alignment, String str2, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, final ss2 ss2Var5, Composer composer, final int i, final int i2) {
        ss2 ss2Var6;
        int i3;
        ss2 ss2Var7;
        Composer h = composer.h(410432995);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        final Alignment e = (i2 & 8) != 0 ? Alignment.a.e() : alignment;
        final String str3 = (i2 & 16) != 0 ? null : str2;
        final ss2 ss2Var8 = (i2 & 32) != 0 ? new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$3
            @Override // defpackage.ss2
            public final androidx.compose.animation.c invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                return EnterExitTransitionKt.o(di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), 0.0f, 2, null);
            }
        } : ss2Var;
        final ss2 ss2Var9 = (i2 & 64) != 0 ? new ss2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4
            @Override // defpackage.ss2
            public final e invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                return EnterExitTransitionKt.q(di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), 0.0f, 2, null);
            }
        } : ss2Var2;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            ss2Var6 = ss2Var8;
        } else {
            ss2Var6 = ss2Var3;
            i3 = i;
        }
        if ((i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            i3 &= -234881025;
            ss2Var7 = ss2Var9;
        } else {
            ss2Var7 = ss2Var4;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(410432995, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        h.z(1618982084);
        boolean S = h.S(str3) | h.S(str) | h.S(ss2Var5);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            m25 m25Var = new m25(n25Var.I(), str, str3);
            ss2Var5.invoke(m25Var);
            A = m25Var.d();
            h.q(A);
        }
        h.R();
        int i4 = (i3 & 896) | 72 | (i3 & 7168);
        int i5 = i3 >> 3;
        a(n25Var, (NavGraph) A, modifier2, e, ss2Var8, ss2Var9, ss2Var6, ss2Var7, h, i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        final ss2 ss2Var10 = ss2Var6;
        final ss2 ss2Var11 = ss2Var7;
        k.a(new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i6) {
                NavHostKt.b(n25.this, str, modifier2, e, str3, ss2Var8, ss2Var9, ss2Var10, ss2Var11, ss2Var5, composer2, gt6.a(i | 1), i2);
            }
        });
    }

    public static final /* synthetic */ void c(final n25 n25Var, final String str, Modifier modifier, String str2, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Composer h = composer.h(141827520);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        final String str3 = (i2 & 8) != 0 ? null : str2;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(141827520, i, -1, "androidx.navigation.compose.NavHost (NavHost.kt:80)");
        }
        h.z(1618982084);
        boolean S = h.S(str3) | h.S(str) | h.S(ss2Var);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            m25 m25Var = new m25(n25Var.I(), str, str3);
            ss2Var.invoke(m25Var);
            A = m25Var.d();
            h.q(A);
        }
        h.R();
        a(n25Var, (NavGraph) A, modifier2, null, null, null, null, null, h, (i & 896) | 72, 248);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.navigation.compose.NavHostKt$NavHost$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                NavHostKt.c(n25.this, str, modifier2, str3, ss2Var, composer2, gt6.a(i | 1), i2);
            }
        });
    }

    private static final List d(x08 x08Var) {
        return (List) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(x08 x08Var) {
        return (List) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(x08 x08Var) {
        return (List) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.c m(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ss2 Y;
        if (navDestination instanceof b.C0097b) {
            ss2 I = ((b.C0097b) navDestination).I();
            if (I != null) {
                return (androidx.compose.animation.c) I.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof a.C0096a) || (Y = ((a.C0096a) navDestination).Y()) == null) {
            return null;
        }
        return (androidx.compose.animation.c) Y.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e n(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ss2 Z;
        if (navDestination instanceof b.C0097b) {
            ss2 J = ((b.C0097b) navDestination).J();
            if (J != null) {
                return (e) J.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof a.C0096a) || (Z = ((a.C0096a) navDestination).Z()) == null) {
            return null;
        }
        return (e) Z.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.c o(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ss2 a0;
        if (navDestination instanceof b.C0097b) {
            ss2 K = ((b.C0097b) navDestination).K();
            if (K != null) {
                return (androidx.compose.animation.c) K.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof a.C0096a) || (a0 = ((a.C0096a) navDestination).a0()) == null) {
            return null;
        }
        return (androidx.compose.animation.c) a0.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e p(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        ss2 b0;
        if (navDestination instanceof b.C0097b) {
            ss2 L = ((b.C0097b) navDestination).L();
            if (L != null) {
                return (e) L.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof a.C0096a) || (b0 = ((a.C0096a) navDestination).b0()) == null) {
            return null;
        }
        return (e) b0.invoke(animatedContentTransitionScope);
    }
}
