package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class YouTabNameDisplay implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ YouTabNameDisplay[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final YouTabNameDisplay CONTROL = new YouTabNameDisplay("CONTROL", 0, "0_Control");
    public static final YouTabNameDisplay NAME_1 = new YouTabNameDisplay("NAME_1", 1, "1_Name");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return YouTabNameDisplay.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ YouTabNameDisplay[] $values() {
        return new YouTabNameDisplay[]{CONTROL, NAME_1};
    }

    static {
        YouTabNameDisplay[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_UserSpace_Name", values(), null, false, 4, null);
    }

    private YouTabNameDisplay(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static YouTabNameDisplay valueOf(String str) {
        return (YouTabNameDisplay) Enum.valueOf(YouTabNameDisplay.class, str);
    }

    public static YouTabNameDisplay[] values() {
        return (YouTabNameDisplay[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
