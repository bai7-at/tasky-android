package com.nytimes.android.utils.cropping;

import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.ImageCropsHelper;
import com.nytimes.android.utils.cropping.ImageCropper;
import defpackage.i31;
import defpackage.jg3;
import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;

/* loaded from: classes4.dex */
public final class ImageCropper {
    private final ImageCropsHelper a;
    private final i31 b;

    public ImageCropper(ImageCropsHelper imageCropsHelper, i31 i31Var) {
        zq3.h(imageCropsHelper, "helper");
        zq3.h(i31Var, "evaluator");
        this.a = imageCropsHelper;
        this.b = i31Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jg3 d(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (jg3) ss2Var.invoke(obj);
    }

    public final Single c(final ImageCropConfig imageCropConfig, final Image image) {
        zq3.h(imageCropConfig, "configuration");
        Single b = this.a.b(imageCropConfig.getResCropID());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.utils.cropping.ImageCropper$crop$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final jg3 invoke(List list) {
                i31 i31Var;
                ImageDimension a;
                zq3.h(list, "it");
                if (Image.this == null) {
                    a = null;
                } else {
                    i31Var = this.b;
                    a = i31Var.a(imageCropConfig, Image.this, list);
                }
                return new jg3(a);
            }
        };
        Single map = b.map(new Function() { // from class: yf3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                jg3 d;
                d = ImageCropper.d(ss2.this, obj);
                return d;
            }
        });
        zq3.g(map, "map(...)");
        return map;
    }
}
