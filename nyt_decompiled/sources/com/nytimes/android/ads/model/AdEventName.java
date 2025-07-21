package com.nytimes.android.ads.model;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdEventName {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AdEventName[] $VALUES;
    public static final AdEventName AdRequest = new AdEventName("AdRequest", 0);
    public static final AdEventName AdFetchNoFill = new AdEventName("AdFetchNoFill", 1);
    public static final AdEventName AdFetchSuccess = new AdEventName("AdFetchSuccess", 2);
    public static final AdEventName AdFetchError = new AdEventName("AdFetchError", 3);

    private static final /* synthetic */ AdEventName[] $values() {
        return new AdEventName[]{AdRequest, AdFetchNoFill, AdFetchSuccess, AdFetchError};
    }

    static {
        AdEventName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AdEventName(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AdEventName valueOf(String str) {
        return (AdEventName) Enum.valueOf(AdEventName.class, str);
    }

    public static AdEventName[] values() {
        return (AdEventName[]) $VALUES.clone();
    }
}
