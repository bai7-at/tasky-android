package defpackage;

import android.app.Application;
import android.app.Service;

/* loaded from: classes4.dex */
public final class bl7 implements hx2 {
    private final Service a;
    private Object b;

    public interface a {
        al7 e();
    }

    public bl7(Service service) {
        this.a = service;
    }

    private Object a() {
        Application application = this.a.getApplication();
        f16.d(application instanceof hx2, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) a22.a(application, a.class)).e().a(this.a).build();
    }

    @Override // defpackage.hx2
    public Object generatedComponent() {
        if (this.b == null) {
            this.b = a();
        }
        return this.b;
    }
}
