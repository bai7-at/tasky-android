package com.nytimes.android.features.discovery.discoverytab.data;

import com.nytimes.android.api.cms.SectionUrlLink;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import defpackage.fa3;
import defpackage.fb5;
import defpackage.vs1;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SectionLinksRepository {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private static final NytTextStyle d = NytTextStyle.LABEL_BLOCKTITLE;
    private static final fa3 e = vs1.a(fb5.a.d());
    private static final List f = i.o("savedforlater", SectionUrlLink.NAME_RECENTLY_VIEWED, "us.politics", "nyregion", "sports", "upshot", "education", "technology", "dealbook", "science", "climate", "health", "well", "arts", "books", "movies", "arts.music", "podcasts", "arts.television", "theater", "feeds.sunday-review", "fashion", "feeds.t-magazine", "dining", "fashion.weddings", "travel", "magazine", "realestate", "parenting", "automobiles", "obituaries", "world.australia", "reader-center", "video.latestvideo", "learning");
    private static final List g = i.o("us.politics", "nyregion", "sports", "upshot", "education", "technology", "dealbook", "science", "climate", "health", "well", "arts", "books", "movies", "arts.music", "podcasts", "arts.television", "theater", "feeds.sunday-review", "fashion", "feeds.t-magazine", "dining", "fashion.weddings", "travel", "magazine", "realestate", "parenting", "automobiles", "obituaries", "world.australia", "reader-center", "video.latestvideo", "learning");
    private final com.nytimes.navigation.deeplink.a a;
    private final SectionFrontPersister b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return SectionLinksRepository.f;
        }

        public final List b() {
            return SectionLinksRepository.g;
        }

        private a() {
        }
    }

    public SectionLinksRepository(com.nytimes.navigation.deeplink.a aVar, SectionFrontPersister sectionFrontPersister) {
        zq3.h(aVar, "deepLinkChecker");
        zq3.h(sectionFrontPersister, "sectionFrontPersister");
        this.a = aVar;
        this.b = sectionFrontPersister;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00de -> B:10:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r26, java.util.List r27, java.util.List r28, defpackage.by0 r29) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.data.SectionLinksRepository.c(java.util.List, java.util.List, java.util.List, by0):java.lang.Object");
    }
}
