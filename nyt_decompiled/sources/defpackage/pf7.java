package defpackage;

import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes4.dex */
public abstract class pf7 {
    public static void a(AspectRatioImageView aspectRatioImageView, int i, int i2, gy6 gy6Var, String str) {
        float f = DeviceUtils.A(aspectRatioImageView.getContext()) ? 0.6f : 0.8f;
        og3.c().o(str).e().i(sg3.a(aspectRatioImageView.getContext(), dd6.image_placeholder)).n((int) (i2 * f), (int) (i * f)).h().a(aspectRatioImageView, gy6Var);
    }

    public static void b(AspectRatioImageView aspectRatioImageView, gy6 gy6Var, int i, int i2, String str) {
        int width = aspectRatioImageView.getWidth();
        a(aspectRatioImageView, (int) (width * (i2 / i)), width, gy6Var, str);
    }

    public static void c(AspectRatioImageView aspectRatioImageView, int i, int i2) {
        if (aspectRatioImageView.getAspectRatioOption() == 0 || aspectRatioImageView.getAspectRatioOption() == -1) {
            aspectRatioImageView.c(i, i2);
        }
    }
}
