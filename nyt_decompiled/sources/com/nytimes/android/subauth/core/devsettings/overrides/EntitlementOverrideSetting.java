package com.nytimes.android.subauth.core.devsettings.overrides;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EntitlementOverrideSetting {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EntitlementOverrideSetting[] $VALUES;
    public static final EntitlementOverrideSetting NO_OVERRIDE = new EntitlementOverrideSetting("NO_OVERRIDE", 0);
    public static final EntitlementOverrideSetting ALL_ACCESS = new EntitlementOverrideSetting("ALL_ACCESS", 1);
    public static final EntitlementOverrideSetting THE_ATHLETIC = new EntitlementOverrideSetting("THE_ATHLETIC", 2);
    public static final EntitlementOverrideSetting NEWS = new EntitlementOverrideSetting("NEWS", 3);
    public static final EntitlementOverrideSetting COOKING = new EntitlementOverrideSetting("COOKING", 4);
    public static final EntitlementOverrideSetting GAMES = new EntitlementOverrideSetting("GAMES", 5);

    private static final /* synthetic */ EntitlementOverrideSetting[] $values() {
        return new EntitlementOverrideSetting[]{NO_OVERRIDE, ALL_ACCESS, THE_ATHLETIC, NEWS, COOKING, GAMES};
    }

    static {
        EntitlementOverrideSetting[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EntitlementOverrideSetting(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EntitlementOverrideSetting valueOf(String str) {
        return (EntitlementOverrideSetting) Enum.valueOf(EntitlementOverrideSetting.class, str);
    }

    public static EntitlementOverrideSetting[] values() {
        return (EntitlementOverrideSetting[]) $VALUES.clone();
    }
}
