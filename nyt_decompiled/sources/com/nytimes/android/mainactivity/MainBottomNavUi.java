package com.nytimes.android.mainactivity;

import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.b0;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.MainActivity;
import com.nytimes.android.features.notifications.push.ComposeNotificationsActivity;
import com.nytimes.android.mainactivity.MainBottomNavUi;
import com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.c04;
import defpackage.de4;
import defpackage.e44;
import defpackage.jk;
import defpackage.ka2;
import defpackage.ma3;
import defpackage.qd4;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.t21;
import defpackage.w4;
import defpackage.yz3;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class MainBottomNavUi {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private final jk a;
    private final qd4 b;
    private final Resources c;
    private final SnackbarUtil d;
    private final MainActivity e;
    private final c04 f;
    private w4 g;
    private final sy4 h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public MainBottomNavUi(jk jkVar, qd4 qd4Var, Resources resources, SnackbarUtil snackbarUtil) {
        zq3.h(jkVar, "activity");
        zq3.h(qd4Var, "analytics");
        zq3.h(resources, "resources");
        zq3.h(snackbarUtil, "snackbarUtil");
        this.a = jkVar;
        this.b = qd4Var;
        this.c = resources;
        this.d = snackbarUtil;
        zq3.f(jkVar, "null cannot be cast to non-null type com.nytimes.android.MainActivity");
        final MainActivity mainActivity = (MainActivity) jkVar;
        this.e = mainActivity;
        final qs2 qs2Var = null;
        this.f = new s(zt6.b(NotificationsBannerViewModel.class), new qs2() { // from class: com.nytimes.android.mainactivity.MainBottomNavUi$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.mainactivity.MainBottomNavUi$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.mainactivity.MainBottomNavUi$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.h = b0.e(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsBannerViewModel h() {
        return (NotificationsBannerViewModel) this.f.getValue();
    }

    private final void m(final yz3 yz3Var) {
        FlowKt.launchIn(FlowKt.onEach(h().n(), new MainBottomNavUi$setupBanner$1(yz3Var, this, null)), e44.a(this.e));
        yz3Var.d.setOnClickListener(new View.OnClickListener() { // from class: zd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainBottomNavUi.n(MainBottomNavUi.this, view);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(h().p(), new MainBottomNavUi$setupBanner$3(this, yz3Var, null)), e44.a(this.e));
        FlowKt.launchIn(FlowKt.onEach(h().n(), new MainBottomNavUi$setupBanner$4(yz3Var, this, null)), e44.a(this.e));
        yz3Var.b.setOnClickListener(new View.OnClickListener() { // from class: ae4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainBottomNavUi.o(MainBottomNavUi.this, yz3Var, view);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(h().o(), 500L), new MainBottomNavUi$setupBanner$6(yz3Var, null)), e44.a(this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MainBottomNavUi mainBottomNavUi, View view) {
        zq3.h(mainBottomNavUi, "this$0");
        MainActivity mainActivity = mainBottomNavUi.e;
        mainActivity.startActivity(ComposeNotificationsActivity.Companion.a(mainActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MainBottomNavUi mainBottomNavUi, yz3 yz3Var, View view) {
        zq3.h(mainBottomNavUi, "this$0");
        zq3.h(yz3Var, "$bannerBinding");
        mainBottomNavUi.h().q();
        yz3Var.e.animate().y(-800.0f).setDuration(300L).setInterpolator(new ka2());
        yz3Var.getRoot().setVisibility(8);
    }

    public final void f() {
        w4 c = w4.c(this.a.getLayoutInflater());
        zq3.g(c, "inflate(...)");
        this.g = c;
    }

    public final Spanned g(String str) {
        zq3.h(str, "<this>");
        Spanned a2 = ma3.a(str, 63);
        zq3.g(a2, "fromHtml(...)");
        return a2;
    }

    public final de4 i() {
        return (de4) this.h.getValue();
    }

    public final void j() {
        w4 w4Var = this.g;
        if (w4Var == null) {
            zq3.z("binding");
            w4Var = null;
        }
        yz3 yz3Var = w4Var.g;
        zq3.g(yz3Var, "notificationsBannerContainer");
        m(yz3Var);
    }

    public final void k(boolean z) {
        de4 i2 = i();
        if (i2 != null) {
            this.b.a(this.e, i2, z);
        }
    }

    public final void l(de4 de4Var) {
        this.h.setValue(de4Var);
    }
}
