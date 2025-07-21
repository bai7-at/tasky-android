package com.nytimes.android.readerhybrid;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class WebViewType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ WebViewType[] $VALUES;
    public static final WebViewType HYBRID = new WebViewType("HYBRID", 0);
    public static final WebViewType WEB = new WebViewType("WEB", 1);
    public static final WebViewType EMBEDDED = new WebViewType("EMBEDDED", 2);

    private static final /* synthetic */ WebViewType[] $values() {
        return new WebViewType[]{HYBRID, WEB, EMBEDDED};
    }

    static {
        WebViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WebViewType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static WebViewType valueOf(String str) {
        return (WebViewType) Enum.valueOf(WebViewType.class, str);
    }

    public static WebViewType[] values() {
        return (WebViewType[]) $VALUES.clone();
    }
}
