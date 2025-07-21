package com.nytimes.android.ads.model;

import defpackage.b22;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ContentType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final ContentType ARTICLE = new ContentType("ARTICLE", 0, "art");
    public static final ContentType SLIDESHOW = new ContentType("SLIDESHOW", 1, "ss");
    public static final ContentType INTERACTIVE = new ContentType("INTERACTIVE", 2, "int");
    public static final ContentType BLOG = new ContentType("BLOG", 3, "bl");
    public static final ContentType SECTION = new ContentType("SECTION", 4, "sf");
    public static final ContentType FOR_YOU = new ContentType("FOR_YOU", 5, "fy");
    public static final ContentType SECTION_HOMEPAGE = new ContentType("SECTION_HOMEPAGE", 6, "hp");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            if (r1.equals(com.nytimes.android.api.cms.AssetConstants.VIDEO_TYPE) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r1.equals(com.nytimes.android.api.cms.AssetConstants.ARTICLE_TYPE) != false) goto L24;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a(com.nytimes.android.api.cms.Asset r2) {
            /*
                r1 = this;
                java.lang.String r1 = "<this>"
                defpackage.zq3.h(r2, r1)
                java.lang.String r1 = r2.getAssetType()
                if (r1 == 0) goto L67
                int r0 = r1.hashCode()
                switch(r0) {
                    case -732377866: goto L4c;
                    case -660723902: goto L3c;
                    case -542673043: goto L2c;
                    case 112202875: goto L23;
                    case 899908915: goto L13;
                    default: goto L12;
                }
            L12:
                goto L67
            L13:
                java.lang.String r2 = "imageslideshow"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1c
                goto L67
            L1c:
                com.nytimes.android.ads.model.ContentType r1 = com.nytimes.android.ads.model.ContentType.SLIDESHOW
                java.lang.String r1 = r1.getValue()
                goto L6d
            L23:
                java.lang.String r0 = "video"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L54
                goto L67
            L2c:
                java.lang.String r2 = "interactivegraphics"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L35
                goto L67
            L35:
                com.nytimes.android.ads.model.ContentType r1 = com.nytimes.android.ads.model.ContentType.INTERACTIVE
                java.lang.String r1 = r1.getValue()
                goto L6d
            L3c:
                java.lang.String r2 = "blogpost"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L45
                goto L67
            L45:
                com.nytimes.android.ads.model.ContentType r1 = com.nytimes.android.ads.model.ContentType.BLOG
                java.lang.String r1 = r1.getValue()
                goto L6d
            L4c:
                java.lang.String r0 = "article"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L67
            L54:
                com.nytimes.android.api.cms.DfpAssetMetaData r1 = r2.getDfp()
                if (r1 == 0) goto L60
                java.lang.String r1 = r1.getTyp()
                if (r1 != 0) goto L6d
            L60:
                com.nytimes.android.ads.model.ContentType r1 = com.nytimes.android.ads.model.ContentType.ARTICLE
                java.lang.String r1 = r1.getValue()
                goto L6d
            L67:
                com.nytimes.android.ads.model.ContentType r1 = com.nytimes.android.ads.model.ContentType.SECTION
                java.lang.String r1 = r1.getValue()
            L6d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.model.ContentType.a.a(com.nytimes.android.api.cms.Asset):java.lang.String");
        }

        private a() {
        }
    }

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{ARTICLE, SLIDESHOW, INTERACTIVE, BLOG, SECTION, FOR_YOU, SECTION_HOMEPAGE};
    }

    static {
        ContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private ContentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
