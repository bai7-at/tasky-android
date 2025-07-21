package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.adapter.viewholder.j;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class qd1 implements Function {
    protected final ue7 a;
    protected final SectionFront b;
    protected final Context c;
    protected final ImageCropper d;

    public qd1(ue7 ue7Var, SectionFront sectionFront, Context context, ImageCropper imageCropper) {
        this.a = ue7Var;
        this.b = sectionFront;
        this.c = context;
        this.d = imageCropper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k38 f(Asset asset, k38 k38Var, jg3 jg3Var) {
        if (jg3Var == null || asset.isShowPicture()) {
            k38Var.b(SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE);
        } else {
            k38Var.b(SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE);
        }
        return k38Var;
    }

    private boolean g(k38 k38Var) {
        Asset asset = k38Var.b;
        if (asset instanceof AudioAsset) {
            k38Var.b(SectionAdapterItemType.AUDIO);
            return true;
        }
        if (asset instanceof VideoAsset) {
            k38Var.b(SectionAdapterItemType.VIDEO_LEDE);
            return true;
        }
        if (asset.getPromotionalMedia() != null) {
            return false;
        }
        k38Var.b(SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE);
        return true;
    }

    protected Single b(final k38 k38Var) {
        final Asset asset = k38Var.b;
        return g(k38Var) ? Single.just(k38Var) : j.g(asset, this.b, this.d).map(new Function() { // from class: pd1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                k38 f;
                f = qd1.f(Asset.this, k38Var, (jg3) obj);
                return f;
            }
        });
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Observable apply(k38 k38Var) {
        if (e(k38Var)) {
            return Observable.empty();
        }
        if (k38Var.a == 0) {
            return b(k38Var).toObservable();
        }
        k38Var.b(d(k38Var.b));
        return y05.b(k38Var);
    }

    protected SectionAdapterItemType d(Asset asset) {
        return asset instanceof AudioAsset ? SectionAdapterItemType.AUDIO : asset instanceof VideoAsset ? SectionAdapterItemType.VIDEO : (asset.isDailyBriefing() && DeviceUtils.G(this.c)) ? SectionAdapterItemType.DAILY_BRIEFING : SectionAdapterItemType.ARTICLE;
    }

    protected boolean e(k38 k38Var) {
        return false;
    }
}
