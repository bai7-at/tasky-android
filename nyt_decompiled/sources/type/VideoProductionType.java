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
public final class VideoProductionType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ VideoProductionType[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f332type;
    private final String rawValue;
    public static final VideoProductionType PRODUCTION_TYPE_NOT_SET = new VideoProductionType("PRODUCTION_TYPE_NOT_SET", 0, "PRODUCTION_TYPE_NOT_SET");
    public static final VideoProductionType ENTERPRISE_LOW = new VideoProductionType("ENTERPRISE_LOW", 1, "ENTERPRISE_LOW");
    public static final VideoProductionType ENTERPRISE_HIGH = new VideoProductionType("ENTERPRISE_HIGH", 2, "ENTERPRISE_HIGH");
    public static final VideoProductionType BIG_PROJECT = new VideoProductionType("BIG_PROJECT", 3, "BIG_PROJECT");
    public static final VideoProductionType SERIES_LOW = new VideoProductionType("SERIES_LOW", 4, "SERIES_LOW");
    public static final VideoProductionType SERIES_HIGH = new VideoProductionType("SERIES_HIGH", 5, "SERIES_HIGH");
    public static final VideoProductionType NEWS_PACKAGE = new VideoProductionType("NEWS_PACKAGE", 6, "NEWS_PACKAGE");
    public static final VideoProductionType NEWS_CLIP = new VideoProductionType("NEWS_CLIP", 7, "NEWS_CLIP");
    public static final VideoProductionType DESK_EXTERNAL = new VideoProductionType("DESK_EXTERNAL", 8, "DESK_EXTERNAL");
    public static final VideoProductionType OPINION = new VideoProductionType("OPINION", 9, "OPINION");
    public static final VideoProductionType OTHER_NYT = new VideoProductionType("OTHER_NYT", 10, "OTHER_NYT");
    public static final VideoProductionType CURATED = new VideoProductionType("CURATED", 11, "CURATED");
    public static final VideoProductionType EXTERNAL = new VideoProductionType("EXTERNAL", 12, "EXTERNAL");
    public static final VideoProductionType BRANDED = new VideoProductionType("BRANDED", 13, "BRANDED");
    public static final VideoProductionType FACEBOOK_LIVE = new VideoProductionType("FACEBOOK_LIVE", 14, "FACEBOOK_LIVE");
    public static final VideoProductionType NEWS_PRODUCTION = new VideoProductionType("NEWS_PRODUCTION", 15, "NEWS_PRODUCTION");
    public static final VideoProductionType DAILY_360 = new VideoProductionType("DAILY_360", 16, "DAILY_360");
    public static final VideoProductionType EMBEDDED_MULTIMEDIA = new VideoProductionType("EMBEDDED_MULTIMEDIA", 17, "EMBEDDED_MULTIMEDIA");
    public static final VideoProductionType CLIP = new VideoProductionType("CLIP", 18, "CLIP");
    public static final VideoProductionType OBITS = new VideoProductionType("OBITS", 19, "OBITS");
    public static final VideoProductionType SHORT_FORM = new VideoProductionType("SHORT_FORM", 20, "SHORT_FORM");
    public static final VideoProductionType PREMIUM_SHOW = new VideoProductionType("PREMIUM_SHOW", 21, "PREMIUM_SHOW");
    public static final VideoProductionType ENTERPRISE = new VideoProductionType("ENTERPRISE", 22, "ENTERPRISE");
    public static final VideoProductionType INTERACTIVE = new VideoProductionType("INTERACTIVE", 23, "INTERACTIVE");
    public static final VideoProductionType OP_DOC = new VideoProductionType("OP_DOC", 24, "OP_DOC");
    public static final VideoProductionType SERIES = new VideoProductionType("SERIES", 25, "SERIES");
    public static final VideoProductionType CINEMAGRAPH = new VideoProductionType("CINEMAGRAPH", 26, "CINEMAGRAPH");
    public static final VideoProductionType PACKAGE = new VideoProductionType("PACKAGE", 27, "PACKAGE");
    public static final VideoProductionType EMBED_ONLY = new VideoProductionType("EMBED_ONLY", 28, "EMBED_ONLY");
    public static final VideoProductionType LIVE_STREAM = new VideoProductionType("LIVE_STREAM", 29, "LIVE_STREAM");
    public static final VideoProductionType ANNOTATED_CLIP = new VideoProductionType("ANNOTATED_CLIP", 30, "ANNOTATED_CLIP");
    public static final VideoProductionType OPINION_VIDEO = new VideoProductionType("OPINION_VIDEO", 31, "OPINION_VIDEO");
    public static final VideoProductionType COOKING_RDP = new VideoProductionType("COOKING_RDP", 32, "COOKING_RDP");
    public static final VideoProductionType COOKING_SERIES = new VideoProductionType("COOKING_SERIES", 33, "COOKING_SERIES");
    public static final VideoProductionType COOKING_RECIPE = new VideoProductionType("COOKING_RECIPE", 34, "COOKING_RECIPE");
    public static final VideoProductionType COOKING_DOC = new VideoProductionType("COOKING_DOC", 35, "COOKING_DOC");
    public static final VideoProductionType UNKNOWN__ = new VideoProductionType("UNKNOWN__", 36, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<VideoProductionType> getKnownEntries() {
            return i.o(VideoProductionType.PRODUCTION_TYPE_NOT_SET, VideoProductionType.ENTERPRISE_LOW, VideoProductionType.ENTERPRISE_HIGH, VideoProductionType.BIG_PROJECT, VideoProductionType.SERIES_LOW, VideoProductionType.SERIES_HIGH, VideoProductionType.NEWS_PACKAGE, VideoProductionType.NEWS_CLIP, VideoProductionType.DESK_EXTERNAL, VideoProductionType.OPINION, VideoProductionType.OTHER_NYT, VideoProductionType.CURATED, VideoProductionType.EXTERNAL, VideoProductionType.BRANDED, VideoProductionType.FACEBOOK_LIVE, VideoProductionType.NEWS_PRODUCTION, VideoProductionType.DAILY_360, VideoProductionType.EMBEDDED_MULTIMEDIA, VideoProductionType.CLIP, VideoProductionType.OBITS, VideoProductionType.SHORT_FORM, VideoProductionType.PREMIUM_SHOW, VideoProductionType.ENTERPRISE, VideoProductionType.INTERACTIVE, VideoProductionType.OP_DOC, VideoProductionType.SERIES, VideoProductionType.CINEMAGRAPH, VideoProductionType.PACKAGE, VideoProductionType.EMBED_ONLY, VideoProductionType.LIVE_STREAM, VideoProductionType.ANNOTATED_CLIP, VideoProductionType.OPINION_VIDEO, VideoProductionType.COOKING_RDP, VideoProductionType.COOKING_SERIES, VideoProductionType.COOKING_RECIPE, VideoProductionType.COOKING_DOC);
        }

        public final c22 getType() {
            return VideoProductionType.f332type;
        }

        public final VideoProductionType[] knownValues() {
            return (VideoProductionType[]) getKnownEntries().toArray(new VideoProductionType[0]);
        }

        public final VideoProductionType safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = VideoProductionType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((VideoProductionType) obj).getRawValue(), str)) {
                    break;
                }
            }
            VideoProductionType videoProductionType = (VideoProductionType) obj;
            return videoProductionType == null ? VideoProductionType.UNKNOWN__ : videoProductionType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ VideoProductionType[] $values() {
        return new VideoProductionType[]{PRODUCTION_TYPE_NOT_SET, ENTERPRISE_LOW, ENTERPRISE_HIGH, BIG_PROJECT, SERIES_LOW, SERIES_HIGH, NEWS_PACKAGE, NEWS_CLIP, DESK_EXTERNAL, OPINION, OTHER_NYT, CURATED, EXTERNAL, BRANDED, FACEBOOK_LIVE, NEWS_PRODUCTION, DAILY_360, EMBEDDED_MULTIMEDIA, CLIP, OBITS, SHORT_FORM, PREMIUM_SHOW, ENTERPRISE, INTERACTIVE, OP_DOC, SERIES, CINEMAGRAPH, PACKAGE, EMBED_ONLY, LIVE_STREAM, ANNOTATED_CLIP, OPINION_VIDEO, COOKING_RDP, COOKING_SERIES, COOKING_RECIPE, COOKING_DOC, UNKNOWN__};
    }

    static {
        VideoProductionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f332type = new c22("VideoProductionType", i.o("PRODUCTION_TYPE_NOT_SET", "ENTERPRISE_LOW", "ENTERPRISE_HIGH", "BIG_PROJECT", "SERIES_LOW", "SERIES_HIGH", "NEWS_PACKAGE", "NEWS_CLIP", "DESK_EXTERNAL", "OPINION", "OTHER_NYT", "CURATED", "EXTERNAL", "BRANDED", "FACEBOOK_LIVE", "NEWS_PRODUCTION", "DAILY_360", "EMBEDDED_MULTIMEDIA", "CLIP", "OBITS", "SHORT_FORM", "PREMIUM_SHOW", "ENTERPRISE", "INTERACTIVE", "OP_DOC", "SERIES", "CINEMAGRAPH", "PACKAGE", "EMBED_ONLY", "LIVE_STREAM", "ANNOTATED_CLIP", "OPINION_VIDEO", "COOKING_RDP", "COOKING_SERIES", "COOKING_RECIPE", "COOKING_DOC"));
    }

    private VideoProductionType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static VideoProductionType valueOf(String str) {
        return (VideoProductionType) Enum.valueOf(VideoProductionType.class, str);
    }

    public static VideoProductionType[] values() {
        return (VideoProductionType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
