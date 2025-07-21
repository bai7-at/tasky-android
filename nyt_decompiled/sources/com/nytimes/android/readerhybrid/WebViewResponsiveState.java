package com.nytimes.android.readerhybrid;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WebViewResponsiveState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ WebViewResponsiveState[] $VALUES;
    public static final WebViewResponsiveState UNKNOWN = new WebViewResponsiveState("UNKNOWN", 0);
    public static final WebViewResponsiveState RESPONSIVE = new WebViewResponsiveState("RESPONSIVE", 1);
    public static final WebViewResponsiveState FROZEN = new WebViewResponsiveState("FROZEN", 2);
    public static final WebViewResponsiveState FREEZE_TIMEOUT = new WebViewResponsiveState("FREEZE_TIMEOUT", 3);

    private static final /* synthetic */ WebViewResponsiveState[] $values() {
        return new WebViewResponsiveState[]{UNKNOWN, RESPONSIVE, FROZEN, FREEZE_TIMEOUT};
    }

    static {
        WebViewResponsiveState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WebViewResponsiveState(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static WebViewResponsiveState valueOf(String str) {
        return (WebViewResponsiveState) Enum.valueOf(WebViewResponsiveState.class, str);
    }

    public static WebViewResponsiveState[] values() {
        return (WebViewResponsiveState[]) $VALUES.clone();
    }
}
