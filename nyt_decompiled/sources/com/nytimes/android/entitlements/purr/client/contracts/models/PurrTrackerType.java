package com.nytimes.android.entitlements.purr.client.contracts.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrTrackerType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrTrackerType[] $VALUES;
    public static final PurrTrackerType CONTROLLER = new PurrTrackerType("CONTROLLER", 0);
    public static final PurrTrackerType PROCESSOR = new PurrTrackerType("PROCESSOR", 1);
    public static final PurrTrackerType ESSENTIAL = new PurrTrackerType("ESSENTIAL", 2);

    private static final /* synthetic */ PurrTrackerType[] $values() {
        return new PurrTrackerType[]{CONTROLLER, PROCESSOR, ESSENTIAL};
    }

    static {
        PurrTrackerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrTrackerType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrTrackerType valueOf(String str) {
        return (PurrTrackerType) Enum.valueOf(PurrTrackerType.class, str);
    }

    public static PurrTrackerType[] values() {
        return (PurrTrackerType[]) $VALUES.clone();
    }
}
