package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EmailMarketingOptInDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EmailMarketingOptInDirectiveValue[] $VALUES;
    public static final EmailMarketingOptInDirectiveValue CHECKED = new EmailMarketingOptInDirectiveValue("CHECKED", 0);
    public static final EmailMarketingOptInDirectiveValue UNCHECKED = new EmailMarketingOptInDirectiveValue("UNCHECKED", 1);
    public static final EmailMarketingOptInDirectiveValue DO_NOT_DISPLAY = new EmailMarketingOptInDirectiveValue("DO_NOT_DISPLAY", 2);

    private static final /* synthetic */ EmailMarketingOptInDirectiveValue[] $values() {
        return new EmailMarketingOptInDirectiveValue[]{CHECKED, UNCHECKED, DO_NOT_DISPLAY};
    }

    static {
        EmailMarketingOptInDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EmailMarketingOptInDirectiveValue(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EmailMarketingOptInDirectiveValue valueOf(String str) {
        return (EmailMarketingOptInDirectiveValue) Enum.valueOf(EmailMarketingOptInDirectiveValue.class, str);
    }

    public static EmailMarketingOptInDirectiveValue[] values() {
        return (EmailMarketingOptInDirectiveValue[]) $VALUES.clone();
    }
}
