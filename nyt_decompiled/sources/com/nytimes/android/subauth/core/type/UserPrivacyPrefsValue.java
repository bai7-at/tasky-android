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
public final class UserPrivacyPrefsValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPrefsValue[] $VALUES;
    public static final a Companion;
    public static final UserPrivacyPrefsValue OPT_IN = new UserPrivacyPrefsValue("OPT_IN", 0, "OPT_IN");
    public static final UserPrivacyPrefsValue OPT_OUT = new UserPrivacyPrefsValue("OPT_OUT", 1, "OPT_OUT");
    public static final UserPrivacyPrefsValue UNKNOWN__ = new UserPrivacyPrefsValue("UNKNOWN__", 2, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f76type;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserPrivacyPrefsValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserPrivacyPrefsValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserPrivacyPrefsValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserPrivacyPrefsValue userPrivacyPrefsValue = (UserPrivacyPrefsValue) obj;
            return userPrivacyPrefsValue == null ? UserPrivacyPrefsValue.UNKNOWN__ : userPrivacyPrefsValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserPrivacyPrefsValue[] $values() {
        return new UserPrivacyPrefsValue[]{OPT_IN, OPT_OUT, UNKNOWN__};
    }

    static {
        UserPrivacyPrefsValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f76type = new c22("UserPrivacyPrefsValue", i.o("OPT_IN", "OPT_OUT"));
    }

    private UserPrivacyPrefsValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPrefsValue valueOf(String str) {
        return (UserPrivacyPrefsValue) Enum.valueOf(UserPrivacyPrefsValue.class, str);
    }

    public static UserPrivacyPrefsValue[] values() {
        return (UserPrivacyPrefsValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
