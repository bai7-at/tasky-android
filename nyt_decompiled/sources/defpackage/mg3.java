package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.nytimes.android.api.cms.ImageDimension;

/* loaded from: classes4.dex */
public abstract class mg3 {
    public static void a(ImageDimension imageDimension, ImageView imageView, int i) {
        if (imageDimension == null || imageDimension.getWidth() < 1 || imageDimension.getHeight() < 1) {
            return;
        }
        int height = (int) (i * (imageDimension.getHeight() / imageDimension.getWidth()));
        d(imageDimension, imageView.getContext(), i, height).p(imageView);
        imageView.setMinimumHeight(height);
    }

    public static fy6 b(ImageDimension imageDimension, int i) {
        if (imageDimension == null || imageDimension.getWidth() < 1 || imageDimension.getHeight() < 1) {
            return null;
        }
        return c(imageDimension, i, (int) (i * (imageDimension.getHeight() / imageDimension.getWidth())));
    }

    private static fy6 c(ImageDimension imageDimension, int i, int i2) {
        return og3.c().o(imageDimension.getUrl()).n(i, i2).h();
    }

    private static fy6 d(ImageDimension imageDimension, Context context, int i, int i2) {
        return c(imageDimension, i, i2).i(sg3.a(context, dd6.image_placeholder));
    }
}
