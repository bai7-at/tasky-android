package com.nytimes.android.ad.params;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.ad.AbraKVPs;
import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.ad.params.video.VideoAdParamKeys;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.utils.TimeDuration;
import defpackage.c50;
import defpackage.c69;
import defpackage.d96;
import defpackage.g89;
import defpackage.i89;
import defpackage.l79;
import defpackage.zq3;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class VideoCustomAdParamProvider {
    private final g89 a;
    public AbraKVPs abraKVPs;
    private final l79 b;
    private final c69 c;
    private final c50 d;
    private final i89 e;
    private final CoroutineScope f;
    private boolean g;

    public VideoCustomAdParamProvider(g89 g89Var, l79 l79Var, c69 c69Var, c50 c50Var, i89 i89Var, d96 d96Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(g89Var, "noAdsParam");
        zq3.h(l79Var, "durationParam");
        zq3.h(c69Var, "autoPlayParam");
        zq3.h(c50Var, "baseParamProvider");
        zq3.h(i89Var, "videoOrientationParam");
        zq3.h(d96Var, "purrManagerClient");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = g89Var;
        this.b = l79Var;
        this.c = c69Var;
        this.d = c50Var;
        this.e = i89Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        d(d96Var);
    }

    private final Map b(Asset asset) {
        DfpAssetMetaData dfp = asset.getDfp();
        Map c = dfp != null ? c(dfp, asset instanceof VideoAsset) : null;
        return c == null ? t.i() : c;
    }

    private final Map c(DfpAssetMetaData dfpAssetMetaData, boolean z) {
        HashMap hashMap = new HashMap();
        String str = z ? "vid" : "";
        Iterator<AbstractMap.SimpleEntry<String, String>> it2 = dfpAssetMetaData.paramList().iterator();
        while (it2.hasNext()) {
            AbstractMap.SimpleEntry<String, String> next = it2.next();
            zq3.e(next);
            String key = next.getKey();
            String value = next.getValue();
            zq3.e(value);
            hashMap.put(str + key, value);
        }
        return hashMap;
    }

    private final void d(d96 d96Var) {
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new VideoCustomAdParamProvider$trackIsAdsNPA$1(this, d96Var, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(d96Var.m(), new VideoCustomAdParamProvider$trackIsAdsNPA$2(this, d96Var, null)), this.f);
    }

    public final Map e(long j, boolean z, String str, String str2, TimeDuration timeDuration, String str3, String str4, Asset asset) {
        zq3.h(str, "contentType");
        zq3.h(timeDuration, "videoDuration");
        zq3.h(str3, "section");
        zq3.h(str4, "subSection");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(VideoAdParamKeys.SECTION.asString(), str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(VideoAdParamKeys.SUBSECTION.asString(), str4);
        }
        hashMap.putAll(this.d.a());
        hashMap.put(BaseAdParamKey.CONTENT_TYPE.asString(), str);
        hashMap.put(VideoAdParamKeys.VIDID.asString(), String.valueOf(j));
        hashMap.put(VideoAdParamKeys.ID.asString(), String.valueOf(j));
        hashMap.put(this.a.a().asString(), this.a.b(str2 == null ? "" : str2));
        hashMap.put(this.b.a().asString(), this.b.b(timeDuration));
        String asString = this.c.a().asString();
        c69 c69Var = this.c;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(asString, c69Var.b(str2));
        hashMap.put(this.e.a().asString(), this.e.b(z));
        String asString2 = VideoAdParamKeys.ABRA_DFP.asString();
        AbraKVPs abraKVPs = this.abraKVPs;
        zq3.e(abraKVPs);
        hashMap.put(asString2, abraKVPs.a());
        if (asset != null) {
            hashMap.putAll(b(asset));
        }
        if (this.g) {
            hashMap.put(BaseAdParamKey.NPA.getKey(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        return hashMap;
    }

    public final Map f(VideoAsset videoAsset, Asset asset) {
        zq3.h(videoAsset, "videoAsset");
        return t.p(e(videoAsset.getAssetId(), videoAsset.isVertical(), DFPContentType.a.a(videoAsset), videoAsset.getAdvertisingSensitivity(), new TimeDuration(videoAsset.getVideoDuration(), TimeUnit.MILLISECONDS), videoAsset.getSectionContentName(), videoAsset.getSubsectionContentName(), asset), b(videoAsset));
    }
}
