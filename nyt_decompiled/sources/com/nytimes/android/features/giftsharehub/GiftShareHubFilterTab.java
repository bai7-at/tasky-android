package com.nytimes.android.features.giftsharehub;

import defpackage.b22;
import defpackage.sk6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GiftShareHubFilterTab {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GiftShareHubFilterTab[] $VALUES;
    public static final GiftShareHubFilterTab ACTIVE_LINKS = new GiftShareHubFilterTab("ACTIVE_LINKS", 0, sk6.gift_share_hub_tab_active, "active");
    public static final GiftShareHubFilterTab EXPIRED_LINKS = new GiftShareHubFilterTab("EXPIRED_LINKS", 1, sk6.gift_share_hub_tab_expired, "expired");
    private final String tabName;
    private int title;

    private static final /* synthetic */ GiftShareHubFilterTab[] $values() {
        return new GiftShareHubFilterTab[]{ACTIVE_LINKS, EXPIRED_LINKS};
    }

    static {
        GiftShareHubFilterTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GiftShareHubFilterTab(String str, int i, int i2, String str2) {
        this.title = i2;
        this.tabName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GiftShareHubFilterTab valueOf(String str) {
        return (GiftShareHubFilterTab) Enum.valueOf(GiftShareHubFilterTab.class, str);
    }

    public static GiftShareHubFilterTab[] values() {
        return (GiftShareHubFilterTab[]) $VALUES.clone();
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setTitle(int i) {
        this.title = i;
    }
}
