package defpackage;

import android.app.Application;

/* loaded from: classes.dex */
final class fj {
    public static final fj a = new fj();

    private fj() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        zq3.g(processName, "getProcessName()");
        return processName;
    }
}
