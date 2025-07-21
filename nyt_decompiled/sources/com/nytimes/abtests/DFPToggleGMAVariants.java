package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DFPToggleGMAVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DFPToggleGMAVariants[] $VALUES;
    public static final a Companion;
    public static final String testNameKey = "DFP_GMA_App_Toggle_0924";
    private static final ss7 testSpec;
    private final String variantName;
    public static final DFPToggleGMAVariants ENABLED = new DFPToggleGMAVariants("ENABLED", 0, "0_Enabled");
    public static final DFPToggleGMAVariants DISABLED = new DFPToggleGMAVariants("DISABLED", 1, "1_Disabled");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return DFPToggleGMAVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ DFPToggleGMAVariants[] $values() {
        return new DFPToggleGMAVariants[]{ENABLED, DISABLED};
    }

    static {
        DFPToggleGMAVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7(testNameKey, values(), null, false, 12, null);
    }

    private DFPToggleGMAVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DFPToggleGMAVariants valueOf(String str) {
        return (DFPToggleGMAVariants) Enum.valueOf(DFPToggleGMAVariants.class, str);
    }

    public static DFPToggleGMAVariants[] values() {
        return (DFPToggleGMAVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
