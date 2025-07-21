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
public final class EmailMarketingOptInUiDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EmailMarketingOptInUiDirectiveValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f68type;
    private final String rawValue;
    public static final EmailMarketingOptInUiDirectiveValue CHECKED = new EmailMarketingOptInUiDirectiveValue("CHECKED", 0, "CHECKED");
    public static final EmailMarketingOptInUiDirectiveValue UNCHECKED = new EmailMarketingOptInUiDirectiveValue("UNCHECKED", 1, "UNCHECKED");
    public static final EmailMarketingOptInUiDirectiveValue DO_NOT_DISPLAY = new EmailMarketingOptInUiDirectiveValue("DO_NOT_DISPLAY", 2, "DO_NOT_DISPLAY");
    public static final EmailMarketingOptInUiDirectiveValue UNKNOWN__ = new EmailMarketingOptInUiDirectiveValue("UNKNOWN__", 3, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmailMarketingOptInUiDirectiveValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = EmailMarketingOptInUiDirectiveValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((EmailMarketingOptInUiDirectiveValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            EmailMarketingOptInUiDirectiveValue emailMarketingOptInUiDirectiveValue = (EmailMarketingOptInUiDirectiveValue) obj;
            return emailMarketingOptInUiDirectiveValue == null ? EmailMarketingOptInUiDirectiveValue.UNKNOWN__ : emailMarketingOptInUiDirectiveValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EmailMarketingOptInUiDirectiveValue[] $values() {
        return new EmailMarketingOptInUiDirectiveValue[]{CHECKED, UNCHECKED, DO_NOT_DISPLAY, UNKNOWN__};
    }

    static {
        EmailMarketingOptInUiDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f68type = new c22("EmailMarketingOptInUiDirectiveValue", i.o("CHECKED", "UNCHECKED", "DO_NOT_DISPLAY"));
    }

    private EmailMarketingOptInUiDirectiveValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EmailMarketingOptInUiDirectiveValue valueOf(String str) {
        return (EmailMarketingOptInUiDirectiveValue) Enum.valueOf(EmailMarketingOptInUiDirectiveValue.class, str);
    }

    public static EmailMarketingOptInUiDirectiveValue[] values() {
        return (EmailMarketingOptInUiDirectiveValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
