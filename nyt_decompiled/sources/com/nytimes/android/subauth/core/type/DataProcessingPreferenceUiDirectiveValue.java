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
public final class DataProcessingPreferenceUiDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DataProcessingPreferenceUiDirectiveValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f67type;
    private final String rawValue;
    public static final DataProcessingPreferenceUiDirectiveValue HIDE = new DataProcessingPreferenceUiDirectiveValue("HIDE", 0, "HIDE");
    public static final DataProcessingPreferenceUiDirectiveValue ALLOW_OPT_OUT = new DataProcessingPreferenceUiDirectiveValue("ALLOW_OPT_OUT", 1, "ALLOW_OPT_OUT");
    public static final DataProcessingPreferenceUiDirectiveValue ALLOW_OPT_IN = new DataProcessingPreferenceUiDirectiveValue("ALLOW_OPT_IN", 2, "ALLOW_OPT_IN");
    public static final DataProcessingPreferenceUiDirectiveValue ALLOW_OPT_IN_OR_OUT = new DataProcessingPreferenceUiDirectiveValue("ALLOW_OPT_IN_OR_OUT", 3, "ALLOW_OPT_IN_OR_OUT");
    public static final DataProcessingPreferenceUiDirectiveValue UNKNOWN__ = new DataProcessingPreferenceUiDirectiveValue("UNKNOWN__", 4, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DataProcessingPreferenceUiDirectiveValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = DataProcessingPreferenceUiDirectiveValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((DataProcessingPreferenceUiDirectiveValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            DataProcessingPreferenceUiDirectiveValue dataProcessingPreferenceUiDirectiveValue = (DataProcessingPreferenceUiDirectiveValue) obj;
            return dataProcessingPreferenceUiDirectiveValue == null ? DataProcessingPreferenceUiDirectiveValue.UNKNOWN__ : dataProcessingPreferenceUiDirectiveValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ DataProcessingPreferenceUiDirectiveValue[] $values() {
        return new DataProcessingPreferenceUiDirectiveValue[]{HIDE, ALLOW_OPT_OUT, ALLOW_OPT_IN, ALLOW_OPT_IN_OR_OUT, UNKNOWN__};
    }

    static {
        DataProcessingPreferenceUiDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f67type = new c22("DataProcessingPreferenceUiDirectiveValue", i.o("HIDE", "ALLOW_OPT_OUT", "ALLOW_OPT_IN", "ALLOW_OPT_IN_OR_OUT"));
    }

    private DataProcessingPreferenceUiDirectiveValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DataProcessingPreferenceUiDirectiveValue valueOf(String str) {
        return (DataProcessingPreferenceUiDirectiveValue) Enum.valueOf(DataProcessingPreferenceUiDirectiveValue.class, str);
    }

    public static DataProcessingPreferenceUiDirectiveValue[] values() {
        return (DataProcessingPreferenceUiDirectiveValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
