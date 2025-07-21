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
public final class PrivacyTargetingValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PrivacyTargetingValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f69type;
    private final String rawValue;
    public static final PrivacyTargetingValue ALLOWED = new PrivacyTargetingValue("ALLOWED", 0, "ALLOWED");
    public static final PrivacyTargetingValue DISALLOWED = new PrivacyTargetingValue("DISALLOWED", 1, "DISALLOWED");
    public static final PrivacyTargetingValue UNKNOWN__ = new PrivacyTargetingValue("UNKNOWN__", 2, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PrivacyTargetingValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = PrivacyTargetingValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((PrivacyTargetingValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            PrivacyTargetingValue privacyTargetingValue = (PrivacyTargetingValue) obj;
            return privacyTargetingValue == null ? PrivacyTargetingValue.UNKNOWN__ : privacyTargetingValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ PrivacyTargetingValue[] $values() {
        return new PrivacyTargetingValue[]{ALLOWED, DISALLOWED, UNKNOWN__};
    }

    static {
        PrivacyTargetingValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f69type = new c22("PrivacyTargetingValue", i.o("ALLOWED", "DISALLOWED"));
    }

    private PrivacyTargetingValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PrivacyTargetingValue valueOf(String str) {
        return (PrivacyTargetingValue) Enum.valueOf(PrivacyTargetingValue.class, str);
    }

    public static PrivacyTargetingValue[] values() {
        return (PrivacyTargetingValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
