package defpackage;

import com.nytimes.android.utils.ImageCropConfig;

/* loaded from: classes4.dex */
public final class xf3 {
    public static final xf3 a = new xf3();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageCropConfig.values().length];
            try {
                iArr[ImageCropConfig.FS_SLIDESHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCropConfig.SF_PHOTO_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private xf3() {
    }

    public final wf3 a(ImageCropConfig imageCropConfig, zf3 zf3Var) {
        zq3.h(imageCropConfig, "configuration");
        zq3.h(zf3Var, "croppingProvider");
        int i = a.a[imageCropConfig.ordinal()];
        return i != 1 ? i != 2 ? new zi1() : new a99(zf3Var) : new ks2(zf3Var);
    }
}
