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
public final class GrowthUIWordlebotPaywallVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GrowthUIWordlebotPaywallVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final GrowthUIWordlebotPaywallVariants CONTROL = new GrowthUIWordlebotPaywallVariants("CONTROL", 0, "0_Control");
    public static final GrowthUIWordlebotPaywallVariants USE_GROWTHUI_WORDLEBOT_PAYWALL = new GrowthUIWordlebotPaywallVariants("USE_GROWTHUI_WORDLEBOT_PAYWALL", 1, "1_GrowthUI_Paywall");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return GrowthUIWordlebotPaywallVariants.testSpec;
        }

        public final boolean b(AbraManager abraManager) {
            String variantName;
            zq3.h(abraManager, "<this>");
            AbraTest test = abraManager.getTest(GrowthUIWordlebotPaywallVariants.Companion.a().getTestName());
            if (test == null || (variantName = test.getVariant()) == null) {
                variantName = GrowthUIWordlebotPaywallVariants.CONTROL.getVariantName();
            }
            return zq3.c(variantName, GrowthUIWordlebotPaywallVariants.USE_GROWTHUI_WORDLEBOT_PAYWALL.getVariantName());
        }

        private a() {
        }
    }

    private static final /* synthetic */ GrowthUIWordlebotPaywallVariants[] $values() {
        return new GrowthUIWordlebotPaywallVariants[]{CONTROL, USE_GROWTHUI_WORDLEBOT_PAYWALL};
    }

    static {
        GrowthUIWordlebotPaywallVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_2024H2_GrowthUI_Wordlebot_Paywall_core_and", values(), null, false, 12, null);
    }

    private GrowthUIWordlebotPaywallVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GrowthUIWordlebotPaywallVariants valueOf(String str) {
        return (GrowthUIWordlebotPaywallVariants) Enum.valueOf(GrowthUIWordlebotPaywallVariants.class, str);
    }

    public static GrowthUIWordlebotPaywallVariants[] values() {
        return (GrowthUIWordlebotPaywallVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
