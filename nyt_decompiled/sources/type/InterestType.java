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
public final class InterestType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ InterestType[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f220type;
    private final String rawValue;
    public static final InterestType COLUMN = new InterestType("COLUMN", 0, "COLUMN");
    public static final InterestType SHUFFLE = new InterestType("SHUFFLE", 1, "SHUFFLE");
    public static final InterestType NEWSLETTER = new InterestType("NEWSLETTER", 2, "NEWSLETTER");
    public static final InterestType NEWSQUIZ = new InterestType("NEWSQUIZ", 3, "NEWSQUIZ");
    public static final InterestType FLASHBACK = new InterestType("FLASHBACK", 4, "FLASHBACK");
    public static final InterestType MULTISTREAM = new InterestType("MULTISTREAM", 5, "MULTISTREAM");
    public static final InterestType FILTER = new InterestType("FILTER", 6, "FILTER");
    public static final InterestType AUDIO = new InterestType("AUDIO", 7, "AUDIO");
    public static final InterestType BOOKS = new InterestType("BOOKS", 8, "BOOKS");
    public static final InterestType UNKNOWN__ = new InterestType("UNKNOWN__", 9, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<InterestType> getKnownEntries() {
            return i.o(InterestType.COLUMN, InterestType.SHUFFLE, InterestType.NEWSLETTER, InterestType.NEWSQUIZ, InterestType.FLASHBACK, InterestType.MULTISTREAM, InterestType.FILTER, InterestType.AUDIO, InterestType.BOOKS);
        }

        public final c22 getType() {
            return InterestType.f220type;
        }

        public final InterestType[] knownValues() {
            return (InterestType[]) getKnownEntries().toArray(new InterestType[0]);
        }

        public final InterestType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = InterestType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((InterestType) obj).getRawValue(), str)) {
                    break;
                }
            }
            InterestType interestType = (InterestType) obj;
            return interestType == null ? InterestType.UNKNOWN__ : interestType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InterestType[] $values() {
        return new InterestType[]{COLUMN, SHUFFLE, NEWSLETTER, NEWSQUIZ, FLASHBACK, MULTISTREAM, FILTER, AUDIO, BOOKS, UNKNOWN__};
    }

    static {
        InterestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f220type = new c22("InterestType", i.o("COLUMN", "SHUFFLE", "NEWSLETTER", "NEWSQUIZ", "FLASHBACK", "MULTISTREAM", "FILTER", "AUDIO", "BOOKS"));
    }

    private InterestType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static InterestType valueOf(String str) {
        return (InterestType) Enum.valueOf(InterestType.class, str);
    }

    public static InterestType[] values() {
        return (InterestType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
