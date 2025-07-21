package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RegiAllocHoldout implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RegiAllocHoldout[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final RegiAllocHoldout HOLDOUT = new RegiAllocHoldout("HOLDOUT", 0, "0_holdout");
    public static final RegiAllocHoldout BEST_EXPERIENCE = new RegiAllocHoldout("BEST_EXPERIENCE", 1, "1_best_experience");
    public static final RegiAllocHoldout TESTING = new RegiAllocHoldout("TESTING", 2, "2_testing");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return RegiAllocHoldout.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ RegiAllocHoldout[] $values() {
        return new RegiAllocHoldout[]{HOLDOUT, BEST_EXPERIENCE, TESTING};
    }

    static {
        RegiAllocHoldout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("SUBX_regi_alloc_holdout_2024H1", values(), null, false, 12, null);
    }

    private RegiAllocHoldout(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RegiAllocHoldout valueOf(String str) {
        return (RegiAllocHoldout) Enum.valueOf(RegiAllocHoldout.class, str);
    }

    public static RegiAllocHoldout[] values() {
        return (RegiAllocHoldout[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
