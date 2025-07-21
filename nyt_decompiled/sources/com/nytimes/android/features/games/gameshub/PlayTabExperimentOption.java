package com.nytimes.android.features.games.gameshub;

import defpackage.b22;
import defpackage.tn1;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlayTabExperimentOption implements tn1 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PlayTabExperimentOption[] $VALUES;
    public static final PlayTabExperimentOption ShowDevTools = new PlayTabExperimentOption("ShowDevTools", 0, "Show dev tools", "Show the dev toolbar on the top of the Play Tab", false, 4, null);
    private final String prefValue;
    private final boolean requestRestart;
    private final String summary;
    private final String title;

    private static final /* synthetic */ PlayTabExperimentOption[] $values() {
        return new PlayTabExperimentOption[]{ShowDevTools};
    }

    static {
        PlayTabExperimentOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlayTabExperimentOption(String str, int i, String str2, String str3, boolean z) {
        this.title = str2;
        this.summary = str3;
        this.requestRestart = z;
        this.prefValue = name();
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PlayTabExperimentOption valueOf(String str) {
        return (PlayTabExperimentOption) Enum.valueOf(PlayTabExperimentOption.class, str);
    }

    public static PlayTabExperimentOption[] values() {
        return (PlayTabExperimentOption[]) $VALUES.clone();
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

    /* synthetic */ PlayTabExperimentOption(String str, int i, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? false : z);
    }
}
