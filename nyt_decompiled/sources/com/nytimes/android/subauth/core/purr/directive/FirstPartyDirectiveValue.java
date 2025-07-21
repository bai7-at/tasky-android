package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FirstPartyDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ FirstPartyDirectiveValue[] $VALUES;
    public static final FirstPartyDirectiveValue ALLOWED = new FirstPartyDirectiveValue("ALLOWED", 0);
    public static final FirstPartyDirectiveValue DISALLOWED = new FirstPartyDirectiveValue("DISALLOWED", 1);

    private static final /* synthetic */ FirstPartyDirectiveValue[] $values() {
        return new FirstPartyDirectiveValue[]{ALLOWED, DISALLOWED};
    }

    static {
        FirstPartyDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FirstPartyDirectiveValue(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static FirstPartyDirectiveValue valueOf(String str) {
        return (FirstPartyDirectiveValue) Enum.valueOf(FirstPartyDirectiveValue.class, str);
    }

    public static FirstPartyDirectiveValue[] values() {
        return (FirstPartyDirectiveValue[]) $VALUES.clone();
    }
}
