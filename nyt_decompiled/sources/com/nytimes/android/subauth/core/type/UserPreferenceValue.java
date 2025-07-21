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
public final class UserPreferenceValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPreferenceValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f72type;
    private final String rawValue;
    public static final UserPreferenceValue OPT_IN = new UserPreferenceValue("OPT_IN", 0, "OPT_IN");
    public static final UserPreferenceValue OPT_OUT = new UserPreferenceValue("OPT_OUT", 1, "OPT_OUT");
    public static final UserPreferenceValue DENIED = new UserPreferenceValue("DENIED", 2, "DENIED");
    public static final UserPreferenceValue AUTHORIZED = new UserPreferenceValue("AUTHORIZED", 3, "AUTHORIZED");
    public static final UserPreferenceValue RESTRICTED = new UserPreferenceValue("RESTRICTED", 4, "RESTRICTED");
    public static final UserPreferenceValue NOT_DETERMINED = new UserPreferenceValue("NOT_DETERMINED", 5, "NOT_DETERMINED");
    public static final UserPreferenceValue NONE = new UserPreferenceValue("NONE", 6, "NONE");
    public static final UserPreferenceValue UNKNOWN__ = new UserPreferenceValue("UNKNOWN__", 7, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserPreferenceValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserPreferenceValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserPreferenceValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserPreferenceValue userPreferenceValue = (UserPreferenceValue) obj;
            return userPreferenceValue == null ? UserPreferenceValue.UNKNOWN__ : userPreferenceValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserPreferenceValue[] $values() {
        return new UserPreferenceValue[]{OPT_IN, OPT_OUT, DENIED, AUTHORIZED, RESTRICTED, NOT_DETERMINED, NONE, UNKNOWN__};
    }

    static {
        UserPreferenceValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f72type = new c22("UserPreferenceValue", i.o("OPT_IN", "OPT_OUT", "DENIED", "AUTHORIZED", "RESTRICTED", "NOT_DETERMINED", "NONE"));
    }

    private UserPreferenceValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPreferenceValue valueOf(String str) {
        return (UserPreferenceValue) Enum.valueOf(UserPreferenceValue.class, str);
    }

    public static UserPreferenceValue[] values() {
        return (UserPreferenceValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
