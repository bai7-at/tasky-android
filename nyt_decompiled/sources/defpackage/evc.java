package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class evc extends hvc {
    private final v6e l;

    public evc(Executor executor, jgb jgbVar, v6e v6eVar, x6e x6eVar, Context context) {
        super(executor, jgbVar, x6eVar, context);
        this.l = v6eVar;
        v6eVar.a(this.b);
    }

    public final Map g() {
        return new HashMap(this.b);
    }
}
