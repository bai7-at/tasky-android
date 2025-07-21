package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DataProcessingPreferenceDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DataProcessingPreferenceDirectiveValue[] $VALUES;
    public static final DataProcessingPreferenceDirectiveValue HIDE = new DataProcessingPreferenceDirectiveValue("HIDE", 0);
    public static final DataProcessingPreferenceDirectiveValue ALLOW_OPT_OUT = new DataProcessingPreferenceDirectiveValue("ALLOW_OPT_OUT", 1);
    public static final DataProcessingPreferenceDirectiveValue ALLOW_OPT_IN = new DataProcessingPreferenceDirectiveValue("ALLOW_OPT_IN", 2);
    public static final DataProcessingPreferenceDirectiveValue ALLOW_OPT_IN_OR_OUT = new DataProcessingPreferenceDirectiveValue("ALLOW_OPT_IN_OR_OUT", 3);

    private static final /* synthetic */ DataProcessingPreferenceDirectiveValue[] $values() {
        return new DataProcessingPreferenceDirectiveValue[]{HIDE, ALLOW_OPT_OUT, ALLOW_OPT_IN, ALLOW_OPT_IN_OR_OUT};
    }

    static {
        DataProcessingPreferenceDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DataProcessingPreferenceDirectiveValue(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DataProcessingPreferenceDirectiveValue valueOf(String str) {
        return (DataProcessingPreferenceDirectiveValue) Enum.valueOf(DataProcessingPreferenceDirectiveValue.class, str);
    }

    public static DataProcessingPreferenceDirectiveValue[] values() {
        return (DataProcessingPreferenceDirectiveValue[]) $VALUES.clone();
    }
}
