package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.video.VideoReferringSource;
import com.nytimes.android.sectionfront.adapter.viewholder.l;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.video.views.InlineVideoView;
import defpackage.mi4;
import defpackage.ud6;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public class l {
    final InlineVideoView a;
    final f b;
    private final FeedStore c;
    private final mi4 d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final int f;

    public l(Context context, f fVar, InlineVideoView inlineVideoView, FeedStore feedStore, mi4 mi4Var) {
        this.b = fVar;
        this.a = inlineVideoView;
        this.f = context.getResources().getDimensionPixelSize(ud6.vertical_video_promo_inset);
        this.c = feedStore;
        this.d = mi4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Throwable th) {
        NYTLogger.i(th, "Error fetching latest for inline video", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(Asset asset, VideoAsset videoAsset, SectionFront sectionFront, Optional optional, LatestFeed latestFeed) {
        NYTMediaItem a = this.d.a(asset, videoAsset, sectionFront, VideoReferringSource.SECTION_FRONT, latestFeed);
        this.a.C(a, this.d.b(videoAsset, ShareOrigin.SECTION_FRONT, a.i0(), false));
        this.a.d0(videoAsset.isVertical() ? this.f : 0);
        h(videoAsset, sectionFront, optional);
    }

    private void h(VideoAsset videoAsset, SectionFront sectionFront, Optional optional) {
        if (!optional.d() || ((ImageDimension) optional.c()).getUrl() == null) {
            this.a.N(null);
            f fVar = this.b;
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        this.a.N((ImageDimension) optional.c());
        f fVar2 = this.b;
        if (fVar2 != null) {
            fVar2.e(videoAsset, sectionFront);
        }
    }

    void c() {
        this.e.clear();
    }

    void f(final Asset asset, final VideoAsset videoAsset, final SectionFront sectionFront, final Optional optional) {
        this.e.add(this.c.f().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: fo7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.this.d(asset, videoAsset, sectionFront, optional, (LatestFeed) obj);
            }
        }, new Consumer() { // from class: go7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                l.e((Throwable) obj);
            }
        }));
    }
}
