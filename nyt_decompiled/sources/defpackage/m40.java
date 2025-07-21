package defpackage;

import com.nytimes.android.logging.NYTLogger;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class m40 implements b42 {
    private final Set a;

    public m40(qv6 qv6Var, at3 at3Var) {
        Set e;
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(at3Var, "decoder");
        try {
            String g = qv6Var.g();
            at3Var.a();
            e = i.c1((Iterable) at3Var.c(new k54(l48.a), g));
        } catch (Exception e2) {
            NYTLogger.i(e2, "Error initializing BannedEventInterceptor", new Object[0]);
            e = b0.e();
        }
        this.a = e;
    }

    @Override // defpackage.b42
    public boolean a(e52 e52Var, Map map) {
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        return !this.a.contains(String.valueOf(map.get("canonical_url")));
    }
}
