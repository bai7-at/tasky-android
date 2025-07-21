package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ConnectionsVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final ConnectionsVariants CONTROL = new ConnectionsVariants("CONTROL", 0, "0_control");
    public static final ConnectionsVariants NO_VISIT_SINCE_LAUNCH = new ConnectionsVariants("NO_VISIT_SINCE_LAUNCH", 1, "1_VisitSinceLaunch");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return ConnectionsVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ ConnectionsVariants[] $values() {
        return new ConnectionsVariants[]{CONTROL, NO_VISIT_SINCE_LAUNCH};
    }

    static {
        ConnectionsVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_ConnectionsPT_0823", values(), null, false, 12, null);
    }

    private ConnectionsVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsVariants valueOf(String str) {
        return (ConnectionsVariants) Enum.valueOf(ConnectionsVariants.class, str);
    }

    public static ConnectionsVariants[] values() {
        return (ConnectionsVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
