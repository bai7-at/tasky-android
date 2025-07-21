package com.nytimes.android.fragment.fullscreen;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ads.slideshow.SlideshowAdsViewModel;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.Slideshow;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.fragment.AssetArgs;
import defpackage.b22;
import defpackage.d8;
import defpackage.k12;
import defpackage.ru7;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class SlideshowPagerAdapter extends p {
    private final SlideshowAdsViewModel j;
    private final SlideshowAsset k;
    private final List l;
    private final Set m;
    private final String n;
    private final ArrayList o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SlideshowSlotType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ SlideshowSlotType[] $VALUES;
        public static final SlideshowSlotType IMAGE = new SlideshowSlotType("IMAGE", 0);
        public static final SlideshowSlotType AD = new SlideshowSlotType("AD", 1);

        private static final /* synthetic */ SlideshowSlotType[] $values() {
            return new SlideshowSlotType[]{IMAGE, AD};
        }

        static {
            SlideshowSlotType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SlideshowSlotType(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static SlideshowSlotType valueOf(String str) {
            return (SlideshowSlotType) Enum.valueOf(SlideshowSlotType.class, str);
        }

        public static SlideshowSlotType[] values() {
            return (SlideshowSlotType[]) $VALUES.clone();
        }
    }

    public static final class a {
        private final SlideshowSlotType a;
        private final int b;

        public a(SlideshowSlotType slideshowSlotType, int i) {
            zq3.h(slideshowSlotType, TransferTable.COLUMN_TYPE);
            this.a = slideshowSlotType;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final SlideshowSlotType b() {
            return this.a;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SlideshowSlotType.values().length];
            try {
                iArr[SlideshowSlotType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlideshowSlotType.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideshowPagerAdapter(FragmentManager fragmentManager, SlideshowAdsViewModel slideshowAdsViewModel, SlideshowAsset slideshowAsset) {
        super(fragmentManager);
        List<Image> slides;
        zq3.h(fragmentManager, "manager");
        zq3.h(slideshowAdsViewModel, "adsViewModel");
        zq3.h(slideshowAsset, "slideshowAsset");
        this.j = slideshowAdsViewModel;
        this.k = slideshowAsset;
        this.m = new HashSet();
        this.n = slideshowAsset.getSafeUri();
        Slideshow slideshow = slideshowAsset.getSlideshow();
        this.l = (slideshow == null || (slides = slideshow.getSlides()) == null) ? i.l() : slides;
        this.o = r();
    }

    private final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        int size = this.l.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.m(i2)) {
                arrayList.add(new a(SlideshowSlotType.AD, i));
                i++;
            }
            arrayList.add(new a(SlideshowSlotType.IMAGE, i2));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.p, androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        zq3.h(viewGroup, "container");
        zq3.h(obj, "obj");
        if (obj instanceof FullScreenImageFragment) {
            this.m.remove(obj);
        }
        super.a(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.a
    public int c() {
        return this.o.size() + 1;
    }

    @Override // androidx.fragment.app.p
    public Fragment m(int i) {
        if (t(i)) {
            return new k12();
        }
        Object obj = this.o.get(i);
        zq3.g(obj, "get(...)");
        a aVar = (a) obj;
        if (aVar.b() == SlideshowSlotType.AD) {
            FullscreenAdFragment a2 = FullscreenAdFragment.Companion.a(aVar.a());
            this.m.add(a2);
            return a2;
        }
        FullScreenImageFragment a3 = FullScreenImageFragment.Companion.a(new AssetArgs(this.n, null, null, null, aVar.a(), null, false, false, false, false, null, 2030, null));
        this.m.add(a3);
        return a3;
    }

    public final Integer p(int i) {
        a aVar = (a) this.o.get(i);
        int i2 = b.a[aVar.b().ordinal()];
        if (i2 == 1) {
            return Integer.valueOf(aVar.a());
        }
        if (i2 == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int q() {
        return this.l.size();
    }

    public final boolean s(int i) {
        Object obj = this.o.get(i);
        zq3.g(obj, "get(...)");
        if (((a) obj).b() == SlideshowSlotType.AD) {
            return ((ru7) this.j.i().getValue()).a() instanceof d8.c;
        }
        return false;
    }

    public final boolean t(int i) {
        return this.o.size() == i;
    }

    public final void u(int i, Fragment fragment) {
        zq3.h(fragment, "fragment");
        ET2CoroutineScopeKt.d(fragment, new SlideshowPagerAdapter$reportEt2SlideShowEvent$1(this, i, null));
    }
}
