package com.nytimes.android.ad;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DFPEditionProvider$Edition {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DFPEditionProvider$Edition[] $VALUES;
    public static final DFPEditionProvider$Edition us = new DFPEditionProvider$Edition("us", 0);
    public static final DFPEditionProvider$Edition es = new DFPEditionProvider$Edition("es", 1);

    private static final /* synthetic */ DFPEditionProvider$Edition[] $values() {
        return new DFPEditionProvider$Edition[]{us, es};
    }

    static {
        DFPEditionProvider$Edition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DFPEditionProvider$Edition(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DFPEditionProvider$Edition valueOf(String str) {
        return (DFPEditionProvider$Edition) Enum.valueOf(DFPEditionProvider$Edition.class, str);
    }

    public static DFPEditionProvider$Edition[] values() {
        return (DFPEditionProvider$Edition[]) $VALUES.clone();
    }
}
