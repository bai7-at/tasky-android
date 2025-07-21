package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public final class ep1 implements zf3 {
    private final Context a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;

    public ep1(Context context) {
        zq3.h(context, "context");
        this.a = context;
        this.b = g(context, sh6.articleLarge);
        this.c = g(context, sh6.articleInline);
        this.d = g(context, sh6.jumbo);
        this.e = g(context, sh6.super_jumbo);
        this.f = g(context, sh6.popup);
        this.g = g(context, sh6.thumbLarge);
        this.h = g(context, sh6.medium3x2_210);
        this.i = g(context, sh6.medium3x2_225);
        this.j = g(context, sh6.medium3x2_440);
        this.k = g(context, sh6.video16x9_1050);
        this.l = g(context, sh6.master_1050);
        this.m = g(context, sh6.master_768);
        this.n = g(context, sh6.master_675);
    }

    private final int g(Context context, int i) {
        return context.getResources().getInteger(i);
    }

    @Override // defpackage.zf3
    public int a() {
        return this.i;
    }

    @Override // defpackage.zf3
    public ImageDimension b(Image image, int i) {
        zq3.h(image, AssetConstants.IMAGE_TYPE);
        if (i == this.b) {
            Image.ImageCrop crops = image.getCrops();
            if (crops != null) {
                return crops.getArticleLarge();
            }
            return null;
        }
        if (i == this.c) {
            Image.ImageCrop crops2 = image.getCrops();
            if (crops2 != null) {
                return crops2.getArticleInline();
            }
            return null;
        }
        if (i == this.d) {
            Image.ImageCrop crops3 = image.getCrops();
            if (crops3 != null) {
                return crops3.getJumbo();
            }
            return null;
        }
        if (i == this.e) {
            Image.ImageCrop crops4 = image.getCrops();
            if (crops4 != null) {
                return crops4.getSuperJumbo();
            }
            return null;
        }
        if (i == this.f) {
            Image.ImageCrop crops5 = image.getCrops();
            if (crops5 != null) {
                return crops5.getPopup();
            }
            return null;
        }
        if (i == this.g) {
            Image.ImageCrop crops6 = image.getCrops();
            if (crops6 != null) {
                return crops6.getThumbLarge();
            }
            return null;
        }
        if (i == this.h) {
            Image.ImageCrop crops7 = image.getCrops();
            if (crops7 != null) {
                return crops7.getMediumThreeByTwo210();
            }
            return null;
        }
        if (i == this.i) {
            Image.ImageCrop crops8 = image.getCrops();
            if (crops8 != null) {
                return crops8.getMediumThreeByTwo225();
            }
            return null;
        }
        if (i == this.j) {
            Image.ImageCrop crops9 = image.getCrops();
            if (crops9 != null) {
                return crops9.getMediumThreeByTwo440();
            }
            return null;
        }
        if (i == this.k) {
            Image.ImageCrop crops10 = image.getCrops();
            if (crops10 != null) {
                return crops10.getVideoSixteenByNine1050();
            }
            return null;
        }
        if (i == this.l) {
            Image.ImageCrop crops11 = image.getCrops();
            if (crops11 != null) {
                return crops11.getMaster1050();
            }
            return null;
        }
        if (i == this.m) {
            Image.ImageCrop crops12 = image.getCrops();
            if (crops12 != null) {
                return crops12.getMaster768();
            }
            return null;
        }
        if (i == this.n) {
            Image.ImageCrop crops13 = image.getCrops();
            if (crops13 != null) {
                return crops13.getMaster675();
            }
            return null;
        }
        NYTLogger.A("Missing proper cropping marker [" + i + "]", new Object[0]);
        Image.ImageCrop crops14 = image.getCrops();
        if (crops14 != null) {
            return crops14.getArticleLarge();
        }
        return null;
    }

    @Override // defpackage.zf3
    public int c() {
        return this.j;
    }

    @Override // defpackage.zf3
    public int d() {
        return this.d;
    }

    @Override // defpackage.zf3
    public int e() {
        return this.h;
    }

    @Override // defpackage.zf3
    public int f() {
        return this.b;
    }
}
