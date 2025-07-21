package com.nytimes.android.subauth.core.purr.directive;

import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName;
import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PurrPrivacyPreferenceName {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PurrPrivacyPreferenceName[] $VALUES;
    public static final PurrPrivacyPreferenceName CCPA = new PurrPrivacyPreferenceName("CCPA", 0);
    public static final PurrPrivacyPreferenceName GDPR = new PurrPrivacyPreferenceName("GDPR", 1);
    public static final PurrPrivacyPreferenceName NYT_PRIVACY_SELL_AND_SERVICE = new PurrPrivacyPreferenceName("NYT_PRIVACY_SELL_AND_SERVICE", 2);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurrPrivacyPreferenceName.values().length];
            try {
                iArr[PurrPrivacyPreferenceName.CCPA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurrPrivacyPreferenceName.GDPR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurrPrivacyPreferenceName.NYT_PRIVACY_SELL_AND_SERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ PurrPrivacyPreferenceName[] $values() {
        return new PurrPrivacyPreferenceName[]{CCPA, GDPR, NYT_PRIVACY_SELL_AND_SERVICE};
    }

    static {
        PurrPrivacyPreferenceName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PurrPrivacyPreferenceName(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PurrPrivacyPreferenceName valueOf(String str) {
        return (PurrPrivacyPreferenceName) Enum.valueOf(PurrPrivacyPreferenceName.class, str);
    }

    public static PurrPrivacyPreferenceName[] values() {
        return (PurrPrivacyPreferenceName[]) $VALUES.clone();
    }

    public final UserPrivacyPreferenceName toModel$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserPrivacyPreferenceName.CCPA;
        }
        if (i == 2) {
            return UserPrivacyPreferenceName.GDPR;
        }
        if (i == 3) {
            return UserPrivacyPreferenceName.NYT_PRIVACY_SELL_AND_SERVICE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
