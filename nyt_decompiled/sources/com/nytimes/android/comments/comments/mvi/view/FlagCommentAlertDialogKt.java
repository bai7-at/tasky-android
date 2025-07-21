package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
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
public final class FlagCommentAlertDialogKt {
    public static final void FlagCommentAlertDialog(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "onConfirm");
        Composer h = composer.h(1208343252);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1208343252, i2, -1, "com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialog (FlagCommentAlertDialog.kt:16)");
            }
            composer2 = h;
            AndroidAlertDialog_androidKt.a(qs2Var, zr0.b(h, 1689361292, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialogKt$FlagCommentAlertDialog$1
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
                        b.S(1689361292, i3, -1, "com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialog.<anonymous> (FlagCommentAlertDialog.kt:27)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$FlagCommentAlertDialogKt.INSTANCE.m264getLambda1$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, zr0.b(h, -711272118, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialogKt$FlagCommentAlertDialog$2
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
                        b.S(-711272118, i3, -1, "com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialog.<anonymous> (FlagCommentAlertDialog.kt:37)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$FlagCommentAlertDialogKt.INSTANCE.m265getLambda2$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), ComposableSingletons$FlagCommentAlertDialogKt.INSTANCE.m266getLambda3$comments_release(), null, null, eb5.Companion.a(h, 8).a(), 0L, null, h, (i2 & 14) | 27696, 868);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialogKt$FlagCommentAlertDialog$3
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
                    FlagCommentAlertDialogKt.FlagCommentAlertDialog(qs2.this, qs2Var2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void FlagCommentAlertDialogPreview(Composer composer, final int i) {
        Composer h = composer.h(1207112432);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1207112432, i, -1, "com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialogPreview (FlagCommentAlertDialog.kt:51)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$FlagCommentAlertDialogKt.INSTANCE.m267getLambda4$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.FlagCommentAlertDialogKt$FlagCommentAlertDialogPreview$1
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
                    FlagCommentAlertDialogKt.FlagCommentAlertDialogPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
