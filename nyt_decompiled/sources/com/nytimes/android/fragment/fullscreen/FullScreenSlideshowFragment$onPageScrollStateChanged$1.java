package com.nytimes.android.fragment.fullscreen;

import androidx.viewpager.widget.ViewPager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$onPageScrollStateChanged$1", f = "FullScreenSlideshowFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenSlideshowFragment$onPageScrollStateChanged$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ FullScreenSlideshowFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenSlideshowFragment$onPageScrollStateChanged$1(FullScreenSlideshowFragment fullScreenSlideshowFragment, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fullScreenSlideshowFragment;
        this.$index = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FullScreenSlideshowFragment fullScreenSlideshowFragment, int i) {
        ViewPager viewPager;
        viewPager = fullScreenSlideshowFragment.h;
        if (viewPager != null) {
            viewPager.K(i, true);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FullScreenSlideshowFragment$onPageScrollStateChanged$1(this.this$0, this.$index, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SlideshowPagerAdapter slideshowPagerAdapter;
        int i;
        ViewPager viewPager;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        slideshowPagerAdapter = this.this$0.g;
        if (slideshowPagerAdapter != null && slideshowPagerAdapter.s(this.$index)) {
            int i2 = this.$index;
            i = this.this$0.l;
            final int i3 = i2 + (i2 - i);
            viewPager = this.this$0.h;
            if (viewPager != null) {
                final FullScreenSlideshowFragment fullScreenSlideshowFragment = this.this$0;
                cc0.a(viewPager.postDelayed(new Runnable() { // from class: com.nytimes.android.fragment.fullscreen.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        FullScreenSlideshowFragment$onPageScrollStateChanged$1.c(FullScreenSlideshowFragment.this, i3);
                    }
                }, 100L));
            }
        }
        this.this$0.l = this.$index;
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FullScreenSlideshowFragment$onPageScrollStateChanged$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
