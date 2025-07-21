package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GraceTruncatorVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ GraceTruncatorVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final GraceTruncatorVariants CONTROL = new GraceTruncatorVariants("CONTROL", 0, "0_Control_not_in_grace");
    public static final GraceTruncatorVariants USER_IN_GRACE = new GraceTruncatorVariants("USER_IN_GRACE", 1, "1_Variant_user_in_grace");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return GraceTruncatorVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ GraceTruncatorVariants[] $values() {
        return new GraceTruncatorVariants[]{CONTROL, USER_IN_GRACE};
    }

    static {
        GraceTruncatorVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_2023H2_GraceTruncator_NoTest", values(), null, false, 12, null);
    }

    private GraceTruncatorVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static GraceTruncatorVariants valueOf(String str) {
        return (GraceTruncatorVariants) Enum.valueOf(GraceTruncatorVariants.class, str);
    }

    public static GraceTruncatorVariants[] values() {
        return (GraceTruncatorVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
