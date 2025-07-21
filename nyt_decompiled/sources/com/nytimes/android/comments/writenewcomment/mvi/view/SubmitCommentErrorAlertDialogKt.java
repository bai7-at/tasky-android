package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.k48;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class SubmitCommentErrorAlertDialogKt {
    public static final void SubmitCommentErrorAlertDialog(final qs2 qs2Var, final qs2 qs2Var2, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "onConfirm");
        Composer h = composer.h(2036314213);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(str) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(2036314213, i2, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialog (SubmitCommentErrorAlertDialog.kt:17)");
            }
            composer2 = h;
            AndroidAlertDialog_androidKt.a(qs2Var, zr0.b(h, -732451555, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogKt$SubmitCommentErrorAlertDialog$1
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
                        b.S(-732451555, i3, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialog.<anonymous> (SubmitCommentErrorAlertDialog.kt:28)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$SubmitCommentErrorAlertDialogKt.INSTANCE.m293getLambda1$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, null, zr0.b(h, -23942086, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogKt$SubmitCommentErrorAlertDialog$2
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
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-23942086, i3, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialog.<anonymous> (SubmitCommentErrorAlertDialog.kt:22)");
                    }
                    String str2 = str;
                    composer3.z(-358933914);
                    if (str2 == null) {
                        str2 = k48.b(R.string.submit_comment_error_dialog_title, composer3, 0);
                    }
                    composer3.R();
                    TextKt.c(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer3, 8).e(), composer3, 0, 0, 65534);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, null, eb5.Companion.a(h, 8).a(), 0L, null, composer2, (i2 & 14) | 24624, 876);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogKt$SubmitCommentErrorAlertDialog$3
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
                    SubmitCommentErrorAlertDialogKt.SubmitCommentErrorAlertDialog(qs2.this, qs2Var2, str, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void SubmitCommentErrorAlertDialogPreview(Composer composer, final int i) {
        Composer h = composer.h(-1549207620);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1549207620, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogPreview (SubmitCommentErrorAlertDialog.kt:42)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$SubmitCommentErrorAlertDialogKt.INSTANCE.m294getLambda2$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogKt$SubmitCommentErrorAlertDialogPreview$1
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
                    SubmitCommentErrorAlertDialogKt.SubmitCommentErrorAlertDialogPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void SubmitCommentErrorAlertDialogWithErrorMessagePreview(Composer composer, final int i) {
        Composer h = composer.h(-1593123593);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1593123593, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogWithErrorMessagePreview (SubmitCommentErrorAlertDialog.kt:54)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$SubmitCommentErrorAlertDialogKt.INSTANCE.m295getLambda3$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.SubmitCommentErrorAlertDialogKt$SubmitCommentErrorAlertDialogWithErrorMessagePreview$1
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
                    SubmitCommentErrorAlertDialogKt.SubmitCommentErrorAlertDialogWithErrorMessagePreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
