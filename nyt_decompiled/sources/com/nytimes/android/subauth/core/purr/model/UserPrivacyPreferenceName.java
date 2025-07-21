package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceName;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsName;
import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserPrivacyPreferenceName {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPreferenceName[] $VALUES;
    public static final UserPrivacyPreferenceName CCPA = new UserPrivacyPreferenceName("CCPA", 0);
    public static final UserPrivacyPreferenceName GDPR = new UserPrivacyPreferenceName("GDPR", 1);
    public static final UserPrivacyPreferenceName NYT_PRIVACY_SELL_AND_SERVICE = new UserPrivacyPreferenceName("NYT_PRIVACY_SELL_AND_SERVICE", 2);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserPrivacyPreferenceName.values().length];
            try {
                iArr[UserPrivacyPreferenceName.CCPA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserPrivacyPreferenceName.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserPrivacyPreferenceName.NYT_PRIVACY_SELL_AND_SERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UserPrivacyPreferenceName[] $values() {
        return new UserPrivacyPreferenceName[]{CCPA, GDPR, NYT_PRIVACY_SELL_AND_SERVICE};
    }

    static {
        UserPrivacyPreferenceName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UserPrivacyPreferenceName(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPreferenceName valueOf(String str) {
        return (UserPrivacyPreferenceName) Enum.valueOf(UserPrivacyPreferenceName.class, str);
    }

    public static UserPrivacyPreferenceName[] values() {
        return (UserPrivacyPreferenceName[]) $VALUES.clone();
    }

    public final UserPrivacyPrefsName toApollo$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserPrivacyPrefsName.CCPA_PREF;
        }
        if (i == 2) {
            return UserPrivacyPrefsName.GDPR_PREF;
        }
        if (i == 3) {
            return UserPrivacyPrefsName.NYT_PRIVACY_SELL_AND_SERVICE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PurrPrivacyPreferenceName toPublic$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return PurrPrivacyPreferenceName.CCPA;
        }
        if (i == 2) {
            return PurrPrivacyPreferenceName.GDPR;
        }
        if (i == 3) {
            return PurrPrivacyPreferenceName.NYT_PRIVACY_SELL_AND_SERVICE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
