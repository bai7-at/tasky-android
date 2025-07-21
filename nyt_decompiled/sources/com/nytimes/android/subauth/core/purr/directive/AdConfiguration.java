package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AdConfiguration {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AdConfiguration[] $VALUES;
    public static final AdConfiguration FULL = new AdConfiguration("FULL", 0);
    public static final AdConfiguration NPA = new AdConfiguration("NPA", 1);
    public static final AdConfiguration ADLUCE = new AdConfiguration("ADLUCE", 2);
    public static final AdConfiguration ADLUCE_SOCRATES = new AdConfiguration("ADLUCE_SOCRATES", 3);
    public static final AdConfiguration RDP = new AdConfiguration("RDP", 4);
    public static final AdConfiguration LTD = new AdConfiguration("LTD", 5);

    private static final /* synthetic */ AdConfiguration[] $values() {
        return new AdConfiguration[]{FULL, NPA, ADLUCE, ADLUCE_SOCRATES, RDP, LTD};
    }

    static {
        AdConfiguration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AdConfiguration(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AdConfiguration valueOf(String str) {
        return (AdConfiguration) Enum.valueOf(AdConfiguration.class, str);
    }

    public static AdConfiguration[] values() {
        return (AdConfiguration[]) $VALUES.clone();
    }
}
