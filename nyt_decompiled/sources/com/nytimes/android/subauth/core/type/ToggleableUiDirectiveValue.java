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
public final class ToggleableUiDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ToggleableUiDirectiveValue[] $VALUES;
    public static final a Companion;
    public static final ToggleableUiDirectiveValue HIDE = new ToggleableUiDirectiveValue("HIDE", 0, "HIDE");
    public static final ToggleableUiDirectiveValue SHOW = new ToggleableUiDirectiveValue("SHOW", 1, "SHOW");
    public static final ToggleableUiDirectiveValue UNKNOWN__ = new ToggleableUiDirectiveValue("UNKNOWN__", 2, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f71type;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ToggleableUiDirectiveValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = ToggleableUiDirectiveValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((ToggleableUiDirectiveValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            ToggleableUiDirectiveValue toggleableUiDirectiveValue = (ToggleableUiDirectiveValue) obj;
            return toggleableUiDirectiveValue == null ? ToggleableUiDirectiveValue.UNKNOWN__ : toggleableUiDirectiveValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ ToggleableUiDirectiveValue[] $values() {
        return new ToggleableUiDirectiveValue[]{HIDE, SHOW, UNKNOWN__};
    }

    static {
        ToggleableUiDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f71type = new c22("ToggleableUiDirectiveValue", i.o("HIDE", "SHOW"));
    }

    private ToggleableUiDirectiveValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ToggleableUiDirectiveValue valueOf(String str) {
        return (ToggleableUiDirectiveValue) Enum.valueOf(ToggleableUiDirectiveValue.class, str);
    }

    public static ToggleableUiDirectiveValue[] values() {
        return (ToggleableUiDirectiveValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
