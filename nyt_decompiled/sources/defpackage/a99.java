package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class a99 implements wf3 {
    private final int a;
    private final ArrayList b;

    public a99(zf3 zf3Var) {
        zq3.h(zf3Var, "provider");
        this.a = zf3Var.c();
        this.b = i.h(Integer.valueOf(zf3Var.a()), Integer.valueOf(zf3Var.e()), Integer.valueOf(zf3Var.f()));
    }

    private final boolean b(Image image, List list) {
        ImageDimension mediumThreeByTwo440;
        String url;
        Image.ImageCrop crops = image.getCrops();
        return list.contains(Integer.valueOf(this.a)) & ((crops == null || (mediumThreeByTwo440 = crops.getMediumThreeByTwo440()) == null || (url = mediumThreeByTwo440.getUrl()) == null) ? false : !h.d0(url));
    }

    @Override // defpackage.wf3
    public Integer a(List list, Image image) {
        zq3.h(list, "mappings");
        zq3.h(image, AssetConstants.IMAGE_TYPE);
        if (b(image, list)) {
            return Integer.valueOf(this.a);
        }
        if (list.isEmpty()) {
            return null;
        }
        return (Integer) i.k0(this.b);
    }
}
