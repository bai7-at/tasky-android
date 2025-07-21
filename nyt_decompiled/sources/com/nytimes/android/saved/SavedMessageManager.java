package com.nytimes.android.saved;

import android.R;
import android.app.Activity;
import android.view.View;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.cb2;
import defpackage.cm6;
import defpackage.qs2;
import defpackage.v63;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SavedMessageManager {
    private final Activity a;
    private final SnackbarUtil b;
    private final v63 c;
    private final cb2 d;

    public SavedMessageManager(Activity activity, SnackbarUtil snackbarUtil, v63 v63Var, cb2 cb2Var) {
        zq3.h(activity, "activity");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(v63Var, "hapticFeedbackManager");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = activity;
        this.b = snackbarUtil;
        this.c = v63Var;
        this.d = cb2Var;
    }

    public final void a(boolean z, final qs2 qs2Var) {
        zq3.h(qs2Var, "undo");
        if (z) {
            this.b.A(this.d.G() ? cm6.you_unsave_success : cm6.unsave_success, 0, this.d.G() ? cm6.you_undo : cm6.undo, new qs2() { // from class: com.nytimes.android.saved.SavedMessageManager$showMessageOnUnsave$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m750invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m750invoke() {
                    qs2.this.mo865invoke();
                }
            });
        } else {
            SnackbarUtil.y(this.b, this.d.G() ? cm6.you_unsave_success : cm6.unsave_success, 0, 2, null);
        }
    }

    public final void b(boolean z, boolean z2, final qs2 qs2Var) {
        zq3.h(qs2Var, "undo");
        if (z) {
            v63 v63Var = this.c;
            View findViewById = this.a.findViewById(R.id.content);
            zq3.g(findViewById, "findViewById(...)");
            v63Var.a(findViewById);
        }
        if (z2) {
            this.b.A(this.d.G() ? cm6.you_save_success : cm6.save_success, 0, this.d.G() ? cm6.you_undo : cm6.undo, new qs2() { // from class: com.nytimes.android.saved.SavedMessageManager$showMessagesOnSave$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m751invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m751invoke() {
                    qs2.this.mo865invoke();
                }
            });
        } else {
            SnackbarUtil.y(this.b, this.d.G() ? cm6.you_save_success : cm6.save_success, 0, 2, null);
        }
    }
}
