package com.nytimes.abtests;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.abra.models.AbraTest;
import defpackage.b22;
import defpackage.ss7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GrowthUIRegibundleVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GrowthUIRegibundleVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final GrowthUIRegibundleVariants CONTROL = new GrowthUIRegibundleVariants("CONTROL", 0, "0_Control");
    public static final GrowthUIRegibundleVariants USE_GROWTHUI_REGIBUNDLE = new GrowthUIRegibundleVariants("USE_GROWTHUI_REGIBUNDLE", 1, "1_GrowthUI_Regibundle");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return GrowthUIRegibundleVariants.testSpec;
        }

        public final boolean b(AbraManager abraManager) {
            String variantName;
            zq3.h(abraManager, "<this>");
            AbraTest test = abraManager.getTest(GrowthUIRegibundleVariants.Companion.a().getTestName());
            if (test == null || (variantName = test.getVariant()) == null) {
                variantName = GrowthUIRegibundleVariants.CONTROL.getVariantName();
            }
            return zq3.c(variantName, GrowthUIRegibundleVariants.USE_GROWTHUI_REGIBUNDLE.getVariantName());
        }

        private a() {
        }
    }

    private static final /* synthetic */ GrowthUIRegibundleVariants[] $values() {
        return new GrowthUIRegibundleVariants[]{CONTROL, USE_GROWTHUI_REGIBUNDLE};
    }

    static {
        GrowthUIRegibundleVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_2024H2_GrowthUI_Regibundle_core_and", values(), null, false, 12, null);
    }

    private GrowthUIRegibundleVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GrowthUIRegibundleVariants valueOf(String str) {
        return (GrowthUIRegibundleVariants) Enum.valueOf(GrowthUIRegibundleVariants.class, str);
    }

    public static GrowthUIRegibundleVariants[] values() {
        return (GrowthUIRegibundleVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
