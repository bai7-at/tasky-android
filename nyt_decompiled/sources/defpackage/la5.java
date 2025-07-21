package defpackage;

import android.app.Application;
import com.nytimes.android.api.config.model.Channel;
import com.nytimes.android.push.PushClientManager;

/* loaded from: classes4.dex */
public final class la5 {
    private final PushClientManager a;
    private final r95 b;

    public la5(PushClientManager pushClientManager, Application application) {
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(application, "application");
        this.a = pushClientManager;
        r95 d = r95.d(application);
        zq3.g(d, "from(...)");
        this.b = d;
    }

    public final boolean a() {
        return this.b.a();
    }

    public final boolean b(Channel channel) {
        if (channel == null) {
            return false;
        }
        return this.a.h().contains(channel.getTag());
    }
}
