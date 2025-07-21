package com.nytimes.android.subauth.core.purr.directive;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrPrivacyPreferenceKind {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrPrivacyPreferenceKind[] $VALUES;
    public static final PurrPrivacyPreferenceKind REGI = new PurrPrivacyPreferenceKind("REGI", 0);
    public static final PurrPrivacyPreferenceKind AGENT = new PurrPrivacyPreferenceKind("AGENT", 1);

    private static final /* synthetic */ PurrPrivacyPreferenceKind[] $values() {
        return new PurrPrivacyPreferenceKind[]{REGI, AGENT};
    }

    static {
        PurrPrivacyPreferenceKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrPrivacyPreferenceKind(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrPrivacyPreferenceKind valueOf(String str) {
        return (PurrPrivacyPreferenceKind) Enum.valueOf(PurrPrivacyPreferenceKind.class, str);
    }

    public static PurrPrivacyPreferenceKind[] values() {
        return (PurrPrivacyPreferenceKind[]) $VALUES.clone();
    }
}
