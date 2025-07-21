package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FakeTrafficTestVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ FakeTrafficTestVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final FakeTrafficTestVariants CONTROL = new FakeTrafficTestVariants("CONTROL", 0, "0_control");
    public static final FakeTrafficTestVariants FAKE_HIGH = new FakeTrafficTestVariants("FAKE_HIGH", 1, "1_fakeHigh");
    public static final FakeTrafficTestVariants FAKE_MEDIUM = new FakeTrafficTestVariants("FAKE_MEDIUM", 2, "2_fakeMed");
    public static final FakeTrafficTestVariants FAKE_LOW = new FakeTrafficTestVariants("FAKE_LOW", 3, "3_fakeLow");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return FakeTrafficTestVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ FakeTrafficTestVariants[] $values() {
        return new FakeTrafficTestVariants[]{CONTROL, FAKE_HIGH, FAKE_MEDIUM, FAKE_LOW};
    }

    static {
        FakeTrafficTestVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_fake_trafficTest", values(), null, false, 12, null);
    }

    private FakeTrafficTestVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static FakeTrafficTestVariants valueOf(String str) {
        return (FakeTrafficTestVariants) Enum.valueOf(FakeTrafficTestVariants.class, str);
    }

    public static FakeTrafficTestVariants[] values() {
        return (FakeTrafficTestVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
