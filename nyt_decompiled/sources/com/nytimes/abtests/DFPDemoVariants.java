package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DFPDemoVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DFPDemoVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final DFPDemoVariants CONTROL = new DFPDemoVariants("CONTROL", 0, "0_control");
    public static final DFPDemoVariants TEST = new DFPDemoVariants("TEST", 1, "1_test");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return DFPDemoVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ DFPDemoVariants[] $values() {
        return new DFPDemoVariants[]{CONTROL, TEST};
    }

    static {
        DFPDemoVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("DFP_demo_test", values(), null, false, 12, null);
    }

    private DFPDemoVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DFPDemoVariants valueOf(String str) {
        return (DFPDemoVariants) Enum.valueOf(DFPDemoVariants.class, str);
    }

    public static DFPDemoVariants[] values() {
        return (DFPDemoVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
