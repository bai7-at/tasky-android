package com.nytimes.android.composeui.notice;

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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.dj7;
import defpackage.ek6;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.k48;
import defpackage.lj7;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class EmailSupportErrorDialogKt {
    public static final void a(Modifier modifier, final qs2 qs2Var, long j, j jVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        j jVar2;
        Modifier modifier3;
        j jVar3;
        final Modifier modifier4;
        final j jVar4;
        int i4;
        zq3.h(qs2Var, "onDismissRequest");
        Composer h = composer.h(857901578);
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
            i3 |= h.S(qs2Var) ? 32 : 16;
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
                b.S(857901578, i7, -1, "com.nytimes.android.composeui.notice.DismissButton (EmailSupportErrorDialog.kt:115)");
            }
            h.z(220663555);
            boolean S = h.S(qs2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$DismissButton$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m321invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m321invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            Modifier e = ClickableKt.e(modifier3, false, null, null, (qs2) A, 7, null);
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
            final String b2 = k48.b(ek6.error_dialog_dismiss_accessibility, h, 0);
            String b3 = k48.b(ek6.error_dialog_dismiss_label, h, 0);
            int a3 = dh8.b.a();
            float f = 32;
            float f2 = 16;
            Modifier l = PaddingKt.l(Modifier.a, bu1.g(f), bu1.g(f2), bu1.g(f), bu1.g(f2));
            h.z(815784803);
            boolean S2 = h.S(b2);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$DismissButton$2$1$1
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
                h.q(A2);
            }
            h.R();
            TextKt.e(b3, dj7.a(l, (ss2) A2), j3, 0L, null, null, null, 0L, null, dh8.h(a3), 0L, 0, false, 0, null, jVar3, h, i7 & 896, (i7 << 6) & 458752, 32248);
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
            k.a(new gt2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$DismissButton$3
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
                    EmailSupportErrorDialogKt.a(Modifier.this, qs2Var, j4, jVar4, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void b(Modifier modifier, final qs2 qs2Var, long j, j jVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        j jVar2;
        Modifier modifier3;
        j jVar3;
        final Modifier modifier4;
        final j jVar4;
        int i4;
        zq3.h(qs2Var, "onEmailSupportRequested");
        Composer h = composer.h(-1720262075);
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
            i3 |= h.S(qs2Var) ? 32 : 16;
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
                b.S(-1720262075, i7, -1, "com.nytimes.android.composeui.notice.EmailSupportButton (EmailSupportErrorDialog.kt:142)");
            }
            h.z(-460768719);
            boolean S = h.S(qs2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$EmailSupportButton$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m322invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m322invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            Modifier e = ClickableKt.e(modifier3, false, null, null, (qs2) A, 7, null);
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
            final String b2 = k48.b(ek6.error_dialog_email_support_accessibility, h, 0);
            String b3 = k48.b(ek6.error_dialog_email_support_label, h, 0);
            int a3 = dh8.b.a();
            float f = 32;
            float f2 = 16;
            Modifier l = PaddingKt.l(Modifier.a, bu1.g(f), bu1.g(f2), bu1.g(f), bu1.g(f2));
            h.z(1672207978);
            boolean S2 = h.S(b2);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$EmailSupportButton$2$1$1
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
                h.q(A2);
            }
            h.R();
            TextKt.e(b3, dj7.a(l, (ss2) A2), j3, 0L, null, null, null, 0L, null, dh8.h(a3), 0L, 0, false, 0, null, jVar3, h, i7 & 896, (i7 << 6) & 458752, 32248);
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
            k.a(new gt2() { // from class: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt$EmailSupportButton$3
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
                    EmailSupportErrorDialogKt.b(Modifier.this, qs2Var, j4, jVar4, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r47, final defpackage.qs2 r48, androidx.compose.ui.Modifier r49, defpackage.qs2 r50, long r51, long r53, androidx.compose.ui.text.j r55, java.lang.String r56, androidx.compose.ui.text.j r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.composeui.notice.EmailSupportErrorDialogKt.c(java.lang.String, qs2, androidx.compose.ui.Modifier, qs2, long, long, androidx.compose.ui.text.j, java.lang.String, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int):void");
    }
}
