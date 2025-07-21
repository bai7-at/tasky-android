package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyPreferenceKind;
import com.nytimes.android.subauth.core.type.UserPrivacyPrefsKind;
import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserPrivacyPreferenceKind {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPreferenceKind[] $VALUES;
    public static final UserPrivacyPreferenceKind REGI = new UserPrivacyPreferenceKind("REGI", 0);
    public static final UserPrivacyPreferenceKind AGENT = new UserPrivacyPreferenceKind("AGENT", 1);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserPrivacyPreferenceKind.values().length];
            try {
                iArr[UserPrivacyPreferenceKind.REGI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserPrivacyPreferenceKind.AGENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UserPrivacyPreferenceKind[] $values() {
        return new UserPrivacyPreferenceKind[]{REGI, AGENT};
    }

    static {
        UserPrivacyPreferenceKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UserPrivacyPreferenceKind(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPreferenceKind valueOf(String str) {
        return (UserPrivacyPreferenceKind) Enum.valueOf(UserPrivacyPreferenceKind.class, str);
    }

    public static UserPrivacyPreferenceKind[] values() {
        return (UserPrivacyPreferenceKind[]) $VALUES.clone();
    }

    public final UserPrivacyPrefsKind toApollo$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserPrivacyPrefsKind.REGI;
        }
        if (i == 2) {
            return UserPrivacyPrefsKind.AGENT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PurrPrivacyPreferenceKind toPublic$subauth_core_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return PurrPrivacyPreferenceKind.REGI;
        }
        if (i == 2) {
            return PurrPrivacyPreferenceKind.AGENT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
