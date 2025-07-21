package com.nytimes.subauth.ui.ui.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.fragment.app.f;
import com.amazonaws.event.ProgressEvent;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.na4;
import defpackage.r54;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class LoginScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e7, code lost:
    
        if (r15 == r24.a()) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0499, code lost:
    
        if (r10 == null) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r62, java.lang.String r63, boolean r64, na4.b r65, defpackage.ss2 r66, defpackage.ss2 r67, defpackage.gt2 r68, defpackage.gt2 r69, androidx.compose.runtime.Composer r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 1435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.LoginScreenKt.a(java.lang.String, java.lang.String, boolean, na4$b, ss2, ss2, gt2, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final f fVar, final SubauthLoginViewModel subauthLoginViewModel, Composer composer, final int i) {
        zq3.h(fVar, "activity");
        zq3.h(subauthLoginViewModel, "viewModel");
        Composer h = composer.h(992087275);
        if (b.G()) {
            b.S(992087275, i, -1, "com.nytimes.subauth.ui.ui.screens.LoginScreen (LoginScreen.kt:162)");
        }
        x08 b = y.b(subauthLoginViewModel.Y(), null, h, 8, 1);
        x08 a = y.a(subauthLoginViewModel.l0(), Boolean.FALSE, null, h, 56, 2);
        x08 a2 = y.a(subauthLoginViewModel.V(), null, null, h, 56, 2);
        r54 c = c(b);
        zq3.f(c, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.LoginScreen");
        String f = ((r54.d) c).f();
        r54 c2 = c(b);
        zq3.f(c2, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.LoginScreen");
        String e = ((r54.d) c2).e();
        boolean z = !((Boolean) a.getValue()).booleanValue();
        na4 d = d(a2);
        a(f, e, z, d instanceof na4.b ? (na4.b) d : null, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.LoginScreenKt$LoginScreen$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "it");
                SubauthLoginViewModel.this.O();
            }
        }, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.LoginScreenKt$LoginScreen$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "newPassword");
                SubauthLoginViewModel.this.F0(str);
                SubauthLoginViewModel.this.O();
            }
        }, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LoginScreenKt$LoginScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(String str, String str2) {
                zq3.h(str, "username");
                zq3.h(str2, "password");
                SubauthLoginViewModel.this.z0(h.c1(str).toString(), str2, fVar);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (String) obj2);
                return ww8.a;
            }
        }, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LoginScreenKt$LoginScreen$4
            {
                super(2);
            }

            public final void b(String str, String str2) {
                zq3.h(str, "url");
                zq3.h(str2, "title");
                SubauthLoginViewModel.this.I0(str, str2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (String) obj2);
                return ww8.a;
            }
        }, h, ProgressEvent.PART_FAILED_EVENT_CODE, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.LoginScreenKt$LoginScreen$5
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
                    LoginScreenKt.b(f.this, subauthLoginViewModel, composer2, i | 1);
                }
            });
        }
    }

    private static final r54 c(x08 x08Var) {
        return (r54) x08Var.getValue();
    }

    private static final na4 d(x08 x08Var) {
        return (na4) x08Var.getValue();
    }
}
