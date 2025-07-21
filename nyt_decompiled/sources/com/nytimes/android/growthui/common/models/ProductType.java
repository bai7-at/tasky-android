package com.nytimes.android.growthui.common.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProductType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final ProductType AllAccess = new ProductType("AllAccess", 0);
    public static final ProductType StandAlone = new ProductType("StandAlone", 1);

    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{AllAccess, StandAlone};
    }

    static {
        ProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
