package com.nytimes.android.eventtracker.buffer;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ValidationStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ValidationStatus[] $VALUES;
    public static final ValidationStatus UNKNOWN = new ValidationStatus("UNKNOWN", 0);
    public static final ValidationStatus VALID = new ValidationStatus("VALID", 1);
    public static final ValidationStatus INVALID = new ValidationStatus("INVALID", 2);

    private static final /* synthetic */ ValidationStatus[] $values() {
        return new ValidationStatus[]{UNKNOWN, VALID, INVALID};
    }

    static {
        ValidationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ValidationStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ValidationStatus valueOf(String str) {
        return (ValidationStatus) Enum.valueOf(ValidationStatus.class, str);
    }

    public static ValidationStatus[] values() {
        return (ValidationStatus[]) $VALUES.clone();
    }
}
