package com.nytimes.android.libs.messagingarchitecture.betasettings;

import defpackage.b22;
import defpackage.tn1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EntitlementOption implements tn1 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EntitlementOption[] $VALUES;
    public static final EntitlementOption Cooking = new EntitlementOption("Cooking", 0, "Cooking", "CKG", false, 4, null);
    public static final EntitlementOption Games;
    public static final EntitlementOption News;
    public static final EntitlementOption TheAthletic;
    public static final EntitlementOption Wirecutter;
    private final boolean requestRestart;
    private final String summary;
    private final String title;

    private static final /* synthetic */ EntitlementOption[] $values() {
        return new EntitlementOption[]{Cooking, Games, TheAthletic, News, Wirecutter};
    }

    static {
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        Games = new EntitlementOption("Games", 1, "Games", "XWD", z, i, defaultConstructorMarker);
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z2 = false;
        TheAthletic = new EntitlementOption("TheAthletic", 2, "The Athletic", "ATH", z2, i2, defaultConstructorMarker2);
        News = new EntitlementOption("News", 3, "News", "MM", z, i, defaultConstructorMarker);
        Wirecutter = new EntitlementOption("Wirecutter", 4, "Wirecutter", "WC", z2, i2, defaultConstructorMarker2);
        EntitlementOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private EntitlementOption(String str, int i, String str2, String str3, boolean z) {
        this.title = str2;
        this.summary = str3;
        this.requestRestart = z;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EntitlementOption valueOf(String str) {
        return (EntitlementOption) Enum.valueOf(EntitlementOption.class, str);
    }

    public static EntitlementOption[] values() {
        return (EntitlementOption[]) $VALUES.clone();
    }

    @Override // defpackage.tn1
    public String getPrefValue() {
        return name();
    }

    @Override // defpackage.tn1
    public boolean getRequestRestart() {
        return this.requestRestart;
    }

    @Override // defpackage.tn1
    public String getSummary() {
        return this.summary;
    }

    @Override // defpackage.tn1
    public String getTitle() {
        return this.title;
    }

    /* synthetic */ EntitlementOption(String str, int i, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? false : z);
    }
}
