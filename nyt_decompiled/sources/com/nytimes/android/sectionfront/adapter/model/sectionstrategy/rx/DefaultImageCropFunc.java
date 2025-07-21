package com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.DefaultImageCropFunc;
import com.nytimes.android.sectionfront.adapter.viewholder.j;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.cropping.ImageCropper;
import defpackage.jg3;
import defpackage.ss2;
import defpackage.v57;
import defpackage.yq;
import defpackage.yt;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public final class DefaultImageCropFunc implements Function {
    private final SectionFront a;
    private final ImageCropper b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SectionAdapterItemType.values().length];
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SectionAdapterItemType.PHOTOSPOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SectionAdapterItemType.DAILY_BRIEFING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SectionAdapterItemType.VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SectionAdapterItemType.VIDEO_LEDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    public DefaultImageCropFunc(SectionFront sectionFront, ImageCropper imageCropper) {
        zq3.h(sectionFront, "section");
        zq3.h(imageCropper, "imageCropper");
        this.a = sectionFront;
        this.b = imageCropper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yq c(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (yq) ss2Var.invoke(obj);
    }

    private final Single d(Asset asset) {
        Asset promotionalMedia;
        ImageAsset mediaImage = asset.getMediaImage();
        if (mediaImage == null && (promotionalMedia = asset.getPromotionalMedia()) != null) {
            Asset promotionalMedia2 = promotionalMedia.getPromotionalMedia();
            if (promotionalMedia2 instanceof ImageAsset) {
                mediaImage = (ImageAsset) promotionalMedia2;
            }
        }
        if (mediaImage != null) {
            return this.b.c(ImageCropConfig.SF_DAILY_BRIEFING, mediaImage.getImage());
        }
        Single just = Single.just(new jg3(null));
        zq3.e(just);
        return just;
    }

    private final Single e(Asset asset, SectionFront sectionFront) {
        ImageAsset m = yt.m(asset, sectionFront);
        if ((m != null ? m.getImage() : null) != null) {
            return this.b.c(ImageCropConfig.SF_ARTICLE, m.getImage());
        }
        Single just = Single.just(new jg3(null));
        zq3.e(just);
        return just;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Single apply(final yq yqVar) {
        Single single;
        zq3.h(yqVar, "articleItem");
        SectionAdapterItemType sectionAdapterItemType = yqVar.a;
        Single single2 = null;
        switch (sectionAdapterItemType == null ? -1 : a.a[sectionAdapterItemType.ordinal()]) {
            case 1:
            case 2:
                single = j.g(yqVar.h, this.a, this.b);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                Asset asset = yqVar.h;
                zq3.g(asset, "asset");
                single = e(asset, this.a);
                break;
            case 7:
                Asset asset2 = yqVar.h;
                zq3.g(asset2, "asset");
                single = d(asset2);
                break;
            case 8:
            case 9:
                if (yqVar.d() instanceof VideoAsset) {
                    v57 v57Var = v57.a;
                    Asset asset3 = yqVar.h;
                    zq3.f(asset3, "null cannot be cast to non-null type com.nytimes.android.api.cms.VideoAsset");
                    single = v57Var.a((VideoAsset) asset3, this.a, this.b);
                    break;
                }
            default:
                single = null;
                break;
        }
        if (single != null) {
            final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.DefaultImageCropFunc$apply$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final yq invoke(jg3 jg3Var) {
                    zq3.h(jg3Var, AssetConstants.IMAGE_TYPE);
                    yq.this.k(jg3Var.a());
                    return yq.this;
                }
            };
            single2 = single.map(new Function() { // from class: yh1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    yq c;
                    c = DefaultImageCropFunc.c(ss2.this, obj);
                    return c;
                }
            });
        }
        if (single2 != null) {
            return single2;
        }
        Single just = Single.just(yqVar);
        zq3.g(just, "just(...)");
        return just;
    }
}
