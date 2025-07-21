package com.nytimes.subauth.ui.ui.dialogs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.mm6;
import defpackage.n37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class DeleteAccountDialogsKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AccountDeleteViewModel.AccountDeleteDialogState.values().length];
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.CONFIRM_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.ERROR_ACTIVE_SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.ERROR_GENERAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r22, final java.lang.String r23, final java.lang.String r24, defpackage.gt2 r25, final defpackage.qs2 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt.a(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, gt2, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1720484647);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1720484647, i2, -1, "com.nytimes.subauth.ui.ui.dialogs.ActiveSubscriptionErrorDialog (DeleteAccountDialogs.kt:96)");
            }
            a(null, k48.b(mm6.subauth_dialog_subscription_error_title, h, 0), k48.b(mm6.subauth_dialog_subscription_error_message_body, h, 0), zr0.b(h, 1039297963, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$ActiveSubscriptionErrorDialog$1
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
                        b.S(1039297963, i3, -1, "com.nytimes.subauth.ui.ui.dialogs.ActiveSubscriptionErrorDialog.<anonymous> (DeleteAccountDialogs.kt:101)");
                    }
                    DeleteAccountDialogsKt.h(qs2.this, composer2, 0, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), qs2Var, h, ((i2 << 12) & 57344) | 3072, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$ActiveSubscriptionErrorDialog$2
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
                    DeleteAccountDialogsKt.b(qs2.this, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.qs2 r30, defpackage.qs2 r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt.c(qs2, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(887228331);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(887228331, i2, -1, "com.nytimes.subauth.ui.ui.dialogs.ConfirmDeleteDialog (DeleteAccountDialogs.kt:72)");
            }
            a(null, k48.b(mm6.subauth_dialog_confirm_delete_title, h, 0), k48.b(mm6.subauth_dialog_confirm_delete_message_body, h, 0), zr0.b(h, -647956355, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$ConfirmDeleteDialog$1
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
                        b.S(-647956355, i3, -1, "com.nytimes.subauth.ui.ui.dialogs.ConfirmDeleteDialog.<anonymous> (DeleteAccountDialogs.kt:77)");
                    }
                    DeleteAccountDialogsKt.c(qs2.this, qs2Var2, composer2, 0, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), qs2Var2, h, ((i2 << 9) & 57344) | 3072, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$ConfirmDeleteDialog$2
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
                    DeleteAccountDialogsKt.d(qs2.this, qs2Var2, composer2, i | 1);
                }
            });
        }
    }

    public static final void e(final AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, final qs2 qs2Var, final ss2 ss2Var, final ss2 ss2Var2, final ss2 ss2Var3, Composer composer, final int i) {
        int i2;
        zq3.h(accountDeleteDialogState, "dialog");
        zq3.h(qs2Var, "onRequestDeleteAccount");
        zq3.h(ss2Var, "dismiss");
        zq3.h(ss2Var2, "exitScreen");
        zq3.h(ss2Var3, "onDialogVisible");
        Composer h = composer.h(1335319571);
        if ((i & 14) == 0) {
            i2 = (h.S(accountDeleteDialogState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(ss2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(ss2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.S(ss2Var3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i2) == 9362 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1335319571, i2, -1, "com.nytimes.subauth.ui.ui.dialogs.DialogContent (DeleteAccountDialogs.kt:37)");
            }
            h.z(1706070831);
            boolean S = h.S(ss2Var3) | h.S(accountDeleteDialogState);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new DeleteAccountDialogsKt$DialogContent$1$1(ss2Var3, accountDeleteDialogState, null);
                h.q(A);
            }
            h.R();
            py1.d(accountDeleteDialogState, (gt2) A, h, (i2 & 14) | 64);
            int i3 = a.a[accountDeleteDialogState.ordinal()];
            if (i3 == 1) {
                h.z(1706075313);
                h.z(1706076026);
                boolean S2 = h.S(ss2Var2) | h.S(accountDeleteDialogState);
                Object A2 = h.A();
                if (S2 || A2 == Composer.a.a()) {
                    A2 = new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m819invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m819invoke() {
                            ss2.this.invoke(accountDeleteDialogState);
                        }
                    };
                    h.q(A2);
                }
                h.R();
                i((qs2) A2, h, 0);
                h.R();
            } else if (i3 == 2) {
                h.z(1706080615);
                h.z(1706082440);
                boolean S3 = h.S(qs2Var);
                Object A3 = h.A();
                if (S3 || A3 == Composer.a.a()) {
                    A3 = new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$3$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m820invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m820invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    h.q(A3);
                }
                qs2 qs2Var2 = (qs2) A3;
                h.R();
                h.z(1706085375);
                boolean S4 = h.S(ss2Var) | h.S(accountDeleteDialogState);
                Object A4 = h.A();
                if (S4 || A4 == Composer.a.a()) {
                    A4 = new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m821invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m821invoke() {
                            ss2.this.invoke(accountDeleteDialogState);
                        }
                    };
                    h.q(A4);
                }
                h.R();
                d(qs2Var2, (qs2) A4, h, 0);
                h.R();
            } else if (i3 == 3) {
                h.z(1706090776);
                h.z(1706091706);
                boolean S5 = h.S(ss2Var2) | h.S(accountDeleteDialogState);
                Object A5 = h.A();
                if (S5 || A5 == Composer.a.a()) {
                    A5 = new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m822invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m822invoke() {
                            ss2.this.invoke(accountDeleteDialogState);
                        }
                    };
                    h.q(A5);
                }
                h.R();
                b((qs2) A5, h, 0);
                h.R();
            } else if (i3 != 4) {
                h.z(1349456056);
                h.R();
            } else {
                h.z(1706096109);
                h.z(1706096698);
                boolean S6 = h.S(ss2Var2) | h.S(accountDeleteDialogState);
                Object A6 = h.A();
                if (S6 || A6 == Composer.a.a()) {
                    A6 = new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m823invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m823invoke() {
                            ss2.this.invoke(accountDeleteDialogState);
                        }
                    };
                    h.q(A6);
                }
                h.R();
                f((qs2) A6, h, 0);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$DialogContent$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    DeleteAccountDialogsKt.e(AccountDeleteViewModel.AccountDeleteDialogState.this, qs2Var, ss2Var, ss2Var2, ss2Var3, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1025545584);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1025545584, i2, -1, "com.nytimes.subauth.ui.ui.dialogs.GeneralErrorDialog (DeleteAccountDialogs.kt:108)");
            }
            a(null, k48.b(mm6.subauth_dialog_general_error_title, h, 0), k48.b(mm6.subauth_dialog_general_error_message_body, h, 0), zr0.b(h, -565185570, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$GeneralErrorDialog$1
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
                        b.S(-565185570, i3, -1, "com.nytimes.subauth.ui.ui.dialogs.GeneralErrorDialog.<anonymous> (DeleteAccountDialogs.kt:113)");
                    }
                    DeleteAccountDialogsKt.h(qs2.this, composer2, 0, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), qs2Var, h, ((i2 << 12) & 57344) | 3072, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$GeneralErrorDialog$2
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
                    DeleteAccountDialogsKt.f(qs2.this, composer2, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.qs2 r22, androidx.compose.ui.Modifier r23, defpackage.gt2 r24, defpackage.gt2 r25, defpackage.gt2 r26, defpackage.no7 r27, long r28, long r30, defpackage.eq1 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt.g(qs2, androidx.compose.ui.Modifier, gt2, gt2, gt2, no7, long, long, eq1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(qs2 qs2Var, Composer composer, final int i, final int i2) {
        final qs2 qs2Var2;
        int i3;
        Composer composer2;
        Composer h = composer.h(1908554262);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qs2Var2 = qs2Var;
        } else if ((i & 14) == 0) {
            qs2Var2 = qs2Var;
            i3 = (h.S(qs2Var2) ? 4 : 2) | i;
        } else {
            qs2Var2 = qs2Var;
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            qs2 qs2Var3 = i4 != 0 ? new qs2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$OKButton$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m824invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m824invoke();
                    return ww8.a;
                }
            } : qs2Var2;
            if (b.G()) {
                b.S(1908554262, i3, -1, "com.nytimes.subauth.ui.ui.dialogs.OKButton (DeleteAccountDialogs.kt:213)");
            }
            Arrangement.e f = Arrangement.a.f();
            Modifier.a aVar = Modifier.a;
            Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
            h.z(693286680);
            rg4 a2 = m.a(f, Alignment.a.l(), h, 6);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 b = LayoutKt.b(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            h.H();
            Composer a4 = Updater.a(h);
            Updater.c(a4, a2, companion.e());
            Updater.c(a4, fm1Var, companion.c());
            Updater.c(a4, layoutDirection, companion.d());
            Updater.c(a4, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-678309503);
            SpacerKt.a(m37.b(n37.a, aVar, 1.0f, false, 2, null), h, 0);
            composer2 = h;
            ButtonKt.d(qs2Var3, null, false, null, null, null, null, null, PaddingKt.a(bu1.g(0)), ComposableSingletons$DeleteAccountDialogsKt.a.c(), h, (i3 & 14) | 905969664, 254);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
            qs2Var2 = qs2Var3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$OKButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    DeleteAccountDialogsKt.h(qs2.this, composer3, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(358178389);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(358178389, i2, -1, "com.nytimes.subauth.ui.ui.dialogs.SuccessfulDeleteDialog (DeleteAccountDialogs.kt:84)");
            }
            a(null, k48.b(mm6.subauth_dialog_success_title, h, 0), k48.b(mm6.subauth_dialog_success_message_body, h, 0), zr0.b(h, -1179134525, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$SuccessfulDeleteDialog$1
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
                        b.S(-1179134525, i3, -1, "com.nytimes.subauth.ui.ui.dialogs.SuccessfulDeleteDialog.<anonymous> (DeleteAccountDialogs.kt:89)");
                    }
                    DeleteAccountDialogsKt.h(qs2.this, composer2, 0, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), qs2Var, h, ((i2 << 12) & 57344) | 3072, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.dialogs.DeleteAccountDialogsKt$SuccessfulDeleteDialog$2
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
                    DeleteAccountDialogsKt.i(qs2.this, composer2, i | 1);
                }
            });
        }
    }
}
