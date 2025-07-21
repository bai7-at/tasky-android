package com.nytimes.android.analytics.purr;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PurrTrackerTypeWrapper {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrTrackerTypeWrapper[] $VALUES;
    public static final PurrTrackerTypeWrapper CONTROLLER = new PurrTrackerTypeWrapper("CONTROLLER", 0);
    public static final PurrTrackerTypeWrapper PROCESSOR = new PurrTrackerTypeWrapper("PROCESSOR", 1);
    public static final PurrTrackerTypeWrapper ESSENTIAL = new PurrTrackerTypeWrapper("ESSENTIAL", 2);

    private static final /* synthetic */ PurrTrackerTypeWrapper[] $values() {
        return new PurrTrackerTypeWrapper[]{CONTROLLER, PROCESSOR, ESSENTIAL};
    }

    static {
        PurrTrackerTypeWrapper[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrTrackerTypeWrapper(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrTrackerTypeWrapper valueOf(String str) {
        return (PurrTrackerTypeWrapper) Enum.valueOf(PurrTrackerTypeWrapper.class, str);
    }

    public static PurrTrackerTypeWrapper[] values() {
        return (PurrTrackerTypeWrapper[]) $VALUES.clone();
    }
}
