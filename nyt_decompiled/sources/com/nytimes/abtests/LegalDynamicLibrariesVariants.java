package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LegalDynamicLibrariesVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LegalDynamicLibrariesVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final LegalDynamicLibrariesVariants CONTROL = new LegalDynamicLibrariesVariants("CONTROL", 0, "0_control");
    public static final LegalDynamicLibrariesVariants ENABLED = new LegalDynamicLibrariesVariants("ENABLED", 1, "1_enabled");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return LegalDynamicLibrariesVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ LegalDynamicLibrariesVariants[] $values() {
        return new LegalDynamicLibrariesVariants[]{CONTROL, ENABLED};
    }

    static {
        LegalDynamicLibrariesVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_dynamic_libraries_listing", values(), null, false, 12, null);
    }

    private LegalDynamicLibrariesVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LegalDynamicLibrariesVariants valueOf(String str) {
        return (LegalDynamicLibrariesVariants) Enum.valueOf(LegalDynamicLibrariesVariants.class, str);
    }

    public static LegalDynamicLibrariesVariants[] values() {
        return (LegalDynamicLibrariesVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
