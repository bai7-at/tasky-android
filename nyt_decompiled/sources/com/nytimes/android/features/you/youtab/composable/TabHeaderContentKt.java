package com.nytimes.android.features.you.youtab.composable;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cg4;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.g14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.om9;
import defpackage.p14;
import defpackage.pm9;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s5;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class TabHeaderContentKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.qs2 r81, final defpackage.qs2 r82, final java.lang.String r83, final androidx.compose.foundation.lazy.LazyListState r84, androidx.compose.ui.Modifier r85, androidx.compose.runtime.Composer r86, final int r87, final int r88) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt.a(qs2, qs2, java.lang.String, androidx.compose.foundation.lazy.LazyListState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float b(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    public static final void c(final YouScreenViewModel youScreenViewModel, final om9 om9Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(om9Var, TransferTable.COLUMN_STATE);
        Composer h = composer.h(543089255);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(543089255, i, -1, "com.nytimes.android.features.you.youtab.composable.YouTabScreenHeader (TabHeaderContent.kt:49)");
        }
        final x08 b = y.b(youScreenViewModel.U(), null, h, 8, 1);
        LifecycleUtilsKt.a(ww8.a, new TabHeaderContentKt$YouTabScreenHeader$1(youScreenViewModel, y.b(youScreenViewModel.O(), null, h, 8, 1), null), h, 70);
        eb5.a aVar = eb5.Companion;
        SurfaceKt.a(PaddingKt.k(PaddingKt.m(BackgroundKt.d(modifier2, aVar.b(h, 8).a(), null, 2, null), 0.0f, bu1.g(16), 0.0f, 0.0f, 13, null), bu1.g(2), 0.0f, 2, null), null, aVar.b(h, 8).a(), 0L, 0.0f, 0.0f, null, zr0.b(h, 27657154, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            private static final float b(x08 x08Var) {
                return ((Number) x08Var.getValue()).floatValue();
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(27657154, i3, -1, "com.nytimes.android.features.you.youtab.composable.YouTabScreenHeader.<anonymous> (TabHeaderContent.kt:66)");
                }
                om9 om9Var2 = om9.this;
                final x08 x08Var = b;
                final YouScreenViewModel youScreenViewModel2 = youScreenViewModel;
                composer2.z(733328855);
                Modifier.a aVar2 = Modifier.a;
                Alignment.a aVar3 = Alignment.a;
                rg4 g = BoxKt.g(aVar3.o(), false, composer2, 0);
                composer2.z(-1323940314);
                int a = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a2 = companion.a();
                it2 c = LayoutKt.c(aVar2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a2);
                } else {
                    composer2.p();
                }
                Composer a3 = Updater.a(composer2);
                Updater.c(a3, g, companion.e());
                Updater.c(a3, o, companion.g());
                gt2 b2 = companion.b();
                if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                    a3.q(Integer.valueOf(a));
                    a3.v(Integer.valueOf(a), b2);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                final ComponentActivity d = s5.d(composer2, 0);
                zq3.f(d, "null cannot be cast to non-null type android.app.Activity");
                composer2.z(-483455358);
                rg4 a4 = d.a(Arrangement.a.g(), aVar3.k(), composer2, 0);
                composer2.z(-1323940314);
                int a5 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                qs2 a6 = companion.a();
                it2 c2 = LayoutKt.c(aVar2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a6);
                } else {
                    composer2.p();
                }
                Composer a7 = Updater.a(composer2);
                Updater.c(a7, a4, companion.e());
                Updater.c(a7, o2, companion.g());
                gt2 b3 = companion.b();
                if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                    a7.q(Integer.valueOf(a5));
                    a7.v(Integer.valueOf(a5), b3);
                }
                c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                final LazyListState b4 = om9Var2.b();
                composer2.z(213214929);
                Object A = composer2.A();
                if (A == Composer.a.a()) {
                    A = y.d(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$spacerHeight$2$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Float mo865invoke() {
                            Object obj;
                            Iterator it2 = LazyListState.this.x().k().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (((g14) obj).getIndex() == 0) {
                                    break;
                                }
                            }
                            g14 g14Var = (g14) obj;
                            return g14Var == null ? Float.valueOf(0.0f) : Float.valueOf(cg4.a(0.0f, 12.0f, p14.b(LazyListState.this.x(), g14Var)));
                        }
                    });
                    composer2.q(A);
                }
                composer2.R();
                SpacerKt.a(SizeKt.i(aVar2, bu1.g(b((x08) A))), composer2, 0);
                MainTopAppBarKt.a(zr0.b(composer2, 1078927226, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(ac0 ac0Var, Composer composer3, int i4) {
                        pm9 d2;
                        zq3.h(ac0Var, "$this$MainTopAppBar");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1078927226, i4, -1, "com.nytimes.android.features.you.youtab.composable.YouTabScreenHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabHeaderContent.kt:83)");
                        }
                        d2 = TabHeaderContentKt.d(x08.this);
                        if (d2 != null) {
                            final YouScreenViewModel youScreenViewModel3 = youScreenViewModel2;
                            LazyListState lazyListState = b4;
                            final Activity activity = d;
                            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final Boolean mo865invoke() {
                                    return Boolean.valueOf(YouScreenViewModel.this.l0(activity));
                                }
                            };
                            qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$1$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final Boolean mo865invoke() {
                                    return Boolean.valueOf(YouScreenViewModel.this.k0(activity));
                                }
                            };
                            composer3.z(-480522863);
                            String a8 = youScreenViewModel3.D().f() ? d2.a() : k48.b(yk6.you_tab_name, composer3, 0);
                            composer3.R();
                            TabHeaderContentKt.a(qs2Var, qs2Var2, a8, lazyListState, null, composer3, 0, 16);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                }), null, null, null, zr0.b(composer2, -1852689777, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(m37 m37Var, Composer composer3, int i4) {
                        zq3.h(m37Var, "$this$MainTopAppBar");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1852689777, i4, -1, "com.nytimes.android.features.you.youtab.composable.YouTabScreenHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabHeaderContent.kt:101)");
                        }
                        final YouScreenViewModel youScreenViewModel3 = YouScreenViewModel.this;
                        final Activity activity = d;
                        final x08 x08Var2 = x08Var;
                        IconButtonKt.a(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$2$1$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m456invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m456invoke() {
                                pm9 d2;
                                d2 = TabHeaderContentKt.d(x08Var2);
                                if (d2 == null) {
                                    YouScreenViewModel.this.V0();
                                } else {
                                    YouScreenViewModel.this.U0();
                                }
                                YouScreenViewModel.this.o0(activity);
                            }
                        }, ComposablePositionsKt.d(Modifier.a, "settingAccount", null, 2, null), false, null, ComposableSingletons$TabHeaderContentKt.a.a(), composer3, 24576, 12);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), eb5.Companion.b(composer2, 8).a(), 0L, bu1.g(0), composer2, 12607878, 74);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 12582912, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.TabHeaderContentKt$YouTabScreenHeader$3
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
                    TabHeaderContentKt.c(YouScreenViewModel.this, om9Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pm9 d(x08 x08Var) {
        return (pm9) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }
}
