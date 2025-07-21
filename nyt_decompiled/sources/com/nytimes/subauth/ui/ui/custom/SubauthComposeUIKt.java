package com.nytimes.subauth.ui.ui.custom;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.composeui.base.BasicAppBarKt;
import com.nytimes.android.composeui.notice.BasicSnackbarKt;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.dj7;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j98;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.k48;
import defpackage.ka7;
import defpackage.lj7;
import defpackage.mm6;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class SubauthComposeUIKt {
    public static final void a(Modifier modifier, final ss2 ss2Var, long j, j jVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        j jVar2;
        Modifier modifier3;
        j jVar3;
        final Modifier modifier4;
        final j jVar4;
        int i4;
        zq3.h(ss2Var, "onResetPasswordRequested");
        Composer h = composer.h(-1793231888);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(ss2Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 896) == 0) {
                i3 |= h.e(j2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
            }
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                jVar2 = jVar;
                if (h.S(jVar2)) {
                    i4 = ProgressEvent.PART_COMPLETED_EVENT_CODE;
                    i3 |= i4;
                }
            } else {
                jVar2 = jVar;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            jVar2 = jVar;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            jVar4 = jVar2;
            modifier4 = modifier2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                modifier3 = i5 != 0 ? Modifier.a : modifier2;
                if (i6 != 0) {
                    j2 = nn0.b.g();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jVar3 = (j) h.m(TextKt.f());
                } else {
                    jVar3 = jVar2;
                }
            } else {
                h.K();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                jVar3 = jVar2;
                modifier3 = modifier2;
            }
            int i7 = i3;
            long j3 = j2;
            h.u();
            if (b.G()) {
                b.S(-1793231888, i7, -1, "com.nytimes.subauth.ui.ui.custom.ResetPasswordButton (SubauthComposeUI.kt:178)");
            }
            final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
            Modifier e = ClickableKt.e(modifier3, false, null, null, new qs2() { // from class: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt$ResetPasswordButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m817invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m817invoke() {
                    ss2.this.invoke(context);
                }
            }, 7, null);
            h.z(733328855);
            rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a = companion.a();
            it2 b = LayoutKt.b(e);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            final String b2 = k48.b(mm6.subauth_error_dialog_reset_password_accessibility, h, 0);
            String b3 = k48.b(mm6.subauth_error_dialog_reset_password_label, h, 0);
            int a3 = dh8.b.a();
            float f = 32;
            float f2 = 16;
            Modifier l = PaddingKt.l(Modifier.a, bu1.g(f), bu1.g(f2), bu1.g(f), bu1.g(f2));
            h.z(1458928539);
            boolean S = h.S(b2);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt$ResetPasswordButton$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        zq3.h(lj7Var, "$this$clearAndSetSemantics");
                        jj7.O(lj7Var, b2);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                };
                h.q(A);
            }
            h.R();
            TextKt.e(b3, dj7.a(l, (ss2) A), j3, 0L, null, null, null, 0L, null, dh8.h(a3), 0L, 0, false, 0, null, jVar3, h, i7 & 896, (i7 << 6) & 458752, 32248);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
            j2 = j3;
            modifier4 = modifier3;
            jVar4 = jVar3;
        }
        cc7 k = h.k();
        if (k != null) {
            final long j4 = j2;
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt$ResetPasswordButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    SubauthComposeUIKt.a(Modifier.this, ss2Var, j4, jVar4, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r47, final defpackage.qs2 r48, androidx.compose.ui.Modifier r49, final defpackage.ss2 r50, long r51, long r53, androidx.compose.ui.text.j r55, java.lang.String r56, androidx.compose.ui.text.j r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt.b(java.lang.String, qs2, androidx.compose.ui.Modifier, ss2, long, long, androidx.compose.ui.text.j, java.lang.String, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final String str, final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        zq3.h(str, "title");
        zq3.h(qs2Var, "onBack");
        Composer h = composer.h(-1325592056);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1325592056, i2, -1, "com.nytimes.subauth.ui.ui.custom.SubauthAppBar (SubauthComposeUI.kt:270)");
            }
            j98 j98Var = j98.a;
            BasicAppBarKt.a(null, str, z, qs2Var, ColorKt.B(j98Var.b(h, 8).a()), ColorKt.B(j98Var.b(h, 8).w()), h, (i2 << 3) & 8176, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt$SubauthAppBar$1
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
                    SubauthComposeUIKt.c(str, z, qs2Var, composer2, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r23, java.lang.String r24, final boolean r25, final defpackage.qs2 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt.d(java.lang.String, java.lang.String, boolean, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r21, java.lang.String r22, final defpackage.qs2 r23, defpackage.qs2 r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt.e(java.lang.String, java.lang.String, qs2, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(androidx.compose.ui.Modifier r19, final java.lang.String r20, androidx.compose.ui.text.j r21, java.util.List r22, final boolean r23, final defpackage.gt2 r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt.f(androidx.compose.ui.Modifier, java.lang.String, androidx.compose.ui.text.j, java.util.List, boolean, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(final ka7 ka7Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(ka7Var, "scaffoldState");
        Composer h = composer.h(-1046769268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(ka7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-1046769268, i3, -1, "com.nytimes.subauth.ui.ui.custom.SubauthSnackBar (SubauthComposeUI.kt:259)");
            }
            j98 j98Var = j98.a;
            BasicSnackbarKt.a(ka7Var, modifier, ColorKt.B(j98Var.b(h, 8).A()), j98Var.c(h, 8).d(), ColorKt.B(j98Var.b(h, 8).z()), h, i3 & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt$SubauthSnackBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    SubauthComposeUIKt.g(ka7.this, modifier, composer2, i | 1, i2);
                }
            });
        }
    }
}
