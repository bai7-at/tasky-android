package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavController;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.subauth.ui.purr.ui.compose.PurrComposeUIKt;
import com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt;
import com.nytimes.subauth.ui.purr.ui.screens.a;

/* loaded from: classes.dex */
public abstract class PrivacySettingsScreenKt {
    public static final void a(final x08 x08Var, final NavController navController, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Modifier.a aVar;
        Modifier m;
        zq3.h(x08Var, TransferTable.COLUMN_STATE);
        zq3.h(navController, "navController");
        zq3.h(qs2Var, "checkDeviceOnline");
        zq3.h(qs2Var2, "onAccountDeleteClicked");
        Composer h = composer.h(-1195524286);
        if (b.G()) {
            b.S(-1195524286, i, -1, "PrivacySettingsScreen (PrivacySettingsScreen.kt:39)");
        }
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        Modifier.a aVar2 = Modifier.a;
        Modifier f = SizeKt.f(aVar2, 0.0f, 1, null);
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar3 = Alignment.a;
        rg4 a = d.a(g, aVar3.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 b = LayoutKt.b(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        h.H();
        Composer a3 = Updater.a(h);
        Updater.c(a3, a, companion.e());
        Updater.c(a3, fm1Var, companion.c());
        Updater.c(a3, layoutDirection, companion.d());
        Updater.c(a3, r99Var, companion.h());
        h.c();
        b.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1163856341);
        ap0 ap0Var = ap0.a;
        PurrComposeUIKt.a(mm6.privacy_settings, navController, h, 64);
        h.z(-402425316);
        if (((i36) x08Var.getValue()).g()) {
            TextFieldsKt.c(PaddingKt.m(aVar2, 0.0f, bu1.g(22), 0.0f, 0.0f, 13, null), mm6.privacy_preference, h, 6, 0);
            Arrangement.e c = arrangement.c();
            Alignment.c i5 = aVar3.i();
            h.z(693286680);
            rg4 a4 = m.a(c, i5, h, 54);
            h.z(-1323940314);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a5 = companion.a();
            it2 b2 = LayoutKt.b(aVar2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a5);
            } else {
                h.p();
            }
            h.H();
            Composer a6 = Updater.a(h);
            Updater.c(a6, a4, companion.e());
            Updater.c(a6, fm1Var2, companion.c());
            Updater.c(a6, layoutDirection2, companion.d());
            Updater.c(a6, r99Var2, companion.h());
            h.c();
            b2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-678309503);
            n37 n37Var = n37.a;
            h.z(-635042783);
            if (((i36) x08Var.getValue()).e()) {
                TextFieldsKt.d(null, mm6.your_privacy_choices, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m1invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1invoke() {
                        NavController.T(NavController.this, a.g.b.a(), null, null, 6, null);
                    }
                }, 0L, h, 0, 9);
                if (r81.a(h, 0)) {
                    h.z(1788816582);
                    i3 = 24;
                    aVar = aVar2;
                    ImageKt.b(do5.d(cf6.privacy_icon_dark, h, 0), k48.b(mm6.icon_content_description, h, 0), PaddingKt.m(aVar2, bu1.g(7), bu1.g(24), 0.0f, 0.0f, 12, null), null, null, 0.0f, null, h, 392, 120);
                    h.R();
                } else {
                    aVar = aVar2;
                    i3 = 24;
                    h.z(1789178507);
                    ImageKt.b(do5.d(cf6.privacy_icon, h, 0), k48.b(mm6.icon_content_description, h, 0), PaddingKt.m(aVar, bu1.g(7), bu1.g(24), 0.0f, 0.0f, 12, null), null, null, 0.0f, null, h, 392, 120);
                    h.R();
                }
            } else {
                aVar = aVar2;
                i3 = 24;
            }
            h.R();
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            h.z(-402380307);
            if (((i36) x08Var.getValue()).f()) {
                TextFieldsKt.d(null, mm6.limit_sensitive_information, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m2invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m2invoke() {
                        if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                            d51.a.a(context, PurrShowLimitSensitivePIUiDirective.URL);
                        }
                    }
                }, 0L, h, 0, 9);
            }
            h.R();
            h.z(-402362842);
            if (((i36) x08Var.getValue()).h()) {
                TextFieldsKt.d(null, mm6.manage_privacy_preferences, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m3invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m3invoke() {
                        if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                            NavController.T(navController, a.f.b.a(), null, null, 6, null);
                        }
                    }
                }, 0L, h, 0, 9);
            }
            h.R();
            i4 = 32;
            float f2 = 32;
            i2 = 6;
            DividerKt.a(BackgroundKt.d(PaddingKt.m(aVar, 0.0f, bu1.g(f2), 0.0f, 0.0f, 13, null), m36.a.a(h, 6).c(), null, 2, null), 0L, 0.0f, 0.0f, h, 0, 14);
            TextFieldsKt.c(PaddingKt.m(aVar, 0.0f, bu1.g(f2), 0.0f, 0.0f, 13, null), mm6.addition_information, h, 6, 0);
        } else {
            i2 = 6;
            i3 = 24;
            i4 = 32;
            aVar = aVar2;
        }
        h.R();
        h.z(-402337132);
        if (((i36) x08Var.getValue()).d()) {
            TextFieldsKt.d(null, mm6.california_notices, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m4invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m4invoke() {
                    if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                        NavController.T(navController, a.C0462a.b.a(), null, null, 6, null);
                    }
                }
            }, 0L, h, 0, 9);
        }
        h.R();
        if (((i36) x08Var.getValue()).g()) {
            m = PaddingKt.m(aVar, bu1.g(20), bu1.g(i3), 0.0f, 0.0f, 12, null);
        } else {
            m = PaddingKt.m(aVar, bu1.g(20), bu1.g(12), 0.0f, 0.0f, 12, null);
        }
        TextFieldsKt.d(m, mm6.privacy_policy, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m5invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5invoke() {
                if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                    NavController.T(navController, a.d.b.a(), null, null, 6, null);
                }
            }
        }, 0L, h, 0, 8);
        TextFieldsKt.d(null, mm6.privacy_faq, new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m6invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() {
                if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                    NavController.T(navController, a.c.b.a(), null, null, 6, null);
                }
            }
        }, 0L, h, 0, 9);
        h.z(-402293994);
        if (((i36) x08Var.getValue()).c()) {
            float f3 = i4;
            Modifier m2 = PaddingKt.m(aVar, 0.0f, bu1.g(f3), 0.0f, 0.0f, 13, null);
            m36 m36Var = m36.a;
            DividerKt.a(BackgroundKt.d(m2, m36Var.a(h, i2).c(), null, 2, null), 0L, 0.0f, 0.0f, h, 0, 14);
            Modifier m3 = PaddingKt.m(aVar, bu1.g(20), bu1.g(f3), 0.0f, 0.0f, 12, null);
            int i6 = mm6.delete_my_account;
            long d = m36Var.a(h, i2).d();
            h.z(-402278890);
            boolean S = h.S(qs2Var2);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$1$7$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m7invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            TextFieldsKt.d(m3, i6, (qs2) A, d, h, 6, 0);
        }
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: PrivacySettingsScreenKt$PrivacySettingsScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    PrivacySettingsScreenKt.a(x08.this, navController, qs2Var, qs2Var2, composer2, i | 1);
                }
            });
        }
    }
}
