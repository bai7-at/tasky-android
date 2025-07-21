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
public final class Tone {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Tone[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f321type;
    private final String rawValue;
    public static final Tone NO_TONE_SET = new Tone("NO_TONE_SET", 0, "NO_TONE_SET");
    public static final Tone NEWS = new Tone("NEWS", 1, "NEWS");
    public static final Tone FEATURE = new Tone("FEATURE", 2, "FEATURE");
    public static final Tone OPINION = new Tone("OPINION", 3, "OPINION");
    public static final Tone INFORMAL = new Tone("INFORMAL", 4, "INFORMAL");
    public static final Tone UNKNOWN__ = new Tone("UNKNOWN__", 5, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<Tone> getKnownEntries() {
            return i.o(Tone.NO_TONE_SET, Tone.NEWS, Tone.FEATURE, Tone.OPINION, Tone.INFORMAL);
        }

        public final c22 getType() {
            return Tone.f321type;
        }

        public final Tone[] knownValues() {
            return (Tone[]) getKnownEntries().toArray(new Tone[0]);
        }

        public final Tone safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = Tone.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((Tone) obj).getRawValue(), str)) {
                    break;
                }
            }
            Tone tone = (Tone) obj;
            return tone == null ? Tone.UNKNOWN__ : tone;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Tone[] $values() {
        return new Tone[]{NO_TONE_SET, NEWS, FEATURE, OPINION, INFORMAL, UNKNOWN__};
    }

    static {
        Tone[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f321type = new c22("Tone", i.o("NO_TONE_SET", "NEWS", "FEATURE", "OPINION", "INFORMAL"));
    }

    private Tone(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Tone valueOf(String str) {
        return (Tone) Enum.valueOf(Tone.class, str);
    }

    public static Tone[] values() {
        return (Tone[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
