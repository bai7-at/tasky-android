package com.nytimes.android.messaging.regibundle;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.messaging.regibundle.models.RegibundleData;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.bu1;
import defpackage.by0;
import defpackage.c37;
import defpackage.d37;
import defpackage.d58;
import defpackage.e44;
import defpackage.eb5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i83;
import defpackage.lu6;
import defpackage.n98;
import defpackage.pa9;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.t21;
import defpackage.uy3;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class RegibundleFragment extends com.nytimes.android.messaging.regibundle.a {
    public static final a Companion = new a(null);
    public static final int j = 8;
    public com.nytimes.android.entitlements.a ecommClient;
    public lu6 eventSender;
    private d58 f;
    private final qs2 g = new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment$onLoginClicked$1

        @fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$onLoginClicked$1$1", f = "RegibundleFragment.kt", l = {63}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.messaging.regibundle.RegibundleFragment$onLoginClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
            int label;
            final /* synthetic */ RegibundleFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RegibundleFragment regibundleFragment, by0 by0Var) {
                super(2, by0Var);
                this.this$0 = regibundleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass1(this.this$0, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    z58 k1 = this.this$0.k1();
                    androidx.fragment.app.f requireActivity = this.this$0.requireActivity();
                    zq3.g(requireActivity, "requireActivity(...)");
                    this.label = 1;
                    if (n98.a.a(k1, requireActivity, false, null, null, this, 14, null) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                this.this$0.i1().b("Log In");
                this.this$0.dismissAllowingStateLoss();
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m607invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m607invoke() {
            androidx.fragment.app.f requireActivity = RegibundleFragment.this.requireActivity();
            zq3.g(requireActivity, "requireActivity(...)");
            BuildersKt__Builders_commonKt.launch$default(e44.a(requireActivity), null, null, new AnonymousClass1(RegibundleFragment.this, null), 3, null);
        }
    };
    private final qs2 h = new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment$onCreateAccountClicked$1

        @fc1(c = "com.nytimes.android.messaging.regibundle.RegibundleFragment$onCreateAccountClicked$1$1", f = "RegibundleFragment.kt", l = {72}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.messaging.regibundle.RegibundleFragment$onCreateAccountClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
            int label;
            final /* synthetic */ RegibundleFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RegibundleFragment regibundleFragment, by0 by0Var) {
                super(2, by0Var);
                this.this$0 = regibundleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass1(this.this$0, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    z58 k1 = this.this$0.k1();
                    androidx.fragment.app.f requireActivity = this.this$0.requireActivity();
                    zq3.g(requireActivity, "requireActivity(...)");
                    this.label = 1;
                    if (n98.a.a(k1, requireActivity, false, null, null, this, 14, null) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
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

        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m605invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m605invoke() {
            RegibundleFragment.this.i1().b("Create a free account");
            androidx.fragment.app.f requireActivity = RegibundleFragment.this.requireActivity();
            zq3.g(requireActivity, "requireActivity(...)");
            BuildersKt__Builders_commonKt.launch$default(e44.a(requireActivity), null, null, new AnonymousClass1(RegibundleFragment.this, null), 3, null);
        }
    };
    private final qs2 i = new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment$onSubscribeClicked$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m608invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m608invoke() {
            RegibundleFragment.this.i1().b("See subscription options");
            RegibundleFragment.this.j1().c(CampaignCodeSource.GATEWAY, RegiInterface.RegiGateway, "", "dismissible regi bundle");
            RegibundleFragment.this.m1();
        }
    };
    public uy3 productLandingHelper;
    public z58 subauthClient;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void l1() {
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(k1().e(), new RegibundleFragment$listenForLireEvents$1(this, null)), new RegibundleFragment$listenForLireEvents$2(this, null)), e44.a(this));
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(k1().B(), new RegibundleFragment$listenForLireEvents$3(this, null)), new RegibundleFragment$listenForLireEvents$4(this, null)), e44.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new RegibundleFragment$listenForSuccessfulPurchaseEvent$1(this, null), 3, null);
    }

    public final lu6 i1() {
        lu6 lu6Var = this.eventSender;
        if (lu6Var != null) {
            return lu6Var;
        }
        zq3.z("eventSender");
        return null;
    }

    public final uy3 j1() {
        uy3 uy3Var = this.productLandingHelper;
        if (uy3Var != null) {
            return uy3Var;
        }
        zq3.z("productLandingHelper");
        return null;
    }

    public final z58 k1() {
        z58 z58Var = this.subauthClient;
        if (z58Var != null) {
            return z58Var;
        }
        zq3.z("subauthClient");
        return null;
    }

    @Override // defpackage.wk, androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        androidx.fragment.app.f requireActivity = requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        Dialog onCreateDialog = DeviceUtils.G(requireActivity) ? super.onCreateDialog(bundle) : new com.google.android.material.bottomsheet.a(requireContext(), getTheme());
        zq3.e(onCreateDialog);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        d58 c = d58.c(layoutInflater, viewGroup, false);
        zq3.g(c, "inflate(...)");
        this.f = c;
        d58 d58Var = null;
        if (c == null) {
            zq3.z("binding");
            c = null;
        }
        ComposeView composeView = c.b;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.b);
        composeView.setContent(zr0.c(-256889706, true, new gt2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment$onCreateView$1$1
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
                if (b.G()) {
                    b.S(-256889706, i, -1, "com.nytimes.android.messaging.regibundle.RegibundleFragment.onCreateView.<anonymous>.<anonymous> (RegibundleFragment.kt:107)");
                }
                final RegibundleFragment regibundleFragment = RegibundleFragment.this;
                NytThemeKt.a(false, null, null, zr0.b(composer, 557716006, true, new gt2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        c37 e;
                        qs2 qs2Var;
                        qs2 qs2Var2;
                        qs2 qs2Var3;
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(557716006, i2, -1, "com.nytimes.android.messaging.regibundle.RegibundleFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (RegibundleFragment.kt:108)");
                        }
                        composer2.z(1890788296);
                        sa9 a2 = LocalViewModelStoreOwner.a.a(composer2, LocalViewModelStoreOwner.c);
                        if (a2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        t.b a3 = i83.a(a2, composer2, 0);
                        composer2.z(1729797275);
                        q c2 = pa9.c(RegibundleViewModel.class, a2, null, a3, a2 instanceof d ? ((d) a2).getDefaultViewModelCreationExtras() : t21.a.b, composer2, 36936, 0);
                        composer2.R();
                        composer2.R();
                        RegibundleViewModel regibundleViewModel = (RegibundleViewModel) c2;
                        Modifier t = SizeKt.t(Modifier.a, bu1.g(0), bu1.g(500));
                        long a4 = eb5.Companion.a(composer2, 8).a();
                        if (DeviceUtils.G((Context) composer2.m(AndroidCompositionLocals_androidKt.g()))) {
                            e = d37.c(bu1.g(10));
                        } else {
                            float f = 10;
                            e = d37.e(bu1.g(f), bu1.g(f), 0.0f, 0.0f, 12, null);
                        }
                        Modifier c3 = BackgroundKt.c(t, a4, e);
                        boolean l = regibundleViewModel.l();
                        String str = (String) y.b(regibundleViewModel.j(), null, composer2, 8, 1).getValue();
                        RegibundleData regibundleData = (RegibundleData) y.b(regibundleViewModel.k(), null, composer2, 8, 1).getValue();
                        qs2Var = RegibundleFragment.this.g;
                        qs2Var2 = RegibundleFragment.this.h;
                        qs2Var3 = RegibundleFragment.this.i;
                        final RegibundleFragment regibundleFragment2 = RegibundleFragment.this;
                        RegibundleMessageKt.c(l, str, regibundleData, c3, qs2Var, qs2Var2, qs2Var3, new qs2() { // from class: com.nytimes.android.messaging.regibundle.RegibundleFragment.onCreateView.1.1.1.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m606invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m606invoke() {
                                RegibundleFragment.this.dismiss();
                            }
                        }, composer2, 512, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        d58 d58Var2 = this.f;
        if (d58Var2 == null) {
            zq3.z("binding");
        } else {
            d58Var = d58Var2;
        }
        FrameLayout root = d58Var.getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(true);
        Object parent = view.getParent();
        zq3.f(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setBackgroundColor(0);
        if (bundle == null) {
            i1().a();
        }
        l1();
    }
}
