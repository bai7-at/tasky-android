package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.common.collect.ImmutableMap;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class qf7 {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private ImmutableMap h;

    public int a(SectionAdapterItemType sectionAdapterItemType) {
        if (this.h.containsKey(sectionAdapterItemType)) {
            return ((Integer) this.h.get(sectionAdapterItemType)).intValue();
        }
        return 0;
    }

    public void b(Context context, int i) {
        int[] iArr = qn6.SectionFrontLayoutConfig;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        ImmutableMap.a aVar = new ImmutableMap.a();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == mc6.supportLedeLiveResult) {
                this.e = obtainStyledAttributes.getBoolean(i2, false);
            } else if (i3 == mc6.supportPhotospot) {
                this.f = obtainStyledAttributes.getBoolean(i2, false);
            } else if (i3 == mc6.showInlineAd) {
                this.d = obtainStyledAttributes.getBoolean(i2, false);
            } else if (i3 == mc6.isOrderedSection) {
                this.g = obtainStyledAttributes.getBoolean(i2, false);
            } else if (i3 == mc6.inlineAdIndex) {
                this.c = obtainStyledAttributes.getInt(i2, -1);
            } else if (i3 == mc6.photospotIndex) {
                this.b = obtainStyledAttributes.getInt(i2, -1);
            } else if (i3 == mc6.numColumns) {
                this.a = obtainStyledAttributes.getInt(i2, -1);
            } else if (i3 == mc6.articleSpan) {
                aVar.f(SectionAdapterItemType.ARTICLE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.adSpan) {
                int i4 = obtainStyledAttributes.getInt(i2, -1);
                aVar.f(SectionAdapterItemType.AD_MODULE, Integer.valueOf(i4));
                aVar.f(SectionAdapterItemType.FLEX_FRAME_AD, Integer.valueOf(i4));
            } else if (i3 == mc6.dailyBriefingSpan) {
                aVar.f(SectionAdapterItemType.DAILY_BRIEFING, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.saveGetMoreSpan) {
                aVar.f(SectionAdapterItemType.SAVED_GET_MORE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.photoSpotSpan) {
                aVar.f(SectionAdapterItemType.PHOTOSPOT, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.ledeHorizontalImageSpan) {
                aVar.f(SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.ledeVerticalImageSpan) {
                aVar.f(SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.ledePackageHorizontalImageSpan) {
                aVar.f(SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.ledePackageVerticalImageSpan) {
                aVar.f(SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.audioSpan) {
                aVar.f(SectionAdapterItemType.AUDIO, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else if (i3 == mc6.videoSpan) {
                aVar.f(SectionAdapterItemType.VIDEO, Integer.valueOf(obtainStyledAttributes.getInt(i2, -1)));
            } else {
                NYTLogger.A("Unknow Attribute: " + obtainStyledAttributes.peekValue(i2).toString(), new Object[0]);
            }
        }
        obtainStyledAttributes.recycle();
        this.h = aVar.a();
    }

    public boolean c() {
        return this.a == 1;
    }
}
