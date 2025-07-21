package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.network.parsing.PurrResponseParserException;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsValue;
import defpackage.qg5;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ApolloExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[UserPrivacyPrefsName.values().length];
            try {
                iArr[UserPrivacyPrefsName.CCPA_PREF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserPrivacyPrefsName.GDPR_PREF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserPrivacyPrefsValue.values().length];
            try {
                iArr2[UserPrivacyPrefsValue.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserPrivacyPrefsValue.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UserPrivacyPrefsKind.values().length];
            try {
                iArr3[UserPrivacyPrefsKind.AGENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[UserPrivacyPrefsKind.REGI.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final UserPrivacyPreference toModel(qg5 qg5Var) {
        zq3.h(qg5Var, "<this>");
        return new UserPrivacyPreference(toModel(qg5Var.b()), toModel(qg5Var.c()), toModel(qg5Var.a()));
    }

    public static final UserPrivacyPreferenceName toModel(UserPrivacyPrefsName userPrivacyPrefsName) {
        zq3.h(userPrivacyPrefsName, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[userPrivacyPrefsName.ordinal()];
        if (i == 1) {
            return UserPrivacyPreferenceName.CCPA;
        }
        if (i == 2) {
            return UserPrivacyPreferenceName.GDPR;
        }
        throw new PurrResponseParserException("Can't convert unknown value=" + userPrivacyPrefsName);
    }

    public static final UserPrivacyPreferenceValue toModel(UserPrivacyPrefsValue userPrivacyPrefsValue) {
        zq3.h(userPrivacyPrefsValue, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[userPrivacyPrefsValue.ordinal()];
        if (i == 1) {
            return UserPrivacyPreferenceValue.OPT_IN;
        }
        if (i == 2) {
            return UserPrivacyPreferenceValue.OPT_OUT;
        }
        throw new PurrResponseParserException("Can't convert unknown value=" + userPrivacyPrefsValue);
    }

    public static final UserPrivacyPreferenceKind toModel(UserPrivacyPrefsKind userPrivacyPrefsKind) {
        zq3.h(userPrivacyPrefsKind, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[userPrivacyPrefsKind.ordinal()];
        if (i == 1) {
            return UserPrivacyPreferenceKind.AGENT;
        }
        if (i == 2) {
            return UserPrivacyPreferenceKind.REGI;
        }
        throw new PurrResponseParserException("Can't convert unknown value=" + userPrivacyPrefsKind);
    }
}
