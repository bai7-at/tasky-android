package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Observable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class dt5 extends pk2 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt5(Context context, SectionFront sectionFront, ue7 ue7Var, AudioFileVerifier audioFileVerifier, boolean z, TimeStampUtil timeStampUtil, SFSummaryController sFSummaryController, ImageCropper imageCropper) {
        super(context, sectionFront, ue7Var, audioFileVerifier, z, timeStampUtil, sFSummaryController, imageCropper);
        zq3.h(context, "context");
        zq3.h(sectionFront, "section");
        zq3.h(ue7Var, "config");
        zq3.h(audioFileVerifier, "audioFileVerifier");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(sFSummaryController, "sfSummaryController");
        zq3.h(imageCropper, "imageCropper");
        this.m = false;
        n(sectionFront.getAssets().size(), 6, 5, 4, 7, -1);
    }

    @Override // defpackage.pk2, defpackage.nj1, defpackage.wh7
    public Observable b() {
        Observable b = y05.b(Boolean.valueOf(this.l && !mk2.a(this.a, this.b.getName())));
        zq3.g(b, "create(...)");
        return b;
    }
}
