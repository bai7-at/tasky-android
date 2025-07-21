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
public final class AdConfigurationDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AdConfigurationDirectiveValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f66type;
    private final String rawValue;
    public static final AdConfigurationDirectiveValue FULL = new AdConfigurationDirectiveValue("FULL", 0, "FULL");
    public static final AdConfigurationDirectiveValue NPA = new AdConfigurationDirectiveValue("NPA", 1, "NPA");
    public static final AdConfigurationDirectiveValue ADLUCE = new AdConfigurationDirectiveValue("ADLUCE", 2, "ADLUCE");
    public static final AdConfigurationDirectiveValue ADLUCE_SOCRATES = new AdConfigurationDirectiveValue("ADLUCE_SOCRATES", 3, "ADLUCE_SOCRATES");
    public static final AdConfigurationDirectiveValue RDP = new AdConfigurationDirectiveValue("RDP", 4, "RDP");
    public static final AdConfigurationDirectiveValue COLLAPSED = new AdConfigurationDirectiveValue("COLLAPSED", 5, "COLLAPSED");
    public static final AdConfigurationDirectiveValue LTD = new AdConfigurationDirectiveValue("LTD", 6, "LTD");
    public static final AdConfigurationDirectiveValue NO_ADS = new AdConfigurationDirectiveValue("NO_ADS", 7, "NO_ADS");
    public static final AdConfigurationDirectiveValue UNKNOWN__ = new AdConfigurationDirectiveValue("UNKNOWN__", 8, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdConfigurationDirectiveValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = AdConfigurationDirectiveValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((AdConfigurationDirectiveValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            AdConfigurationDirectiveValue adConfigurationDirectiveValue = (AdConfigurationDirectiveValue) obj;
            return adConfigurationDirectiveValue == null ? AdConfigurationDirectiveValue.UNKNOWN__ : adConfigurationDirectiveValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AdConfigurationDirectiveValue[] $values() {
        return new AdConfigurationDirectiveValue[]{FULL, NPA, ADLUCE, ADLUCE_SOCRATES, RDP, COLLAPSED, LTD, NO_ADS, UNKNOWN__};
    }

    static {
        AdConfigurationDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f66type = new c22("AdConfigurationDirectiveValue", i.o("FULL", "NPA", "ADLUCE", "ADLUCE_SOCRATES", "RDP", "COLLAPSED", "LTD", "NO_ADS"));
    }

    private AdConfigurationDirectiveValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AdConfigurationDirectiveValue valueOf(String str) {
        return (AdConfigurationDirectiveValue) Enum.valueOf(AdConfigurationDirectiveValue.class, str);
    }

    public static AdConfigurationDirectiveValue[] values() {
        return (AdConfigurationDirectiveValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
