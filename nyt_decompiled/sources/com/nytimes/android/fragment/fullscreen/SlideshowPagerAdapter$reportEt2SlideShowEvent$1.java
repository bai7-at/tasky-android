package com.nytimes.android.fragment.fullscreen;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.Slideshow;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.fragment.fullscreen.SlideshowPagerAdapter;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s55;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;

@fc1(c = "com.nytimes.android.fragment.fullscreen.SlideshowPagerAdapter$reportEt2SlideShowEvent$1", f = "SlideshowPagerAdapter.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SlideshowPagerAdapter$reportEt2SlideShowEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $position;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlideshowPagerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlideshowPagerAdapter$reportEt2SlideShowEvent$1(SlideshowPagerAdapter slideshowPagerAdapter, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = slideshowPagerAdapter;
        this.$position = i;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((SlideshowPagerAdapter$reportEt2SlideShowEvent$1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SlideshowPagerAdapter$reportEt2SlideShowEvent$1 slideshowPagerAdapter$reportEt2SlideShowEvent$1 = new SlideshowPagerAdapter$reportEt2SlideShowEvent$1(this.this$0, this.$position, by0Var);
        slideshowPagerAdapter$reportEt2SlideShowEvent$1.L$0 = obj;
        return slideshowPagerAdapter$reportEt2SlideShowEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        SlideshowAsset slideshowAsset;
        SlideshowAsset slideshowAsset2;
        Object h;
        SlideshowAsset slideshowAsset3;
        List<Image> slides;
        Image image;
        Object h2 = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
            Integer p = this.this$0.p(this.$position);
            int intValue = p != null ? p.intValue() : this.$position;
            arrayList = this.this$0.o;
            String lowerCase = ((SlideshowPagerAdapter.a) arrayList.get(this.$position)).b().toString().toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            String str = null;
            if (h.w(lowerCase, AssetConstants.IMAGE_TYPE, true)) {
                slideshowAsset3 = this.this$0.k;
                Slideshow slideshow = slideshowAsset3.getSlideshow();
                if (slideshow != null && (slides = slideshow.getSlides()) != null && (image = (Image) i.n0(slides, intValue)) != null) {
                    str = image.getUri();
                }
                str = String.valueOf(str);
            }
            s55.o oVar = new s55.o(lowerCase, str);
            slideshowAsset = this.this$0.k;
            String url = slideshowAsset.getUrl();
            slideshowAsset2 = this.this$0.k;
            String uri = slideshowAsset2.getUri();
            this.label = 1;
            h = eT2CoroutineScope.h(oVar, (r23 & 2) != 0 ? null : url, (r23 & 4) != 0 ? null : uri, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            } : null, (r23 & 64) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$3
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : null, (r23 & 128) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$4
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : null, this);
            if (h == h2) {
                return h2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
