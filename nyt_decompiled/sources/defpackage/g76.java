package defpackage;

import android.app.Application;
import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes2.dex */
public final class g76 {
    private final Application a;

    public g76(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    public BaseAdParamKey a() {
        return BaseAdParamKey.PROP;
    }

    public String b() {
        return DeviceUtils.a(this.a);
    }
}
