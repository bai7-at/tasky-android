package defpackage;

import android.content.Context;
import com.nytimes.android.push.PushClientManager;
import java.util.Map;

/* loaded from: classes4.dex */
public final class wa2 {
    private final PushClientManager a;
    private final Map b;
    private final Context c;
    private final h05 d;

    public wa2(PushClientManager pushClientManager, Map map, Context context, h05 h05Var) {
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(map, "messageData");
        zq3.h(context, "context");
        zq3.h(h05Var, "nytJobScheduler");
        this.a = pushClientManager;
        this.b = map;
        this.c = context;
        this.d = h05Var;
    }

    public final Map a() {
        return this.b;
    }

    public final h05 b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa2)) {
            return false;
        }
        wa2 wa2Var = (wa2) obj;
        return zq3.c(this.a, wa2Var.a) && zq3.c(this.b, wa2Var.b) && zq3.c(this.c, wa2Var.c) && zq3.c(this.d, wa2Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "FcmBroadcastProcessorParam(pushClientManager=" + this.a + ", messageData=" + this.b + ", context=" + this.c + ", nytJobScheduler=" + this.d + ")";
    }
}
