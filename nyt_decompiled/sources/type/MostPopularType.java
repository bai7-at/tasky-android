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
public final class MostPopularType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MostPopularType[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f234type;
    private final String rawValue;
    public static final MostPopularType VIEWED = new MostPopularType("VIEWED", 0, "VIEWED");
    public static final MostPopularType ESPANOL = new MostPopularType("ESPANOL", 1, "ESPANOL");
    public static final MostPopularType VIDEOS = new MostPopularType("VIDEOS", 2, "VIDEOS");
    public static final MostPopularType FACEBOOK = new MostPopularType("FACEBOOK", 3, "FACEBOOK");
    public static final MostPopularType EMAILED = new MostPopularType("EMAILED", 4, "EMAILED");
    public static final MostPopularType RECIPES = new MostPopularType("RECIPES", 5, "RECIPES");
    public static final MostPopularType TRENDING = new MostPopularType("TRENDING", 6, "TRENDING");
    public static final MostPopularType UNKNOWN__ = new MostPopularType("UNKNOWN__", 7, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<MostPopularType> getKnownEntries() {
            return i.o(MostPopularType.VIEWED, MostPopularType.ESPANOL, MostPopularType.VIDEOS, MostPopularType.FACEBOOK, MostPopularType.EMAILED, MostPopularType.RECIPES, MostPopularType.TRENDING);
        }

        public final c22 getType() {
            return MostPopularType.f234type;
        }

        public final MostPopularType[] knownValues() {
            return (MostPopularType[]) getKnownEntries().toArray(new MostPopularType[0]);
        }

        public final MostPopularType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = MostPopularType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((MostPopularType) obj).getRawValue(), str)) {
                    break;
                }
            }
            MostPopularType mostPopularType = (MostPopularType) obj;
            return mostPopularType == null ? MostPopularType.UNKNOWN__ : mostPopularType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MostPopularType[] $values() {
        return new MostPopularType[]{VIEWED, ESPANOL, VIDEOS, FACEBOOK, EMAILED, RECIPES, TRENDING, UNKNOWN__};
    }

    static {
        MostPopularType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f234type = new c22("MostPopularType", i.o("VIEWED", "ESPANOL", "VIDEOS", "FACEBOOK", "EMAILED", "RECIPES", "TRENDING"));
    }

    private MostPopularType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MostPopularType valueOf(String str) {
        return (MostPopularType) Enum.valueOf(MostPopularType.class, str);
    }

    public static MostPopularType[] values() {
        return (MostPopularType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
