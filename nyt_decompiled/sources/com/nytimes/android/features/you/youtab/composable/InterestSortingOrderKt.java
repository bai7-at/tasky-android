package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.features.you.youtab.SortOrder;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class InterestSortingOrderKt {
    public static final void a(final StateFlow stateFlow, final ss2 ss2Var, final ss2 ss2Var2, final gt2 gt2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z;
        final x08 x08Var;
        zq3.h(stateFlow, "selectedSortOption");
        zq3.h(ss2Var, "sendSortByImpression");
        zq3.h(ss2Var2, "sendSortDropdownInteraction");
        zq3.h(gt2Var, "mostRecentSortingSelected");
        Composer h = composer.h(-666309641);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-666309641, i, -1, "com.nytimes.android.features.you.youtab.composable.InterestSortingOption (InterestSortingOrder.kt:38)");
        }
        h.z(-1589198463);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        x08 b = y.b(stateFlow, null, h, 8, 1);
        ww8 ww8Var = ww8.a;
        h.z(-1589198338);
        boolean S = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(ss2Var)) || (i & 48) == 32) | h.S(b);
        Object A2 = h.A();
        if (S || A2 == aVar.a()) {
            A2 = new InterestSortingOrderKt$InterestSortingOption$1$1(ss2Var, b, null);
            h.q(A2);
        }
        h.R();
        py1.d(ww8Var, (gt2) A2, h, 70);
        h.z(693286680);
        Arrangement arrangement = Arrangement.a;
        Arrangement.e f = arrangement.f();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = m.a(f, aVar2.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b2 = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b2);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        String b3 = k48.b(yk6.interest_sort_by, h, 0);
        j value = TPLTypography.text16.getValue();
        eb5.a aVar3 = eb5.Companion;
        long g = aVar3.b(h, 8).g();
        Modifier.a aVar4 = Modifier.a;
        TextKt.c(b3, PaddingKt.m(aVar4, 0.0f, 0.0f, bu1.g(4), 0.0f, 11, null), g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, h, 48, 0, 65528);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(aVar4);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a6);
        } else {
            h.p();
        }
        Composer a7 = Updater.a(h);
        Updater.c(a7, g2, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b4 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b4);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        h.z(1491697003);
        if ((((i & 896) ^ 384) <= 256 || !h.S(ss2Var2)) && (i & 384) != 256) {
            z = false;
            x08Var = b;
        } else {
            x08Var = b;
            z = true;
        }
        boolean S2 = h.S(x08Var) | z;
        Object A3 = h.A();
        if (S2 || A3 == aVar.a()) {
            A3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$2$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m446invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m446invoke() {
                    SortOrder d;
                    ss2 ss2Var3 = ss2.this;
                    d = InterestSortingOrderKt.d(x08Var);
                    ss2Var3.invoke(d);
                    InterestSortingOrderKt.c(sy4Var, true);
                }
            };
            h.q(A3);
        }
        h.R();
        Modifier e = ClickableKt.e(aVar4, false, null, null, (qs2) A3, 7, null);
        h.z(693286680);
        rg4 a8 = m.a(arrangement.f(), aVar2.l(), h, 0);
        h.z(-1323940314);
        int a9 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a10 = companion.a();
        it2 c3 = LayoutKt.c(e);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a10);
        } else {
            h.p();
        }
        Composer a11 = Updater.a(h);
        Updater.c(a11, a8, companion.e());
        Updater.c(a11, o3, companion.g());
        gt2 b5 = companion.b();
        if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
            a11.q(Integer.valueOf(a9));
            a11.v(Integer.valueOf(a9), b5);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        final x08 x08Var2 = x08Var;
        TextKt.c(d(x08Var).getLabel(), null, aVar3.b(h, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title16.getValue(), h, 0, 0, 65530);
        SpacerKt.a(SizeKt.n(aVar4, bu1.g(6)), h, 6);
        IconKt.b(do5.d(re6.ic_caret_down, h, 0), null, SizeKt.n(aVar4, bu1.g(16)), aVar3.b(h, 8).g(), h, 440, 0);
        h.R();
        h.t();
        h.R();
        h.R();
        boolean b6 = b(sy4Var);
        h.z(1491697791);
        Object A4 = h.A();
        if (A4 == aVar.a()) {
            A4 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$2$1$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m447invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m447invoke() {
                    InterestSortingOrderKt.c(sy4.this, false);
                }
            };
            h.q(A4);
        }
        h.R();
        AndroidMenu_androidKt.a(b6, (qs2) A4, BackgroundKt.d(aVar4, aVar3.b(h, 8).b(), null, 2, null), 0L, null, null, zr0.b(h, 1974000404, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$2$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$DropdownMenu");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1974000404, i3, -1, "com.nytimes.android.features.you.youtab.composable.InterestSortingOption.<anonymous>.<anonymous>.<anonymous> (InterestSortingOrder.kt:82)");
                }
                composer2.z(-1582465056);
                boolean S3 = composer2.S(gt2.this) | composer2.S(x08Var2);
                final gt2 gt2Var2 = gt2.this;
                final x08 x08Var3 = x08Var2;
                final sy4 sy4Var2 = sy4Var;
                Object A5 = composer2.A();
                if (S3 || A5 == Composer.a.a()) {
                    A5 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$2$1$4$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m448invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m448invoke() {
                            SortOrder d;
                            gt2 gt2Var3 = gt2.this;
                            d = InterestSortingOrderKt.d(x08Var3);
                            gt2Var3.invoke(d, SortOrder.MOST_RECENT);
                            InterestSortingOrderKt.c(sy4Var2, false);
                        }
                    };
                    composer2.q(A5);
                }
                composer2.R();
                ComposableSingletons$InterestSortingOrderKt composableSingletons$InterestSortingOrderKt = ComposableSingletons$InterestSortingOrderKt.a;
                androidx.compose.material.AndroidMenu_androidKt.b((qs2) A5, null, false, null, null, composableSingletons$InterestSortingOrderKt.a(), composer2, 196608, 30);
                DividerKt.a(null, 0L, 0.0f, 0.0f, composer2, 0, 15);
                composer2.z(-1582464572);
                boolean S4 = composer2.S(gt2.this) | composer2.S(x08Var2);
                final gt2 gt2Var3 = gt2.this;
                final x08 x08Var4 = x08Var2;
                final sy4 sy4Var3 = sy4Var;
                Object A6 = composer2.A();
                if (S4 || A6 == Composer.a.a()) {
                    A6 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$2$1$4$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m449invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m449invoke() {
                            SortOrder d;
                            gt2 gt2Var4 = gt2.this;
                            d = InterestSortingOrderKt.d(x08Var4);
                            gt2Var4.invoke(d, SortOrder.YOUR_ORDER);
                            InterestSortingOrderKt.c(sy4Var3, false);
                        }
                    };
                    composer2.q(A6);
                }
                composer2.R();
                androidx.compose.material.AndroidMenu_androidKt.b((qs2) A6, null, false, null, null, composableSingletons$InterestSortingOrderKt.b(), composer2, 196608, 30);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 1572912, 56);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$3
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
                    InterestSortingOrderKt.a(StateFlow.this, ss2Var, ss2Var2, gt2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SortOrder d(x08 x08Var) {
        return (SortOrder) x08Var.getValue();
    }
}
