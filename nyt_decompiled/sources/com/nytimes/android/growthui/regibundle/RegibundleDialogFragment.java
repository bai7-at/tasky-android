package com.nytimes.android.growthui.regibundle;

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
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.common.theme.GrowthUIThemeKt;
import com.nytimes.android.growthui.regibundle.layouts.RegibundleLayoutKt;
import defpackage.cu6;
import defpackage.gt2;
import defpackage.n75;
import defpackage.qs2;
import defpackage.t43;
import defpackage.t53;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class RegibundleDialogFragment extends com.nytimes.android.growthui.regibundle.a {
    public static final a Companion = new a(null);
    public static final int f = 8;
    public CoroutineScope applicationScope;
    public t43 auth;
    public Map<DataConfigId, cu6> eventsSenderMap;
    public t53 theme;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager) {
            zq3.h(fragmentManager, "fragmentManager");
            new RegibundleDialogFragment().show(fragmentManager, "RegibundleDialogFragment");
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1() {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        BuildersKt__Builders_commonKt.launch$default(i1(), null, null, new RegibundleDialogFragment$onLoginClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1() {
        BuildersKt__Builders_commonKt.launch$default(i1(), null, null, new RegibundleDialogFragment$onRegistrationButtonClick$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1() {
        BuildersKt__Builders_commonKt.launch$default(i1(), null, null, new RegibundleDialogFragment$onSubscribeButtonClick$1(this, null), 3, null);
    }

    public final CoroutineScope i1() {
        CoroutineScope coroutineScope = this.applicationScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("applicationScope");
        return null;
    }

    public final t43 j1() {
        t43 t43Var = this.auth;
        if (t43Var != null) {
            return t43Var;
        }
        zq3.z("auth");
        return null;
    }

    public final Map k1() {
        Map<DataConfigId, cu6> map = this.eventsSenderMap;
        if (map != null) {
            return map;
        }
        zq3.z("eventsSenderMap");
        return null;
    }

    public final t53 l1() {
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
        final cu6 cu6Var = (cu6) k1().get(DataConfigId.Regibundle);
        if (cu6Var == null) {
            cu6Var = n75.a;
        }
        cu6Var.c(this);
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.b);
        cu6Var.d();
        composeView.setContent(zr0.c(-1808604437, true, new gt2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment$onCreateView$1$1
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
                    androidx.compose.runtime.b.S(-1808604437, i, -1, "com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.<anonymous>.<anonymous> (RegibundleDialogFragment.kt:61)");
                }
                t53 l1 = RegibundleDialogFragment.this.l1();
                final cu6 cu6Var2 = cu6Var;
                final RegibundleDialogFragment regibundleDialogFragment = RegibundleDialogFragment.this;
                GrowthUIThemeKt.a(l1, zr0.b(composer, 1341749008, true, new gt2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment$onCreateView$1$1.1
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
                            androidx.compose.runtime.b.S(1341749008, i2, -1, "com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (RegibundleDialogFragment.kt:62)");
                        }
                        final cu6 cu6Var3 = cu6.this;
                        final RegibundleDialogFragment regibundleDialogFragment2 = regibundleDialogFragment;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.1.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m564invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m564invoke() {
                                cu6.this.a();
                                regibundleDialogFragment2.n1();
                            }
                        };
                        final RegibundleDialogFragment regibundleDialogFragment3 = regibundleDialogFragment;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.1.1.1.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m565invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m565invoke() {
                                RegibundleDialogFragment.this.m1();
                            }
                        };
                        final cu6 cu6Var4 = cu6.this;
                        final RegibundleDialogFragment regibundleDialogFragment4 = regibundleDialogFragment;
                        qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.1.1.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m566invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m566invoke() {
                                cu6.this.e();
                                regibundleDialogFragment4.o1();
                            }
                        };
                        final cu6 cu6Var5 = cu6.this;
                        final RegibundleDialogFragment regibundleDialogFragment5 = regibundleDialogFragment;
                        RegibundleLayoutKt.a(qs2Var, qs2Var2, qs2Var3, new qs2() { // from class: com.nytimes.android.growthui.regibundle.RegibundleDialogFragment.onCreateView.1.1.1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m567invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m567invoke() {
                                cu6.this.b();
                                regibundleDialogFragment5.p1();
                            }
                        }, null, composer2, 0, 16);
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
