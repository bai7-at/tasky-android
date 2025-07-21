package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MessagingOmaMigration implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MessagingOmaMigration[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final MessagingOmaMigration CONTROL = new MessagingOmaMigration("CONTROL", 0, "0_control");
    public static final MessagingOmaMigration OMA = new MessagingOmaMigration("OMA", 1, "1_oma");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return MessagingOmaMigration.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ MessagingOmaMigration[] $values() {
        return new MessagingOmaMigration[]{CONTROL, OMA};
    }

    static {
        MessagingOmaMigration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_Messaging_OMAmigration", values(), null, false, 12, null);
    }

    private MessagingOmaMigration(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MessagingOmaMigration valueOf(String str) {
        return (MessagingOmaMigration) Enum.valueOf(MessagingOmaMigration.class, str);
    }

    public static MessagingOmaMigration[] values() {
        return (MessagingOmaMigration[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
