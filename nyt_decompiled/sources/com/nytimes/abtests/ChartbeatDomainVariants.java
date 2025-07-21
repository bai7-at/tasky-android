package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ChartbeatDomainVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ChartbeatDomainVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final ChartbeatDomainVariants CONTROL = new ChartbeatDomainVariants("CONTROL", 0, "0_control");
    public static final ChartbeatDomainVariants STAGING = new ChartbeatDomainVariants("STAGING", 1, "1_staging");
    public static final ChartbeatDomainVariants PRODUCTION = new ChartbeatDomainVariants("PRODUCTION", 2, "2_production");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return ChartbeatDomainVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ ChartbeatDomainVariants[] $values() {
        return new ChartbeatDomainVariants[]{CONTROL, STAGING, PRODUCTION};
    }

    static {
        ChartbeatDomainVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_Android_Chartbeat", values(), null, false, 12, null);
    }

    private ChartbeatDomainVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ChartbeatDomainVariants valueOf(String str) {
        return (ChartbeatDomainVariants) Enum.valueOf(ChartbeatDomainVariants.class, str);
    }

    public static ChartbeatDomainVariants[] values() {
        return (ChartbeatDomainVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
