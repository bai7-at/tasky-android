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
public final class UserPrivacyPrefsKind {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserPrivacyPrefsKind[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f73type;
    private final String rawValue;
    public static final UserPrivacyPrefsKind REGI = new UserPrivacyPrefsKind("REGI", 0, "REGI");
    public static final UserPrivacyPrefsKind AGENT = new UserPrivacyPrefsKind("AGENT", 1, "AGENT");
    public static final UserPrivacyPrefsKind UNKNOWN__ = new UserPrivacyPrefsKind("UNKNOWN__", 2, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserPrivacyPrefsKind a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserPrivacyPrefsKind.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserPrivacyPrefsKind) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserPrivacyPrefsKind userPrivacyPrefsKind = (UserPrivacyPrefsKind) obj;
            return userPrivacyPrefsKind == null ? UserPrivacyPrefsKind.UNKNOWN__ : userPrivacyPrefsKind;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserPrivacyPrefsKind[] $values() {
        return new UserPrivacyPrefsKind[]{REGI, AGENT, UNKNOWN__};
    }

    static {
        UserPrivacyPrefsKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f73type = new c22("UserPrivacyPrefsKind", i.o("REGI", "AGENT"));
    }

    private UserPrivacyPrefsKind(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserPrivacyPrefsKind valueOf(String str) {
        return (UserPrivacyPrefsKind) Enum.valueOf(UserPrivacyPrefsKind.class, str);
    }

    public static UserPrivacyPrefsKind[] values() {
        return (UserPrivacyPrefsKind[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
