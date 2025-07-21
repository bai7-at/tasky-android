package com.nytimes.subauth.ui.ui.screens.regilite;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.gt2;
import defpackage.j98;
import defpackage.k48;
import defpackage.mm6;
import defpackage.r54;
import defpackage.ss2;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class VerifyEmailScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final String str, Composer composer, final int i) {
        int i2;
        j b;
        Composer composer2;
        Composer h = composer.h(824868945);
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
                b.S(824868945, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.CodeSentTextSection (VerifyEmailScreen.kt:155)");
            }
            h.z(685008647);
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            h.z(685009304);
            j98 j98Var = j98.a;
            int n = c0064a.n(j98Var.c(h, 8).b().R());
            try {
                c0064a.i(k48.b(mm6.subauth_enter_the_code_we_sent_to, h, 0));
                c0064a.i(" ");
                ww8 ww8Var = ww8.a;
                c0064a.k(n);
                h.R();
                b = r16.b((r42 & 1) != 0 ? r16.a.i() : 0L, (r42 & 2) != 0 ? r16.a.m() : 0L, (r42 & 4) != 0 ? r16.a.p() : o.b.l(), (r42 & 8) != 0 ? r16.a.n() : null, (r42 & 16) != 0 ? r16.a.o() : null, (r42 & 32) != 0 ? r16.a.k() : null, (r42 & 64) != 0 ? r16.a.l() : null, (r42 & 128) != 0 ? r16.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r16.a.g() : null, (r42 & 512) != 0 ? r16.a.w() : null, (r42 & 1024) != 0 ? r16.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r16.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r16.a.u() : null, (r42 & 8192) != 0 ? r16.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r16.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r16.b.i()) : null, (r42 & 65536) != 0 ? r16.b.e() : 0L, (r42 & 131072) != 0 ? j98Var.c(h, 8).b().b.j() : null);
                n = c0064a.n(b.R());
                try {
                    c0064a.i(str);
                    c0064a.i(" ");
                    c0064a.k(n);
                    h.z(685023703);
                    n = c0064a.n(j98Var.c(h, 8).b().R());
                    try {
                        c0064a.i(k48.b(mm6.subauth_to_update_your_login, h, 0));
                        c0064a.k(n);
                        h.R();
                        a o = c0064a.o();
                        h.R();
                        composer2 = h;
                        TextKt.b(o, null, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), j98Var.c(h, 8).b().w(), 0, false, 0, null, null, null, composer2, 0, 0, 129534);
                        if (b.G()) {
                            b.R();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$CodeSentTextSection$2
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
                    VerifyEmailScreenKt.a(str, composer3, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r44, final java.lang.String r45, final boolean r46, final defpackage.ss2 r47, final defpackage.gt2 r48, final defpackage.ss2 r49, final defpackage.gt2 r50, androidx.compose.ui.Modifier r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt.b(java.lang.String, java.lang.String, boolean, ss2, gt2, ss2, gt2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(Modifier modifier, final SubauthLoginViewModel subauthLoginViewModel, Composer composer, final int i, final int i2) {
        zq3.h(subauthLoginViewModel, "viewModel");
        Composer h = composer.h(1182840850);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1182840850, i, -1, "com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreen (VerifyEmailScreen.kt:37)");
        }
        x08 b = y.b(subauthLoginViewModel.Y(), null, h, 8, 1);
        r54 d = d(b);
        zq3.f(d, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.VerifyEmailScreen");
        String f = ((r54.g) d).f();
        r54 d2 = d(b);
        zq3.f(d2, "null cannot be cast to non-null type com.nytimes.subauth.ui.login.helpers.LireScreenState.VerifyEmailScreen");
        String e = ((r54.g) d2).e();
        x08 b2 = y.b(subauthLoginViewModel.l0(), null, h, 8, 1);
        if (e == null) {
            e = "";
        }
        final Modifier modifier3 = modifier2;
        b(f, e, e(b2), new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$VerifyEmailScreen$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "verificationCode");
                SubauthLoginViewModel.this.F0(str);
            }
        }, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$VerifyEmailScreen$2
            {
                super(2);
            }

            public final void b(String str, String str2) {
                zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                zq3.h(str2, "verificationCode");
                SubauthLoginViewModel.this.E0(str, str2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (String) obj2);
                return ww8.a;
            }
        }, new ss2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$VerifyEmailScreen$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
                SubauthLoginViewModel.N0(SubauthLoginViewModel.this, str, false, 2, null);
            }
        }, new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$VerifyEmailScreen$4
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
        }, modifier2, h, (i << 21) & 29360128, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.VerifyEmailScreenKt$VerifyEmailScreen$5
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
                    VerifyEmailScreenKt.c(Modifier.this, subauthLoginViewModel, composer2, i | 1, i2);
                }
            });
        }
    }

    private static final r54 d(x08 x08Var) {
        return (r54) x08Var.getValue();
    }

    private static final boolean e(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }
}
