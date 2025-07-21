package com.nytimes.android.saved.synchronization;

import android.content.Context;
import defpackage.b22;
import defpackage.da7;
import defpackage.tn1;
import defpackage.zq3;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SavedExperimentOption implements tn1 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SavedExperimentOption[] $VALUES;
    public static final SavedExperimentOption Modals = new SavedExperimentOption("Modals", 0, "Modals", "Appear from a bottom sheet", false, 4, null);
    public static final SavedExperimentOption Moving_up_within_Sections_Tab;
    public static final SavedExperimentOption New_tab;
    public static final SavedExperimentOption Renaming;
    public static final SavedExperimentOption Replaces_for_you_tab;
    public static final SavedExperimentOption TopAppBar_icon;
    public static final SavedExperimentOption Top_of_for_you_tab;
    public static final SavedExperimentOption Top_of_sections_tab;
    private final String prefValue;
    private final boolean requestRestart;
    private final String summary;
    private final String title;

    private static final /* synthetic */ SavedExperimentOption[] $values() {
        return new SavedExperimentOption[]{Modals, Moving_up_within_Sections_Tab, Renaming, New_tab, Replaces_for_you_tab, Top_of_for_you_tab, Top_of_sections_tab, TopAppBar_icon};
    }

    static {
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        Moving_up_within_Sections_Tab = new SavedExperimentOption("Moving_up_within_Sections_Tab", 1, "Moving up within sections tab", null, z, i, defaultConstructorMarker);
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z2 = false;
        Renaming = new SavedExperimentOption("Renaming", 2, "Renaming", "Renaming “Saved For Later”", z2, i2, defaultConstructorMarker2);
        New_tab = new SavedExperimentOption("New_tab", 3, "New tab", "Completely new Tab", z, i, defaultConstructorMarker);
        Replaces_for_you_tab = new SavedExperimentOption("Replaces_for_you_tab", 4, "Replaces for you tab", "Tab that replaces For You", z2, i2, defaultConstructorMarker2);
        Top_of_for_you_tab = new SavedExperimentOption("Top_of_for_you_tab", 5, "Top of ForYou", "At the top of the ForYou tab", z, i, defaultConstructorMarker);
        Top_of_sections_tab = new SavedExperimentOption("Top_of_sections_tab", 6, "Top of Sections", "At the top of the Sections tab", z2, i2, defaultConstructorMarker2);
        TopAppBar_icon = new SavedExperimentOption("TopAppBar_icon", 7, "TopAppBar with icon", "In top nav bar with an icon", z, i, defaultConstructorMarker);
        SavedExperimentOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SavedExperimentOption(String str, int i, String str2, String str3, boolean z) {
        this.title = str2;
        this.summary = str3;
        this.requestRestart = z;
        this.prefValue = name();
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SavedExperimentOption valueOf(String str) {
        return (SavedExperimentOption) Enum.valueOf(SavedExperimentOption.class, str);
    }

    public static SavedExperimentOption[] values() {
        return (SavedExperimentOption[]) $VALUES.clone();
    }

    @Override // defpackage.tn1
    public String getPrefValue() {
        return this.prefValue;
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

    public final boolean isEnabled(Context context) {
        zq3.h(context, "context");
        return da7.a().h(context, this);
    }

    /* synthetic */ SavedExperimentOption(String str, int i, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? false : z);
    }
}
