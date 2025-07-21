package com.nytimes.android.growthui.common.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DataConfigId {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DataConfigId[] $VALUES;
    public static final DataConfigId AllAccess = new DataConfigId("AllAccess", 0);
    public static final DataConfigId AllAccessLandingPageAsPaywall = new DataConfigId("AllAccessLandingPageAsPaywall", 1);
    public static final DataConfigId AllAccessPaywall = new DataConfigId("AllAccessPaywall", 2);
    public static final DataConfigId WordlebotPaywall = new DataConfigId("WordlebotPaywall", 3);
    public static final DataConfigId AllAccessPostLogin = new DataConfigId("AllAccessPostLogin", 4);
    public static final DataConfigId AllAccessPostRegistration = new DataConfigId("AllAccessPostRegistration", 5);
    public static final DataConfigId Cooking = new DataConfigId("Cooking", 6);
    public static final DataConfigId Games = new DataConfigId("Games", 7);
    public static final DataConfigId GamesPostLogin = new DataConfigId("GamesPostLogin", 8);
    public static final DataConfigId GamesPostRegistration = new DataConfigId("GamesPostRegistration", 9);
    public static final DataConfigId PlayTab = new DataConfigId("PlayTab", 10);
    public static final DataConfigId Regibundle = new DataConfigId("Regibundle", 11);

    private static final /* synthetic */ DataConfigId[] $values() {
        return new DataConfigId[]{AllAccess, AllAccessLandingPageAsPaywall, AllAccessPaywall, WordlebotPaywall, AllAccessPostLogin, AllAccessPostRegistration, Cooking, Games, GamesPostLogin, GamesPostRegistration, PlayTab, Regibundle};
    }

    static {
        DataConfigId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DataConfigId(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DataConfigId valueOf(String str) {
        return (DataConfigId) Enum.valueOf(DataConfigId.class, str);
    }

    public static DataConfigId[] values() {
        return (DataConfigId[]) $VALUES.clone();
    }
}
