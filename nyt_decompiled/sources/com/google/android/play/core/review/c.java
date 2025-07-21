package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.l17;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vg8;

/* loaded from: classes3.dex */
public final class c implements l17 {
    private final g a;
    private final Handler b = new Handler(Looper.getMainLooper());

    c(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.l17
    public final og8 a() {
        return this.a.a();
    }

    @Override // defpackage.l17
    public final og8 b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return vg8.e(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        qg8 qg8Var = new qg8();
        intent.putExtra("result_receiver", new zzc(this, this.b, qg8Var));
        activity.startActivity(intent);
        return qg8Var.a();
    }
}
