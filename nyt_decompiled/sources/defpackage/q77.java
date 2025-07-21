package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.internal.cms.CmsEnvironment;

/* loaded from: classes4.dex */
public final class q77 {
    private final Application a;
    private final qs2 b;
    private final Resources c;

    public q77(Application application, qs2 qs2Var) {
        zq3.h(application, "context");
        zq3.h(qs2Var, "feedEnvironment");
        this.a = application;
        this.b = qs2Var;
        this.c = application.getResources();
    }

    public final String a() {
        CmsEnvironment cmsEnvironment = (CmsEnvironment) this.b.mo865invoke();
        Resources resources = this.c;
        zq3.g(resources, "resources");
        return cmsEnvironment.getUrl(resources);
    }

    public final qs2 b() {
        return this.b;
    }
}
