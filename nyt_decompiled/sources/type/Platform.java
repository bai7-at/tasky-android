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
public final class Platform {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f268type;
    private final String rawValue;
    public static final Platform NOT_SET = new Platform("NOT_SET", 0, "NOT_SET");
    public static final Platform ANDROID = new Platform("ANDROID", 1, "ANDROID");
    public static final Platform IOS = new Platform("IOS", 2, "IOS");
    public static final Platform UNKNOWN__ = new Platform("UNKNOWN__", 3, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<Platform> getKnownEntries() {
            return i.o(Platform.NOT_SET, Platform.ANDROID, Platform.IOS);
        }

        public final c22 getType() {
            return Platform.f268type;
        }

        public final Platform[] knownValues() {
            return (Platform[]) getKnownEntries().toArray(new Platform[0]);
        }

        public final Platform safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = Platform.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((Platform) obj).getRawValue(), str)) {
                    break;
                }
            }
            Platform platform = (Platform) obj;
            return platform == null ? Platform.UNKNOWN__ : platform;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{NOT_SET, ANDROID, IOS, UNKNOWN__};
    }

    static {
        Platform[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f268type = new c22("Platform", i.o("NOT_SET", "ANDROID", "IOS"));
    }

    private Platform(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
