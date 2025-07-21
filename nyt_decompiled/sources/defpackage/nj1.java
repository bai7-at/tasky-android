package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.DefaultImageCropFunc;
import com.nytimes.android.sectionfront.adapter.model.sectionstrategy.rx.PromoVideoImageCropFunc;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;

/* loaded from: classes4.dex */
public class nj1 implements wh7 {
    protected final Context a;
    protected final SectionFront b;
    protected final ue7 c;
    protected final Predicate d;
    protected final ImageCropper e;
    private final TimeStampUtil f;
    private final SFSummaryController g;
    private Function h;
    private Function i;
    private Function j;

    public nj1(Context context, SectionFront sectionFront, ue7 ue7Var, final AudioFileVerifier audioFileVerifier, TimeStampUtil timeStampUtil, SFSummaryController sFSummaryController, ImageCropper imageCropper) {
        this.a = context;
        this.c = ue7Var;
        this.b = sectionFront;
        this.e = imageCropper;
        this.d = new Predicate() { // from class: lj1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m;
                m = nj1.m(AudioFileVerifier.this, (k38) obj);
                return m;
            }
        };
        this.f = timeStampUtil;
        this.g = sFSummaryController;
    }

    private Function j() {
        if (this.h == null) {
            this.h = h();
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k38 l(List list, Integer num) {
        return new k38(num.intValue(), (Asset) list.get(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m(AudioFileVerifier audioFileVerifier, k38 k38Var) {
        Asset asset = k38Var.b;
        return !(asset instanceof AudioAsset) || audioFileVerifier.isSupported((AudioAsset) asset);
    }

    @Override // defpackage.wh7
    public Observable a(List list) {
        return list == null ? Observable.empty() : e(list).filter(this.d).flatMap(i()).map(j()).flatMapSingle(new DefaultImageCropFunc(this.b, this.e)).flatMapSingle(new PromoVideoImageCropFunc(this.b, this.e)).toSortedList().toObservable().map(k());
    }

    @Override // defpackage.wh7
    public Observable b() {
        return y05.b(Boolean.TRUE);
    }

    protected Observable e(final List list) {
        return Observable.range(0, list.size()).map(new Function() { // from class: mj1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                k38 l;
                l = nj1.l(list, (Integer) obj);
                return l;
            }
        });
    }

    protected Function f() {
        return new qd1(this.c, this.b, this.a, this.e);
    }

    protected Function g() {
        return new ar();
    }

    protected Function h() {
        return new tm8(this.b, this.c, this.f, this.g);
    }

    protected Function i() {
        if (this.i == null) {
            this.i = f();
        }
        return this.i;
    }

    protected Function k() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }
}
