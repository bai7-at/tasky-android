package com.nytimes.android.growthui.paywall;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.theme.GrowthUIThemeKt;
import com.nytimes.android.growthui.paywall.layouts.PaywallLayoutKt;
import defpackage.gt2;
import defpackage.le0;
import defpackage.qs2;
import defpackage.t53;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class PaywallDialogFragment extends com.nytimes.android.growthui.paywall.a {
    public static final a Companion = new a(null);
    public static final int f = 8;
    public CoroutineScope applicationScope;
    public t53 theme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, FragmentManager fragmentManager, DataConfigId dataConfigId, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            aVar.a(fragmentManager, dataConfigId, str);
        }

        public final void a(FragmentManager fragmentManager, DataConfigId dataConfigId, String str) {
            zq3.h(fragmentManager, "fragmentManager");
            zq3.h(dataConfigId, "configId");
            PaywallDialogFragment paywallDialogFragment = new PaywallDialogFragment();
            paywallDialogFragment.setArguments(le0.a(new Pair("CONFIG_ID", dataConfigId), new Pair("VARIANT_NAME", str)));
            paywallDialogFragment.setCancelable(false);
            paywallDialogFragment.show(fragmentManager, "PaywallDialogFragment");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(DataConfigId dataConfigId) {
        BuildersKt__Builders_commonKt.launch$default(g1(), null, null, new PaywallDialogFragment$onButtonClick$1(this, dataConfigId == DataConfigId.WordlebotPaywall ? DataConfigId.PlayTab : DataConfigId.AllAccess, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        dismissAllowingStateLoss();
        f activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final CoroutineScope g1() {
        CoroutineScope coroutineScope = this.applicationScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("applicationScope");
        return null;
    }

    public final t53 h1() {
        t53 t53Var = this.theme;
        if (t53Var != null) {
            return t53Var;
        }
        zq3.z("theme");
        return null;
    }

    @Override // defpackage.wk, androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext());
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("CONFIG_ID") : null;
        final DataConfigId dataConfigId = serializable instanceof DataConfigId ? (DataConfigId) serializable : null;
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.b);
        composeView.setContent(zr0.c(-1868910044, true, new gt2() { // from class: com.nytimes.android.growthui.paywall.PaywallDialogFragment$onCreateView$1$1
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
                    androidx.compose.runtime.b.S(-1868910044, i, -1, "com.nytimes.android.growthui.paywall.PaywallDialogFragment.onCreateView.<anonymous>.<anonymous> (PaywallDialogFragment.kt:50)");
                }
                t53 h1 = PaywallDialogFragment.this.h1();
                final PaywallDialogFragment paywallDialogFragment = PaywallDialogFragment.this;
                final DataConfigId dataConfigId2 = dataConfigId;
                GrowthUIThemeKt.a(h1, zr0.b(composer, 950464607, true, new gt2() { // from class: com.nytimes.android.growthui.paywall.PaywallDialogFragment$onCreateView$1$1.1
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
                            androidx.compose.runtime.b.S(950464607, i2, -1, "com.nytimes.android.growthui.paywall.PaywallDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PaywallDialogFragment.kt:51)");
                        }
                        final PaywallDialogFragment paywallDialogFragment2 = PaywallDialogFragment.this;
                        final DataConfigId dataConfigId3 = dataConfigId2;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.growthui.paywall.PaywallDialogFragment.onCreateView.1.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m557invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m557invoke() {
                                PaywallDialogFragment.this.i1(dataConfigId3);
                            }
                        };
                        final PaywallDialogFragment paywallDialogFragment3 = PaywallDialogFragment.this;
                        PaywallLayoutKt.a(qs2Var, new qs2() { // from class: com.nytimes.android.growthui.paywall.PaywallDialogFragment.onCreateView.1.1.1.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m558invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m558invoke() {
                                PaywallDialogFragment.this.j1();
                            }
                        }, null, composer2, 0, 4);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 48, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
        return composeView;
    }
}
