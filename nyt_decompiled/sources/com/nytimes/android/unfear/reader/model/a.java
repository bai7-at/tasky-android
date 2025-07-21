package com.nytimes.android.unfear.reader.model;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.unfear.reader.model.ImageElement;
import defpackage.d56;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.unfear.reader.model.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0442a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageElement.Dimension.values().length];
            try {
                iArr[ImageElement.Dimension.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageElement.Dimension.SQUARE_THUMBNAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageElement.Dimension.WIDE_THUMBNAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final ImageDimension a(Image.ImageCrop imageCrop, ImageElement.Dimension dimension) {
        zq3.h(imageCrop, "<this>");
        zq3.h(dimension, "dimension");
        int i = C0442a.a[dimension.ordinal()];
        if (i == 1) {
            ImageDimension master675 = imageCrop.getMaster675();
            if (master675 != null) {
                return master675;
            }
            ImageDimension master768 = imageCrop.getMaster768();
            return master768 == null ? imageCrop.getMaster1050() : master768;
        }
        if (i == 2) {
            ImageDimension thumbLarge = imageCrop.getThumbLarge();
            if (thumbLarge != null) {
                return thumbLarge;
            }
            ImageDimension smallSquare168 = imageCrop.getSmallSquare168();
            return smallSquare168 == null ? imageCrop.getSquare320() : smallSquare168;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ImageDimension mediumThreeByTwo210 = imageCrop.getMediumThreeByTwo210();
        if (mediumThreeByTwo210 != null) {
            return mediumThreeByTwo210;
        }
        ImageDimension mediumThreeByTwo225 = imageCrop.getMediumThreeByTwo225();
        return mediumThreeByTwo225 == null ? imageCrop.getMediumThreeByTwo440() : mediumThreeByTwo225;
    }

    public static final d56 b(Asset asset, ImageElement.Dimension dimension, boolean z) {
        Image image;
        Image.ImageCrop crops;
        zq3.h(asset, "<this>");
        zq3.h(dimension, "dimension");
        Asset promotionalMedia = asset.getPromotionalMedia();
        ImageAsset imageAsset = promotionalMedia instanceof ImageAsset ? (ImageAsset) promotionalMedia : null;
        if (imageAsset == null) {
            Asset promotionalMedia2 = asset.getPromotionalMedia();
            Asset promotionalMedia3 = promotionalMedia2 != null ? promotionalMedia2.getPromotionalMedia() : null;
            imageAsset = promotionalMedia3 instanceof ImageAsset ? (ImageAsset) promotionalMedia3 : null;
        }
        ImageDimension a = (imageAsset == null || (image = imageAsset.getImage()) == null || (crops = image.getCrops()) == null) ? null : a(crops, dimension);
        if (a != null) {
            return new d56(new ImageElement(a.getHeight(), a.getWidth(), a.getNonNullableUrl(), (String) null, (String) null, 16, (DefaultConstructorMarker) null), z);
        }
        return null;
    }

    public static /* synthetic */ d56 c(Asset asset, ImageElement.Dimension dimension, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(asset, dimension, z);
    }
}
