package defpackage;

import android.app.Application;
import io.embrace.android.embracesdk.Embrace;

/* loaded from: classes4.dex */
public final class qz1 {
    private final Application a;

    public qz1(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    public final void a() {
        Embrace.getInstance().start(this.a);
    }
}
