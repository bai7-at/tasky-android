package defpackage;

import com.nytimes.android.subauth.core.devsettings.purr.PurrEmailOptInResultOverride;

/* loaded from: classes4.dex */
public abstract class fm5 {
    public static final PurrEmailOptInResultOverride a(String str) {
        zq3.h(str, "<this>");
        for (PurrEmailOptInResultOverride purrEmailOptInResultOverride : PurrEmailOptInResultOverride.values()) {
            if (zq3.c(purrEmailOptInResultOverride.name(), str)) {
                return purrEmailOptInResultOverride;
            }
        }
        return null;
    }
}
