package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public class v87 extends qd1 {
    public v87(ue7 ue7Var, SectionFront sectionFront, Context context, ImageCropper imageCropper) {
        super(ue7Var, sectionFront, context, imageCropper);
    }

    @Override // defpackage.qd1
    protected Single b(k38 k38Var) {
        k38Var.b(SectionAdapterItemType.ARTICLE);
        return Single.just(k38Var);
    }

    @Override // defpackage.qd1
    protected SectionAdapterItemType d(Asset asset) {
        return SectionAdapterItemType.ARTICLE;
    }
}
