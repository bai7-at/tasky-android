package com.nytimes.android.ribbon.config;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.ribbon.tpl.XPNBrandColor;
import defpackage.b22;
import defpackage.gt2;
import defpackage.zq3;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RibbonConfig {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RibbonConfig[] $VALUES;
    public static final RibbonConfig BEST_OF;
    public static final a Companion;
    public static final RibbonConfig ELECTION;
    public static final RibbonConfig GREAT_READS;
    public static final RibbonConfig LIFESTYLE;
    public static final RibbonConfig OPINION;
    public static final RibbonConfig SECTIONS;
    public static final RibbonConfig TODAY;
    public static final RibbonConfig TRENDING;
    private final gt2 brandColor;
    private final String id;
    public static final RibbonConfig GAMES = new RibbonConfig("GAMES", 0, "games", XPNBrandColor.GAMES.getColor());
    public static final RibbonConfig AUDIO = new RibbonConfig("AUDIO", 1, AssetConstants.AUDIO_TYPE, XPNBrandColor.AUDIO.getColor());
    public static final RibbonConfig WIRECUTTER = new RibbonConfig("WIRECUTTER", 2, "wirecutter", XPNBrandColor.WIRECUTTER.getColor());
    public static final RibbonConfig COOKING = new RibbonConfig("COOKING", 3, "cooking", XPNBrandColor.COOKING.getColor());
    public static final RibbonConfig THE_ATHLETIC = new RibbonConfig("THE_ATHLETIC", 4, "the_athletic", XPNBrandColor.THE_ATHLETIC.getColor());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RibbonConfig a(String str) {
            RibbonConfig[] values = RibbonConfig.values();
            int length = values.length;
            int i = 0;
            while (true) {
                String str2 = null;
                if (i >= length) {
                    return null;
                }
                RibbonConfig ribbonConfig = values[i];
                String id = ribbonConfig.getId();
                Locale locale = Locale.ROOT;
                String lowerCase = id.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                if (str != null) {
                    str2 = str.toLowerCase(locale);
                    zq3.g(str2, "toLowerCase(...)");
                }
                if (zq3.c(lowerCase, str2)) {
                    return ribbonConfig;
                }
                i++;
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ RibbonConfig[] $values() {
        return new RibbonConfig[]{GAMES, AUDIO, WIRECUTTER, COOKING, THE_ATHLETIC, TODAY, ELECTION, BEST_OF, TRENDING, GREAT_READS, OPINION, LIFESTYLE, SECTIONS};
    }

    static {
        XPNBrandColor xPNBrandColor = XPNBrandColor.NEWS;
        TODAY = new RibbonConfig("TODAY", 5, "today", xPNBrandColor.getColor());
        ELECTION = new RibbonConfig("ELECTION", 6, "election", xPNBrandColor.getColor());
        BEST_OF = new RibbonConfig("BEST_OF", 7, "best_of", xPNBrandColor.getColor());
        TRENDING = new RibbonConfig("TRENDING", 8, "trending", xPNBrandColor.getColor());
        GREAT_READS = new RibbonConfig("GREAT_READS", 9, "great_reads", xPNBrandColor.getColor());
        OPINION = new RibbonConfig("OPINION", 10, "opinion", xPNBrandColor.getColor());
        LIFESTYLE = new RibbonConfig("LIFESTYLE", 11, "lifestyle", xPNBrandColor.getColor());
        SECTIONS = new RibbonConfig("SECTIONS", 12, "sections", xPNBrandColor.getColor());
        RibbonConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private RibbonConfig(String str, int i, String str2, gt2 gt2Var) {
        this.id = str2;
        this.brandColor = gt2Var;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RibbonConfig valueOf(String str) {
        return (RibbonConfig) Enum.valueOf(RibbonConfig.class, str);
    }

    public static RibbonConfig[] values() {
        return (RibbonConfig[]) $VALUES.clone();
    }

    public final gt2 getBrandColor() {
        return this.brandColor;
    }

    public final String getEt2Name() {
        String lowerCase = this.id.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.F(lowerCase, QueryKeys.END_MARKER, " ", false, 4, null);
    }

    public final String getId() {
        return this.id;
    }
}
