package type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PersonalizationDeviceType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PersonalizationDeviceType[] $VALUES;
    public static final Companion Companion;
    public static final PersonalizationDeviceType DESKTOP = new PersonalizationDeviceType("DESKTOP", 0, "DESKTOP");
    public static final PersonalizationDeviceType MOBILE = new PersonalizationDeviceType("MOBILE", 1, "MOBILE");
    public static final PersonalizationDeviceType UNKNOWN__ = new PersonalizationDeviceType("UNKNOWN__", 2, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f261type;
    private final String rawValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<PersonalizationDeviceType> getKnownEntries() {
            return i.o(PersonalizationDeviceType.DESKTOP, PersonalizationDeviceType.MOBILE);
        }

        public final c22 getType() {
            return PersonalizationDeviceType.f261type;
        }

        public final PersonalizationDeviceType[] knownValues() {
            return (PersonalizationDeviceType[]) getKnownEntries().toArray(new PersonalizationDeviceType[0]);
        }

        public final PersonalizationDeviceType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = PersonalizationDeviceType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((PersonalizationDeviceType) obj).getRawValue(), str)) {
                    break;
                }
            }
            PersonalizationDeviceType personalizationDeviceType = (PersonalizationDeviceType) obj;
            return personalizationDeviceType == null ? PersonalizationDeviceType.UNKNOWN__ : personalizationDeviceType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PersonalizationDeviceType[] $values() {
        return new PersonalizationDeviceType[]{DESKTOP, MOBILE, UNKNOWN__};
    }

    static {
        PersonalizationDeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f261type = new c22("PersonalizationDeviceType", i.o("DESKTOP", "MOBILE"));
    }

    private PersonalizationDeviceType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PersonalizationDeviceType valueOf(String str) {
        return (PersonalizationDeviceType) Enum.valueOf(PersonalizationDeviceType.class, str);
    }

    public static PersonalizationDeviceType[] values() {
        return (PersonalizationDeviceType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
