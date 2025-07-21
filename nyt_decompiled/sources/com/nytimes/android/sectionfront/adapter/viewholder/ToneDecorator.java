package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.nytimes.android.api.cms.SectionFront;
import defpackage.b22;
import defpackage.m07;
import defpackage.um6;
import defpackage.un6;
import defpackage.zq3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ToneDecorator {
    public static final ToneDecorator a = new ToneDecorator();
    private static ImmutableMap b;
    private static ImmutableMap c;
    public static final int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class SectionCatalog {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ SectionCatalog[] $VALUES;
        private final String sectionKey;
        private final String toneName;
        public static final SectionCatalog TOP_STORIES = new SectionCatalog("TOP_STORIES", 0, "homepage", "NEWS");
        public static final SectionCatalog ARTS = new SectionCatalog("ARTS", 1, "arts", "FEATURE");
        public static final SectionCatalog FASHION = new SectionCatalog("FASHION", 2, "fashion", "FEATURE");
        public static final SectionCatalog BOOKS = new SectionCatalog("BOOKS", 3, "books", "FEATURE");
        public static final SectionCatalog MOVIES = new SectionCatalog("MOVIES", 4, "movies", "FEATURE");
        public static final SectionCatalog THEATER = new SectionCatalog("THEATER", 5, "theater", "FEATURE");
        public static final SectionCatalog T_MAGAZINE = new SectionCatalog("T_MAGAZINE", 6, "feeds.t-magazine", "FEATURE");
        public static final SectionCatalog FOOD = new SectionCatalog("FOOD", 7, "dining", "FEATURE");
        public static final SectionCatalog HOME_GARDEN = new SectionCatalog("HOME_GARDEN", 8, "garden", "FEATURE");
        public static final SectionCatalog WEDDINGS = new SectionCatalog("WEDDINGS", 9, "fashion.weddings", "FEATURE");
        public static final SectionCatalog TRAVEL = new SectionCatalog("TRAVEL", 10, "travel", "FEATURE");
        public static final SectionCatalog REAL_ESTATE = new SectionCatalog("REAL_ESTATE", 11, "realestate", "FEATURE");
        public static final SectionCatalog AUTOMOBILES = new SectionCatalog("AUTOMOBILES", 12, "automobiles", "FEATURE");
        public static final SectionCatalog INSIDER = new SectionCatalog("INSIDER", 13, "insider", "FEATURE");
        public static final SectionCatalog OPINION = new SectionCatalog("OPINION", 14, "opinion", "OPINION");
        public static final SectionCatalog SUNDAY_REVIEW = new SectionCatalog("SUNDAY_REVIEW", 15, "feeds.sunday-review", "OPINION");
        public static final SectionCatalog MAGAZINE = new SectionCatalog("MAGAZINE", 16, "magazine", "MAGAZINE");

        private static final /* synthetic */ SectionCatalog[] $values() {
            return new SectionCatalog[]{TOP_STORIES, ARTS, FASHION, BOOKS, MOVIES, THEATER, T_MAGAZINE, FOOD, HOME_GARDEN, WEDDINGS, TRAVEL, REAL_ESTATE, AUTOMOBILES, INSIDER, OPINION, SUNDAY_REVIEW, MAGAZINE};
        }

        static {
            SectionCatalog[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SectionCatalog(String str, int i, String str2, String str3) {
            this.sectionKey = str2;
            this.toneName = str3;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static SectionCatalog valueOf(String str) {
            return (SectionCatalog) Enum.valueOf(SectionCatalog.class, str);
        }

        public static SectionCatalog[] values() {
            return (SectionCatalog[]) $VALUES.clone();
        }

        public final String getSectionKey() {
            return this.sectionKey;
        }

        public final String getToneName() {
            return this.toneName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class ToneCatalog {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ToneCatalog[] $VALUES;
        public static final ToneCatalog AF_DEFAULT;
        public static final ToneCatalog AF_FEATURE;
        public static final ToneCatalog AF_MAGAZINE;
        public static final ToneCatalog AF_NEWS;
        public static final ToneCatalog AF_OPINION;
        public static final ToneCatalog SFL_DEFAULT;
        public static final ToneCatalog SFL_FEATURE;
        public static final ToneCatalog SFL_MAGAZINE;
        public static final ToneCatalog SFL_NEWS;
        public static final ToneCatalog SFL_OPINION;
        public static final ToneCatalog SF_DEFAULT;
        public static final ToneCatalog SF_FEATURE;
        public static final ToneCatalog SF_MAGAZINE;
        public static final ToneCatalog SF_NEWS;
        public static final ToneCatalog SF_OPINION;
        private final ToneLayout layout;
        private final int style;
        private final String toneName;

        private static final /* synthetic */ ToneCatalog[] $values() {
            return new ToneCatalog[]{SF_NEWS, SF_MAGAZINE, SF_OPINION, SF_FEATURE, SF_DEFAULT, SFL_NEWS, SFL_MAGAZINE, SFL_OPINION, SFL_FEATURE, SFL_DEFAULT, AF_NEWS, AF_MAGAZINE, AF_OPINION, AF_FEATURE, AF_DEFAULT};
        }

        static {
            ToneLayout toneLayout = ToneLayout.SECTION_FRONT;
            SF_NEWS = new ToneCatalog("SF_NEWS", 0, toneLayout, "NEWS", um6.Tone_SectionFront_News);
            SF_MAGAZINE = new ToneCatalog("SF_MAGAZINE", 1, toneLayout, "MAGAZINE", um6.Tone_SectionFront_Magazine);
            SF_OPINION = new ToneCatalog("SF_OPINION", 2, toneLayout, "OPINION", um6.Tone_SectionFront_Opinion);
            SF_FEATURE = new ToneCatalog("SF_FEATURE", 3, toneLayout, "FEATURE", um6.Tone_SectionFront_Feature);
            SF_DEFAULT = new ToneCatalog("SF_DEFAULT", 4, toneLayout, "DEFAULT", um6.Tone_SectionFront_Default);
            ToneLayout toneLayout2 = ToneLayout.SECTION_FRONT_LEDE;
            SFL_NEWS = new ToneCatalog("SFL_NEWS", 5, toneLayout2, "NEWS", um6.Tone_SectionFrontLede_News);
            SFL_MAGAZINE = new ToneCatalog("SFL_MAGAZINE", 6, toneLayout2, "MAGAZINE", um6.Tone_SectionFrontLede_Magazine);
            SFL_OPINION = new ToneCatalog("SFL_OPINION", 7, toneLayout2, "OPINION", um6.Tone_SectionFrontLede_Opinion);
            SFL_FEATURE = new ToneCatalog("SFL_FEATURE", 8, toneLayout2, "FEATURE", um6.Tone_SectionFrontLede_Feature);
            SFL_DEFAULT = new ToneCatalog("SFL_DEFAULT", 9, toneLayout2, "DEFAULT", um6.Tone_SectionFrontLede_Default);
            ToneLayout toneLayout3 = ToneLayout.ARTICLE_FRONT;
            AF_NEWS = new ToneCatalog("AF_NEWS", 10, toneLayout3, "NEWS", um6.Tone_ArticleFront_News);
            AF_MAGAZINE = new ToneCatalog("AF_MAGAZINE", 11, toneLayout3, "MAGAZINE", um6.Tone_ArticleFront_Magazine);
            AF_OPINION = new ToneCatalog("AF_OPINION", 12, toneLayout3, "OPINION", um6.Tone_ArticleFront_Opinion);
            AF_FEATURE = new ToneCatalog("AF_FEATURE", 13, toneLayout3, "FEATURE", um6.Tone_ArticleFront_Feature);
            AF_DEFAULT = new ToneCatalog("AF_DEFAULT", 14, toneLayout3, "DEFAULT", um6.Tone_ArticleFront_Default);
            ToneCatalog[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ToneCatalog(String str, int i, ToneLayout toneLayout, String str2, int i2) {
            this.layout = toneLayout;
            this.toneName = str2;
            this.style = i2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ToneCatalog valueOf(String str) {
            return (ToneCatalog) Enum.valueOf(ToneCatalog.class, str);
        }

        public static ToneCatalog[] values() {
            return (ToneCatalog[]) $VALUES.clone();
        }

        public final ToneLayout getLayout() {
            return this.layout;
        }

        public final int getStyle() {
            return this.style;
        }

        public final String getToneName() {
            return this.toneName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ToneLayout {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ToneLayout[] $VALUES;
        public static final ToneLayout SECTION_FRONT = new ToneLayout("SECTION_FRONT", 0);
        public static final ToneLayout SECTION_FRONT_LEDE = new ToneLayout("SECTION_FRONT_LEDE", 1);
        public static final ToneLayout ARTICLE_FRONT = new ToneLayout("ARTICLE_FRONT", 2);

        private static final /* synthetic */ ToneLayout[] $values() {
            return new ToneLayout[]{SECTION_FRONT, SECTION_FRONT_LEDE, ARTICLE_FRONT};
        }

        static {
            ToneLayout[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ToneLayout(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ToneLayout valueOf(String str) {
            return (ToneLayout) Enum.valueOf(ToneLayout.class, str);
        }

        public static ToneLayout[] values() {
            return (ToneLayout[]) $VALUES.clone();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        for (ToneCatalog toneCatalog : ToneCatalog.values()) {
            Map map = (Map) hashMap.get(toneCatalog.getLayout());
            if (map == null) {
                map = new HashMap();
                hashMap.put(toneCatalog.getLayout(), map);
            }
            map.put(toneCatalog.getToneName(), toneCatalog);
        }
        b = ImmutableMap.f(hashMap);
        HashMap hashMap2 = new HashMap();
        for (SectionCatalog sectionCatalog : SectionCatalog.values()) {
            hashMap2.put(sectionCatalog.getSectionKey(), sectionCatalog.getToneName());
        }
        c = ImmutableMap.f(hashMap2);
        d = 8;
    }

    private ToneDecorator() {
    }

    private final String a(String str) {
        if (str == null) {
            return "DEFAULT";
        }
        Locale locale = Locale.ENGLISH;
        zq3.g(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        ImmutableMap immutableMap = c;
        zq3.e(immutableMap);
        if (!immutableMap.containsKey(lowerCase)) {
            return "DEFAULT";
        }
        ImmutableMap immutableMap2 = c;
        zq3.e(immutableMap2);
        return (String) immutableMap2.get(lowerCase);
    }

    public static final void b(Context context, int i, TextView textView) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        zq3.h(context, "context");
        zq3.h(textView, "headlineView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, un6.CustomFontTextView);
        zq3.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes.hasValue(un6.CustomFontTextView_android_fontFamily)) {
            Typeface g = m07.g(context.getApplicationContext(), obtainStyledAttributes.getResourceId(un6.CustomFontTextView_android_fontFamily, -1));
            if (g != null) {
                textView.setTypeface(g);
            }
        }
        if (obtainStyledAttributes.hasValue(un6.CustomFontTextView_lineHeight) && (dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(un6.CustomFontTextView_lineHeight, -1)) != -1) {
            textView.setLineHeight(dimensionPixelSize2);
        }
        if (obtainStyledAttributes.hasValue(un6.CustomFontTextView_android_textSize) && (dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(un6.CustomFontTextView_android_textSize, -1)) != -1) {
            textView.setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public static final void c(Context context, SectionFront sectionFront, ToneLayout toneLayout, TextView textView) {
        zq3.h(context, "context");
        zq3.h(toneLayout, "layout");
        zq3.h(textView, "headlineView");
        ToneDecorator toneDecorator = a;
        toneDecorator.d(context, sectionFront == null ? null : toneDecorator.a(sectionFront.getName()), toneLayout, textView);
    }

    private final ToneCatalog e(ToneLayout toneLayout, String str) {
        ImmutableMap immutableMap = b;
        zq3.e(immutableMap);
        Map map = (Map) immutableMap.get(toneLayout);
        if (map == null) {
            throw new IllegalStateException("Missing layout: " + toneLayout);
        }
        if (str != null) {
            Locale locale = Locale.getDefault();
            zq3.g(locale, "getDefault(...)");
            str = str.toUpperCase(locale);
            zq3.g(str, "toUpperCase(...)");
        }
        if (str == null || !map.containsKey(str)) {
            str = "DEFAULT";
        }
        return (ToneCatalog) map.get(str);
    }

    public final void d(Context context, String str, ToneLayout toneLayout, TextView textView) {
        zq3.h(context, "context");
        zq3.h(toneLayout, "layout");
        zq3.h(textView, "headlineView");
        ToneCatalog e = e(toneLayout, str);
        zq3.e(e);
        b(context, e.getStyle(), textView);
    }
}
