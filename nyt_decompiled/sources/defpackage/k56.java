package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.domain.ImageCrop;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;

/* loaded from: classes4.dex */
public final class k56 {
    private final tg3 a;

    public k56(tg3 tg3Var) {
        zq3.h(tg3Var, "imageLoaderWrapper");
        this.a = tg3Var;
    }

    public static /* synthetic */ void b(k56 k56Var, Image image, AspectRatioImageView aspectRatioImageView, TextView textView, ImageCrop imageCrop, int i, int i2, int i3, Object obj) {
        ImageCrop imageCrop2;
        int i4;
        int i5;
        TextView textView2 = (i3 & 4) != 0 ? null : textView;
        if ((i3 & 8) != 0) {
            imageCrop2 = image != null ? image.c() : null;
        } else {
            imageCrop2 = imageCrop;
        }
        if ((i3 & 16) != 0) {
            i4 = imageCrop2 != null ? imageCrop2.c() : 0;
        } else {
            i4 = i;
        }
        if ((i3 & 32) != 0) {
            i5 = imageCrop2 != null ? imageCrop2.a() : 0;
        } else {
            i5 = i2;
        }
        k56Var.a(image, aspectRatioImageView, textView2, imageCrop2, i4, i5);
    }

    public final void a(Image image, AspectRatioImageView aspectRatioImageView, TextView textView, ImageCrop imageCrop, int i, int i2) {
        zq3.h(aspectRatioImageView, AssetConstants.IMAGE_TYPE);
        if (image == null || imageCrop == null) {
            aspectRatioImageView.setVisibility(8);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        aspectRatioImageView.setVisibility(0);
        if (textView != null) {
            textView.setVisibility(0);
        }
        aspectRatioImageView.c(i, i2);
        fy6 o = this.a.get().o(imageCrop.b());
        ColorDrawable a = sg3.a(aspectRatioImageView.getContext(), dd6.image_placeholder);
        zq3.g(a, "compatPlaceholder(...)");
        o.i(a).p(aspectRatioImageView);
        if (textView == null) {
            return;
        }
        textView.setText(image.a());
    }
}
