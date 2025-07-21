package com.nytimes.android.ads.hybrid.adbridge.model;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdSlotEvent {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AdSlotEvent[] $VALUES;
    public static final AdSlotEvent AdDefined = new AdSlotEvent("AdDefined", 0);
    public static final AdSlotEvent AdCalled = new AdSlotEvent("AdCalled", 1);
    public static final AdSlotEvent AdRequestSent = new AdSlotEvent("AdRequestSent", 2);
    public static final AdSlotEvent AdRendered = new AdSlotEvent("AdRendered", 3);
    public static final AdSlotEvent AdViewable = new AdSlotEvent("AdViewable", 4);
    public static final AdSlotEvent UnsupportedEvent = new AdSlotEvent("UnsupportedEvent", 5);

    private static final /* synthetic */ AdSlotEvent[] $values() {
        return new AdSlotEvent[]{AdDefined, AdCalled, AdRequestSent, AdRendered, AdViewable, UnsupportedEvent};
    }

    static {
        AdSlotEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AdSlotEvent(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AdSlotEvent valueOf(String str) {
        return (AdSlotEvent) Enum.valueOf(AdSlotEvent.class, str);
    }

    public static AdSlotEvent[] values() {
        return (AdSlotEvent[]) $VALUES.clone();
    }
}
