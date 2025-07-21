package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ix0 {
    private final Set a = new CopyOnWriteArraySet();
    private volatile Context b;

    public final void a(pe5 pe5Var) {
        zq3.h(pe5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.b;
        if (context != null) {
            pe5Var.onContextAvailable(context);
        }
        this.a.add(pe5Var);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        zq3.h(context, "context");
        this.b = context;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((pe5) it2.next()).onContextAvailable(context);
        }
    }

    public final Context d() {
        return this.b;
    }

    public final void e(pe5 pe5Var) {
        zq3.h(pe5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a.remove(pe5Var);
    }
}
