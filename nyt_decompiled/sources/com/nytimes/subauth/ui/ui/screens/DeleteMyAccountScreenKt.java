package com.nytimes.subauth.ui.ui.screens;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.composeui.base.AppBarWithTitleContentKt;
import com.nytimes.android.composeui.button.CtaButtonsKt;
import com.nytimes.android.composeui.notice.ShowSnackbarKt;
import com.nytimes.android.composeui.notice.a;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt;
import com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import com.nytimes.subauth.ui.ui.theme.ThemeKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.f68;
import defpackage.fk;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j98;
import defpackage.ju7;
import defpackage.k48;
import defpackage.ka7;
import defpackage.mm6;
import defpackage.nn0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.r81;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class DeleteMyAccountScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final zo0 zo0Var, boolean z, final qs2 qs2Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        final int i3;
        final qs2 qs2Var2;
        final boolean z2;
        Composer h = composer.h(-1722736397);
        if ((i & 14) == 0) {
            i2 = (h.S(zo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i4 = i2;
        if ((i4 & 731) == 146 && h.i()) {
            h.K();
            i3 = i;
            qs2Var2 = qs2Var;
            z2 = z;
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1722736397, i4, -1, "com.nytimes.subauth.ui.ui.screens.DeleteAccountButton (DeleteMyAccountScreen.kt:222)");
            }
            Modifier.a aVar = Modifier.a;
            SpacerKt.a(zo0.b(zo0Var, aVar, 1.0f, false, 2, null), h, 0);
            float f = 24;
            Modifier i5 = SizeKt.i(PaddingKt.m(aVar, bu1.g(f), 0.0f, bu1.g(f), bu1.g(40), 2, null), bu1.g(44));
            j c = j98.a.c(h, 8).c();
            String b = k48.b(mm6.subauth_account_delete_cta_delete_account, h, 0);
            h.z(-301954237);
            boolean S = h.S(qs2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteAccountButton$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m825invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m825invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            composer2 = h;
            i3 = i;
            qs2Var2 = qs2Var;
            z2 = z;
            CtaButtonsKt.a(b, z, (qs2) A, i5, null, 0L, 0L, 0L, 0L, 0L, c, null, composer2, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 3072, 0, 3056);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteAccountButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    DeleteMyAccountScreenKt.a(zo0.this, z2, qs2Var2, composer3, i3 | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(101445429);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(101445429, i2, -1, "com.nytimes.subauth.ui.ui.screens.DeleteAccountForUserContent (DeleteMyAccountScreen.kt:172)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier k = PaddingKt.k(aVar, bu1.g(20), 0.0f, 2, null);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(k);
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
            g(PaddingKt.m(aVar, 0.0f, bu1.g(32), 0.0f, 0.0f, 13, null), mm6.subauth_account_delete_for_user, h, 6, 0);
            Modifier m = PaddingKt.m(aVar, 0.0f, bu1.g(4), 0.0f, 0.0f, 13, null);
            j98 j98Var = j98.a;
            TextKt.e(str, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98Var.c(h, 8).b(), h, (i2 & 14) | 48, 0, 32764);
            composer2 = h;
            TextKt.e(k48.b(mm6.subauth_account_delete_cant_undo_prompt, h, 0), PaddingKt.m(aVar, 0.0f, bu1.g(8), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98Var.c(h, 8).d(), composer2, 48, 0, 32764);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteAccountForUserContent$2
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
                    DeleteMyAccountScreenKt.b(str, composer3, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1646768749);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1646768749, i2, -1, "com.nytimes.subauth.ui.ui.screens.DeleteAccountTopBar (DeleteMyAccountScreen.kt:154)");
            }
            long B = ColorKt.B(j98.a.b(h, 8).b());
            float g = r81.a(h, 0) ? bu1.g(0) : fk.a.b();
            gt2 a = ComposableSingletons$DeleteMyAccountScreenKt.a.a();
            h.z(-187370074);
            boolean S = h.S(qs2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteAccountTopBar$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m826invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m826invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            AppBarWithTitleContentKt.a(null, a, false, (qs2) A, g, B, 0L, h, 48, 69);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteAccountTopBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DeleteMyAccountScreenKt.c(qs2.this, composer2, i | 1);
                }
            });
        }
    }

    public static final void d(final f68 f68Var, final String str, final AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, final boolean z, final boolean z2, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final ss2 ss2Var, final qs2 qs2Var4, final ss2 ss2Var2, final ss2 ss2Var3, Composer composer, final int i, final int i2) {
        zq3.h(f68Var, "subauthConfig");
        zq3.h(str, "email");
        zq3.h(accountDeleteDialogState, "dialog");
        zq3.h(qs2Var, "onDeleteAccountClicked");
        zq3.h(qs2Var2, "onConfirmDeleteAccountModal");
        zq3.h(qs2Var3, "onPageVisible");
        zq3.h(ss2Var, "dismissDialog");
        zq3.h(qs2Var4, "dismissSnackbar");
        zq3.h(ss2Var2, "exitScreen");
        zq3.h(ss2Var3, "onDialogVisible");
        Composer h = composer.h(-768680557);
        if (b.G()) {
            b.S(-768680557, i, i2, "com.nytimes.subauth.ui.ui.screens.DeleteMyAccountContent (DeleteMyAccountScreen.kt:63)");
        }
        final ComponentActivity componentActivity = (ComponentActivity) h.m(AndroidCompositionLocals_androidKt.g());
        final ka7 l = ScaffoldKt.l(null, null, h, 0, 3);
        ww8 ww8Var = ww8.a;
        h.z(-529515377);
        boolean S = h.S(qs2Var3);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new DeleteMyAccountScreenKt$DeleteMyAccountContent$1$1(qs2Var3, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        ThemeKt.a(f68Var, false, zr0.b(h, 593140342, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteMyAccountContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(593140342, i3, -1, "com.nytimes.subauth.ui.ui.screens.DeleteMyAccountContent.<anonymous> (DeleteMyAccountScreen.kt:71)");
                }
                Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer2, 8));
                final ka7 ka7Var = ka7.this;
                yr0 b = zr0.b(composer2, -7979747, true, new it2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteMyAccountContent$2.1
                    {
                        super(3);
                    }

                    public final void b(SnackbarHostState snackbarHostState, Composer composer3, int i4) {
                        zq3.h(snackbarHostState, "it");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-7979747, i4, -1, "com.nytimes.subauth.ui.ui.screens.DeleteMyAccountContent.<anonymous>.<anonymous> (DeleteMyAccountScreen.kt:74)");
                        }
                        SubauthComposeUIKt.g(ka7.this, null, composer3, 0, 2);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                });
                final AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState2 = accountDeleteDialogState;
                final boolean z3 = z;
                final ComponentActivity componentActivity2 = componentActivity;
                final String str2 = str;
                final qs2 qs2Var5 = qs2Var;
                final qs2 qs2Var6 = qs2Var2;
                final ss2 ss2Var4 = ss2Var;
                final ss2 ss2Var5 = ss2Var2;
                final ss2 ss2Var6 = ss2Var3;
                final boolean z4 = z2;
                final qs2 qs2Var7 = qs2Var4;
                final ka7 ka7Var2 = ka7.this;
                ScaffoldKt.b(c, ka7Var, null, null, b, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer2, 1623711480, true, new it2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteMyAccountContent$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i4) {
                        int i5;
                        zq3.h(ym5Var, "padding");
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer3.S(ym5Var) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i5 & 91) == 18 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1623711480, i5, -1, "com.nytimes.subauth.ui.ui.screens.DeleteMyAccountContent.<anonymous>.<anonymous> (DeleteMyAccountScreen.kt:76)");
                        }
                        Modifier h2 = PaddingKt.h(Modifier.a, ym5Var);
                        AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState3 = AccountDeleteViewModel.AccountDeleteDialogState.this;
                        boolean z5 = z3;
                        ComponentActivity componentActivity3 = componentActivity2;
                        String str3 = str2;
                        qs2 qs2Var8 = qs2Var5;
                        qs2 qs2Var9 = qs2Var6;
                        ss2 ss2Var7 = ss2Var4;
                        ss2 ss2Var8 = ss2Var5;
                        ss2 ss2Var9 = ss2Var6;
                        boolean z6 = z4;
                        qs2 qs2Var10 = qs2Var7;
                        ka7 ka7Var3 = ka7Var2;
                        composer3.z(733328855);
                        rg4 g = BoxKt.g(Alignment.a.o(), false, composer3, 0);
                        composer3.z(-1323940314);
                        fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                        r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a = companion.a();
                        it2 b2 = LayoutKt.b(h2);
                        if (composer3.j() == null) {
                            cs0.c();
                        }
                        composer3.G();
                        if (composer3.f()) {
                            composer3.D(a);
                        } else {
                            composer3.p();
                        }
                        composer3.H();
                        Composer a2 = Updater.a(composer3);
                        Updater.c(a2, g, companion.e());
                        Updater.c(a2, fm1Var, companion.c());
                        Updater.c(a2, layoutDirection, companion.d());
                        Updater.c(a2, r99Var, companion.h());
                        composer3.c();
                        b2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                        composer3.z(2058660585);
                        composer3.z(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        DeleteMyAccountScreenKt.f(componentActivity3, str3, accountDeleteDialogState3 == AccountDeleteViewModel.AccountDeleteDialogState.NONE && !z5, qs2Var8, composer3, 8);
                        DeleteAccountDialogsKt.e(accountDeleteDialogState3, qs2Var9, ss2Var7, ss2Var8, ss2Var9, composer3, 0);
                        DeleteMyAccountScreenKt.e(z5, composer3, 0);
                        DeleteMyAccountScreenKt.h(z6, qs2Var10, ka7Var3, composer3, 0);
                        composer3.R();
                        composer3.R();
                        composer3.t();
                        composer3.R();
                        composer3.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 24576, 12582912, 131052);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 392, 2);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$DeleteMyAccountContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DeleteMyAccountScreenKt.d(f68.this, str, accountDeleteDialogState, z, z2, qs2Var, qs2Var2, qs2Var3, ss2Var, qs2Var4, ss2Var2, ss2Var3, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final boolean z, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-229786085);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-229786085, i2, -1, "com.nytimes.subauth.ui.ui.screens.LoadingScreen (DeleteMyAccountScreen.kt:113)");
            }
            if (z) {
                long r = nn0.r(ColorKt.B(j98.a.b(h, 8).f()), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                Modifier.a aVar = Modifier.a;
                Modifier d = BackgroundKt.d(SizeKt.f(aVar, 0.0f, 1, null), r, null, 2, null);
                h.z(733328855);
                Alignment.a aVar2 = Alignment.a;
                rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
                h.z(-1323940314);
                fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
                LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
                r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a = companion.a();
                it2 b = LayoutKt.b(d);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a);
                } else {
                    h.p();
                }
                h.H();
                Composer a2 = Updater.a(h);
                Updater.c(a2, g, companion.e());
                Updater.c(a2, fm1Var, companion.c());
                Updater.c(a2, layoutDirection, companion.d());
                Updater.c(a2, r99Var, companion.h());
                h.c();
                b.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                h.z(-2137368960);
                ProgressIndicatorKt.b(BoxScopeInstance.a.c(aVar, aVar2.e()), nn0.b.h(), 0.0f, h, 48, 4);
                h.R();
                h.R();
                h.t();
                h.R();
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$LoadingScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DeleteMyAccountScreenKt.e(z, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final ComponentActivity componentActivity, final String str, final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        Composer h = composer.h(-1742081754);
        if (b.G()) {
            b.S(-1742081754, i, -1, "com.nytimes.subauth.ui.ui.screens.MainContent (DeleteMyAccountScreen.kt:135)");
        }
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 b = LayoutKt.b(aVar);
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
        c(new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$MainContent$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m827invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m827invoke() {
                OnBackPressedDispatcher onBackPressedDispatcher;
                ComponentActivity componentActivity2 = ComponentActivity.this;
                if (componentActivity2 == null || (onBackPressedDispatcher = componentActivity2.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.l();
            }
        }, h, 0);
        int i2 = i >> 3;
        b(str, h, i2 & 14);
        float f = 20;
        DividerKt.a(BackgroundKt.d(PaddingKt.m(aVar, bu1.g(f), bu1.g(f), 0.0f, 0.0f, 12, null), ColorKt.B(j98.a.b(h, 8).D()), null, 2, null), 0L, 0.0f, 0.0f, h, 0, 14);
        i(h, 0);
        a(ap0Var, z, qs2Var, h, (i2 & 896) | (i2 & ContentType.LONG_FORM_ON_DEMAND) | 6);
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
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$MainContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DeleteMyAccountScreenKt.f(ComponentActivity.this, str, z, qs2Var, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        Composer composer2;
        Composer h = composer.h(-795675020);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (h.S(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i5 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-795675020, i4, -1, "com.nytimes.subauth.ui.ui.screens.SectionTitle (DeleteMyAccountScreen.kt:210)");
            }
            composer2 = h;
            TextKt.e(k48.b(i, h, (i4 >> 3) & 14), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(h, 8).k(), composer2, (i4 << 3) & ContentType.LONG_FORM_ON_DEMAND, 0, 32764);
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$SectionTitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    DeleteMyAccountScreenKt.g(Modifier.this, i, composer3, i2 | 1, i3);
                }
            });
        }
    }

    public static final void h(final boolean z, final qs2 qs2Var, final ka7 ka7Var, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "dismissSnackbar");
        zq3.h(ka7Var, "scaffoldState");
        Composer h = composer.h(-457649557);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(ka7Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-457649557, i2, -1, "com.nytimes.subauth.ui.ui.screens.SnackbarDisplay (DeleteMyAccountScreen.kt:103)");
            }
            if (z) {
                SnackbarHostState b = ka7Var.b();
                a.C0250a c0250a = a.C0250a.b;
                h.z(1688160101);
                boolean S = h.S(qs2Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$SnackbarDisplay$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m828invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m828invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    h.q(A);
                }
                h.R();
                ShowSnackbarKt.a(b, c0250a, (qs2) A, h, a.C0250a.c << 3);
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$SnackbarDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DeleteMyAccountScreenKt.h(z, qs2Var, ka7Var, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(9567744);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(9567744, i, -1, "com.nytimes.subauth.ui.ui.screens.WhatToExpectContent (DeleteMyAccountScreen.kt:192)");
            }
            Modifier.a aVar = Modifier.a;
            float f = 20;
            Modifier k = PaddingKt.k(aVar, bu1.g(f), 0.0f, 2, null);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(k);
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
            g(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), mm6.subauth_account_delete_what_to_expect_title, h, 6, 0);
            Modifier m = PaddingKt.m(aVar, 0.0f, bu1.g(4), 0.0f, 0.0f, 13, null);
            composer2 = h;
            TextKt.e(k48.b(mm6.subauth_account_delete_what_to_expect_prompt, h, 0), m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(h, 8).d(), composer2, 48, 0, 32764);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.DeleteMyAccountScreenKt$WhatToExpectContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    DeleteMyAccountScreenKt.i(composer3, i | 1);
                }
            });
        }
    }
}
