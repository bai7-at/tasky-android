package com.nytimes.abtests.targeting;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NonGamePlayerVariants implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NonGamePlayerVariants[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final NonGamePlayerVariants CONTROL = new NonGamePlayerVariants("CONTROL", 0, "0_control");
    public static final NonGamePlayerVariants NON_GAME_PLAYERS = new NonGamePlayerVariants("NON_GAME_PLAYERS", 1, "1_nonGamePlayers");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return NonGamePlayerVariants.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ NonGamePlayerVariants[] $values() {
        return new NonGamePlayerVariants[]{CONTROL, NON_GAME_PLAYERS};
    }

    static {
        NonGamePlayerVariants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_Targeting_nonGamePlayers", values(), null, false, 12, null);
    }

    private NonGamePlayerVariants(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NonGamePlayerVariants valueOf(String str) {
        return (NonGamePlayerVariants) Enum.valueOf(NonGamePlayerVariants.class, str);
    }

    public static NonGamePlayerVariants[] values() {
        return (NonGamePlayerVariants[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
