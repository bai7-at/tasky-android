package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SynthVoice implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SynthVoice[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final SynthVoice CONTROL = new SynthVoice("CONTROL", 0, "0_control");
    public static final SynthVoice SYNTH = new SynthVoice("SYNTH", 1, "1_synth");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return SynthVoice.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ SynthVoice[] $values() {
        return new SynthVoice[]{CONTROL, SYNTH};
    }

    static {
        SynthVoice[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("STYLN_synth_voice_app_android", values(), null, false, 12, null);
    }

    private SynthVoice(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SynthVoice valueOf(String str) {
        return (SynthVoice) Enum.valueOf(SynthVoice.class, str);
    }

    public static SynthVoice[] values() {
        return (SynthVoice[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
