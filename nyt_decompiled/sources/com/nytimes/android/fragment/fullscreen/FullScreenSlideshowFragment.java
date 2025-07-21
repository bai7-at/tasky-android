package com.nytimes.android.fragment.fullscreen;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.nytimes.android.ads.slideshow.SlideshowAdsViewModel;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.Slideshow;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.c04;
import defpackage.cb2;
import defpackage.e44;
import defpackage.ei6;
import defpackage.mx0;
import defpackage.n83;
import defpackage.ng6;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.t21;
import defpackage.zq3;
import defpackage.zt6;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class FullScreenSlideshowFragment extends n83 implements ViewPager.i {
    public static final a Companion = new a(null);
    public static final int m = 8;
    public ET2CoroutineScope f;
    public cb2 featureFlagUtil;
    private SlideshowPagerAdapter g;
    private ViewPager h;
    private Intent i = new Intent();
    private final c04 j;
    private final c04 k;
    private int l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FullScreenSlideshowFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sa9 mo865invoke() {
                return (sa9) qs2.this.mo865invoke();
            }
        });
        final qs2 qs2Var2 = null;
        this.j = FragmentViewModelLazyKt.b(this, zt6.b(AssetViewModel.class), new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                sa9 c;
                c = FragmentViewModelLazyKt.c(c04.this);
                return c.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                sa9 c;
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                c = FragmentViewModelLazyKt.c(b);
                d dVar = c instanceof d ? (d) c : null;
                return dVar != null ? dVar.getDefaultViewModelCreationExtras() : t21.a.b;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                sa9 c;
                t.b defaultViewModelProviderFactory;
                c = FragmentViewModelLazyKt.c(b);
                d dVar = c instanceof d ? (d) c : null;
                if (dVar != null && (defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                t.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.k = FragmentViewModelLazyKt.b(this, zt6.b(SlideshowAdsViewModel.class), new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                u viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                zq3.g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                t21 defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenSlideshowFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                t.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final SlideshowAdsViewModel k1() {
        return (SlideshowAdsViewModel) this.k.getValue();
    }

    private final int l1() {
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        if (DeviceUtils.G(requireContext)) {
            Context requireContext2 = requireContext();
            zq3.g(requireContext2, "requireContext(...)");
            ActivityManager activityManager = (ActivityManager) mx0.j(requireContext2, ActivityManager.class);
            if (activityManager != null && activityManager.getMemoryClass() <= 64) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetViewModel m1() {
        return (AssetViewModel) this.j.getValue();
    }

    private final void n1(int i) {
        String str;
        SlideshowPagerAdapter slideshowPagerAdapter = this.g;
        if (slideshowPagerAdapter == null || slideshowPagerAdapter.t(i)) {
            return;
        }
        f requireActivity = requireActivity();
        Integer p = slideshowPagerAdapter.p(i);
        if (p != null) {
            str = (p.intValue() + 1) + " of " + slideshowPagerAdapter.q();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        requireActivity.setTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(SlideshowAsset slideshowAsset) {
        List<Image> slides;
        SlideshowAdsViewModel k1 = k1();
        Slideshow slideshow = slideshowAsset.getSlideshow();
        k1.k((slideshow == null || (slides = slideshow.getSlides()) == null) ? 0 : slides.size(), slideshowAsset.getSectionContentName(), slideshowAsset.getSubsectionContentName());
        FragmentManager childFragmentManager = getChildFragmentManager();
        SlideshowAdsViewModel k12 = k1();
        zq3.e(childFragmentManager);
        SlideshowPagerAdapter slideshowPagerAdapter = new SlideshowPagerAdapter(childFragmentManager, k12, slideshowAsset);
        this.g = slideshowPagerAdapter;
        Intent intent = requireActivity().getIntent();
        ViewPager viewPager = this.h;
        if (viewPager != null) {
            viewPager.setAdapter(slideshowPagerAdapter);
            viewPager.setOffscreenPageLimit(l1());
            viewPager.b(this);
            int intExtra = intent.getIntExtra("com.nytimes.android.EXTRA_SLIDESHOW_INDEX", -1);
            if (intExtra != -1) {
                viewPager.setCurrentItem(intExtra);
            }
            n1(viewPager.getCurrentItem());
            slideshowPagerAdapter.u(viewPager.getCurrentItem(), this);
        }
        this.i.putExtra("com.nytimes.android.EXTRA_SLIDESHOW_ASSET_ID", slideshowAsset.getAssetId());
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void U(int i, float f, int i2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenSlideshowFragment$onActivityCreated$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SlideshowAdsViewModel k1 = k1();
        String h = m1().g().h();
        if (h == null) {
            h = m1().g().i();
        }
        k1.j(h);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(ei6.fragment_full_screen_slideshow, viewGroup, false);
        View findViewById = inflate.findViewById(ng6.viewpager);
        zq3.f(findViewById, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        this.h = (ViewPager) findViewById;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ViewPager viewPager = this.h;
        if (viewPager != null) {
            viewPager.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        setEt2Scope(ET2CoroutineScopeKt.d(this, new FullScreenSlideshowFragment$onViewCreated$1(null)));
    }

    public final void setEt2Scope(ET2CoroutineScope eT2CoroutineScope) {
        zq3.h(eT2CoroutineScope, "<set-?>");
        this.f = eT2CoroutineScope;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void t0(int i) {
        ViewPager viewPager = this.h;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : 0;
        if (i == 0) {
            SlideshowPagerAdapter slideshowPagerAdapter = this.g;
            if (slideshowPagerAdapter == null || !slideshowPagerAdapter.t(currentItem)) {
                BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenSlideshowFragment$onPageScrollStateChanged$1(this, currentItem, null), 3, null);
            } else {
                requireActivity().finish();
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void v0(int i) {
        SlideshowPagerAdapter slideshowPagerAdapter;
        n1(i);
        this.i.putExtra("com.nytimes.android.EXTRA_SLIDESHOW_INDEX", i);
        requireActivity().setResult(3001, this.i);
        SlideshowPagerAdapter slideshowPagerAdapter2 = this.g;
        if (slideshowPagerAdapter2 == null || slideshowPagerAdapter2.t(i) || (slideshowPagerAdapter = this.g) == null) {
            return;
        }
        slideshowPagerAdapter.u(i, this);
    }
}
