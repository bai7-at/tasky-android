package com.nytimes.android.dailyfive.ui;

import android.app.Activity;
import com.nytimes.android.dailyfive.ui.a;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.em6;
import defpackage.fk6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zm8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class b {
    private final SnackbarUtil a;
    private final Activity b;
    private final TimeStampUtil c;

    public b(SnackbarUtil snackbarUtil, Activity activity, TimeStampUtil timeStampUtil) {
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(activity, "activity");
        zq3.h(timeStampUtil, "timeStampUtil");
        this.a = snackbarUtil;
        this.b = activity;
        this.c = timeStampUtil;
    }

    public final void a(a aVar, qs2 qs2Var, ss2 ss2Var) {
        zq3.h(qs2Var, "onRetryAfterAnError");
        zq3.h(ss2Var, "onLoginClick");
        if (zq3.c(aVar, a.c.a)) {
            this.a.m(qs2Var);
            return;
        }
        if (aVar instanceof a.C0253a) {
            SnackbarUtil.z(this.a, this.c.s(((a.C0253a) aVar).a()), 0, false, 6, null);
            return;
        }
        if (zq3.c(aVar, a.b.a)) {
            SnackbarUtil.y(this.a, em6.retry_text_error, 0, 2, null);
        } else if (aVar instanceof a.d) {
            Activity activity = this.b;
            zm8.g(activity, activity.getString(fk6.daily_five_login_error));
        }
    }
}
