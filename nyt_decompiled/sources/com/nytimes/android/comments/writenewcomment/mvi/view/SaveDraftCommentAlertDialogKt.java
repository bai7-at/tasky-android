package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class SaveDraftCommentAlertDialogKt {
    public static final void SaveDraftCommentAlertDialog(final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "onConfirm");
        zq3.h(qs2Var3, "onDiscard");
        Composer h = composer.h(233523656);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var3) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(233523656, i2, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialog (SaveDraftCommentAlertDialog.kt:17)");
            }
            composer2 = h;
            AndroidAlertDialog_androidKt.a(qs2Var, zr0.b(h, 975492624, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialogKt$SaveDraftCommentAlertDialog$1
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(975492624, i3, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialog.<anonymous> (SaveDraftCommentAlertDialog.kt:28)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$SaveDraftCommentAlertDialogKt.INSTANCE.m286getLambda1$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, zr0.b(h, 159445394, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialogKt$SaveDraftCommentAlertDialog$2
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(159445394, i3, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialog.<anonymous> (SaveDraftCommentAlertDialog.kt:38)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$SaveDraftCommentAlertDialogKt.INSTANCE.m287getLambda2$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), ComposableSingletons$SaveDraftCommentAlertDialogKt.INSTANCE.m288getLambda3$comments_release(), null, null, eb5.Companion.a(h, 8).a(), 0L, null, composer2, (i2 & 14) | 27696, 868);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialogKt$SaveDraftCommentAlertDialog$3
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
                    SaveDraftCommentAlertDialogKt.SaveDraftCommentAlertDialog(qs2.this, qs2Var2, qs2Var3, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void SaveDraftCommentDialogPreview(Composer composer, final int i) {
        Composer h = composer.h(59973178);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(59973178, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentDialogPreview (SaveDraftCommentAlertDialog.kt:52)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$SaveDraftCommentAlertDialogKt.INSTANCE.m289getLambda4$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SaveDraftCommentAlertDialogKt$SaveDraftCommentDialogPreview$1
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
                    SaveDraftCommentAlertDialogKt.SaveDraftCommentDialogPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
