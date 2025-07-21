package com.nytimes.android.features.notifications.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.android.utils.composeutils.ActionUtilsKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.c04;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.jc;
import defpackage.mx0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t21;
import defpackage.tq0;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class ComposeNotificationsActivity extends com.nytimes.android.features.notifications.push.a {
    public static final a Companion = new a(null);
    public static final int f = 8;
    public jc analyticsClient;
    private final c04 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context) {
            zq3.h(context, "context");
            return new Intent(context, (Class<?>) ComposeNotificationsActivity.class);
        }

        private a() {
        }
    }

    public ComposeNotificationsActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(SettingsNotificationsViewModel.class), new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$special$$inlined$viewModels$default$2
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
        }, new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$special$$inlined$viewModels$default$1
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
        }, new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$special$$inlined$viewModels$default$3
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(final Activity activity, final qs2 qs2Var, Composer composer, final int i) {
        Composer h = composer.h(-13452683);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-13452683, i, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen (ComposeNotificationsActivity.kt:67)");
        }
        NytThemeKt.a(false, null, null, zr0.b(h, -1562651643, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1
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
                    androidx.compose.runtime.b.S(-1562651643, i2, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous> (ComposeNotificationsActivity.kt:69)");
                }
                Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer2, 8));
                final qs2 qs2Var2 = qs2.this;
                yr0 b = zr0.b(composer2, -628475318, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1.1
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
                            androidx.compose.runtime.b.S(-628475318, i3, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous>.<anonymous> (ComposeNotificationsActivity.kt:72)");
                        }
                        eb5.a aVar = eb5.Companion;
                        long d = aVar.a(composer3, 8).d();
                        long r = aVar.a(composer3, 8).r();
                        gt2 a2 = ComposableSingletons$ComposeNotificationsActivityKt.a.a();
                        final qs2 qs2Var3 = qs2.this;
                        AppBarKt.d(a2, null, zr0.b(composer3, -974664252, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.1.1.1
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
                                    androidx.compose.runtime.b.S(-974664252, i4, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous>.<anonymous>.<anonymous> (ComposeNotificationsActivity.kt:79)");
                                }
                                composer4.z(-2056372144);
                                boolean S = composer4.S(qs2.this);
                                final qs2 qs2Var4 = qs2.this;
                                Object A = composer4.A();
                                if (S || A == Composer.a.a()) {
                                    A = new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1$1$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                            m415invoke();
                                            return ww8.a;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m415invoke() {
                                            qs2.this.mo865invoke();
                                        }
                                    };
                                    composer4.q(A);
                                }
                                composer4.R();
                                IconButtonKt.a((qs2) A, null, false, null, ComposableSingletons$ComposeNotificationsActivityKt.a.b(), composer4, 24576, 14);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), null, d, r, 0.0f, composer3, 390, 74);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                });
                final ComposeNotificationsActivity composeNotificationsActivity = this;
                final Activity activity2 = activity;
                ScaffoldKt.b(c, null, b, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer2, -411914813, true, new it2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1.2

                    @fc1(c = "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1$2$1", f = "ComposeNotificationsActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                        final /* synthetic */ Activity $activity;
                        int label;
                        final /* synthetic */ ComposeNotificationsActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(ComposeNotificationsActivity composeNotificationsActivity, Activity activity, by0 by0Var) {
                            super(2, by0Var);
                            this.this$0 = composeNotificationsActivity;
                            this.$activity = activity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new AnonymousClass1(this.this$0, this.$activity, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            SettingsNotificationsViewModel V;
                            kotlin.coroutines.intrinsics.a.h();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            V = this.this$0.V();
                            V.m(this.$activity, this.this$0.getSnackbarUtil());
                            this.this$0.U().B(-1);
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List g(x08 x08Var) {
                        return (List) x08Var.getValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean h(sy4 sy4Var) {
                        return ((Boolean) sy4Var.getValue()).booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void i(sy4 sy4Var, boolean z) {
                        sy4Var.setValue(Boolean.valueOf(z));
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(final ym5 ym5Var, Composer composer3, int i3) {
                        SettingsNotificationsViewModel V;
                        zq3.h(ym5Var, "padding");
                        if ((i3 & 14) == 0) {
                            i3 |= composer3.S(ym5Var) ? 4 : 2;
                        }
                        if ((i3 & 91) == 18 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-411914813, i3, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous>.<anonymous> (ComposeNotificationsActivity.kt:90)");
                        }
                        final Context applicationContext = ((Context) composer3.m(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
                        V = ComposeNotificationsActivity.this.V();
                        final x08 b2 = y.b(V.q(), null, composer3, 8, 1);
                        final ComposeNotificationsActivity composeNotificationsActivity2 = ComposeNotificationsActivity.this;
                        final qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$1$2$launchSettings$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m416invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m416invoke() {
                                SettingsNotificationsViewModel V2;
                                V2 = ComposeNotificationsActivity.this.V();
                                V2.A();
                            }
                        };
                        composer3.z(541049239);
                        Object A = composer3.A();
                        if (A == Composer.a.a()) {
                            A = b0.e(Boolean.FALSE, null, 2, null);
                            composer3.q(A);
                        }
                        final sy4 sy4Var = (sy4) A;
                        composer3.R();
                        py1.d(ww8.a, new AnonymousClass1(ComposeNotificationsActivity.this, activity2, null), composer3, 70);
                        final ComposeNotificationsActivity composeNotificationsActivity3 = ComposeNotificationsActivity.this;
                        ActionUtilsKt.a(null, new ss2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(Lifecycle.Event event) {
                                boolean T;
                                SettingsNotificationsViewModel V2;
                                SettingsNotificationsViewModel V3;
                                SettingsNotificationsViewModel V4;
                                zq3.h(event, "event");
                                if (event == Lifecycle.Event.ON_CREATE) {
                                    V4 = ComposeNotificationsActivity.this.V();
                                    V4.D();
                                }
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    sy4 sy4Var2 = sy4Var;
                                    ComposeNotificationsActivity composeNotificationsActivity4 = ComposeNotificationsActivity.this;
                                    Context context = applicationContext;
                                    zq3.g(context, "$context");
                                    T = composeNotificationsActivity4.T(context);
                                    AnonymousClass2.i(sy4Var2, T);
                                    V2 = ComposeNotificationsActivity.this.V();
                                    if (V2.C(AnonymousClass2.h(sy4Var))) {
                                        ComposeNotificationsActivity.this.W(AnonymousClass2.h(sy4Var));
                                    }
                                    if (AnonymousClass2.g(b2).isEmpty()) {
                                        V3 = ComposeNotificationsActivity.this.V();
                                        V3.p();
                                    }
                                }
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((Lifecycle.Event) obj);
                                return ww8.a;
                            }
                        }, composer3, 0, 1);
                        Boolean valueOf = Boolean.valueOf(h(sy4Var));
                        final ComposeNotificationsActivity composeNotificationsActivity4 = ComposeNotificationsActivity.this;
                        NotificationsPermissionProviderKt.a(valueOf, zr0.b(composer3, -455212513, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.1.2.3
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
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-455212513, i4, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous>.<anonymous>.<anonymous> (ComposeNotificationsActivity.kt:118)");
                                }
                                Modifier h2 = PaddingKt.h(Modifier.a, ym5.this);
                                List g = AnonymousClass2.g(b2);
                                final ComposeNotificationsActivity composeNotificationsActivity5 = composeNotificationsActivity4;
                                it2 it2Var = new it2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.1.2.3.1
                                    {
                                        super(3);
                                    }

                                    public final void b(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z) {
                                        SettingsNotificationsViewModel V2;
                                        zq3.h(notificationsGroupItems, "group");
                                        zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
                                        V2 = ComposeNotificationsActivity.this.V();
                                        V2.o(notificationsGroupItems, notificationsChannel, z);
                                    }

                                    @Override // defpackage.it2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        b((NotificationsGroupItems) obj, (NotificationsChannel) obj2, ((Boolean) obj3).booleanValue());
                                        return ww8.a;
                                    }
                                };
                                final qs2 qs2Var4 = qs2Var3;
                                NotificationsScreenKt.e(h2, g, it2Var, zr0.b(composer4, -516923975, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.1.2.3.2
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(Composer composer5, int i5) {
                                        if ((i5 & 11) == 2 && composer5.i()) {
                                            composer5.K();
                                            return;
                                        }
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.S(-516923975, i5, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.NotificationsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComposeNotificationsActivity.kt:124)");
                                        }
                                        NotificationsScreenKt.g(qs2.this, composer5, 0);
                                        if (androidx.compose.runtime.b.G()) {
                                            androidx.compose.runtime.b.R();
                                        }
                                    }
                                }), null, composer4, 3136, 16);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer3, 48, 0);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer2, 384, 12582912, 131066);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), h, 3072, 7);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$NotificationsScreen$2
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
                    ComposeNotificationsActivity.this.O(activity, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T(Context context) {
        return mx0.a(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsNotificationsViewModel V() {
        return (SettingsNotificationsViewModel) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(boolean z) {
        if (z) {
            SnackbarUtil.g(getSnackbarUtil(), wl6.settings_notifications_accepted, wl6.settings_notifications_accepted_message, 0, 4, null);
        } else {
            SnackbarUtil.g(getSnackbarUtil(), wl6.settings_notifications_declined, wl6.settings_notifications_declined_message, 0, 4, null);
        }
    }

    public final jc U() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    @Override // com.nytimes.android.features.notifications.push.a, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(-296243988, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$onCreate$1
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
                    androidx.compose.runtime.b.S(-296243988, i, -1, "com.nytimes.android.features.notifications.push.ComposeNotificationsActivity.onCreate.<anonymous> (ComposeNotificationsActivity.kt:62)");
                }
                final ComposeNotificationsActivity composeNotificationsActivity = ComposeNotificationsActivity.this;
                composeNotificationsActivity.O(composeNotificationsActivity, new qs2() { // from class: com.nytimes.android.features.notifications.push.ComposeNotificationsActivity$onCreate$1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m417invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m417invoke() {
                        SettingsNotificationsViewModel V;
                        V = ComposeNotificationsActivity.this.V();
                        V.B(ComposeNotificationsActivity.this);
                    }
                }, composer, 520);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }
}
