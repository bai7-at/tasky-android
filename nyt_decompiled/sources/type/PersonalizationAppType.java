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
public final class PersonalizationAppType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PersonalizationAppType[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f260type;
    private final String rawValue;
    public static final PersonalizationAppType WEB = new PersonalizationAppType("WEB", 0, "WEB");
    public static final PersonalizationAppType NATIVE = new PersonalizationAppType("NATIVE", 1, "NATIVE");
    public static final PersonalizationAppType UNKNOWN__ = new PersonalizationAppType("UNKNOWN__", 2, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<PersonalizationAppType> getKnownEntries() {
            return i.o(PersonalizationAppType.WEB, PersonalizationAppType.NATIVE);
        }

        public final c22 getType() {
            return PersonalizationAppType.f260type;
        }

        public final PersonalizationAppType[] knownValues() {
            return (PersonalizationAppType[]) getKnownEntries().toArray(new PersonalizationAppType[0]);
        }

        public final PersonalizationAppType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = PersonalizationAppType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((PersonalizationAppType) obj).getRawValue(), str)) {
                    break;
                }
            }
            PersonalizationAppType personalizationAppType = (PersonalizationAppType) obj;
            return personalizationAppType == null ? PersonalizationAppType.UNKNOWN__ : personalizationAppType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PersonalizationAppType[] $values() {
        return new PersonalizationAppType[]{WEB, NATIVE, UNKNOWN__};
    }

    static {
        PersonalizationAppType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f260type = new c22("PersonalizationAppType", i.o("WEB", "NATIVE"));
    }

    private PersonalizationAppType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PersonalizationAppType valueOf(String str) {
        return (PersonalizationAppType) Enum.valueOf(PersonalizationAppType.class, str);
    }

    public static PersonalizationAppType[] values() {
        return (PersonalizationAppType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
