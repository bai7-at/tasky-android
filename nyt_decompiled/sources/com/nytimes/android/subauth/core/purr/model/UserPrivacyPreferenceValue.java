package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceValue;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;
import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserPrivacyPreferenceValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPreferenceValue[] $VALUES;
    public static final UserPrivacyPreferenceValue OPT_IN = new UserPrivacyPreferenceValue("OPT_IN", 0);
    public static final UserPrivacyPreferenceValue OPT_OUT = new UserPrivacyPreferenceValue("OPT_OUT", 1);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserPrivacyPreferenceValue.values().length];
            try {
                iArr[UserPrivacyPreferenceValue.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserPrivacyPreferenceValue.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UserPrivacyPreferenceValue[] $values() {
        return new UserPrivacyPreferenceValue[]{OPT_IN, OPT_OUT};
    }

    static {
        UserPrivacyPreferenceValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UserPrivacyPreferenceValue(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPreferenceValue valueOf(String str) {
        return (UserPrivacyPreferenceValue) Enum.valueOf(UserPrivacyPreferenceValue.class, str);
    }

    public static UserPrivacyPreferenceValue[] values() {
        return (UserPrivacyPreferenceValue[]) $VALUES.clone();
    }

    public final UserPrivacyPrefsValue toApollo$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserPrivacyPrefsValue.OPT_IN;
        }
        if (i == 2) {
            return UserPrivacyPrefsValue.OPT_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PurrPrivacyPreferenceValue toPublic$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return PurrPrivacyPreferenceValue.OPT_IN;
        }
        if (i == 2) {
            return PurrPrivacyPreferenceValue.OPT_OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
