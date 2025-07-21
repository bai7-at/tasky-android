package com.nytimes.android.subauth.core.type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserPrivacyPrefsName {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPrefsName[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f74type;
    private final String rawValue;
    public static final UserPrivacyPrefsName CCPA_PREF = new UserPrivacyPrefsName("CCPA_PREF", 0, "CCPA_PREF");
    public static final UserPrivacyPrefsName GDPR_PREF = new UserPrivacyPrefsName("GDPR_PREF", 1, "GDPR_PREF");
    public static final UserPrivacyPrefsName NYT_PRIVACY_SELL_AND_SERVICE = new UserPrivacyPrefsName("NYT_PRIVACY_SELL_AND_SERVICE", 2, "NYT_PRIVACY_SELL_AND_SERVICE");
    public static final UserPrivacyPrefsName UNKNOWN__ = new UserPrivacyPrefsName("UNKNOWN__", 3, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserPrivacyPrefsName a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserPrivacyPrefsName.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserPrivacyPrefsName) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserPrivacyPrefsName userPrivacyPrefsName = (UserPrivacyPrefsName) obj;
            return userPrivacyPrefsName == null ? UserPrivacyPrefsName.UNKNOWN__ : userPrivacyPrefsName;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserPrivacyPrefsName[] $values() {
        return new UserPrivacyPrefsName[]{CCPA_PREF, GDPR_PREF, NYT_PRIVACY_SELL_AND_SERVICE, UNKNOWN__};
    }

    static {
        UserPrivacyPrefsName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f74type = new c22("UserPrivacyPrefsName", i.o("CCPA_PREF", "GDPR_PREF", "NYT_PRIVACY_SELL_AND_SERVICE"));
    }

    private UserPrivacyPrefsName(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPrefsName valueOf(String str) {
        return (UserPrivacyPrefsName) Enum.valueOf(UserPrivacyPrefsName.class, str);
    }

    public static UserPrivacyPrefsName[] values() {
        return (UserPrivacyPrefsName[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
