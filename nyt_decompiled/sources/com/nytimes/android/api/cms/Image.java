package com.nytimes.android.api.cms;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Image {
    private final Caption caption;
    private final String credit;

    @SerializedName("image_crops")
    private final ImageCrop crops;
    private final String uri;

    @et3(generateAdapter = true)
    public static final class ImageCrop {
        private final ImageDimension articleInline;
        private final ImageDimension articleLarge;
        private final ImageDimension jumbo;
        private final ImageDimension master1050;
        private final ImageDimension master675;
        private final ImageDimension master768;
        private final ImageDimension mediumThreeByTwo210;
        private final ImageDimension mediumThreeByTwo225;
        private final ImageDimension mediumThreeByTwo440;
        private final ImageDimension popup;
        private final ImageDimension smallSquare168;
        private final ImageDimension square320;
        private final ImageDimension square640;
        private final ImageDimension superJumbo;
        private final ImageDimension thumbLarge;
        private final ImageDimension videoSixteenByNine1050;

        public ImageCrop() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        }

        public final ImageDimension component1() {
            return this.articleInline;
        }

        public final ImageDimension component10() {
            return this.mediumThreeByTwo440;
        }

        public final ImageDimension component11() {
            return this.smallSquare168;
        }

        public final ImageDimension component12() {
            return this.square320;
        }

        public final ImageDimension component13() {
            return this.square640;
        }

        public final ImageDimension component14() {
            return this.master675;
        }

        public final ImageDimension component15() {
            return this.master768;
        }

        public final ImageDimension component16() {
            return this.master1050;
        }

        public final ImageDimension component2() {
            return this.articleLarge;
        }

        public final ImageDimension component3() {
            return this.popup;
        }

        public final ImageDimension component4() {
            return this.jumbo;
        }

        public final ImageDimension component5() {
            return this.superJumbo;
        }

        public final ImageDimension component6() {
            return this.thumbLarge;
        }

        public final ImageDimension component7() {
            return this.mediumThreeByTwo225;
        }

        public final ImageDimension component8() {
            return this.mediumThreeByTwo210;
        }

        public final ImageDimension component9() {
            return this.videoSixteenByNine1050;
        }

        public final ImageCrop copy(ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6, ImageDimension imageDimension7, ImageDimension imageDimension8, ImageDimension imageDimension9, ImageDimension imageDimension10, ImageDimension imageDimension11, ImageDimension imageDimension12, ImageDimension imageDimension13, ImageDimension imageDimension14, ImageDimension imageDimension15, ImageDimension imageDimension16) {
            return new ImageCrop(imageDimension, imageDimension2, imageDimension3, imageDimension4, imageDimension5, imageDimension6, imageDimension7, imageDimension8, imageDimension9, imageDimension10, imageDimension11, imageDimension12, imageDimension13, imageDimension14, imageDimension15, imageDimension16);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageCrop)) {
                return false;
            }
            ImageCrop imageCrop = (ImageCrop) obj;
            return zq3.c(this.articleInline, imageCrop.articleInline) && zq3.c(this.articleLarge, imageCrop.articleLarge) && zq3.c(this.popup, imageCrop.popup) && zq3.c(this.jumbo, imageCrop.jumbo) && zq3.c(this.superJumbo, imageCrop.superJumbo) && zq3.c(this.thumbLarge, imageCrop.thumbLarge) && zq3.c(this.mediumThreeByTwo225, imageCrop.mediumThreeByTwo225) && zq3.c(this.mediumThreeByTwo210, imageCrop.mediumThreeByTwo210) && zq3.c(this.videoSixteenByNine1050, imageCrop.videoSixteenByNine1050) && zq3.c(this.mediumThreeByTwo440, imageCrop.mediumThreeByTwo440) && zq3.c(this.smallSquare168, imageCrop.smallSquare168) && zq3.c(this.square320, imageCrop.square320) && zq3.c(this.square640, imageCrop.square640) && zq3.c(this.master675, imageCrop.master675) && zq3.c(this.master768, imageCrop.master768) && zq3.c(this.master1050, imageCrop.master1050);
        }

        public final ImageDimension getArticleInline() {
            return this.articleInline;
        }

        public final ImageDimension getArticleLarge() {
            return this.articleLarge;
        }

        public final ImageDimension getJumbo() {
            return this.jumbo;
        }

        public final ImageDimension getMaster1050() {
            return this.master1050;
        }

        public final ImageDimension getMaster675() {
            return this.master675;
        }

        public final ImageDimension getMaster768() {
            return this.master768;
        }

        public final ImageDimension getMediumThreeByTwo210() {
            return this.mediumThreeByTwo210;
        }

        public final ImageDimension getMediumThreeByTwo225() {
            return this.mediumThreeByTwo225;
        }

        public final ImageDimension getMediumThreeByTwo440() {
            return this.mediumThreeByTwo440;
        }

        public final ImageDimension getPopup() {
            return this.popup;
        }

        public final ImageDimension getSmallSquare168() {
            return this.smallSquare168;
        }

        public final ImageDimension getSquare320() {
            return this.square320;
        }

        public final ImageDimension getSquare640() {
            return this.square640;
        }

        public final ImageDimension getSuperJumbo() {
            return this.superJumbo;
        }

        public final ImageDimension getThumbLarge() {
            return this.thumbLarge;
        }

        public final ImageDimension getVideoSixteenByNine1050() {
            return this.videoSixteenByNine1050;
        }

        public int hashCode() {
            ImageDimension imageDimension = this.articleInline;
            int hashCode = (imageDimension == null ? 0 : imageDimension.hashCode()) * 31;
            ImageDimension imageDimension2 = this.articleLarge;
            int hashCode2 = (hashCode + (imageDimension2 == null ? 0 : imageDimension2.hashCode())) * 31;
            ImageDimension imageDimension3 = this.popup;
            int hashCode3 = (hashCode2 + (imageDimension3 == null ? 0 : imageDimension3.hashCode())) * 31;
            ImageDimension imageDimension4 = this.jumbo;
            int hashCode4 = (hashCode3 + (imageDimension4 == null ? 0 : imageDimension4.hashCode())) * 31;
            ImageDimension imageDimension5 = this.superJumbo;
            int hashCode5 = (hashCode4 + (imageDimension5 == null ? 0 : imageDimension5.hashCode())) * 31;
            ImageDimension imageDimension6 = this.thumbLarge;
            int hashCode6 = (hashCode5 + (imageDimension6 == null ? 0 : imageDimension6.hashCode())) * 31;
            ImageDimension imageDimension7 = this.mediumThreeByTwo225;
            int hashCode7 = (hashCode6 + (imageDimension7 == null ? 0 : imageDimension7.hashCode())) * 31;
            ImageDimension imageDimension8 = this.mediumThreeByTwo210;
            int hashCode8 = (hashCode7 + (imageDimension8 == null ? 0 : imageDimension8.hashCode())) * 31;
            ImageDimension imageDimension9 = this.videoSixteenByNine1050;
            int hashCode9 = (hashCode8 + (imageDimension9 == null ? 0 : imageDimension9.hashCode())) * 31;
            ImageDimension imageDimension10 = this.mediumThreeByTwo440;
            int hashCode10 = (hashCode9 + (imageDimension10 == null ? 0 : imageDimension10.hashCode())) * 31;
            ImageDimension imageDimension11 = this.smallSquare168;
            int hashCode11 = (hashCode10 + (imageDimension11 == null ? 0 : imageDimension11.hashCode())) * 31;
            ImageDimension imageDimension12 = this.square320;
            int hashCode12 = (hashCode11 + (imageDimension12 == null ? 0 : imageDimension12.hashCode())) * 31;
            ImageDimension imageDimension13 = this.square640;
            int hashCode13 = (hashCode12 + (imageDimension13 == null ? 0 : imageDimension13.hashCode())) * 31;
            ImageDimension imageDimension14 = this.master675;
            int hashCode14 = (hashCode13 + (imageDimension14 == null ? 0 : imageDimension14.hashCode())) * 31;
            ImageDimension imageDimension15 = this.master768;
            int hashCode15 = (hashCode14 + (imageDimension15 == null ? 0 : imageDimension15.hashCode())) * 31;
            ImageDimension imageDimension16 = this.master1050;
            return hashCode15 + (imageDimension16 != null ? imageDimension16.hashCode() : 0);
        }

        public String toString() {
            return "ImageCrop(articleInline=" + this.articleInline + ", articleLarge=" + this.articleLarge + ", popup=" + this.popup + ", jumbo=" + this.jumbo + ", superJumbo=" + this.superJumbo + ", thumbLarge=" + this.thumbLarge + ", mediumThreeByTwo225=" + this.mediumThreeByTwo225 + ", mediumThreeByTwo210=" + this.mediumThreeByTwo210 + ", videoSixteenByNine1050=" + this.videoSixteenByNine1050 + ", mediumThreeByTwo440=" + this.mediumThreeByTwo440 + ", smallSquare168=" + this.smallSquare168 + ", square320=" + this.square320 + ", square640=" + this.square640 + ", master675=" + this.master675 + ", master768=" + this.master768 + ", master1050=" + this.master1050 + ")";
        }

        public ImageCrop(ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6, ImageDimension imageDimension7, ImageDimension imageDimension8, ImageDimension imageDimension9, ImageDimension imageDimension10, ImageDimension imageDimension11, ImageDimension imageDimension12, ImageDimension imageDimension13, ImageDimension imageDimension14, ImageDimension imageDimension15, ImageDimension imageDimension16) {
            this.articleInline = imageDimension;
            this.articleLarge = imageDimension2;
            this.popup = imageDimension3;
            this.jumbo = imageDimension4;
            this.superJumbo = imageDimension5;
            this.thumbLarge = imageDimension6;
            this.mediumThreeByTwo225 = imageDimension7;
            this.mediumThreeByTwo210 = imageDimension8;
            this.videoSixteenByNine1050 = imageDimension9;
            this.mediumThreeByTwo440 = imageDimension10;
            this.smallSquare168 = imageDimension11;
            this.square320 = imageDimension12;
            this.square640 = imageDimension13;
            this.master675 = imageDimension14;
            this.master768 = imageDimension15;
            this.master1050 = imageDimension16;
        }

        public /* synthetic */ ImageCrop(ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6, ImageDimension imageDimension7, ImageDimension imageDimension8, ImageDimension imageDimension9, ImageDimension imageDimension10, ImageDimension imageDimension11, ImageDimension imageDimension12, ImageDimension imageDimension13, ImageDimension imageDimension14, ImageDimension imageDimension15, ImageDimension imageDimension16, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : imageDimension, (i & 2) != 0 ? null : imageDimension2, (i & 4) != 0 ? null : imageDimension3, (i & 8) != 0 ? null : imageDimension4, (i & 16) != 0 ? null : imageDimension5, (i & 32) != 0 ? null : imageDimension6, (i & 64) != 0 ? null : imageDimension7, (i & 128) != 0 ? null : imageDimension8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : imageDimension9, (i & 512) != 0 ? null : imageDimension10, (i & 1024) != 0 ? null : imageDimension11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : imageDimension12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : imageDimension13, (i & 8192) != 0 ? null : imageDimension14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : imageDimension15, (i & 32768) != 0 ? null : imageDimension16);
        }
    }

    public Image() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Image copy$default(Image image, Caption caption, ImageCrop imageCrop, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            caption = image.caption;
        }
        if ((i & 2) != 0) {
            imageCrop = image.crops;
        }
        if ((i & 4) != 0) {
            str = image.credit;
        }
        if ((i & 8) != 0) {
            str2 = image.uri;
        }
        return image.copy(caption, imageCrop, str, str2);
    }

    public final Caption component1() {
        return this.caption;
    }

    public final ImageCrop component2() {
        return this.crops;
    }

    public final String component3() {
        return this.credit;
    }

    public final String component4() {
        return this.uri;
    }

    public final Image copy(Caption caption, ImageCrop imageCrop, String str, String str2) {
        return new Image(caption, imageCrop, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return zq3.c(this.caption, image.caption) && zq3.c(this.crops, image.crops) && zq3.c(this.credit, image.credit) && zq3.c(this.uri, image.uri);
    }

    public final Caption getCaption() {
        return this.caption;
    }

    public final String getCredit() {
        return this.credit;
    }

    public final ImageCrop getCrops() {
        return this.crops;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        Caption caption = this.caption;
        int hashCode = (caption == null ? 0 : caption.hashCode()) * 31;
        ImageCrop imageCrop = this.crops;
        int hashCode2 = (hashCode + (imageCrop == null ? 0 : imageCrop.hashCode())) * 31;
        String str = this.credit;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Image(caption=" + this.caption + ", crops=" + this.crops + ", credit=" + this.credit + ", uri=" + this.uri + ")";
    }

    public Image(Caption caption, ImageCrop imageCrop, String str, String str2) {
        this.caption = caption;
        this.crops = imageCrop;
        this.credit = str;
        this.uri = str2;
    }

    public /* synthetic */ Image(Caption caption, ImageCrop imageCrop, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : caption, (i & 2) != 0 ? null : imageCrop, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
