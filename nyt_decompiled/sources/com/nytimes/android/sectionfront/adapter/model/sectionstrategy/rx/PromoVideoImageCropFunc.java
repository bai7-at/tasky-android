package com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.PromoVideoImageCropFunc;
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
public final class PromoVideoImageCropFunc implements Function {
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
            a = iArr;
        }
    }

    public PromoVideoImageCropFunc(SectionFront sectionFront, ImageCropper imageCropper) {
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

    @Override // io.reactivex.functions.Function
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Single apply(final yq yqVar) {
        zq3.h(yqVar, "articleItem");
        Asset l = yt.l(yqVar.h, this.a);
        if (!(l instanceof VideoAsset)) {
            Single just = Single.just(yqVar);
            zq3.g(just, "just(...)");
            return just;
        }
        zq3.f(l, "null cannot be cast to non-null type com.nytimes.android.api.cms.VideoAsset");
        VideoAsset videoAsset = (VideoAsset) l;
        SectionAdapterItemType sectionAdapterItemType = yqVar.a;
        int i = sectionAdapterItemType == null ? -1 : a.a[sectionAdapterItemType.ordinal()];
        Single single = null;
        Single a2 = (i == 1 || i == 2) ? v57.a.a(videoAsset, this.a, this.b) : null;
        if (a2 != null) {
            final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.PromoVideoImageCropFunc$apply$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final yq invoke(jg3 jg3Var) {
                    zq3.h(jg3Var, "imageDimension");
                    yq.this.l(jg3Var.a());
                    return yq.this;
                }
            };
            single = a2.map(new Function() { // from class: l56
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    yq c;
                    c = PromoVideoImageCropFunc.c(ss2.this, obj);
                    return c;
                }
            });
        }
        if (single != null) {
            return single;
        }
        Single just2 = Single.just(yqVar);
        zq3.g(just2, "just(...)");
        return just2;
    }
}
