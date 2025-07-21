package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AcceptableTracker {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AcceptableTracker[] $VALUES;
    public static final AcceptableTracker CONTROLLERS = new AcceptableTracker("CONTROLLERS", 0);
    public static final AcceptableTracker PROCESSORS = new AcceptableTracker("PROCESSORS", 1);
    public static final AcceptableTracker ESSENTIALS = new AcceptableTracker("ESSENTIALS", 2);

    private static final /* synthetic */ AcceptableTracker[] $values() {
        return new AcceptableTracker[]{CONTROLLERS, PROCESSORS, ESSENTIALS};
    }

    static {
        AcceptableTracker[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AcceptableTracker(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AcceptableTracker valueOf(String str) {
        return (AcceptableTracker) Enum.valueOf(AcceptableTracker.class, str);
    }

    public static AcceptableTracker[] values() {
        return (AcceptableTracker[]) $VALUES.clone();
    }
}
