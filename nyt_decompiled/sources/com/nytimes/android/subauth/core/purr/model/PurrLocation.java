package com.nytimes.android.subauth.core.purr.model;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrLocation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrLocation[] $VALUES;
    private final String country;
    private final String label;
    private final String region;
    public static final PurrLocation NO_OVERRIDE = new PurrLocation("NO_OVERRIDE", 0, "Not Overridden", null, null);
    public static final PurrLocation CALIFORNIA = new PurrLocation("CALIFORNIA", 1, "California", "CA", "US");
    public static final PurrLocation EUROPE = new PurrLocation("EUROPE", 2, "Europe", "IDF", "FR");
    public static final PurrLocation NEW_YORK = new PurrLocation("NEW_YORK", 3, "New York", "NY", "US");
    public static final PurrLocation AUSTRALIA = new PurrLocation("AUSTRALIA", 4, "Australia", "SYD", "AU");

    private static final /* synthetic */ PurrLocation[] $values() {
        return new PurrLocation[]{NO_OVERRIDE, CALIFORNIA, EUROPE, NEW_YORK, AUSTRALIA};
    }

    static {
        PurrLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrLocation(String str, int i, String str2, String str3, String str4) {
        this.label = str2;
        this.region = str3;
        this.country = str4;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrLocation valueOf(String str) {
        return (PurrLocation) Enum.valueOf(PurrLocation.class, str);
    }

    public static PurrLocation[] values() {
        return (PurrLocation[]) $VALUES.clone();
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getRegion() {
        return this.region;
    }
}
