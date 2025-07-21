package com.nytimes.android.growthui.common.models.config;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OffersMessageType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ OffersMessageType[] $VALUES;
    public static final OffersMessageType BauMessage = new OffersMessageType("BauMessage", 0);
    public static final OffersMessageType FreeTrialMessage = new OffersMessageType("FreeTrialMessage", 1);
    public static final OffersMessageType SaleMessage = new OffersMessageType("SaleMessage", 2);

    private static final /* synthetic */ OffersMessageType[] $values() {
        return new OffersMessageType[]{BauMessage, FreeTrialMessage, SaleMessage};
    }

    static {
        OffersMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OffersMessageType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static OffersMessageType valueOf(String str) {
        return (OffersMessageType) Enum.valueOf(OffersMessageType.class, str);
    }

    public static OffersMessageType[] values() {
        return (OffersMessageType[]) $VALUES.clone();
    }
}
