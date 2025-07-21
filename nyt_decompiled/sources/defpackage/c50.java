package defpackage;

import android.app.Application;
import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.ad.DFPEditionProvider$Edition;
import com.nytimes.android.utils.DeviceUtils;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class c50 {
    private final Application a;
    private final g76 b;
    private final vu5 c;
    private final t20 d;
    private final fb8 e;
    private final a80 f;

    public c50(Application application, g76 g76Var, vu5 vu5Var, t20 t20Var, fb8 fb8Var, a80 a80Var) {
        zq3.h(application, "context");
        zq3.h(g76Var, "propParam");
        zq3.h(vu5Var, "platformParam");
        zq3.h(t20Var, "autoplayParam");
        zq3.h(fb8Var, "subscriberParam");
        zq3.h(a80Var, "keywordParam");
        this.a = application;
        this.b = g76Var;
        this.c = vu5Var;
        this.d = t20Var;
        this.e = fb8Var;
        this.f = a80Var;
    }

    public Map a() {
        Map c = t.c();
        String b = this.f.b();
        if (b.length() > 0) {
            c.put(this.f.a().asString(), b);
        }
        c.put(this.c.a().asString(), this.c.b());
        c.put(this.e.a().asString(), this.e.b());
        c.put(this.b.a().asString(), this.b.b());
        c.put(this.d.a().asString(), this.d.b());
        c.put(BaseAdParamKey.EDITION.asString(), DFPEditionProvider$Edition.us.toString());
        c.put(BaseAdParamKey.VERSION.asString(), DeviceUtils.u(this.a, false, false, 3, null));
        c.put(BaseAdParamKey.VERSION_CODE.asString(), DeviceUtils.v(this.a));
        c.put(BaseAdParamKey.BUILD_TYPE.asString(), DeviceUtils.d(this.a));
        return t.b(c);
    }
}
