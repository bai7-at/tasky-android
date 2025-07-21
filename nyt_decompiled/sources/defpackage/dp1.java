package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.utils.ImageCropConfig;
import java.util.List;

/* loaded from: classes4.dex */
public final class dp1 implements i31 {
    private final zf3 a;

    public dp1(zf3 zf3Var) {
        zq3.h(zf3Var, "provider");
        this.a = zf3Var;
    }

    @Override // defpackage.i31
    public ImageDimension a(ImageCropConfig imageCropConfig, Image image, List list) {
        zq3.h(imageCropConfig, "config");
        zq3.h(image, AssetConstants.IMAGE_TYPE);
        zq3.h(list, "mappings");
        Integer a = xf3.a.a(imageCropConfig, this.a).a(list, image);
        if (a != null) {
            return this.a.b(image, a.intValue());
        }
        return null;
    }
}
