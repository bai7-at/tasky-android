package com.nytimes.abtests.targeting;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class EarlyTenuredUsersVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EarlyTenuredUsersVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final EarlyTenuredUsersVariants CONTROL = new EarlyTenuredUsersVariants("CONTROL", 0, "0_control");
    public static final EarlyTenuredUsersVariants EARLY_TENURED = new EarlyTenuredUsersVariants("EARLY_TENURED", 1, "1_earlyTenured");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return EarlyTenuredUsersVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EarlyTenuredUsersVariants[] $values() {
        return new EarlyTenuredUsersVariants[]{CONTROL, EARLY_TENURED};
    }

    static {
        EarlyTenuredUsersVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_Targeting_earlyTenuredUsers", values(), null, false, 12, null);
    }

    private EarlyTenuredUsersVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EarlyTenuredUsersVariants valueOf(String str) {
        return (EarlyTenuredUsersVariants) Enum.valueOf(EarlyTenuredUsersVariants.class, str);
    }

    public static EarlyTenuredUsersVariants[] values() {
        return (EarlyTenuredUsersVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
