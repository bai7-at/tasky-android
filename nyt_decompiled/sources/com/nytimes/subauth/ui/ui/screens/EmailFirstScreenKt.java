package com.nytimes.subauth.ui.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.f;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j98;
import defpackage.ju7;
import defpackage.k48;
import defpackage.mm6;
import defpackage.n37;
import defpackage.na4;
import defpackage.nk8;
import defpackage.qs2;
import defpackage.r54;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zo0;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class EmailFirstScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, na4.b r82, defpackage.ss2 r83, defpackage.qs2 r84, defpackage.qs2 r85, defpackage.ss2 r86, defpackage.gt2 r87, androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt.a(java.lang.String, boolean, boolean, boolean, boolean, boolean, na4$b, ss2, qs2, qs2, ss2, gt2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(final SubauthLoginViewModel subauthLoginViewModel, final f fVar, Composer composer, final int i) {
        String str;
        zq3.h(subauthLoginViewModel, "viewModel");
        zq3.h(fVar, "activity");
        Composer h = composer.h(-1507558471);
        if (b.G()) {
            b.S(-1507558471, i, -1, "com.nytimes.subauth.ui.ui.screens.EmailFirstScreen (EmailFirstScreen.kt:201)");
        }
        x08 a = y.a(subauthLoginViewModel.l0(), Boolean.FALSE, null, h, 56, 2);
        x08 b = y.b(subauthLoginViewModel.Y(), null, h, 8, 1);
        x08 a2 = y.a(subauthLoginViewModel.V(), null, null, h, 56, 2);
        r54 e = e(b);
        r54.e eVar = e instanceof r54.e ? (r54.e) e : null;
        if (eVar == null || (str = eVar.d()) == null) {
            str = "";
        }
        final nk8 x = j98.a.d(h, 8).x();
        h.z(-643548863);
        Object A = h.A();
        if (A == Composer.a.a()) {
            A = y.d(new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$isReturningUser$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    String d = nk8.this.d();
                    return Boolean.valueOf(!(d == null || d.length() == 0));
                }
            });
            h.q(A);
        }
        h.R();
        boolean d = d((x08) A);
        boolean k0 = subauthLoginViewModel.k0();
        boolean k02 = subauthLoginViewModel.k0();
        boolean m0 = subauthLoginViewModel.m0();
        boolean z = !((Boolean) a.getValue()).booleanValue();
        na4 c = c(a2);
        a(str, d, k02, k0, z, m0, c instanceof na4.b ? (na4.b) c : null, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str2) {
                zq3.h(str2, "username");
                SubauthLoginViewModel.this.u0(h.c1(str2).toString());
            }
        }, new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m833invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m833invoke() {
                SubauthLoginViewModel.this.y0(fVar);
            }
        }, new qs2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m834invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m834invoke() {
                SubauthLoginViewModel.this.x0(fVar);
            }
        }, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$4
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str2) {
                zq3.h(str2, "newEmail");
                SubauthLoginViewModel.this.t0(str2);
                SubauthLoginViewModel.this.O();
            }
        }, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$5
            {
                super(2);
            }

            public final void b(String str2, String str3) {
                zq3.h(str2, "url");
                zq3.h(str3, "title");
                SubauthLoginViewModel.this.I0(str2, str3);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (String) obj2);
                return ww8.a;
            }
        }, h, 2097152, 0, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$EmailFirstScreen$6
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
                    EmailFirstScreenKt.b(SubauthLoginViewModel.this, fVar, composer2, i | 1);
                }
            });
        }
    }

    private static final na4 c(x08 x08Var) {
        return (na4) x08Var.getValue();
    }

    private static final boolean d(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    private static final r54 e(x08 x08Var) {
        return (r54) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final zo0 zo0Var, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-2102890278);
        if ((i & 14) == 0) {
            i2 = (h.S(zo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-2102890278, i2, -1, "com.nytimes.subauth.ui.ui.screens.TitleText (EmailFirstScreen.kt:178)");
            }
            int i3 = (z2 && z) ? mm6.subauth_email_first_screen_ta_welcome : z2 ? mm6.subauth_email_first_screen_ta_create_account : mm6.subauth_email_first_screen_title;
            Modifier.a aVar = Modifier.a;
            Alignment.a aVar2 = Alignment.a;
            Modifier c = zo0Var.c(aVar, aVar2.g());
            h.z(693286680);
            rg4 a = m.a(Arrangement.a.f(), aVar2.l(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(c);
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
            h.z(-678309503);
            n37 n37Var = n37.a;
            composer2 = h;
            TextKt.e(k48.b(i3, h, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(h, 8).n(), composer2, 0, 0, 32766);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.EmailFirstScreenKt$TitleText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    EmailFirstScreenKt.f(zo0.this, z, z2, composer3, i | 1);
                }
            });
        }
    }
}
