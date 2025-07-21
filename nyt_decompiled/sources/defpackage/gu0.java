package defpackage;

import com.nytimes.android.image.loader.internals.ConfigurationConstants;
import java.util.HashMap;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class gu0 {
    private final HashMap a;

    public gu0() {
        ConfigurationConstants configurationConstants = ConfigurationConstants.INDICATORS_ENABLED;
        Boolean bool = Boolean.FALSE;
        this.a = t.k(du8.a(configurationConstants, bool), du8.a(ConfigurationConstants.LOGGING_ENABLED, bool));
    }

    public final boolean a() {
        Boolean bool = (Boolean) this.a.get(ConfigurationConstants.INDICATORS_ENABLED);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public final boolean b() {
        Boolean bool = (Boolean) this.a.get(ConfigurationConstants.LOGGING_ENABLED);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
