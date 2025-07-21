package com.nytimes.android.designsystem.uicompose.ui;

import defpackage.b22;
import defpackage.tn1;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ThemeExperimentOption implements tn1 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ThemeExperimentOption[] $VALUES;
    private final String prefValue;
    private final boolean requestRestart;
    private final String summary;
    private final String title;
    public static final ThemeExperimentOption UseMaterialYouAsAccent = new ThemeExperimentOption("UseMaterialYouAsAccent", 0, "Material You as accent", "It works only Android 12+", true);
    public static final ThemeExperimentOption AnimatedTabs = new ThemeExperimentOption("AnimatedTabs", 1, "Animated Tabs", "Show animated Lottie icons at the bottom of the MainActivity", true);

    private static final /* synthetic */ ThemeExperimentOption[] $values() {
        return new ThemeExperimentOption[]{UseMaterialYouAsAccent, AnimatedTabs};
    }

    static {
        ThemeExperimentOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ThemeExperimentOption(String str, int i, String str2, String str3, boolean z) {
        this.title = str2;
        this.summary = str3;
        this.requestRestart = z;
        this.prefValue = name();
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ThemeExperimentOption valueOf(String str) {
        return (ThemeExperimentOption) Enum.valueOf(ThemeExperimentOption.class, str);
    }

    public static ThemeExperimentOption[] values() {
        return (ThemeExperimentOption[]) $VALUES.clone();
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

    /* synthetic */ ThemeExperimentOption(String str, int i, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? false : z);
    }
}
