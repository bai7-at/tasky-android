package com.nytimes.android.feedback;

import android.app.Application;
import android.content.Intent;
import defpackage.yc2;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class e implements yc2 {
    private final Application a;

    public e(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    @Override // defpackage.yc2
    public Intent a(List list) {
        Intent a = FeedbackActivity.Companion.a(this.a, list);
        a.addFlags(268435456);
        return a;
    }

    @Override // defpackage.yc2
    public void b(List list) {
        this.a.startActivity(a(list));
    }
}
