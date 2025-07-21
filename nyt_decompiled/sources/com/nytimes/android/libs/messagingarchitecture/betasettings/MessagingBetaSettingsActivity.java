package com.nytimes.android.libs.messagingarchitecture.betasettings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.libs.messagingarchitecture.betasettings.b;
import com.nytimes.android.libs.messagingarchitecture.betasettings.composable.MessageQueueScreenKt;
import defpackage.c04;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.m25;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.uh;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class MessagingBetaSettingsActivity extends com.nytimes.android.libs.messagingarchitecture.betasettings.a {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, b bVar) {
            zq3.h(context, "context");
            zq3.h(bVar, "screen");
            Intent putExtra = new Intent(context, (Class<?>) MessagingBetaSettingsActivity.class).putExtra("SCREEN_ROUTE", bVar.a());
            zq3.g(putExtra, "putExtra(...)");
            return putExtra;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugViewModel z(c04 c04Var) {
        return (DebugViewModel) c04Var.getValue();
    }

    @Override // com.nytimes.android.libs.messagingarchitecture.betasettings.a, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final b a2 = b.Companion.a(getIntent().getStringExtra("SCREEN_ROUTE"));
        final qs2 qs2Var = null;
        final s sVar = new s(zt6.b(DebugViewModel.class), new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                u viewModelStore = ComponentActivity.this.getViewModelStore();
                zq3.g(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                t.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                if (qs2Var2 != null && (t21Var = (t21) qs2Var2.mo865invoke()) != null) {
                    return t21Var;
                }
                t21 defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        tq0.b(this, null, zr0.c(1393749943, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1393749943, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous> (MessagingBetaSettingsActivity.kt:40)");
                }
                final n25 e = NavHostControllerKt.e(new Navigator[0], composer, 8);
                final b bVar = b.this;
                final MessagingBetaSettingsActivity messagingBetaSettingsActivity = this;
                final c04 c04Var = sVar;
                NytThemeKt.a(false, null, null, zr0.b(composer, -1764037593, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$1.1
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
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-1764037593, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:42)");
                        }
                        final b bVar2 = b.this;
                        final MessagingBetaSettingsActivity messagingBetaSettingsActivity2 = messagingBetaSettingsActivity;
                        yr0 b = zr0.b(composer2, -1768507532, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-1768507532, i3, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:44)");
                                }
                                long d = eb5.Companion.a(composer3, 8).d();
                                final b bVar3 = b.this;
                                yr0 b2 = zr0.b(composer3, 1133552176, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.1.1
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
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.S(1133552176, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:50)");
                                        }
                                        TextKt.c(b.this.b(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.R();
                                        }
                                    }
                                });
                                final MessagingBetaSettingsActivity messagingBetaSettingsActivity3 = messagingBetaSettingsActivity2;
                                AppBarKt.d(b2, null, zr0.b(composer3, 1822678894, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.1.2
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
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.S(1822678894, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:46)");
                                        }
                                        composer4.z(652254956);
                                        boolean S = composer4.S(MessagingBetaSettingsActivity.this);
                                        final MessagingBetaSettingsActivity messagingBetaSettingsActivity4 = MessagingBetaSettingsActivity.this;
                                        Object A = composer4.A();
                                        if (S || A == Composer.a.a()) {
                                            A = new qs2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity$onCreate$1$1$1$2$1$1
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m572invoke();
                                                    return ww8.a;
                                                }

                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m572invoke() {
                                                    MessagingBetaSettingsActivity.this.getOnBackPressedDispatcher().l();
                                                }
                                            };
                                            composer4.q(A);
                                        }
                                        composer4.R();
                                        IconButtonKt.a((qs2) A, null, false, null, ComposableSingletons$MessagingBetaSettingsActivityKt.a.a(), composer4, 24576, 14);
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.R();
                                        }
                                    }
                                }), null, d, 0L, 0.0f, composer3, 390, 106);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        });
                        final n25 n25Var = e;
                        final b bVar3 = b.this;
                        final c04 c04Var2 = c04Var;
                        NytScaffoldKt.a(null, b, null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(composer2, 747511046, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(ym5 ym5Var, Composer composer3, int i3) {
                                zq3.h(ym5Var, "it");
                                if ((i3 & 81) == 16 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(747511046, i3, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:55)");
                                }
                                n25 n25Var2 = n25.this;
                                String a3 = bVar3.a();
                                final c04 c04Var3 = c04Var2;
                                NavHostKt.b(n25Var2, a3, null, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.2.1
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((m25) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(m25 m25Var) {
                                        zq3.h(m25Var, "$this$NavHost");
                                        String a4 = b.e.c.a();
                                        final c04 c04Var4 = c04.this;
                                        NavGraphBuilderKt.c(m25Var, a4, null, null, null, null, null, null, zr0.c(-1302946716, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.1.1.2.1.1
                                            {
                                                super(4);
                                            }

                                            @Override // defpackage.kt2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                                return ww8.a;
                                            }

                                            public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer4, int i4) {
                                                DebugViewModel z;
                                                zq3.h(uhVar, "$this$composable");
                                                zq3.h(navBackStackEntry, "it");
                                                if (androidx.compose.runtime.b.G()) {
                                                    androidx.compose.runtime.b.S(-1302946716, i4, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.MessagingBetaSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MessagingBetaSettingsActivity.kt:58)");
                                                }
                                                z = MessagingBetaSettingsActivity.z(c04.this);
                                                MessageQueueScreenKt.a(null, z, composer4, 64, 1);
                                                if (androidx.compose.runtime.b.G()) {
                                                    androidx.compose.runtime.b.R();
                                                }
                                            }
                                        }), WebSocketProtocol.PAYLOAD_SHORT, null);
                                        String a5 = b.C0340b.c.a();
                                        ComposableSingletons$MessagingBetaSettingsActivityKt composableSingletons$MessagingBetaSettingsActivityKt = ComposableSingletons$MessagingBetaSettingsActivityKt.a;
                                        NavGraphBuilderKt.c(m25Var, a5, null, null, null, null, null, null, composableSingletons$MessagingBetaSettingsActivityKt.b(), WebSocketProtocol.PAYLOAD_SHORT, null);
                                        NavGraphBuilderKt.c(m25Var, b.d.c.a(), null, null, null, null, null, null, composableSingletons$MessagingBetaSettingsActivityKt.c(), WebSocketProtocol.PAYLOAD_SHORT, null);
                                        NavGraphBuilderKt.c(m25Var, b.a.c.a(), null, null, null, null, null, null, composableSingletons$MessagingBetaSettingsActivityKt.d(), WebSocketProtocol.PAYLOAD_SHORT, null);
                                        NavGraphBuilderKt.c(m25Var, b.f.c.a(), null, null, null, null, null, null, composableSingletons$MessagingBetaSettingsActivityKt.e(), WebSocketProtocol.PAYLOAD_SHORT, null);
                                        NavGraphBuilderKt.c(m25Var, b.g.c.a(), null, null, null, null, null, null, composableSingletons$MessagingBetaSettingsActivityKt.f(), WebSocketProtocol.PAYLOAD_SHORT, null);
                                    }
                                }, composer3, 8, 508);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, 48, 0, 6, 1048573);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }
}
