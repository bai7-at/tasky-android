package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
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
public final class ErrorAlertDialogKt {
    public static final void ErrorAlertDialog(final String str, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "errorMessage");
        zq3.h(qs2Var, "onDismiss");
        Composer h = composer.h(-417409175);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-417409175, i2, -1, "com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialog (ErrorAlertDialog.kt:14)");
            }
            composer2 = h;
            AndroidAlertDialog_androidKt.a(qs2Var, zr0.b(h, 1420869041, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialogKt$ErrorAlertDialog$1
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
                        b.S(1420869041, i3, -1, "com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialog.<anonymous> (ErrorAlertDialog.kt:25)");
                    }
                    ButtonKt.d(qs2.this, null, false, null, null, null, null, null, null, ComposableSingletons$ErrorAlertDialogKt.INSTANCE.m263getLambda1$comments_release(), composer3, 805306368, 510);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, null, zr0.b(h, 1525340852, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialogKt$ErrorAlertDialog$2
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
                        b.S(1525340852, i3, -1, "com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialog.<anonymous> (ErrorAlertDialog.kt:19)");
                    }
                    composer3.z(-1802706012);
                    String str2 = str;
                    if (str2.length() == 0) {
                        str2 = k48.b(R.string.comments_general_error_message, composer3, 0);
                    }
                    composer3.R();
                    TextKt.c(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer3, 8).e(), composer3, 0, 0, 65534);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), null, null, eb5.Companion.a(h, 8).a(), 0L, null, h, ((i2 >> 3) & 14) | 24624, 876);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.ErrorAlertDialogKt$ErrorAlertDialog$3
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
                    ErrorAlertDialogKt.ErrorAlertDialog(str, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
