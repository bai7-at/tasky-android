package defpackage;

import com.datadog.legacy.trace.api.Config;

/* loaded from: classes2.dex */
public interface z77 {

    public static final class a {
        public static z77 a(Config config) {
            if (config != null && config.I()) {
                return config.H() != null ? new xo6(config.H()) : new xo6();
            }
            return new mb();
        }
    }

    boolean b(com.datadog.opentracing.a aVar);
}
