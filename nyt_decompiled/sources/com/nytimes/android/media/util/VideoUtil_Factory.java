package com.nytimes.android.media.util;

import android.app.Application;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class VideoUtil_Factory implements ba2 {
    private final p76 applicationProvider;

    public VideoUtil_Factory(p76 p76Var) {
        this.applicationProvider = p76Var;
    }

    public static VideoUtil_Factory create(p76 p76Var) {
        return new VideoUtil_Factory(p76Var);
    }

    public static VideoUtil newInstance(Application application) {
        return new VideoUtil(application);
    }

    @Override // defpackage.p76
    public VideoUtil get() {
        return newInstance((Application) this.applicationProvider.get());
    }
}
