package defpackage;

import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public final class v57 {
    public static final v57 a = new v57();

    private v57() {
    }

    public final Single a(VideoAsset videoAsset, SectionFront sectionFront, ImageCropper imageCropper) {
        zq3.h(videoAsset, "asset");
        zq3.h(sectionFront, "section");
        zq3.h(imageCropper, "imageCropper");
        ImageAsset m = yt.m(videoAsset, sectionFront);
        if ((m != null ? m.getImage() : null) != null) {
            return imageCropper.c(videoAsset.isVertical() ? ImageCropConfig.SF_VERTICAL_VIDEO : ImageCropConfig.SF_LEDE_PHOTO_VIDEO, m.getImage());
        }
        Single just = Single.just(new jg3(null));
        zq3.g(just, "just(...)");
        return just;
    }
}
