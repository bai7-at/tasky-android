package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SavedForLaterHoldoutVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SavedForLaterHoldoutVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final SavedForLaterHoldoutVariants CONTROL = new SavedForLaterHoldoutVariants("CONTROL", 0, "0_holdout");
    public static final SavedForLaterHoldoutVariants EXPERIMENT_AUDIENCE = new SavedForLaterHoldoutVariants("EXPERIMENT_AUDIENCE", 1, "1_experimentAudience");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return SavedForLaterHoldoutVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ SavedForLaterHoldoutVariants[] $values() {
        return new SavedForLaterHoldoutVariants[]{CONTROL, EXPERIMENT_AUDIENCE};
    }

    static {
        SavedForLaterHoldoutVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_settings_holdout", values(), null, false, 12, null);
    }

    private SavedForLaterHoldoutVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SavedForLaterHoldoutVariants valueOf(String str) {
        return (SavedForLaterHoldoutVariants) Enum.valueOf(SavedForLaterHoldoutVariants.class, str);
    }

    public static SavedForLaterHoldoutVariants[] values() {
        return (SavedForLaterHoldoutVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
