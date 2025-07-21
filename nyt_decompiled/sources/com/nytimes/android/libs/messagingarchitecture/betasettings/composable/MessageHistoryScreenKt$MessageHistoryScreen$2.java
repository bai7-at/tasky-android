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
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.lr4;
import defpackage.nn0;
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
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class MessageHistoryScreenKt$MessageHistoryScreen$2 extends Lambda implements it2 {
    final /* synthetic */ DebugViewModel $debugViewModel;
    final /* synthetic */ SnackbarUtil $snackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageHistoryScreenKt$MessageHistoryScreen$2(DebugViewModel debugViewModel, SnackbarUtil snackbarUtil) {
        super(3);
        this.$debugViewModel = debugViewModel;
        this.$snackbar = snackbarUtil;
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
            b.S(-751956773, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreen.<anonymous> (MessageHistoryScreen.kt:41)");
        }
        composer.z(1463370455);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = b0.e(list, null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer, 8));
        final DebugViewModel debugViewModel = this.$debugViewModel;
        final SnackbarUtil snackbarUtil = this.$snackbar;
        ScaffoldKt.b(c, null, null, null, null, zr0.b(composer, 1055302563, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2.1
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
                    b.S(1055302563, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreen.<anonymous>.<anonymous> (MessageHistoryScreen.kt:45)");
                }
                ComposableSingletons$MessageHistoryScreenKt composableSingletons$MessageHistoryScreenKt = ComposableSingletons$MessageHistoryScreenKt.a;
                gt2 a = composableSingletons$MessageHistoryScreenKt.a();
                final DebugViewModel debugViewModel2 = DebugViewModel.this;
                final SnackbarUtil snackbarUtil2 = snackbarUtil;
                final sy4 sy4Var2 = sy4Var;
                FloatingActionButtonKt.a(a, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt.MessageHistoryScreen.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m576invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m576invoke() {
                        DebugViewModel.this.k();
                        MessageHistoryScreenKt$MessageHistoryScreen$2.h(sy4Var2, i.l());
                        SnackbarUtil.z(snackbarUtil2, "History cleared!", 0, false, 6, null);
                    }
                }, null, composableSingletons$MessageHistoryScreenKt.b(), null, null, 0L, 0L, null, composer2, 3078, 500);
                if (b.G()) {
                    b.R();
                }
            }
        }), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer, 189639449, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2.2
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
                    b.S(189639449, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreen.<anonymous>.<anonymous> (MessageHistoryScreen.kt:56)");
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
                ItemLayoutsKt.c("messageId", "shown", null, null, null, composer2, 54, 28);
                composer2.z(1549836980);
                Object A2 = composer2.A();
                if (A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1
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
                            g = MessageHistoryScreenKt$MessageHistoryScreen$2.g(sy4.this);
                            final MessageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1$invoke$$inlined$items$default$1 messageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1$invoke$$inlined$items$default$1
                                @Override // defpackage.ss2
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Void invoke(Object obj) {
                                    return null;
                                }
                            };
                            lazyListScope.b(g.size(), null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1$invoke$$inlined$items$default$3
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
                            }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageHistoryScreenKt$MessageHistoryScreen$2$2$1$1$1$invoke$$inlined$items$default$4
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
                                        i5 = (composer3.S(h04Var) ? 4 : 2) | i4;
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
                                    lr4 lr4Var = (lr4) g.get(i3);
                                    if (lr4Var.a() != null) {
                                        composer3.z(317798199);
                                        Message a5 = lr4Var.a();
                                        String b2 = s29.b(lr4Var.c(), composer3, 8);
                                        zq3.g(b2, "formatDateTime(...)");
                                        ItemLayoutsKt.d(a5, b2, composer3, 8);
                                        composer3.R();
                                    } else {
                                        composer3.z(317798482);
                                        String e = lr4Var.b().e();
                                        String b3 = s29.b(lr4Var.b().d(), composer3, 8);
                                        zq3.g(b3, "formatDateTime(...)");
                                        ItemLayoutsKt.b(e, b3, BackgroundKt.d(Modifier.a, nn0.b.d(), null, 2, null), null, null, composer3, 384, 24);
                                        composer3.R();
                                    }
                                    if (b.G()) {
                                        b.R();
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
