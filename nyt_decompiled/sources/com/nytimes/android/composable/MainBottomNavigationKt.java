package com.nytimes.android.composable;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.j;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.NavHostControllerKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.ag4;
import defpackage.ak7;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.de4;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fu1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.mt2;
import defpackage.n25;
import defpackage.n37;
import defpackage.nn0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s25;
import defpackage.ss2;
import defpackage.uv0;
import defpackage.uv7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class MainBottomNavigationKt {
    public static final void a(final List list, final n25 n25Var, final it2 it2Var, final it2 it2Var2, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(list, "mainTabFactories");
        zq3.h(n25Var, "navController");
        zq3.h(it2Var, "onTabSelected");
        zq3.h(it2Var2, "onTabReselected");
        zq3.h(ss2Var, "sendUpdateBadgeImpression");
        Composer h = composer.h(-477863226);
        if (b.G()) {
            b.S(-477863226, i, -1, "com.nytimes.android.composable.MainBottomNavigation (MainBottomNavigation.kt:63)");
        }
        BottomNavigationKt.a(null, eb5.Companion.a(h, 8).a(), ColorsKt.b(uv7.a.a(h, uv7.b), h, 0), 0.0f, zr0.b(h, -1951021842, true, new it2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final NavBackStackEntry b(x08 x08Var) {
                return (NavBackStackEntry) x08Var.getValue();
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(m37 m37Var, Composer composer2, int i2) {
                final boolean z;
                ak7 c;
                final m37 m37Var2 = m37Var;
                Composer composer3 = composer2;
                zq3.h(m37Var2, "$this$BottomNavigation");
                int i3 = (i2 & 14) == 0 ? i2 | (composer3.S(m37Var2) ? 4 : 2) : i2;
                if ((i3 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1951021842, i3, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous> (MainBottomNavigation.kt:68)");
                }
                NavBackStackEntry b = b(NavHostControllerKt.d(n25.this, composer3, 8));
                NavDestination e = b != null ? b.e() : null;
                composer3.z(773894976);
                composer3.z(-492369756);
                Object A = composer2.A();
                if (A == Composer.a.a()) {
                    e eVar = new e(py1.j(EmptyCoroutineContext.a, composer3));
                    composer3.q(eVar);
                    A = eVar;
                }
                composer2.R();
                final CoroutineScope a = ((e) A).a();
                composer2.R();
                final Context context = (Context) composer3.m(AndroidCompositionLocals_androidKt.g());
                List<de4> list2 = list;
                it2 it2Var3 = it2Var2;
                it2 it2Var4 = it2Var;
                final ss2 ss2Var2 = ss2Var;
                for (final de4 de4Var : list2) {
                    if (e != null && (c = NavDestination.j.c(e)) != null) {
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            if (zq3.c(((NavDestination) it2.next()).v(), de4Var.f().c())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    composer3.z(1005787500);
                    Object A2 = composer2.A();
                    if (A2 == Composer.a.a()) {
                        final boolean z2 = z;
                        final it2 it2Var5 = it2Var3;
                        final it2 it2Var6 = it2Var4;
                        A2 = new qs2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$onClick$1$1

                            @fc1(c = "com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$onClick$1$1$1", f = "MainBottomNavigation.kt", l = {80, 82}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$onClick$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ boolean $isSelected;
                                final /* synthetic */ de4 $mainTabFactory;
                                final /* synthetic */ it2 $onTabReselected;
                                final /* synthetic */ it2 $onTabSelected;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(boolean z, it2 it2Var, Context context, de4 de4Var, it2 it2Var2, by0 by0Var) {
                                    super(2, by0Var);
                                    this.$isSelected = z;
                                    this.$onTabReselected = it2Var;
                                    this.$context = context;
                                    this.$mainTabFactory = de4Var;
                                    this.$onTabSelected = it2Var2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final by0 create(Object obj, by0 by0Var) {
                                    return new AnonymousClass1(this.$isSelected, this.$onTabReselected, this.$context, this.$mainTabFactory, this.$onTabSelected, by0Var);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        if (this.$isSelected) {
                                            it2 it2Var = this.$onTabReselected;
                                            Context context = this.$context;
                                            de4 de4Var = this.$mainTabFactory;
                                            this.label = 1;
                                            if (it2Var.invoke(context, de4Var, this) == h) {
                                                return h;
                                            }
                                        } else {
                                            it2 it2Var2 = this.$onTabSelected;
                                            Context context2 = this.$context;
                                            de4 de4Var2 = this.$mainTabFactory;
                                            this.label = 2;
                                            if (it2Var2.invoke(context2, de4Var2, this) == h) {
                                                return h;
                                            }
                                        }
                                    } else {
                                        if (i != 1 && i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        f.b(obj);
                                    }
                                    return ww8.a;
                                }

                                @Override // defpackage.gt2
                                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m317invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m317invoke() {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(z2, it2Var5, context, de4Var, it2Var6, null), 3, null);
                            }
                        };
                        composer3.q(A2);
                    }
                    final qs2 qs2Var = (qs2) A2;
                    composer2.R();
                    BottomNavigationKt.c(m37Var, z, qs2Var, zr0.b(composer3, -1084544774, true, new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 11) == 2 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1084544774, i4, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous>.<anonymous>.<anonymous> (MainBottomNavigation.kt:114)");
                            }
                            MainBottomNavigationKt.b(m37.this, de4Var, z, ss2Var2, composer4, 64);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), ComposablePositionsKt.c(Modifier.a, de4Var.f().c(), zr0.b(composer3, -1700304070, true, new mt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(5);
                        }

                        public final void b(Modifier modifier, long j, final qs2 qs2Var2, Composer composer4, int i4) {
                            int i5;
                            zq3.h(modifier, "modifier");
                            zq3.h(qs2Var2, "onClickClose");
                            if ((i4 & 14) == 0) {
                                i5 = (composer4.S(modifier) ? 4 : 2) | i4;
                            } else {
                                i5 = i4;
                            }
                            if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                i5 |= composer4.e(j) ? 32 : 16;
                            }
                            if ((i4 & 896) == 0) {
                                i5 |= composer4.C(qs2Var2) ? 256 : 128;
                            }
                            if ((i5 & 5851) == 1170 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1700304070, i5, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous>.<anonymous>.<anonymous> (MainBottomNavigation.kt:91)");
                            }
                            Modifier o = SizeKt.o(modifier, j);
                            final boolean z3 = z;
                            final qs2 qs2Var3 = qs2Var;
                            final de4 de4Var2 = de4Var;
                            final ss2 ss2Var3 = ss2Var2;
                            composer4.z(693286680);
                            rg4 a2 = m.a(Arrangement.a.f(), Alignment.a.l(), composer4, 0);
                            composer4.z(-1323940314);
                            int a3 = cs0.a(composer4, 0);
                            et0 o2 = composer4.o();
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a4 = companion.a();
                            it2 c2 = LayoutKt.c(o);
                            if (composer4.j() == null) {
                                cs0.c();
                            }
                            composer4.G();
                            if (composer4.f()) {
                                composer4.D(a4);
                            } else {
                                composer4.p();
                            }
                            Composer a5 = Updater.a(composer4);
                            Updater.c(a5, a2, companion.e());
                            Updater.c(a5, o2, companion.g());
                            gt2 b2 = companion.b();
                            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                                a5.q(Integer.valueOf(a3));
                                a5.v(Integer.valueOf(a3), b2);
                            }
                            c2.invoke(ju7.a(ju7.b(composer4)), composer4, 0);
                            composer4.z(2058660585);
                            final n37 n37Var = n37.a;
                            Modifier.a aVar = Modifier.a;
                            ag4 ag4Var = ag4.a;
                            int i6 = ag4.b;
                            long j2 = ag4Var.a(composer4, i6).j();
                            long r = nn0.r(ag4Var.a(composer4, i6).j(), uv0.a.d(composer4, uv0.b), 0.0f, 0.0f, 0.0f, 14, null);
                            composer4.z(-1571585393);
                            boolean z4 = (i5 & 896) == 256;
                            Object A3 = composer4.A();
                            if (z4 || A3 == Composer.a.a()) {
                                A3 = new qs2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m316invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m316invoke() {
                                        qs2.this.mo865invoke();
                                        qs2Var2.mo865invoke();
                                    }
                                };
                                composer4.q(A3);
                            }
                            composer4.R();
                            BottomNavigationKt.c(n37Var, z3, (qs2) A3, zr0.b(composer4, -961088363, true, new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$1$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(Composer composer5, int i7) {
                                    if ((i7 & 11) == 2 && composer5.i()) {
                                        composer5.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(-961088363, i7, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainBottomNavigation.kt:95)");
                                    }
                                    MainBottomNavigationKt.b(m37.this, de4Var2, z3, ss2Var3, composer5, 64);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), aVar, false, zr0.b(composer4, 169185330, true, new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$1$1$3
                                {
                                    super(2);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(Composer composer5, int i7) {
                                    if ((i7 & 11) == 2 && composer5.i()) {
                                        composer5.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(169185330, i7, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainBottomNavigation.kt:101)");
                                    }
                                    MainBottomNavigationKt.d(de4.this, composer5, 8);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), false, null, j2, r, composer4, 1600518, 0, 208);
                            composer4.R();
                            composer4.t();
                            composer4.R();
                            composer4.R();
                            if (b.G()) {
                                b.R();
                            }
                        }

                        @Override // defpackage.mt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            b((Modifier) obj, ((fu1) obj2).k(), (qs2) obj3, (Composer) obj4, ((Number) obj5).intValue());
                            return ww8.a;
                        }
                    })), false, zr0.b(composer3, 2070688215, true, new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$1$1$3
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 11) == 2 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(2070688215, i4, -1, "com.nytimes.android.composable.MainBottomNavigation.<anonymous>.<anonymous>.<anonymous> (MainBottomNavigation.kt:115)");
                            }
                            MainBottomNavigationKt.d(de4.this, composer4, 8);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), false, null, 0L, nn0.r(((nn0) composer3.m(ContentColorKt.a())).B(), uv0.a.d(composer3, uv0.b), 0.0f, 0.0f, 0.0f, 14, null), composer2, (i3 & 14) | 1576320, 0, 464);
                    m37Var2 = m37Var;
                    composer3 = composer2;
                    i3 = i3;
                    it2Var4 = it2Var4;
                    it2Var3 = it2Var3;
                    ss2Var2 = ss2Var2;
                    e = e;
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 24576, 9);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainBottomNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    MainBottomNavigationKt.a(list, n25Var, it2Var, it2Var2, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.m37 r26, final defpackage.de4 r27, final boolean r28, final defpackage.ss2 r29, androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.composable.MainBottomNavigationKt.b(m37, de4, boolean, ss2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s25 c(x08 x08Var) {
        return (s25) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final de4 de4Var, Composer composer, final int i) {
        Modifier modifier;
        Composer h = composer.h(2028064933);
        if (b.G()) {
            b.S(2028064933, i, -1, "com.nytimes.android.composable.MainLabel (MainBottomNavigation.kt:125)");
        }
        Integer d = de4Var.f().d();
        h.z(-363964920);
        String b = d == null ? null : k48.b(d.intValue(), h, 0);
        h.R();
        String b2 = k48.b(de4Var.f().e(), h, 0);
        j f = ag4.a.c(h, ag4.b).f();
        if (b == null || (modifier = ModifierUtilsKt.d(Modifier.a, b)) == null) {
            modifier = Modifier.a;
        }
        TextKt.c(b2, modifier, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, f, h, 0, 0, 65532);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.composable.MainBottomNavigationKt$MainLabel$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    MainBottomNavigationKt.d(de4.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
