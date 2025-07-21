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
public final class PodcastService {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PodcastService[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f271type;
    private final String rawValue;
    public static final PodcastService NOT_SET = new PodcastService("NOT_SET", 0, "NOT_SET");
    public static final PodcastService APPLE = new PodcastService("APPLE", 1, "APPLE");
    public static final PodcastService GOOGLE = new PodcastService("GOOGLE", 2, "GOOGLE");
    public static final PodcastService RADIO_PUBLIC = new PodcastService("RADIO_PUBLIC", 3, "RADIO_PUBLIC");
    public static final PodcastService UNKNOWN__ = new PodcastService("UNKNOWN__", 4, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<PodcastService> getKnownEntries() {
            return i.o(PodcastService.NOT_SET, PodcastService.APPLE, PodcastService.GOOGLE, PodcastService.RADIO_PUBLIC);
        }

        public final c22 getType() {
            return PodcastService.f271type;
        }

        public final PodcastService[] knownValues() {
            return (PodcastService[]) getKnownEntries().toArray(new PodcastService[0]);
        }

        public final PodcastService safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = PodcastService.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((PodcastService) obj).getRawValue(), str)) {
                    break;
                }
            }
            PodcastService podcastService = (PodcastService) obj;
            return podcastService == null ? PodcastService.UNKNOWN__ : podcastService;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PodcastService[] $values() {
        return new PodcastService[]{NOT_SET, APPLE, GOOGLE, RADIO_PUBLIC, UNKNOWN__};
    }

    static {
        PodcastService[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f271type = new c22("PodcastService", i.o("NOT_SET", "APPLE", "GOOGLE", "RADIO_PUBLIC"));
    }

    private PodcastService(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PodcastService valueOf(String str) {
        return (PodcastService) Enum.valueOf(PodcastService.class, str);
    }

    public static PodcastService[] values() {
        return (PodcastService[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
