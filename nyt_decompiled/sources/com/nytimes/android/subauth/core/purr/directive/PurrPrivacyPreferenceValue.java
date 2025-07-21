package com.nytimes.android.subauth.core.purr.directive;

import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue;
import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrPrivacyPreferenceValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrPrivacyPreferenceValue[] $VALUES;
    public static final PurrPrivacyPreferenceValue OPT_IN = new PurrPrivacyPreferenceValue("OPT_IN", 0);
    public static final PurrPrivacyPreferenceValue OPT_OUT = new PurrPrivacyPreferenceValue("OPT_OUT", 1);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurrPrivacyPreferenceValue.values().length];
            try {
                iArr[PurrPrivacyPreferenceValue.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurrPrivacyPreferenceValue.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ PurrPrivacyPreferenceValue[] $values() {
        return new PurrPrivacyPreferenceValue[]{OPT_IN, OPT_OUT};
    }

    static {
        PurrPrivacyPreferenceValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrPrivacyPreferenceValue(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrPrivacyPreferenceValue valueOf(String str) {
        return (PurrPrivacyPreferenceValue) Enum.valueOf(PurrPrivacyPreferenceValue.class, str);
    }

    public static PurrPrivacyPreferenceValue[] values() {
        return (PurrPrivacyPreferenceValue[]) $VALUES.clone();
    }

    public final UserPrivacyPreferenceValue toModel$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserPrivacyPreferenceValue.OPT_IN;
        }
        if (i == 2) {
            return UserPrivacyPreferenceValue.OPT_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
