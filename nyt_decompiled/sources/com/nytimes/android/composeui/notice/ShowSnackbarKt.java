package com.nytimes.android.composeui.notice;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.composeui.notice.a;
import defpackage.cc7;
import defpackage.ek6;
import defpackage.gt2;
import defpackage.k48;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ShowSnackbarKt {
    public static final void a(final SnackbarHostState snackbarHostState, final a aVar, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        String str;
        zq3.h(snackbarHostState, "snackbarHostState");
        zq3.h(aVar, "snackbarState");
        zq3.h(qs2Var, "onShown");
        Composer h = composer.h(-2091149447);
        if ((i & 14) == 0) {
            i2 = (h.S(snackbarHostState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-2091149447, i2, -1, "com.nytimes.android.composeui.notice.ShowSnackbar (ShowSnackbar.kt:31)");
            }
            if (!zq3.c(aVar, a.b.b)) {
                if (zq3.c(aVar, a.C0250a.b)) {
                    h.z(1692592652);
                    str = k48.b(ek6.error_snackbar_device_offline, h, 0);
                    h.R();
                } else if (aVar instanceof a.c) {
                    h.z(1692598009);
                    str = k48.b(((a.c) aVar).a(), h, 0);
                    h.R();
                } else {
                    h.z(930990124);
                    h.R();
                    str = null;
                }
                h.z(1692601897);
                boolean S = h.S(str) | h.S(snackbarHostState) | h.S(qs2Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new ShowSnackbarKt$ShowSnackbar$1$1(str, snackbarHostState, qs2Var, null);
                    h.q(A);
                }
                h.R();
                py1.d(snackbarHostState, (gt2) A, h, (i2 & 14) | 64);
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.composeui.notice.ShowSnackbarKt$ShowSnackbar$2
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
                    ShowSnackbarKt.a(SnackbarHostState.this, aVar, qs2Var, composer2, i | 1);
                }
            });
        }
    }
}
