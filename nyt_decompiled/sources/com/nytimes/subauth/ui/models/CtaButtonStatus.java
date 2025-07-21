package com.nytimes.subauth.ui.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CtaButtonStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CtaButtonStatus[] $VALUES;
    public static final CtaButtonStatus DISABLED = new CtaButtonStatus("DISABLED", 0);
    public static final CtaButtonStatus ENABLED = new CtaButtonStatus("ENABLED", 1);
    public static final CtaButtonStatus LOADING = new CtaButtonStatus("LOADING", 2);

    private static final /* synthetic */ CtaButtonStatus[] $values() {
        return new CtaButtonStatus[]{DISABLED, ENABLED, LOADING};
    }

    static {
        CtaButtonStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CtaButtonStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CtaButtonStatus valueOf(String str) {
        return (CtaButtonStatus) Enum.valueOf(CtaButtonStatus.class, str);
    }

    public static CtaButtonStatus[] values() {
        return (CtaButtonStatus[]) $VALUES.clone();
    }
}
