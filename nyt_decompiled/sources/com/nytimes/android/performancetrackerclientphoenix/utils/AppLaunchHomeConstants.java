package com.nytimes.android.performancetrackerclientphoenix.utils;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AppLaunchHomeConstants {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AppLaunchHomeConstants[] $VALUES;
    public static final AppLaunchHomeConstants HOME = new AppLaunchHomeConstants("HOME", 0);
    public static final AppLaunchHomeConstants ONE_WEBVIEW_HOME = new AppLaunchHomeConstants("ONE_WEBVIEW_HOME", 1);
    public static final AppLaunchHomeConstants XPN_HOME = new AppLaunchHomeConstants("XPN_HOME", 2);
    public static final AppLaunchHomeConstants ARTICLE = new AppLaunchHomeConstants("ARTICLE", 3);

    private static final /* synthetic */ AppLaunchHomeConstants[] $values() {
        return new AppLaunchHomeConstants[]{HOME, ONE_WEBVIEW_HOME, XPN_HOME, ARTICLE};
    }

    static {
        AppLaunchHomeConstants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AppLaunchHomeConstants(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AppLaunchHomeConstants valueOf(String str) {
        return (AppLaunchHomeConstants) Enum.valueOf(AppLaunchHomeConstants.class, str);
    }

    public static AppLaunchHomeConstants[] values() {
        return (AppLaunchHomeConstants[]) $VALUES.clone();
    }
}
