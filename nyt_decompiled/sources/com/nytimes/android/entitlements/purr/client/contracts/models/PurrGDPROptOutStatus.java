package com.nytimes.android.entitlements.purr.client.contracts.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrGDPROptOutStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrGDPROptOutStatus[] $VALUES;
    public static final PurrGDPROptOutStatus HIDE = new PurrGDPROptOutStatus("HIDE", 0);
    public static final PurrGDPROptOutStatus ALLOW_OPT_OUT = new PurrGDPROptOutStatus("ALLOW_OPT_OUT", 1);
    public static final PurrGDPROptOutStatus ALLOW_OPT_IN = new PurrGDPROptOutStatus("ALLOW_OPT_IN", 2);
    public static final PurrGDPROptOutStatus ALLOW_OPT_IN_OR_OUT = new PurrGDPROptOutStatus("ALLOW_OPT_IN_OR_OUT", 3);

    private static final /* synthetic */ PurrGDPROptOutStatus[] $values() {
        return new PurrGDPROptOutStatus[]{HIDE, ALLOW_OPT_OUT, ALLOW_OPT_IN, ALLOW_OPT_IN_OR_OUT};
    }

    static {
        PurrGDPROptOutStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrGDPROptOutStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrGDPROptOutStatus valueOf(String str) {
        return (PurrGDPROptOutStatus) Enum.valueOf(PurrGDPROptOutStatus.class, str);
    }

    public static PurrGDPROptOutStatus[] values() {
        return (PurrGDPROptOutStatus[]) $VALUES.clone();
    }
}
