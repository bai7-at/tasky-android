package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DataSaleOptOutDirectiveValueV2 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DataSaleOptOutDirectiveValueV2[] $VALUES;
    public static final DataSaleOptOutDirectiveValueV2 HIDE = new DataSaleOptOutDirectiveValueV2("HIDE", 0);
    public static final DataSaleOptOutDirectiveValueV2 SHOW = new DataSaleOptOutDirectiveValueV2("SHOW", 1);
    public static final DataSaleOptOutDirectiveValueV2 SHOW_OPTED_OUT = new DataSaleOptOutDirectiveValueV2("SHOW_OPTED_OUT", 2);

    private static final /* synthetic */ DataSaleOptOutDirectiveValueV2[] $values() {
        return new DataSaleOptOutDirectiveValueV2[]{HIDE, SHOW, SHOW_OPTED_OUT};
    }

    static {
        DataSaleOptOutDirectiveValueV2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DataSaleOptOutDirectiveValueV2(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DataSaleOptOutDirectiveValueV2 valueOf(String str) {
        return (DataSaleOptOutDirectiveValueV2) Enum.valueOf(DataSaleOptOutDirectiveValueV2.class, str);
    }

    public static DataSaleOptOutDirectiveValueV2[] values() {
        return (DataSaleOptOutDirectiveValueV2[]) $VALUES.clone();
    }
}
