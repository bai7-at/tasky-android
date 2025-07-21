package com.nytimes.android.ribbon.destinations.trending;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import defpackage.ps8;
import defpackage.ss8;
import defpackage.x08;
import defpackage.zq3;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class TrendingDestinationKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r17, androidx.compose.ui.Modifier r18, com.nytimes.android.ribbon.destinations.trending.TrendingViewModel r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.trending.TrendingDestinationKt.a(boolean, androidx.compose.ui.Modifier, com.nytimes.android.ribbon.destinations.trending.TrendingViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss8 b(x08 x08Var) {
        return (ss8) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ps8 e(Asset asset, int i, boolean z) {
        String str;
        String sectionNameOptional;
        Image.ImageCrop crops;
        ImageDimension square640;
        String title = asset.getTitle();
        String str2 = title == null ? "" : title;
        Image extractImage = asset.extractImage();
        String url = (extractImage == null || (crops = extractImage.getCrops()) == null || (square640 = crops.getSquare640()) == null) ? null : square640.getUrl();
        Image extractImage2 = asset.extractImage();
        String credit = extractImage2 != null ? extractImage2.getCredit() : null;
        String str3 = credit == null ? "" : credit;
        if (!Asset.Companion.isOpinion(asset.getSectionNameOptional()) || (sectionNameOptional = asset.getSectionNameOptional()) == null) {
            str = null;
        } else {
            String upperCase = sectionNameOptional.toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            str = upperCase;
        }
        return new ps8(str2, url, str3, str, i, z);
    }

    static /* synthetic */ ps8 f(Asset asset, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return e(asset, i, z);
    }
}
