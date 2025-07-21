package com.nytimes.android.fragment.fullscreen;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Caption;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.Slideshow;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.fragment.AssetArgs;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.fragment.fullscreen.FullScreenImageFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.cropping.ImageCropper;
import com.nytimes.android.video.FullscreenToolsController;
import com.nytimes.android.widget.CollapsibleLayout;
import defpackage.b04;
import defpackage.bj6;
import defpackage.c04;
import defpackage.e44;
import defpackage.ei6;
import defpackage.fp2;
import defpackage.fy6;
import defpackage.jg3;
import defpackage.ke6;
import defpackage.m83;
import defpackage.mg3;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.ph6;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tm6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class FullScreenImageFragment extends m83 {
    public static final a Companion = new a(null);
    public static final int s = 8;
    private final c04 f;
    private View g;
    private ImageViewTouch h;
    private ViewGroup i;
    public ImageCropper imageCropper;
    private CollapsibleLayout j;
    private TextView k;
    private TextView l;
    private ValueAnimator m;
    private final CompositeDisposable n;
    private int r;
    public b04 sharingManager;
    public FullscreenToolsController toolsController;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FullScreenImageFragment a(AssetArgs assetArgs) {
            zq3.h(assetArgs, "assetArgs");
            FullScreenImageFragment fullScreenImageFragment = new FullScreenImageFragment();
            fullScreenImageFragment.setArguments(assetArgs.l());
            return fullScreenImageFragment;
        }

        private a() {
        }
    }

    public FullScreenImageFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$special$$inlined$viewModels$default$2
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
        this.f = FragmentViewModelLazyKt.b(this, zt6.b(AssetViewModel.class), new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$special$$inlined$viewModels$default$3
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
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$special$$inlined$viewModels$default$4
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
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$special$$inlined$viewModels$default$5
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
        this.n = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetViewModel A1() {
        return (AssetViewModel) this.f.getValue();
    }

    private final void B1() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenImageFragment$launchShare$1(this, null), 3, null);
    }

    private final void C1() {
        CompositeDisposable compositeDisposable = this.n;
        Observable c = z1().c();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$listenToFullscreenChanges$1
            {
                super(1);
            }

            public final void b(FullscreenToolsController.SyncAction syncAction) {
                FullScreenImageFragment.this.r1(syncAction == FullscreenToolsController.SyncAction.SHOW);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((FullscreenToolsController.SyncAction) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: jr2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullScreenImageFragment.D1(ss2.this, obj);
            }
        };
        final FullScreenImageFragment$listenToFullscreenChanges$2 fullScreenImageFragment$listenToFullscreenChanges$2 = new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$listenToFullscreenChanges$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                NYTLogger.g("Error listening to fullscreen changes.", new Object[0]);
            }
        };
        Disposable subscribe = c.subscribe(consumer, new Consumer() { // from class: kr2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullScreenImageFragment.E1(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(ImageDimension imageDimension) {
        fy6 c;
        fy6 l;
        ImageViewTouch imageViewTouch = this.h;
        ImageViewTouch imageViewTouch2 = null;
        if (imageViewTouch == null) {
            zq3.z("imageView");
            imageViewTouch = null;
        }
        Context context = imageViewTouch.getContext();
        zq3.g(context, "getContext(...)");
        fy6 b = mg3.b(imageDimension, DeviceUtils.p(context));
        if (b == null || (c = b.c()) == null || (l = c.l(ke6.t_logo_drawable)) == null) {
            return;
        }
        ImageViewTouch imageViewTouch3 = this.h;
        if (imageViewTouch3 == null) {
            zq3.z("imageView");
        } else {
            imageViewTouch2 = imageViewTouch3;
        }
        l.p(imageViewTouch2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(FullScreenImageFragment fullScreenImageFragment) {
        zq3.h(fullScreenImageFragment, "this$0");
        fullScreenImageFragment.z1().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(FullScreenImageFragment fullScreenImageFragment, View view) {
        zq3.h(fullScreenImageFragment, "this$0");
        fullScreenImageFragment.z1().d();
    }

    private final void I1() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenImageFragment$reloadImage$1(this, null), 3, null);
    }

    private final void J1(CharSequence charSequence, String str) {
        TextView textView = this.k;
        TextView textView2 = null;
        if (textView == null) {
            zq3.z("mediaOverlayTitleTextView");
            textView = null;
        }
        textView.setText(str);
        TextView textView3 = this.l;
        if (textView3 == null) {
            zq3.z("mediaOverlayBodyTextView");
            textView3 = null;
        }
        textView3.setText(charSequence);
        TextView textView4 = this.k;
        if (textView4 == null) {
            zq3.z("mediaOverlayTitleTextView");
            textView4 = null;
        }
        textView4.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        TextView textView5 = this.l;
        if (textView5 == null) {
            zq3.z("mediaOverlayBodyTextView");
        } else {
            textView2 = textView5;
        }
        textView2.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(Asset asset) {
        String y1 = y1(asset);
        Image w1 = w1(asset);
        J1(t1(w1), y1);
        z1().a(FullscreenToolsController.SyncAction.SHOW);
        CompositeDisposable compositeDisposable = this.n;
        Single observeOn = v1(w1).observeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$updateInitialViewState$1
            {
                super(1);
            }

            public final void b(jg3 jg3Var) {
                FullScreenImageFragment.this.F1(jg3Var.a());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((jg3) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: lr2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullScreenImageFragment.L1(ss2.this, obj);
            }
        };
        final FullScreenImageFragment$updateInitialViewState$2 fullScreenImageFragment$updateInitialViewState$2 = new ss2() { // from class: com.nytimes.android.fragment.fullscreen.FullScreenImageFragment$updateInitialViewState$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                NYTLogger.g("Error loading image dimension.", new Object[0]);
            }
        };
        Disposable subscribe = observeOn.subscribe(consumer, new Consumer() { // from class: mr2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FullScreenImageFragment.M1(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(boolean z) {
        ValueAnimator ofFloat;
        ValueAnimator valueAnimator = this.m;
        ValueAnimator valueAnimator2 = null;
        if (valueAnimator == null) {
            zq3.z("animator");
            valueAnimator = null;
        }
        valueAnimator.cancel();
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            zq3.z("mediaOverlayViewGroup");
            viewGroup = null;
        }
        float alpha = viewGroup.getAlpha();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(alpha, 1.0f);
            zq3.e(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(alpha, 0.0f);
            zq3.e(ofFloat);
        }
        this.m = ofFloat;
        if (ofFloat == null) {
            zq3.z("animator");
            ofFloat = null;
        }
        ofFloat.setDuration(this.r);
        ValueAnimator valueAnimator3 = this.m;
        if (valueAnimator3 == null) {
            zq3.z("animator");
            valueAnimator3 = null;
        }
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nr2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                FullScreenImageFragment.s1(FullScreenImageFragment.this, valueAnimator4);
            }
        });
        ValueAnimator valueAnimator4 = this.m;
        if (valueAnimator4 == null) {
            zq3.z("animator");
        } else {
            valueAnimator2 = valueAnimator4;
        }
        valueAnimator2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s1(FullScreenImageFragment fullScreenImageFragment, ValueAnimator valueAnimator) {
        zq3.h(fullScreenImageFragment, "this$0");
        zq3.h(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        zq3.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ViewGroup viewGroup = fullScreenImageFragment.i;
        if (viewGroup == null) {
            zq3.z("mediaOverlayViewGroup");
            viewGroup = null;
        }
        viewGroup.setAlpha(floatValue);
    }

    private final CharSequence t1(Image image) {
        Caption caption = image.getCaption();
        if (caption == null || caption.getShouldHideCaption()) {
            return null;
        }
        String full = caption.getFull();
        if (TextUtils.isEmpty(image.getCredit())) {
            return full;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(image.getCredit());
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        fp2.c(requireContext, spannableStringBuilder, tm6.TextView_FullscreenMedia_Credit, 0, spannableStringBuilder.length());
        return TextUtils.isEmpty(full) ? spannableStringBuilder : TextUtils.concat(full, " ", spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single v1(Image image) {
        return u1().c(ImageCropConfig.FS_SLIDESHOW, image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image w1(Asset asset) {
        Image image;
        List<Image> slides;
        if (asset instanceof ImageAsset) {
            image = ((ImageAsset) asset).getImage();
        } else if (asset instanceof SlideshowAsset) {
            Slideshow slideshow = ((SlideshowAsset) asset).getSlideshow();
            if (slideshow != null && (slides = slideshow.getSlides()) != null) {
                image = slides.get(A1().g().g());
            }
            image = null;
        } else {
            ImageAsset mediaImage = asset.getMediaImage();
            if (mediaImage != null) {
                image = mediaImage.getImage();
            }
            image = null;
        }
        zq3.e(image);
        return image;
    }

    private final String y1(Asset asset) {
        SlideshowAsset slideshowAsset = asset instanceof SlideshowAsset ? (SlideshowAsset) asset : null;
        String displayTitle = slideshowAsset != null ? slideshowAsset.getDisplayTitle() : null;
        return displayTitle == null ? "" : displayTitle;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ImageViewTouch imageViewTouch = this.h;
        if (imageViewTouch == null) {
            zq3.z("imageView");
            imageViewTouch = null;
        }
        imageViewTouch.setSingleTapListener(new ImageViewTouch.c() { // from class: hr2
            @Override // it.sephiroth.android.library.imagezoom.ImageViewTouch.c
            public final void a() {
                FullScreenImageFragment.G1(FullScreenImageFragment.this);
            }
        });
        View view = this.g;
        if (view == null) {
            zq3.z("rootView");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: ir2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FullScreenImageFragment.H1(FullScreenImageFragment.this, view2);
            }
        });
        if (getArguments() == null) {
            NYTLogger.A("Failed to display image, No arguments for fragment", new Object[0]);
            c1(nk6.unable_to_display_image);
        } else {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new FullScreenImageFragment$onActivityCreated$3(this, null), 3, null);
            C1();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        zq3.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        I1();
        CollapsibleLayout collapsibleLayout = this.j;
        if (collapsibleLayout == null) {
            zq3.z("mediaOverlayLayout");
            collapsibleLayout = null;
        }
        Context context = getContext();
        collapsibleLayout.setLayoutParams(new FrameLayout.LayoutParams(context != null ? DeviceUtils.p(context) : 0, -2, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.r = getResources().getInteger(ph6.fullscreen_media_animation_duration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        zq3.h(menu, "menu");
        zq3.h(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(bj6.fullscreen_image, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(ei6.fragment_full_screen_image, viewGroup, false);
        zq3.g(inflate, "inflate(...)");
        this.g = inflate;
        if (inflate == null) {
            zq3.z("rootView");
            inflate = null;
        }
        View findViewById = inflate.findViewById(ng6.imageView);
        zq3.g(findViewById, "findViewById(...)");
        this.h = (ImageViewTouch) findViewById;
        View findViewById2 = inflate.findViewById(ng6.media_overlay);
        zq3.g(findViewById2, "findViewById(...)");
        this.i = (ViewGroup) findViewById2;
        View findViewById3 = inflate.findViewById(ng6.media_overlay_layout);
        zq3.g(findViewById3, "findViewById(...)");
        this.j = (CollapsibleLayout) findViewById3;
        View findViewById4 = inflate.findViewById(ng6.media_overlay_body);
        zq3.g(findViewById4, "findViewById(...)");
        this.l = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(ng6.media_overlay_title);
        zq3.g(findViewById5, "findViewById(...)");
        this.k = (TextView) findViewById5;
        View view = this.g;
        if (view != null) {
            return view;
        }
        zq3.z("rootView");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.n.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        CollapsibleLayout collapsibleLayout = this.j;
        if (collapsibleLayout == null) {
            zq3.z("mediaOverlayLayout");
            collapsibleLayout = null;
        }
        collapsibleLayout.unregisterViewTreeObserver();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == ng6.refresh_video) {
            I1();
            return true;
        }
        if (itemId != ng6.action_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        B1();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        f activity;
        super.onStart();
        if (getParentFragment() != null || (activity = getActivity()) == null) {
            return;
        }
        activity.setTitle((CharSequence) null);
    }

    public final ImageCropper u1() {
        ImageCropper imageCropper = this.imageCropper;
        if (imageCropper != null) {
            return imageCropper;
        }
        zq3.z("imageCropper");
        return null;
    }

    public final b04 x1() {
        b04 b04Var = this.sharingManager;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    public final FullscreenToolsController z1() {
        FullscreenToolsController fullscreenToolsController = this.toolsController;
        if (fullscreenToolsController != null) {
            return fullscreenToolsController;
        }
        zq3.z("toolsController");
        return null;
    }
}
