package defpackage;

import android.app.Application;
import com.nytimes.android.utils.ImageCropsHelper;
import com.nytimes.android.utils.cropping.ImageCropper;

/* loaded from: classes4.dex */
public final class j31 {
    public static final j31 a = new j31();

    private j31() {
    }

    public final i31 a(zf3 zf3Var) {
        zq3.h(zf3Var, "croppingProvider");
        return new dp1(zf3Var);
    }

    public final zf3 b(Application application) {
        zq3.h(application, "context");
        return new ep1(application);
    }

    public final ImageCropper c(ImageCropsHelper imageCropsHelper, i31 i31Var) {
        zq3.h(imageCropsHelper, "helper");
        zq3.h(i31Var, "evaluator");
        return new ImageCropper(imageCropsHelper, i31Var);
    }
}
