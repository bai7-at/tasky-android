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
public final class GrowthUIPaywallVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GrowthUIPaywallVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final GrowthUIPaywallVariants CONTROL = new GrowthUIPaywallVariants("CONTROL", 0, "0_Control");
    public static final GrowthUIPaywallVariants USE_GROWTHUI_PAYWALL = new GrowthUIPaywallVariants("USE_GROWTHUI_PAYWALL", 1, "1_GrowthUI_Paywall");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return GrowthUIPaywallVariants.testSpec;
        }

        public final boolean b(AbraManager abraManager) {
            String variantName;
            zq3.h(abraManager, "<this>");
            AbraTest test = abraManager.getTest(GrowthUIPaywallVariants.Companion.a().getTestName());
            if (test == null || (variantName = test.getVariant()) == null) {
                variantName = GrowthUIPaywallVariants.CONTROL.getVariantName();
            }
            return zq3.c(variantName, GrowthUIPaywallVariants.USE_GROWTHUI_PAYWALL.getVariantName());
        }

        private a() {
        }
    }

    private static final /* synthetic */ GrowthUIPaywallVariants[] $values() {
        return new GrowthUIPaywallVariants[]{CONTROL, USE_GROWTHUI_PAYWALL};
    }

    static {
        GrowthUIPaywallVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_2024H2_GrowthUI_Paywall_core_and", values(), null, false, 12, null);
    }

    private GrowthUIPaywallVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GrowthUIPaywallVariants valueOf(String str) {
        return (GrowthUIPaywallVariants) Enum.valueOf(GrowthUIPaywallVariants.class, str);
    }

    public static GrowthUIPaywallVariants[] values() {
        return (GrowthUIPaywallVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
