package com.nytimes.android.subauth.core.purchase.analytics;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CampaignCodeSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CampaignCodeSource[] $VALUES;
    public static final CampaignCodeSource SUBSCRIBE = new CampaignCodeSource("SUBSCRIBE", 0);
    public static final CampaignCodeSource GATEWAY = new CampaignCodeSource("GATEWAY", 1);
    public static final CampaignCodeSource SUBSCRIBE_AD = new CampaignCodeSource("SUBSCRIBE_AD", 2);
    public static final CampaignCodeSource TOAST = new CampaignCodeSource("TOAST", 3);
    public static final CampaignCodeSource METER_CARD = new CampaignCodeSource("METER_CARD", 4);
    public static final CampaignCodeSource SPLASH = new CampaignCodeSource("SPLASH", 5);
    public static final CampaignCodeSource TOP_STORIES_SUB = new CampaignCodeSource("TOP_STORIES_SUB", 6);
    public static final CampaignCodeSource AF_SUB = new CampaignCodeSource("AF_SUB", 7);

    private static final /* synthetic */ CampaignCodeSource[] $values() {
        return new CampaignCodeSource[]{SUBSCRIBE, GATEWAY, SUBSCRIBE_AD, TOAST, METER_CARD, SPLASH, TOP_STORIES_SUB, AF_SUB};
    }

    static {
        CampaignCodeSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CampaignCodeSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CampaignCodeSource valueOf(String str) {
        return (CampaignCodeSource) Enum.valueOf(CampaignCodeSource.class, str);
    }

    public static CampaignCodeSource[] values() {
        return (CampaignCodeSource[]) $VALUES.clone();
    }
}
