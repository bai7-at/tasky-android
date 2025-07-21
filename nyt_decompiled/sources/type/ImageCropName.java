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
public final class ImageCropName {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ImageCropName[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f211type;
    private final String rawValue;
    public static final ImageCropName NOT_SET = new ImageCropName("NOT_SET", 0, "NOT_SET");
    public static final ImageCropName MASTER = new ImageCropName("MASTER", 1, "MASTER");
    public static final ImageCropName SMALL_SQUARE = new ImageCropName("SMALL_SQUARE", 2, "SMALL_SQUARE");
    public static final ImageCropName MEDIUM_SQUARE = new ImageCropName("MEDIUM_SQUARE", 3, "MEDIUM_SQUARE");
    public static final ImageCropName HORIZONTAL = new ImageCropName("HORIZONTAL", 4, "HORIZONTAL");
    public static final ImageCropName WIDESCREEN = new ImageCropName("WIDESCREEN", 5, "WIDESCREEN");
    public static final ImageCropName FLEXIBLE = new ImageCropName("FLEXIBLE", 6, "FLEXIBLE");
    public static final ImageCropName FACEBOOK = new ImageCropName("FACEBOOK", 7, "FACEBOOK");
    public static final ImageCropName WATCH = new ImageCropName("WATCH", 8, "WATCH");
    public static final ImageCropName THREE_BY_TWO = new ImageCropName("THREE_BY_TWO", 9, "THREE_BY_TWO");
    public static final ImageCropName TWO_BY_THREE = new ImageCropName("TWO_BY_THREE", 10, "TWO_BY_THREE");
    public static final ImageCropName SIXTEEN_BY_NINE = new ImageCropName("SIXTEEN_BY_NINE", 11, "SIXTEEN_BY_NINE");
    public static final ImageCropName FIFTEEN_BY_SEVEN = new ImageCropName("FIFTEEN_BY_SEVEN", 12, "FIFTEEN_BY_SEVEN");
    public static final ImageCropName FULL_BLEED_SAFE_AREA = new ImageCropName("FULL_BLEED_SAFE_AREA", 13, "FULL_BLEED_SAFE_AREA");
    public static final ImageCropName MOBILE_MASTER = new ImageCropName("MOBILE_MASTER", 14, "MOBILE_MASTER");
    public static final ImageCropName GOOGLE_4_BY_3 = new ImageCropName("GOOGLE_4_BY_3", 15, "GOOGLE_4_BY_3");
    public static final ImageCropName UNKNOWN__ = new ImageCropName("UNKNOWN__", 16, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<ImageCropName> getKnownEntries() {
            return i.o(ImageCropName.NOT_SET, ImageCropName.MASTER, ImageCropName.SMALL_SQUARE, ImageCropName.MEDIUM_SQUARE, ImageCropName.HORIZONTAL, ImageCropName.WIDESCREEN, ImageCropName.FLEXIBLE, ImageCropName.FACEBOOK, ImageCropName.WATCH, ImageCropName.THREE_BY_TWO, ImageCropName.TWO_BY_THREE, ImageCropName.SIXTEEN_BY_NINE, ImageCropName.FIFTEEN_BY_SEVEN, ImageCropName.FULL_BLEED_SAFE_AREA, ImageCropName.MOBILE_MASTER, ImageCropName.GOOGLE_4_BY_3);
        }

        public final c22 getType() {
            return ImageCropName.f211type;
        }

        public final ImageCropName[] knownValues() {
            return (ImageCropName[]) getKnownEntries().toArray(new ImageCropName[0]);
        }

        public final ImageCropName safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = ImageCropName.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((ImageCropName) obj).getRawValue(), str)) {
                    break;
                }
            }
            ImageCropName imageCropName = (ImageCropName) obj;
            return imageCropName == null ? ImageCropName.UNKNOWN__ : imageCropName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ImageCropName[] $values() {
        return new ImageCropName[]{NOT_SET, MASTER, SMALL_SQUARE, MEDIUM_SQUARE, HORIZONTAL, WIDESCREEN, FLEXIBLE, FACEBOOK, WATCH, THREE_BY_TWO, TWO_BY_THREE, SIXTEEN_BY_NINE, FIFTEEN_BY_SEVEN, FULL_BLEED_SAFE_AREA, MOBILE_MASTER, GOOGLE_4_BY_3, UNKNOWN__};
    }

    static {
        ImageCropName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f211type = new c22("ImageCropName", i.o("NOT_SET", "MASTER", "SMALL_SQUARE", "MEDIUM_SQUARE", "HORIZONTAL", "WIDESCREEN", "FLEXIBLE", "FACEBOOK", "WATCH", "THREE_BY_TWO", "TWO_BY_THREE", "SIXTEEN_BY_NINE", "FIFTEEN_BY_SEVEN", "FULL_BLEED_SAFE_AREA", "MOBILE_MASTER", "GOOGLE_4_BY_3"));
    }

    private ImageCropName(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ImageCropName valueOf(String str) {
        return (ImageCropName) Enum.valueOf(ImageCropName.class, str);
    }

    public static ImageCropName[] values() {
        return (ImageCropName[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
