package com.nytimes.subauth.ui.purr.ui.screens;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PrivacySettingsSnackbarState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PrivacySettingsSnackbarState[] $VALUES;
    public static final PrivacySettingsSnackbarState NONE = new PrivacySettingsSnackbarState("NONE", 0);
    public static final PrivacySettingsSnackbarState CCPA_REGI = new PrivacySettingsSnackbarState("CCPA_REGI", 1);
    public static final PrivacySettingsSnackbarState CCPA_ANON = new PrivacySettingsSnackbarState("CCPA_ANON", 2);
    public static final PrivacySettingsSnackbarState ERROR = new PrivacySettingsSnackbarState("ERROR", 3);
    public static final PrivacySettingsSnackbarState ERROR_DEVICE_OFFLINE = new PrivacySettingsSnackbarState("ERROR_DEVICE_OFFLINE", 4);

    private static final /* synthetic */ PrivacySettingsSnackbarState[] $values() {
        return new PrivacySettingsSnackbarState[]{NONE, CCPA_REGI, CCPA_ANON, ERROR, ERROR_DEVICE_OFFLINE};
    }

    static {
        PrivacySettingsSnackbarState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PrivacySettingsSnackbarState(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PrivacySettingsSnackbarState valueOf(String str) {
        return (PrivacySettingsSnackbarState) Enum.valueOf(PrivacySettingsSnackbarState.class, str);
    }

    public static PrivacySettingsSnackbarState[] values() {
        return (PrivacySettingsSnackbarState[]) $VALUES.clone();
    }
}
