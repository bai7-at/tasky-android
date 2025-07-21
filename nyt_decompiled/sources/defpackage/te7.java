package defpackage;

import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.features.discovery.discoverytab.data.CarouselAsset;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class te7 {
    public static final a Companion = new a(null);
    private static final fa3 a = vs1.a(fb5.a.b());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final k59 a(Set set, String str, String str2, List list, boolean z, boolean z2, String str3, String str4) {
        return z2 ? c(set, str, list, str2, str3, str4, z) : d(set, str, list, str2, str3, str4, z);
    }

    private final k59 c(Set set, String str, List list, String str2, String str3, String str4, boolean z) {
        l59 l59Var = new l59(i.e(new yh7(str2, new StyledText(str, NytTextStyle.LABEL_BLOCKTITLE, false, 4, (DefaultConstructorMarker) null), null, 4, null)), null, 2, null);
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            CarouselAsset carouselAsset = (CarouselAsset) obj;
            arrayList.add(new da3(carouselAsset.h(), carouselAsset.i(), carouselAsset.e(), new StyledText(carouselAsset.f(), NytTextStyle.HEADLINE_NEUTRAL_SMALL, set.contains(carouselAsset.g())), i, "Carousel." + str2, str));
            i = i2;
        }
        ea3 ea3Var = new ea3(arrayList, null, 16.0f, 2, 2, null);
        String upperCase = ("More in " + str).toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        return new k59(i.o(l59Var, ea3Var, new l59(i.e(new uv4(str3, str4, new StyledText(upperCase, NytTextStyle.UTILITY_BOLD_SMALL, false, 4, (DefaultConstructorMarker) null), str, str2, z)), null, 2, null)), null, str, 2, null);
    }

    private final k59 d(Set set, String str, List list, String str2, String str3, String str4, boolean z) {
        l59 l59Var = new l59(i.e(new yh7(str2, new StyledText(str, NytTextStyle.LABEL_BLOCKTITLE, false, 4, (DefaultConstructorMarker) null), null, 4, null)), null, 2, null);
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            CarouselAsset carouselAsset = (CarouselAsset) obj;
            arrayList.add(new h59(carouselAsset.h(), carouselAsset.i(), carouselAsset.b(), new StyledText(carouselAsset.f(), NytTextStyle.HEADLINE_NEUTRAL_SMALL, set.contains(carouselAsset.g())), carouselAsset.d(), carouselAsset.a(), i, "Carousel." + str2, str));
            i = i2;
        }
        return new k59(i.o(l59Var, new ea3(i.G0(arrayList, new di7(str3, str4, new StyledText("See more of our " + str + " stories", NytTextStyle.UTILITY_BOLD_SMALL, false, 4, (DefaultConstructorMarker) null), str, str2, z)), null, 16.0f, 1, 2, null)), null, str, 2, null);
    }

    public final List b(Set set, String str, String str2, List list, boolean z, boolean z2, String str3, String str4) {
        zq3.h(set, "viewed");
        zq3.h(str, "title");
        zq3.h(str2, "sectionName");
        zq3.h(list, "assets");
        zq3.h(str3, "sectionUrl");
        zq3.h(str4, "sectionUri");
        return i.o(a(set, str, str2, list, z, z2, str3, str4), a);
    }
}
