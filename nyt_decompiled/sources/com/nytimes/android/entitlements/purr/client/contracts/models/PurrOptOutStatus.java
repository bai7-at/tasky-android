package com.nytimes.android.entitlements.purr.client.contracts.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrOptOutStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrOptOutStatus[] $VALUES;
    public static final PurrOptOutStatus HIDE = new PurrOptOutStatus("HIDE", 0);
    public static final PurrOptOutStatus SHOW_OPT_OUT_ACTION = new PurrOptOutStatus("SHOW_OPT_OUT_ACTION", 1);
    public static final PurrOptOutStatus SHOW_OPTED_OUT_MSG = new PurrOptOutStatus("SHOW_OPTED_OUT_MSG", 2);

    private static final /* synthetic */ PurrOptOutStatus[] $values() {
        return new PurrOptOutStatus[]{HIDE, SHOW_OPT_OUT_ACTION, SHOW_OPTED_OUT_MSG};
    }

    static {
        PurrOptOutStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrOptOutStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrOptOutStatus valueOf(String str) {
        return (PurrOptOutStatus) Enum.valueOf(PurrOptOutStatus.class, str);
    }

    public static PurrOptOutStatus[] values() {
        return (PurrOptOutStatus[]) $VALUES.clone();
    }
}
