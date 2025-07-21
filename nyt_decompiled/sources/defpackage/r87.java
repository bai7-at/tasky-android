package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class r87 extends nj1 {
    public r87(Context context, SectionFront sectionFront, ue7 ue7Var, AudioFileVerifier audioFileVerifier, TimeStampUtil timeStampUtil, SFSummaryController sFSummaryController, ImageCropper imageCropper) {
        super(context, sectionFront, ue7Var, audioFileVerifier, timeStampUtil, sFSummaryController, imageCropper);
    }

    @Override // defpackage.nj1, defpackage.wh7
    public Observable b() {
        SectionFront sectionFront = this.b;
        return sectionFront == null ? y05.b(Boolean.FALSE) : y05.b(Boolean.valueOf(c97.c(sectionFront.getName())));
    }

    @Override // defpackage.nj1
    protected Function f() {
        return new v87(this.c, this.b, this.a, this.e);
    }
}
