package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class InterestsUpdatedBadging implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ InterestsUpdatedBadging[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final InterestsUpdatedBadging CONTROL = new InterestsUpdatedBadging("CONTROL", 0, "0_control");
    public static final InterestsUpdatedBadging BADGE = new InterestsUpdatedBadging("BADGE", 1, "1_interest_badging");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return InterestsUpdatedBadging.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ InterestsUpdatedBadging[] $values() {
        return new InterestsUpdatedBadging[]{CONTROL, BADGE};
    }

    static {
        InterestsUpdatedBadging[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_UserSpace_Android_BadgingFrequency", values(), null, false, 4, null);
    }

    private InterestsUpdatedBadging(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static InterestsUpdatedBadging valueOf(String str) {
        return (InterestsUpdatedBadging) Enum.valueOf(InterestsUpdatedBadging.class, str);
    }

    public static InterestsUpdatedBadging[] values() {
        return (InterestsUpdatedBadging[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
