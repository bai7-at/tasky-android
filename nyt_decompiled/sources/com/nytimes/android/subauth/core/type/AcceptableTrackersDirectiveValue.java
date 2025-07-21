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
public final class AcceptableTrackersDirectiveValue {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AcceptableTrackersDirectiveValue[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f65type;
    private final String rawValue;
    public static final AcceptableTrackersDirectiveValue CONTROLLERS = new AcceptableTrackersDirectiveValue("CONTROLLERS", 0, "CONTROLLERS");
    public static final AcceptableTrackersDirectiveValue PROCESSORS = new AcceptableTrackersDirectiveValue("PROCESSORS", 1, "PROCESSORS");
    public static final AcceptableTrackersDirectiveValue ESSENTIALS = new AcceptableTrackersDirectiveValue("ESSENTIALS", 2, "ESSENTIALS");
    public static final AcceptableTrackersDirectiveValue CHILDSAFE = new AcceptableTrackersDirectiveValue("CHILDSAFE", 3, "CHILDSAFE");
    public static final AcceptableTrackersDirectiveValue UNKNOWN__ = new AcceptableTrackersDirectiveValue("UNKNOWN__", 4, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AcceptableTrackersDirectiveValue a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = AcceptableTrackersDirectiveValue.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((AcceptableTrackersDirectiveValue) obj).getRawValue(), str)) {
                    break;
                }
            }
            AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue = (AcceptableTrackersDirectiveValue) obj;
            return acceptableTrackersDirectiveValue == null ? AcceptableTrackersDirectiveValue.UNKNOWN__ : acceptableTrackersDirectiveValue;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AcceptableTrackersDirectiveValue[] $values() {
        return new AcceptableTrackersDirectiveValue[]{CONTROLLERS, PROCESSORS, ESSENTIALS, CHILDSAFE, UNKNOWN__};
    }

    static {
        AcceptableTrackersDirectiveValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f65type = new c22("AcceptableTrackersDirectiveValue", i.o("CONTROLLERS", "PROCESSORS", "ESSENTIALS", "CHILDSAFE"));
    }

    private AcceptableTrackersDirectiveValue(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AcceptableTrackersDirectiveValue valueOf(String str) {
        return (AcceptableTrackersDirectiveValue) Enum.valueOf(AcceptableTrackersDirectiveValue.class, str);
    }

    public static AcceptableTrackersDirectiveValue[] values() {
        return (AcceptableTrackersDirectiveValue[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
