package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class IterateSurveyVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ IterateSurveyVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final IterateSurveyVariants CONTROL = new IterateSurveyVariants("CONTROL", 0, "0_control");
    public static final IterateSurveyVariants STAGING = new IterateSurveyVariants("STAGING", 1, "1_staging");
    public static final IterateSurveyVariants PRODUCTION = new IterateSurveyVariants("PRODUCTION", 2, "2_production");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return IterateSurveyVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ IterateSurveyVariants[] $values() {
        return new IterateSurveyVariants[]{CONTROL, STAGING, PRODUCTION};
    }

    static {
        IterateSurveyVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_android_iterate_survey", values(), null, false, 12, null);
    }

    private IterateSurveyVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static IterateSurveyVariants valueOf(String str) {
        return (IterateSurveyVariants) Enum.valueOf(IterateSurveyVariants.class, str);
    }

    public static IterateSurveyVariants[] values() {
        return (IterateSurveyVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
