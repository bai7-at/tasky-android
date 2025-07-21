package defpackage;

import android.app.Activity;
import com.nytimes.android.SingleArticleActivity;
import com.nytimes.android.media.video.VideoReferringSource;

/* loaded from: classes4.dex */
public final class k89 implements j89 {
    private final Activity a;

    public k89(Activity activity) {
        zq3.h(activity, "activity");
        this.a = activity;
    }

    @Override // defpackage.j89
    public VideoReferringSource a() {
        return this.a instanceof SingleArticleActivity ? VideoReferringSource.ARTICLE_FRONT : VideoReferringSource.SECTION_FRONT;
    }
}
