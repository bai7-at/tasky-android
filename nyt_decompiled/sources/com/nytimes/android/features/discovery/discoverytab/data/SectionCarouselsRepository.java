package com.nytimes.android.features.discovery.discoverytab.data;

import android.content.SharedPreferences;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import defpackage.b05;
import defpackage.he0;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class SectionCarouselsRepository {
    private final b05 a;
    private final SectionCarouselsDataFetcher b;
    private final File c;
    private final CachedParallelStore d;

    public SectionCarouselsRepository(SharedPreferences sharedPreferences, b05 b05Var, SectionCarouselsDataFetcher sectionCarouselsDataFetcher, File file) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(b05Var, "clock");
        zq3.h(sectionCarouselsDataFetcher, "sectionCarouselsDataFetcher");
        zq3.h(file, "baseDir");
        this.a = b05Var;
        this.b = sectionCarouselsDataFetcher;
        this.c = file;
        this.d = new CachedParallelStore(sharedPreferences, new SectionCarouselsRepository$parallelStore$1(b05Var), file, "sectionsCache.json", he0.h(CarouselBlock.Companion.serializer()), new SectionCarouselsRepository$parallelStore$2(this, null), null, 0L, 192, null);
    }

    public final Flow b(ParallelDownloadStrategy parallelDownloadStrategy, List list) {
        zq3.h(parallelDownloadStrategy, "strategy");
        zq3.h(list, "carouselConfigs");
        return this.d.d(parallelDownloadStrategy, new SectionCarouselsRepository$loadCarousels$1(list, null), null);
    }
}
