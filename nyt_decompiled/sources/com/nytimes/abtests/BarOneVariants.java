package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BarOneVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BarOneVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final BarOneVariants CONTROL = new BarOneVariants("CONTROL", 0, "0_control");
    public static final BarOneVariants DISPLAY_BAR_ONE = new BarOneVariants("DISPLAY_BAR_ONE", 1, "1_bar_one");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return BarOneVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ BarOneVariants[] $values() {
        return new BarOneVariants[]{CONTROL, DISPLAY_BAR_ONE};
    }

    static {
        BarOneVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_2023H2_CoreBar1", values(), null, false, 4, null);
    }

    private BarOneVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BarOneVariants valueOf(String str) {
        return (BarOneVariants) Enum.valueOf(BarOneVariants.class, str);
    }

    public static BarOneVariants[] values() {
        return (BarOneVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
