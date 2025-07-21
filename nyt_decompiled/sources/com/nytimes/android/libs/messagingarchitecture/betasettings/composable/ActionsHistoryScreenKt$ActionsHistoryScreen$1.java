package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import com.comscore.streaming.ContentType;
import com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.a4;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gv1;
import defpackage.h04;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.kt2;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s29;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class ActionsHistoryScreenKt$ActionsHistoryScreen$1 extends Lambda implements it2 {
    final /* synthetic */ DebugViewModel $debugViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionsHistoryScreenKt$ActionsHistoryScreen$1(DebugViewModel debugViewModel) {
        super(3);
        this.$debugViewModel = debugViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(sy4 sy4Var) {
        return (List) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(sy4 sy4Var, List list) {
        sy4Var.setValue(list);
    }

    public final void d(List list, Composer composer, int i) {
        zq3.h(list, "wrapperList");
        if (b.G()) {
            b.S(467039643, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreen.<anonymous> (ActionsHistoryScreen.kt:40)");
        }
        composer.z(1768596549);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(list, null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer, 8));
        final DebugViewModel debugViewModel = this.$debugViewModel;
        ScaffoldKt.b(c, null, null, null, null, zr0.b(composer, -2020668317, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1.1
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
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-2020668317, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreen.<anonymous>.<anonymous> (ActionsHistoryScreen.kt:44)");
                }
                final SnackbarUtil snackbarUtil = (SnackbarUtil) composer2.m(LocalSnackbarKt.a());
                ComposableSingletons$ActionsHistoryScreenKt composableSingletons$ActionsHistoryScreenKt = ComposableSingletons$ActionsHistoryScreenKt.a;
                gt2 a = composableSingletons$ActionsHistoryScreenKt.a();
                final DebugViewModel debugViewModel2 = DebugViewModel.this;
                final sy4 sy4Var2 = sy4Var;
                FloatingActionButtonKt.a(a, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt.ActionsHistoryScreen.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m573invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m573invoke() {
                        DebugViewModel.this.j();
                        ActionsHistoryScreenKt$ActionsHistoryScreen$1.h(sy4Var2, i.l());
                        SnackbarUtil.z(snackbarUtil, "Actions cleared!", 0, false, 6, null);
                    }
                }, null, composableSingletons$ActionsHistoryScreenKt.b(), null, null, 0L, 0L, null, composer2, 3078, 500);
                if (b.G()) {
                    b.R();
                }
            }
        }), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer, 1408635865, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1.2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(ym5 ym5Var, Composer composer2, int i2) {
                zq3.h(ym5Var, "it");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1408635865, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreen.<anonymous>.<anonymous> (ActionsHistoryScreen.kt:56)");
                }
                final sy4 sy4Var2 = sy4.this;
                composer2.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                composer2.z(-1323940314);
                int a2 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c2 = LayoutKt.c(aVar);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a3);
                } else {
                    composer2.p();
                }
                Composer a4 = Updater.a(composer2);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                composer2.z(1728217608);
                Object A2 = composer2.A();
                if (A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LazyListScope) obj);
                            return ww8.a;
                        }

                        public final void invoke(LazyListScope lazyListScope) {
                            final List g;
                            zq3.h(lazyListScope, "$this$LazyColumn");
                            g = ActionsHistoryScreenKt$ActionsHistoryScreen$1.g(sy4.this);
                            final ActionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1$invoke$$inlined$items$default$1 actionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1$invoke$$inlined$items$default$1
                                @Override // defpackage.ss2
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Void invoke(Object obj) {
                                    return null;
                                }
                            };
                            lazyListScope.b(g.size(), null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1$invoke$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }

                                public final Object invoke(int i3) {
                                    return ss2.this.invoke(g.get(i3));
                                }
                            }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1$2$1$1$1$invoke$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, int i3, Composer composer3, int i4) {
                                    int i5;
                                    if ((i4 & 14) == 0) {
                                        i5 = i4 | (composer3.S(h04Var) ? 4 : 2);
                                    } else {
                                        i5 = i4;
                                    }
                                    if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i5 |= composer3.d(i3) ? 32 : 16;
                                    }
                                    if ((i5 & 731) == 146 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    a4 a4Var = (a4) g.get(i3);
                                    composer3.z(1638601585);
                                    a.C0064a c0064a = new a.C0064a(0, 1, null);
                                    composer3.z(1638601644);
                                    int n = c0064a.n(eb5.Companion.c(composer3, 8).k().R());
                                    try {
                                        c0064a.i(s29.b(a4Var.b(), composer3, 8) + "\n");
                                        ww8 ww8Var = ww8.a;
                                        c0064a.k(n);
                                        composer3.R();
                                        n = c0064a.n(new jy7(0L, 0L, androidx.compose.ui.text.font.o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null));
                                        try {
                                            c0064a.i(a4Var.a().b() + ": ");
                                            c0064a.k(n);
                                            c0064a.i(a4Var.a().c().toString());
                                            a o2 = c0064a.o();
                                            composer3.R();
                                            TextKt.d(o2, PaddingKt.i(Modifier.a, bu1.g(8)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 48, 0, 262140);
                                            if (b.G()) {
                                                b.R();
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            }));
                        }
                    };
                    composer2.q(A2);
                }
                composer2.R();
                LazyDslKt.a(null, null, null, false, null, null, null, false, (ss2) A2, composer2, 100663296, 255);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), composer, 196608, 12582912, 131038);
        if (b.G()) {
            b.R();
        }
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        d((List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }
}
