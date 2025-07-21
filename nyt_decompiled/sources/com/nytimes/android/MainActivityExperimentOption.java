package com.nytimes.android;

import defpackage.b22;
import defpackage.tn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MainActivityExperimentOption implements tn1 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MainActivityExperimentOption[] $VALUES;
    public static final MainActivityExperimentOption ComposeBottomBar = new MainActivityExperimentOption("ComposeBottomBar", 0, "Compose: BottomBar", "BottomBar in NytScaffold { }");
    private final String prefValue = name();
    private final boolean requestRestart = true;
    private final String summary;
    private final String title;

    private static final /* synthetic */ MainActivityExperimentOption[] $values() {
        return new MainActivityExperimentOption[]{ComposeBottomBar};
    }

    static {
        MainActivityExperimentOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MainActivityExperimentOption(String str, int i, String str2, String str3) {
        this.title = str2;
        this.summary = str3;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MainActivityExperimentOption valueOf(String str) {
        return (MainActivityExperimentOption) Enum.valueOf(MainActivityExperimentOption.class, str);
    }

    public static MainActivityExperimentOption[] values() {
        return (MainActivityExperimentOption[]) $VALUES.clone();
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
}
