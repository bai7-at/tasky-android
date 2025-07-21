package com.nytimes.android.subauth.core.devsettings.purr;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrEmailOptInResultOverride {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrEmailOptInResultOverride[] $VALUES;
    public static final PurrEmailOptInResultOverride NO_OVERRIDE = new PurrEmailOptInResultOverride("NO_OVERRIDE", 0);
    public static final PurrEmailOptInResultOverride SUCCESS = new PurrEmailOptInResultOverride("SUCCESS", 1);
    public static final PurrEmailOptInResultOverride FAILURE = new PurrEmailOptInResultOverride("FAILURE", 2);

    private static final /* synthetic */ PurrEmailOptInResultOverride[] $values() {
        return new PurrEmailOptInResultOverride[]{NO_OVERRIDE, SUCCESS, FAILURE};
    }

    static {
        PurrEmailOptInResultOverride[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrEmailOptInResultOverride(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrEmailOptInResultOverride valueOf(String str) {
        return (PurrEmailOptInResultOverride) Enum.valueOf(PurrEmailOptInResultOverride.class, str);
    }

    public static PurrEmailOptInResultOverride[] values() {
        return (PurrEmailOptInResultOverride[]) $VALUES.clone();
    }
}
