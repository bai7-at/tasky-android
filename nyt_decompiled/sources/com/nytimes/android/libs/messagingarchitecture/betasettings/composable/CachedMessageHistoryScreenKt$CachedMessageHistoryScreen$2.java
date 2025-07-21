package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.ir4;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.Lambda;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
final class CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2 extends Lambda implements it2 {
    final /* synthetic */ DebugViewModel $debugViewModel;
    final /* synthetic */ SnackbarUtil $snackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2(DebugViewModel debugViewModel, SnackbarUtil snackbarUtil) {
        super(3);
        this.$debugViewModel = debugViewModel;
        this.$snackbar = snackbarUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(sy4 sy4Var) {
        return (List) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, List list) {
        sy4Var.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(sy4 sy4Var) {
        return (List) sy4Var.getValue();
    }

    public final void g(List list, Composer composer, int i) {
        zq3.h(list, "wrapperList");
        if (b.G()) {
            b.S(1819162075, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreen.<anonymous> (CachedMessageHistoryScreen.kt:40)");
        }
        composer.z(-1656222712);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            List list2 = (List) i.n0(list, 0);
            if (list2 == null) {
                list2 = i.l();
            }
            A = b0.e(list2, null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(-1656222619);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            List list3 = (List) i.n0(list, 1);
            if (list3 == null) {
                list3 = i.l();
            }
            A2 = b0.e(list3, null, 2, null);
            composer.q(A2);
        }
        final sy4 sy4Var2 = (sy4) A2;
        composer.R();
        Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer, 8));
        final DebugViewModel debugViewModel = this.$debugViewModel;
        final SnackbarUtil snackbarUtil = this.$snackbar;
        ScaffoldKt.b(c, null, null, null, null, zr0.b(composer, 542302371, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.1
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
                    b.S(542302371, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreen.<anonymous>.<anonymous> (CachedMessageHistoryScreen.kt:46)");
                }
                ComposableSingletons$CachedMessageHistoryScreenKt composableSingletons$CachedMessageHistoryScreenKt = ComposableSingletons$CachedMessageHistoryScreenKt.a;
                gt2 a = composableSingletons$CachedMessageHistoryScreenKt.a();
                final DebugViewModel debugViewModel2 = DebugViewModel.this;
                final SnackbarUtil snackbarUtil2 = snackbarUtil;
                final sy4 sy4Var3 = sy4Var;
                FloatingActionButtonKt.a(a, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt.CachedMessageHistoryScreen.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m574invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m574invoke() {
                        DebugViewModel.this.l();
                        CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.i(sy4Var3, i.l());
                        SnackbarUtil.z(snackbarUtil2, "History cleared!", 0, false, 6, null);
                    }
                }, null, composableSingletons$CachedMessageHistoryScreenKt.b(), null, null, 0L, 0L, null, composer2, 3078, 500);
                if (b.G()) {
                    b.R();
                }
            }
        }), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer, 265053977, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    b.S(265053977, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreen.<anonymous>.<anonymous> (CachedMessageHistoryScreen.kt:57)");
                }
                final sy4 sy4Var3 = sy4.this;
                final sy4 sy4Var4 = sy4Var2;
                composer2.z(-483455358);
                Modifier.a aVar2 = Modifier.a;
                Arrangement arrangement = Arrangement.a;
                Arrangement.m g = arrangement.g();
                Alignment.a aVar3 = Alignment.a;
                rg4 a = d.a(g, aVar3.k(), composer2, 0);
                composer2.z(-1323940314);
                int a2 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c2 = LayoutKt.c(aVar2);
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
                Modifier b2 = zo0.b(ap0Var, aVar2, 1.0f, false, 2, null);
                composer2.z(-483455358);
                rg4 a5 = d.a(arrangement.g(), aVar3.k(), composer2, 0);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                qs2 a7 = companion.a();
                it2 c3 = LayoutKt.c(b2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a7);
                } else {
                    composer2.p();
                }
                Composer a8 = Updater.a(composer2);
                Updater.c(a8, a5, companion.e());
                Updater.c(a8, o2, companion.g());
                gt2 b3 = companion.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b3);
                }
                c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ItemLayoutsKt.g("Local Message History", "Records have not yet been synced to OMA User State API. Sync will occur on the next Message List refresh.", null, composer2, 54, 4);
                ItemLayoutsKt.c("Message ID", "Audience", null, "View Count", "Last Seen On", composer2, 27702, 4);
                composer2.z(1758590957);
                Object A3 = composer2.A();
                Composer.a aVar4 = Composer.a;
                if (A3 == aVar4.a()) {
                    A3 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2$2$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LazyListScope) obj);
                            return ww8.a;
                        }

                        public final void invoke(LazyListScope lazyListScope) {
                            List h;
                            zq3.h(lazyListScope, "$this$LazyColumn");
                            h = CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.h(sy4.this);
                            int size = h.size();
                            final sy4 sy4Var5 = sy4.this;
                            LazyListScope.e(lazyListScope, size, null, null, zr0.c(1090808866, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2$2$1$1$1$1.1
                                {
                                    super(4);
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, int i3, Composer composer3, int i4) {
                                    List h2;
                                    zq3.h(h04Var, "$this$items");
                                    if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i4 |= composer3.d(i3) ? 32 : 16;
                                    }
                                    if ((i4 & 721) == 144 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(1090808866, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CachedMessageHistoryScreen.kt:74)");
                                    }
                                    h2 = CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.h(sy4.this);
                                    ir4 ir4Var = (ir4) h2.get(i3);
                                    String c4 = ir4Var.c();
                                    String a9 = ir4Var.a();
                                    if (a9 == null) {
                                        a9 = "";
                                    }
                                    String str = a9;
                                    String valueOf = String.valueOf(ir4Var.d());
                                    Instant b4 = ir4Var.b();
                                    ItemLayoutsKt.b(c4, str, BackgroundKt.d(Modifier.a, nn0.b.d(), null, 2, null), valueOf, b4 != null ? b4.toString() : null, composer3, 384, 0);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), 6, null);
                        }
                    };
                    composer2.q(A3);
                }
                composer2.R();
                LazyDslKt.a(null, null, null, false, null, null, null, false, (ss2) A3, composer2, 100663296, 255);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                Modifier b4 = zo0.b(ap0Var, aVar2, 1.0f, false, 2, null);
                composer2.z(-483455358);
                rg4 a9 = d.a(arrangement.g(), aVar3.k(), composer2, 0);
                composer2.z(-1323940314);
                int a10 = cs0.a(composer2, 0);
                et0 o3 = composer2.o();
                qs2 a11 = companion.a();
                it2 c4 = LayoutKt.c(b4);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a11);
                } else {
                    composer2.p();
                }
                Composer a12 = Updater.a(composer2);
                Updater.c(a12, a9, companion.e());
                Updater.c(a12, o3, companion.g());
                gt2 b5 = companion.b();
                if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
                    a12.q(Integer.valueOf(a10));
                    a12.v(Integer.valueOf(a10), b5);
                }
                c4.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ItemLayoutsKt.g("Remote Message History", "Records have been synced to OMA User State API.", null, composer2, 54, 4);
                ItemLayoutsKt.c("Message ID", "Audience", null, "View Count", "Last Seen On", composer2, 27702, 4);
                composer2.z(1758592241);
                Object A4 = composer2.A();
                if (A4 == aVar4.a()) {
                    A4 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2$2$1$2$1$1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LazyListScope) obj);
                            return ww8.a;
                        }

                        public final void invoke(LazyListScope lazyListScope) {
                            List j;
                            zq3.h(lazyListScope, "$this$LazyColumn");
                            j = CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.j(sy4.this);
                            int size = j.size();
                            final sy4 sy4Var5 = sy4.this;
                            LazyListScope.e(lazyListScope, size, null, null, zr0.c(782441177, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2$2$1$2$1$1.1
                                {
                                    super(4);
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, int i3, Composer composer3, int i4) {
                                    List j2;
                                    zq3.h(h04Var, "$this$items");
                                    if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i4 |= composer3.d(i3) ? 32 : 16;
                                    }
                                    if ((i4 & 721) == 144 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(782441177, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.CachedMessageHistoryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CachedMessageHistoryScreen.kt:100)");
                                    }
                                    j2 = CachedMessageHistoryScreenKt$CachedMessageHistoryScreen$2.j(sy4.this);
                                    ir4 ir4Var = (ir4) j2.get(i3);
                                    String c5 = ir4Var.c();
                                    String a13 = ir4Var.a();
                                    if (a13 == null) {
                                        a13 = "";
                                    }
                                    String str = a13;
                                    String valueOf = String.valueOf(ir4Var.d());
                                    Instant b6 = ir4Var.b();
                                    ItemLayoutsKt.b(c5, str, BackgroundKt.d(Modifier.a, nn0.b.d(), null, 2, null), valueOf, b6 != null ? b6.toString() : null, composer3, 384, 0);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), 6, null);
                        }
                    };
                    composer2.q(A4);
                }
                composer2.R();
                LazyDslKt.a(null, null, null, false, null, null, null, false, (ss2) A4, composer2, 100663296, 255);
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
        }), composer, 196608, 12582912, 131038);
        if (b.G()) {
            b.R();
        }
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        g((List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }
}
