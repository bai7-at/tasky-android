package com.nytimes.android.ribbon.destinations;

import android.content.SharedPreferences;
import com.nytimes.android.api.cms.SectionQueryType;
import com.nytimes.android.api.config.model.RibbonTabEndpoint;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor;
import com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher;
import com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher;
import com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher;
import defpackage.a48;
import defpackage.b05;
import defpackage.by0;
import defpackage.eh7;
import defpackage.gt2;
import defpackage.si1;
import defpackage.ss2;
import defpackage.z24;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class DestinationAssetRepository {
    private final eh7 a;
    private final NewsletterFetcher b;
    private final ContentSearchExecutor c;
    private final z24 d;
    private final CookingCollectionRepository e;
    private final OpinionAssetFetcher f;
    private final GamesAssetFetcher g;
    private final File h;
    private final b05 i;
    private final SharedPreferences j;
    private final si1.a k;

    public DestinationAssetRepository(eh7 eh7Var, NewsletterFetcher newsletterFetcher, ContentSearchExecutor contentSearchExecutor, z24 z24Var, CookingCollectionRepository cookingCollectionRepository, OpinionAssetFetcher opinionAssetFetcher, GamesAssetFetcher gamesAssetFetcher, File file, b05 b05Var, SharedPreferences sharedPreferences, si1.a aVar) {
        zq3.h(eh7Var, "sectionFrontStore");
        zq3.h(newsletterFetcher, "newsletterFetcher");
        zq3.h(contentSearchExecutor, "searchExecutor");
        zq3.h(z24Var, "legacyCollectionRepository");
        zq3.h(cookingCollectionRepository, "cookingCollectionRepo");
        zq3.h(opinionAssetFetcher, "opinionAssetFetcher");
        zq3.h(gamesAssetFetcher, "gamesAssetFetcher");
        zq3.h(file, "baseDir");
        zq3.h(b05Var, "clock");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(aVar, "tracerBuilder");
        this.a = eh7Var;
        this.b = newsletterFetcher;
        this.c = contentSearchExecutor;
        this.d = z24Var;
        this.e = cookingCollectionRepository;
        this.f = opinionAssetFetcher;
        this.g = gamesAssetFetcher;
        this.h = file;
        this.i = b05Var;
        this.j = sharedPreferences;
        this.k = aVar;
    }

    public static /* synthetic */ Object e(DestinationAssetRepository destinationAssetRepository, String str, String str2, SectionQueryType sectionQueryType, String str3, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            sectionQueryType = SectionQueryType.LEGACY_COLLECTION;
        }
        SectionQueryType sectionQueryType2 = sectionQueryType;
        if ((i & 8) != 0) {
            str3 = "TRENDING";
        }
        return destinationAssetRepository.d(str, str4, sectionQueryType2, str3, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    public static /* synthetic */ Object m(DestinationAssetRepository destinationAssetRepository, String str, boolean z, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return destinationAssetRepository.l(str, z, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (List) ss2Var.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, java.lang.String r6, com.nytimes.android.api.cms.SectionQueryType r7, java.lang.String r8, defpackage.by0 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$1 r0 = (com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$1 r0 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L29
            goto L5b
        L29:
            r4 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r9)
            eh7 r4 = r4.a     // Catch: java.lang.Exception -> L29
            com.nytimes.android.section.sectionfront.a$a r9 = com.nytimes.android.section.sectionfront.a.Companion     // Catch: java.lang.Exception -> L29
            com.nytimes.android.section.sectionfront.a r5 = r9.b(r5, r6, r7, r8)     // Catch: java.lang.Exception -> L29
            io.reactivex.Single r4 = r4.get(r5)     // Catch: java.lang.Exception -> L29
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2 r5 = new defpackage.ss2() { // from class: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2
                static {
                    /*
                        com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2 r0 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2) com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2.a com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.util.List invoke(com.nytimes.android.api.cms.SectionFront r1) {
                    /*
                        r0 = this;
                        java.lang.String r0 = "it"
                        defpackage.zq3.h(r1, r0)
                        java.util.List r0 = r1.getAssets()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2.invoke(com.nytimes.android.api.cms.SectionFront):java.util.List");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.nytimes.android.api.cms.SectionFront r1 = (com.nytimes.android.api.cms.SectionFront) r1
                        java.util.List r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getCustomSectionFront$2.invoke(java.lang.Object):java.lang.Object");
                }
            }     // Catch: java.lang.Exception -> L29
            gn1 r6 = new gn1     // Catch: java.lang.Exception -> L29
            r6.<init>()     // Catch: java.lang.Exception -> L29
            io.reactivex.Single r4 = r4.map(r6)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "map(...)"
            defpackage.zq3.g(r4, r5)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = kotlinx.coroutines.rx2.RxAwaitKt.await(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r9 != r1) goto L5b
            return r1
        L5b:
            defpackage.zq3.e(r9)     // Catch: java.lang.Exception -> L29
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L29
            goto L68
        L61:
            com.nytimes.android.logging.NYTLogger.h(r4)
            java.util.List r9 = kotlin.collections.i.l()
        L68:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository.d(java.lang.String, java.lang.String, com.nytimes.android.api.cms.SectionQueryType, java.lang.String, by0):java.lang.Object");
    }

    public final CachedParallelStore g(String str, KSerializer kSerializer, gt2 gt2Var) {
        zq3.h(str, "destination");
        zq3.h(kSerializer, "serializer");
        zq3.h(gt2Var, "fetch");
        return new CachedParallelStore(this.j, new DestinationAssetRepository$getCustomStoreFor$1(this.i), this.h, str + "Cache.json", kSerializer, gt2Var, si1.a.b(this.k, a48.a(str) + "DataStore", null, null, 6, null), 0L, 128, null);
    }

    public final Object h(by0 by0Var) {
        return this.g.a(by0Var);
    }

    public final Object i(RibbonTabEndpoint ribbonTabEndpoint, by0 by0Var) {
        return this.f.a(ribbonTabEndpoint, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r14, java.lang.String r15, com.nytimes.android.api.cms.SectionQueryType r16, boolean r17, defpackage.by0 r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$1
            if (r2 == 0) goto L16
            r2 = r1
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$1 r2 = (com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$1 r2 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$1
            r2.<init>(r13, r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            kotlin.f.b(r1)     // Catch: java.lang.Exception -> L2c
            goto L72
        L2c:
            r0 = move-exception
            goto L78
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.f.b(r1)
            com.nytimes.android.section.sectionfront.a$a r6 = com.nytimes.android.section.sectionfront.a.Companion     // Catch: java.lang.Exception -> L2c
            r11 = 8
            r12 = 0
            r10 = 0
            r7 = r14
            r8 = r15
            r9 = r16
            com.nytimes.android.section.sectionfront.a r1 = com.nytimes.android.section.sectionfront.a.C0402a.c(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L2c
            if (r17 == 0) goto L50
            eh7 r0 = r0.a     // Catch: java.lang.Exception -> L2c
            io.reactivex.Single r0 = r0.fetch(r1)     // Catch: java.lang.Exception -> L2c
            goto L56
        L50:
            eh7 r0 = r0.a     // Catch: java.lang.Exception -> L2c
            io.reactivex.Single r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2c
        L56:
            defpackage.zq3.e(r0)     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2 r1 = new defpackage.ss2() { // from class: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2
                static {
                    /*
                        com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2 r0 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2) com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2.a com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.util.List invoke(com.nytimes.android.api.cms.SectionFront r1) {
                    /*
                        r0 = this;
                        java.lang.String r0 = "it"
                        defpackage.zq3.h(r1, r0)
                        java.util.List r0 = r1.getAssets()
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        java.util.List r1 = r1.getTrackingParams()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.List r0 = kotlin.collections.i.h1(r0, r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2.invoke(com.nytimes.android.api.cms.SectionFront):java.util.List");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.nytimes.android.api.cms.SectionFront r1 = (com.nytimes.android.api.cms.SectionFront) r1
                        java.util.List r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getPersonalizedSectionFront$2.invoke(java.lang.Object):java.lang.Object");
                }
            }     // Catch: java.lang.Exception -> L2c
            fn1 r4 = new fn1     // Catch: java.lang.Exception -> L2c
            r4.<init>()     // Catch: java.lang.Exception -> L2c
            io.reactivex.Single r0 = r0.map(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "map(...)"
            defpackage.zq3.g(r0, r1)     // Catch: java.lang.Exception -> L2c
            r2.label = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = kotlinx.coroutines.rx2.RxAwaitKt.await(r0, r2)     // Catch: java.lang.Exception -> L2c
            if (r1 != r3) goto L72
            return r3
        L72:
            defpackage.zq3.e(r1)     // Catch: java.lang.Exception -> L2c
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L2c
            goto L7f
        L78:
            com.nytimes.android.logging.NYTLogger.h(r0)
            java.util.List r1 = kotlin.collections.i.l()
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository.j(java.lang.String, java.lang.String, com.nytimes.android.api.cms.SectionQueryType, boolean, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r12, boolean r13, defpackage.by0 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$1
            if (r0 == 0) goto L13
            r0 = r14
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$1 r0 = (com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$1 r0 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r14)     // Catch: java.lang.Exception -> L29
            goto L6e
        L29:
            r11 = move-exception
            goto L74
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.f.b(r14)
            com.nytimes.android.section.sectionfront.a$a r4 = com.nytimes.android.section.sectionfront.a.Companion     // Catch: java.lang.Exception -> L29
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.nytimes.android.section.sectionfront.a r12 = com.nytimes.android.section.sectionfront.a.C0402a.c(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L29
            if (r13 == 0) goto L4c
            eh7 r11 = r11.a     // Catch: java.lang.Exception -> L29
            io.reactivex.Single r11 = r11.fetch(r12)     // Catch: java.lang.Exception -> L29
            goto L52
        L4c:
            eh7 r11 = r11.a     // Catch: java.lang.Exception -> L29
            io.reactivex.Single r11 = r11.get(r12)     // Catch: java.lang.Exception -> L29
        L52:
            defpackage.zq3.e(r11)     // Catch: java.lang.Exception -> L29
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2 r12 = new defpackage.ss2() { // from class: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2
                static {
                    /*
                        com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2 r0 = new com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2) com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2.a com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.util.List invoke(com.nytimes.android.api.cms.SectionFront r1) {
                    /*
                        r0 = this;
                        java.lang.String r0 = "it"
                        defpackage.zq3.h(r1, r0)
                        java.util.List r0 = r1.getAssets()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2.invoke(com.nytimes.android.api.cms.SectionFront):java.util.List");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.nytimes.android.api.cms.SectionFront r1 = (com.nytimes.android.api.cms.SectionFront) r1
                        java.util.List r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository$getSectionFront$2.invoke(java.lang.Object):java.lang.Object");
                }
            }     // Catch: java.lang.Exception -> L29
            hn1 r13 = new hn1     // Catch: java.lang.Exception -> L29
            r13.<init>()     // Catch: java.lang.Exception -> L29
            io.reactivex.Single r11 = r11.map(r13)     // Catch: java.lang.Exception -> L29
            java.lang.String r12 = "map(...)"
            defpackage.zq3.g(r11, r12)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r14 = kotlinx.coroutines.rx2.RxAwaitKt.await(r11, r0)     // Catch: java.lang.Exception -> L29
            if (r14 != r1) goto L6e
            return r1
        L6e:
            java.lang.String r11 = "await(...)"
            defpackage.zq3.g(r14, r11)     // Catch: java.lang.Exception -> L29
            return r14
        L74:
            com.nytimes.android.logging.NYTLogger.h(r11)
            java.util.List r11 = kotlin.collections.i.l()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.DestinationAssetRepository.l(java.lang.String, boolean, by0):java.lang.Object");
    }

    public final Object o(by0 by0Var) {
        return this.b.b(by0Var);
    }

    public final Object p(by0 by0Var) {
        return this.b.a(by0Var);
    }

    public final Object q(String str, by0 by0Var) {
        return this.e.e(str, by0Var);
    }

    public final Object r(String str, by0 by0Var) {
        return this.e.f(str, by0Var);
    }
}
