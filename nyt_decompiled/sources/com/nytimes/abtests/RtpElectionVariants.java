package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RtpElectionVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RtpElectionVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final RtpElectionVariants EXCLUDE = new RtpElectionVariants("EXCLUDE", 0, "exclude");
    public static final RtpElectionVariants CONTROL = new RtpElectionVariants("CONTROL", 1, "0_election_control");
    public static final RtpElectionVariants ELECTION = new RtpElectionVariants("ELECTION", 2, "1_election");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return RtpElectionVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ RtpElectionVariants[] $values() {
        return new RtpElectionVariants[]{EXCLUDE, CONTROL, ELECTION};
    }

    static {
        RtpElectionVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_rtp_election", values(), null, false, 12, null);
    }

    private RtpElectionVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RtpElectionVariants valueOf(String str) {
        return (RtpElectionVariants) Enum.valueOf(RtpElectionVariants.class, str);
    }

    public static RtpElectionVariants[] values() {
        return (RtpElectionVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
