package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PushColumnsVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PushColumnsVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final PushColumnsVariants CONTROL = new PushColumnsVariants("CONTROL", 0, "0_control");
    public static final PushColumnsVariants PUSH = new PushColumnsVariants("PUSH", 1, "1_push");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return PushColumnsVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ PushColumnsVariants[] $values() {
        return new PushColumnsVariants[]{CONTROL, PUSH};
    }

    static {
        PushColumnsVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_push_columns", values(), null, false, 12, null);
    }

    private PushColumnsVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PushColumnsVariants valueOf(String str) {
        return (PushColumnsVariants) Enum.valueOf(PushColumnsVariants.class, str);
    }

    public static PushColumnsVariants[] values() {
        return (PushColumnsVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
