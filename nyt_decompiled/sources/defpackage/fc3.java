package defpackage;

import android.app.Application;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes4.dex */
public final class fc3 {
    public static final fc3 a = new fc3();

    private fc3() {
    }

    public final ec3 a(Application application) {
        zq3.h(application, "context");
        return new ec3("Reader", DeviceUtils.v(application), DeviceUtils.u(application, false, false, 3, null), DeviceUtils.g(), DeviceUtils.l());
    }
}
