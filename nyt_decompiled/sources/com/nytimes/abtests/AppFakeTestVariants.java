package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AppFakeTestVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AppFakeTestVariants[] $VALUES;
    public static final a Companion;
    public static final AppFakeTestVariants VARIANT_A = new AppFakeTestVariants("VARIANT_A", 0, "variant_a");
    public static final AppFakeTestVariants VARIANT_B = new AppFakeTestVariants("VARIANT_B", 1, "variant_b");
    private static final ss7 testSpec;
    private final String variantName;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return AppFakeTestVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AppFakeTestVariants[] $values() {
        return new AppFakeTestVariants[]{VARIANT_A, VARIANT_B};
    }

    static {
        AppFakeTestVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_Fake_Test_Rules_Object", values(), null, false, 4, null);
    }

    private AppFakeTestVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AppFakeTestVariants valueOf(String str) {
        return (AppFakeTestVariants) Enum.valueOf(AppFakeTestVariants.class, str);
    }

    public static AppFakeTestVariants[] values() {
        return (AppFakeTestVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
