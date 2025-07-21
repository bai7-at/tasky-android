package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DFPOneWebviewHPVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DFPOneWebviewHPVariants[] $VALUES;
    public static final a Companion;
    public static final String testNameKey = "DFP_GPTHP";
    private static final ss7 testSpec;
    private final String variantName;
    public static final DFPOneWebviewHPVariants CONTROL = new DFPOneWebviewHPVariants("CONTROL", 0, "0_control");
    public static final DFPOneWebviewHPVariants DEFAULT = new DFPOneWebviewHPVariants("DEFAULT", 1, "0_default");
    public static final DFPOneWebviewHPVariants GPTADS = new DFPOneWebviewHPVariants("GPTADS", 2, "1_gptads");
    public static final DFPOneWebviewHPVariants HIGHERMID1 = new DFPOneWebviewHPVariants("HIGHERMID1", 3, "2_highermid1");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return DFPOneWebviewHPVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ DFPOneWebviewHPVariants[] $values() {
        return new DFPOneWebviewHPVariants[]{CONTROL, DEFAULT, GPTADS, HIGHERMID1};
    }

    static {
        DFPOneWebviewHPVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7(testNameKey, values(), null, false, 12, null);
    }

    private DFPOneWebviewHPVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DFPOneWebviewHPVariants valueOf(String str) {
        return (DFPOneWebviewHPVariants) Enum.valueOf(DFPOneWebviewHPVariants.class, str);
    }

    public static DFPOneWebviewHPVariants[] values() {
        return (DFPOneWebviewHPVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
