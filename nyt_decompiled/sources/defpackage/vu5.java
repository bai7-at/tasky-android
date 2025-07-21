package defpackage;

import android.app.Application;
import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes2.dex */
public final class vu5 {
    private final Application a;

    public vu5(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    public BaseAdParamKey a() {
        return BaseAdParamKey.PLATFORM;
    }

    public String b() {
        return DeviceUtils.D(this.a);
    }
}
