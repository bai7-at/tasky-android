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
public final class UserPrivacyPrefsNameV2 {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPrefsNameV2[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f75type;
    private final String rawValue;
    public static final UserPrivacyPrefsNameV2 CCPA_PREF = new UserPrivacyPrefsNameV2("CCPA_PREF", 0, "CCPA_PREF");
    public static final UserPrivacyPrefsNameV2 GDPR_PREF = new UserPrivacyPrefsNameV2("GDPR_PREF", 1, "GDPR_PREF");
    public static final UserPrivacyPrefsNameV2 NYT_PRIVACY_SELL_AND_SERVICE = new UserPrivacyPrefsNameV2("NYT_PRIVACY_SELL_AND_SERVICE", 2, "NYT_PRIVACY_SELL_AND_SERVICE");
    public static final UserPrivacyPrefsNameV2 NYT_PRIVACY_SELL_AND_SERVICE_V2 = new UserPrivacyPrefsNameV2("NYT_PRIVACY_SELL_AND_SERVICE_V2", 3, "NYT_PRIVACY_SELL_AND_SERVICE_V2");
    public static final UserPrivacyPrefsNameV2 UNKNOWN__ = new UserPrivacyPrefsNameV2("UNKNOWN__", 4, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserPrivacyPrefsNameV2 a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserPrivacyPrefsNameV2.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserPrivacyPrefsNameV2) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserPrivacyPrefsNameV2 userPrivacyPrefsNameV2 = (UserPrivacyPrefsNameV2) obj;
            return userPrivacyPrefsNameV2 == null ? UserPrivacyPrefsNameV2.UNKNOWN__ : userPrivacyPrefsNameV2;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserPrivacyPrefsNameV2[] $values() {
        return new UserPrivacyPrefsNameV2[]{CCPA_PREF, GDPR_PREF, NYT_PRIVACY_SELL_AND_SERVICE, NYT_PRIVACY_SELL_AND_SERVICE_V2, UNKNOWN__};
    }

    static {
        UserPrivacyPrefsNameV2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f75type = new c22("UserPrivacyPrefsNameV2", i.o("CCPA_PREF", "GDPR_PREF", "NYT_PRIVACY_SELL_AND_SERVICE", "NYT_PRIVACY_SELL_AND_SERVICE_V2"));
    }

    private UserPrivacyPrefsNameV2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPrefsNameV2 valueOf(String str) {
        return (UserPrivacyPrefsNameV2) Enum.valueOf(UserPrivacyPrefsNameV2.class, str);
    }

    public static UserPrivacyPrefsNameV2[] values() {
        return (UserPrivacyPrefsNameV2[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
