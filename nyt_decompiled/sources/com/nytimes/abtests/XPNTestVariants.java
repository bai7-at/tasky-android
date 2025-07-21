package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class XPNTestVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ XPNTestVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final XPNTestVariants CONTROL = new XPNTestVariants("CONTROL", 0, "0_control");
    public static final XPNTestVariants RIBBON = new XPNTestVariants("RIBBON", 1, "1_ribbon");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return XPNTestVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ XPNTestVariants[] $values() {
        return new XPNTestVariants[]{CONTROL, RIBBON};
    }

    static {
        XPNTestVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_xpn_android_mvp_h12024", values(), null, false, 4, null);
    }

    private XPNTestVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static XPNTestVariants valueOf(String str) {
        return (XPNTestVariants) Enum.valueOf(XPNTestVariants.class, str);
    }

    public static XPNTestVariants[] values() {
        return (XPNTestVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
