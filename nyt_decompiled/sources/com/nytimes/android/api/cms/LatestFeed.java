package com.nytimes.android.api.cms;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.config.model.Ad;
import com.nytimes.android.api.config.model.EComm;
import com.nytimes.android.api.config.model.JsonMessage;
import com.nytimes.android.api.config.model.Marketing;
import com.nytimes.android.api.config.model.NotificationsBannerMessaging;
import com.nytimes.android.api.config.model.PushMessaging;
import com.nytimes.android.api.config.model.RibbonConfigGsonDTO;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class LatestFeed {
    private final Ad ad;
    private final BaseSectionConfig baseSectionConfig;
    private final EComm ecomm;
    private final List<String> hybridResources;
    private final Map<String, List<Integer>> imageCropMappings;
    private final Marketing marketing;
    private final List<JsonMessage> messageList;
    private final Map<String, Integer> messagingCadences;
    private final List<String> messagingSequence;
    private final NotificationsBannerMessaging notificationsBannerMessaging;
    private final Map<String, ProgramMeta> programs;
    private final PushMessaging pushMessaging;
    private final RecentlyViewed recentlyViewed;
    private final SectionConfig sectionConfig;
    private final List<SectionUrlLink> sectionUrlLinks;
    private final List<SectionMeta> sections;
    private final List<RibbonConfigGsonDTO> xpnConfig;

    public LatestFeed() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final List<SectionMeta> component1() {
        return this.sections;
    }

    public final SectionConfig component10() {
        return this.sectionConfig;
    }

    public final PushMessaging component11() {
        return this.pushMessaging;
    }

    public final NotificationsBannerMessaging component12() {
        return this.notificationsBannerMessaging;
    }

    public final RecentlyViewed component13() {
        return this.recentlyViewed;
    }

    public final List<JsonMessage> component14() {
        return this.messageList;
    }

    public final Map<String, Integer> component15() {
        return this.messagingCadences;
    }

    public final List<String> component16() {
        return this.messagingSequence;
    }

    public final List<RibbonConfigGsonDTO> component17() {
        return this.xpnConfig;
    }

    public final List<SectionUrlLink> component2() {
        return this.sectionUrlLinks;
    }

    public final Map<String, ProgramMeta> component3() {
        return this.programs;
    }

    public final Ad component4() {
        return this.ad;
    }

    public final BaseSectionConfig component5() {
        return this.baseSectionConfig;
    }

    public final EComm component6() {
        return this.ecomm;
    }

    public final List<String> component7() {
        return this.hybridResources;
    }

    public final Map<String, List<Integer>> component8() {
        return this.imageCropMappings;
    }

    public final Marketing component9() {
        return this.marketing;
    }

    public final LatestFeed copy(List<SectionMeta> list, List<SectionUrlLink> list2, Map<String, ProgramMeta> map, Ad ad, BaseSectionConfig baseSectionConfig, EComm eComm, List<String> list3, Map<String, ? extends List<Integer>> map2, Marketing marketing, SectionConfig sectionConfig, PushMessaging pushMessaging, NotificationsBannerMessaging notificationsBannerMessaging, RecentlyViewed recentlyViewed, List<JsonMessage> list4, Map<String, Integer> map3, List<String> list5, List<RibbonConfigGsonDTO> list6) {
        return new LatestFeed(list, list2, map, ad, baseSectionConfig, eComm, list3, map2, marketing, sectionConfig, pushMessaging, notificationsBannerMessaging, recentlyViewed, list4, map3, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestFeed)) {
            return false;
        }
        LatestFeed latestFeed = (LatestFeed) obj;
        return zq3.c(this.sections, latestFeed.sections) && zq3.c(this.sectionUrlLinks, latestFeed.sectionUrlLinks) && zq3.c(this.programs, latestFeed.programs) && zq3.c(this.ad, latestFeed.ad) && zq3.c(this.baseSectionConfig, latestFeed.baseSectionConfig) && zq3.c(this.ecomm, latestFeed.ecomm) && zq3.c(this.hybridResources, latestFeed.hybridResources) && zq3.c(this.imageCropMappings, latestFeed.imageCropMappings) && zq3.c(this.marketing, latestFeed.marketing) && zq3.c(this.sectionConfig, latestFeed.sectionConfig) && zq3.c(this.pushMessaging, latestFeed.pushMessaging) && zq3.c(this.notificationsBannerMessaging, latestFeed.notificationsBannerMessaging) && zq3.c(this.recentlyViewed, latestFeed.recentlyViewed) && zq3.c(this.messageList, latestFeed.messageList) && zq3.c(this.messagingCadences, latestFeed.messagingCadences) && zq3.c(this.messagingSequence, latestFeed.messagingSequence) && zq3.c(this.xpnConfig, latestFeed.xpnConfig);
    }

    public final Ad getAd() {
        return this.ad;
    }

    public final BaseSectionConfig getBaseSectionConfig() {
        return this.baseSectionConfig;
    }

    public final EComm getEcomm() {
        return this.ecomm;
    }

    public final List<String> getHybridResources() {
        return this.hybridResources;
    }

    public final Map<String, List<Integer>> getImageCropMappings() {
        return this.imageCropMappings;
    }

    public final Marketing getMarketing() {
        return this.marketing;
    }

    public final List<JsonMessage> getMessageList() {
        return this.messageList;
    }

    public final Map<String, Integer> getMessagingCadences() {
        return this.messagingCadences;
    }

    public final List<String> getMessagingSequence() {
        return this.messagingSequence;
    }

    public final NotificationsBannerMessaging getNotificationsBannerMessaging() {
        return this.notificationsBannerMessaging;
    }

    public final Map<String, ProgramMeta> getPrograms() {
        return this.programs;
    }

    public final PushMessaging getPushMessaging() {
        return this.pushMessaging;
    }

    public final RecentlyViewed getRecentlyViewed() {
        return this.recentlyViewed;
    }

    public final SectionMeta getSection(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return getSectionMeta(str);
    }

    public final SectionConfig getSectionConfig() {
        return this.sectionConfig;
    }

    public final SectionMeta getSectionMeta(String str) {
        return (SectionMeta) i.m0(getSectionMetas(SectionMeta.Companion.named(str)));
    }

    public final List<SectionMeta> getSectionMetas(ss2 ss2Var) {
        zq3.h(ss2Var, "filter");
        List<SectionMeta> list = this.sections;
        if (list == null) {
            list = i.l();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ss2Var.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<SectionUrlLink> getSectionUrlLinks() {
        return this.sectionUrlLinks;
    }

    public final List<SectionMeta> getSections() {
        return this.sections;
    }

    public final List<RibbonConfigGsonDTO> getXpnConfig() {
        return this.xpnConfig;
    }

    public int hashCode() {
        List<SectionMeta> list = this.sections;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SectionUrlLink> list2 = this.sectionUrlLinks;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, ProgramMeta> map = this.programs;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Ad ad = this.ad;
        int hashCode4 = (hashCode3 + (ad == null ? 0 : ad.hashCode())) * 31;
        BaseSectionConfig baseSectionConfig = this.baseSectionConfig;
        int hashCode5 = (hashCode4 + (baseSectionConfig == null ? 0 : baseSectionConfig.hashCode())) * 31;
        EComm eComm = this.ecomm;
        int hashCode6 = (hashCode5 + (eComm == null ? 0 : eComm.hashCode())) * 31;
        List<String> list3 = this.hybridResources;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, List<Integer>> map2 = this.imageCropMappings;
        int hashCode8 = (hashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Marketing marketing = this.marketing;
        int hashCode9 = (hashCode8 + (marketing == null ? 0 : marketing.hashCode())) * 31;
        SectionConfig sectionConfig = this.sectionConfig;
        int hashCode10 = (hashCode9 + (sectionConfig == null ? 0 : sectionConfig.hashCode())) * 31;
        PushMessaging pushMessaging = this.pushMessaging;
        int hashCode11 = (hashCode10 + (pushMessaging == null ? 0 : pushMessaging.hashCode())) * 31;
        NotificationsBannerMessaging notificationsBannerMessaging = this.notificationsBannerMessaging;
        int hashCode12 = (hashCode11 + (notificationsBannerMessaging == null ? 0 : notificationsBannerMessaging.hashCode())) * 31;
        RecentlyViewed recentlyViewed = this.recentlyViewed;
        int hashCode13 = (hashCode12 + (recentlyViewed == null ? 0 : recentlyViewed.hashCode())) * 31;
        List<JsonMessage> list4 = this.messageList;
        int hashCode14 = (hashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Map<String, Integer> map3 = this.messagingCadences;
        int hashCode15 = (hashCode14 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List<String> list5 = this.messagingSequence;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<RibbonConfigGsonDTO> list6 = this.xpnConfig;
        return hashCode16 + (list6 != null ? list6.hashCode() : 0);
    }

    public final Map<String, Integer> messageCadences() {
        Map<String, Integer> map = this.messagingCadences;
        return map == null ? t.i() : map;
    }

    public final List<JsonMessage> messageDetails() {
        List<JsonMessage> list = this.messageList;
        return list == null ? i.l() : list;
    }

    public final List<String> messageSequence() {
        List<String> list = this.messagingSequence;
        return list == null ? i.l() : list;
    }

    public final PushMessaging pushMessaging() {
        PushMessaging pushMessaging = this.pushMessaging;
        return pushMessaging == null ? new PushMessaging(i.l()) : pushMessaging;
    }

    public final void setSectionConfigs() {
        List<SectionMeta> list = this.sections;
        if (list != null) {
            for (SectionMeta sectionMeta : list) {
                SectionConfig sectionConfig = this.sectionConfig;
                zq3.e(sectionConfig);
                sectionMeta.setSectionConfig(sectionConfig.get(sectionMeta.getName()));
            }
        }
    }

    public String toString() {
        return "LatestFeed(sections=" + this.sections + ", sectionUrlLinks=" + this.sectionUrlLinks + ", programs=" + this.programs + ", ad=" + this.ad + ", baseSectionConfig=" + this.baseSectionConfig + ", ecomm=" + this.ecomm + ", hybridResources=" + this.hybridResources + ", imageCropMappings=" + this.imageCropMappings + ", marketing=" + this.marketing + ", sectionConfig=" + this.sectionConfig + ", pushMessaging=" + this.pushMessaging + ", notificationsBannerMessaging=" + this.notificationsBannerMessaging + ", recentlyViewed=" + this.recentlyViewed + ", messageList=" + this.messageList + ", messagingCadences=" + this.messagingCadences + ", messagingSequence=" + this.messagingSequence + ", xpnConfig=" + this.xpnConfig + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LatestFeed(List<SectionMeta> list, List<SectionUrlLink> list2, Map<String, ProgramMeta> map, Ad ad, BaseSectionConfig baseSectionConfig, EComm eComm, List<String> list3, Map<String, ? extends List<Integer>> map2, Marketing marketing, SectionConfig sectionConfig, PushMessaging pushMessaging, NotificationsBannerMessaging notificationsBannerMessaging, RecentlyViewed recentlyViewed, List<JsonMessage> list4, Map<String, Integer> map3, List<String> list5, List<RibbonConfigGsonDTO> list6) {
        this.sections = list;
        this.sectionUrlLinks = list2;
        this.programs = map;
        this.ad = ad;
        this.baseSectionConfig = baseSectionConfig;
        this.ecomm = eComm;
        this.hybridResources = list3;
        this.imageCropMappings = map2;
        this.marketing = marketing;
        this.sectionConfig = sectionConfig;
        this.pushMessaging = pushMessaging;
        this.notificationsBannerMessaging = notificationsBannerMessaging;
        this.recentlyViewed = recentlyViewed;
        this.messageList = list4;
        this.messagingCadences = map3;
        this.messagingSequence = list5;
        this.xpnConfig = list6;
    }

    public /* synthetic */ LatestFeed(List list, List list2, Map map, Ad ad, BaseSectionConfig baseSectionConfig, EComm eComm, List list3, Map map2, Marketing marketing, SectionConfig sectionConfig, PushMessaging pushMessaging, NotificationsBannerMessaging notificationsBannerMessaging, RecentlyViewed recentlyViewed, List list4, Map map3, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : ad, (i & 16) != 0 ? null : baseSectionConfig, (i & 32) != 0 ? null : eComm, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : map2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : marketing, (i & 512) != 0 ? null : sectionConfig, (i & 1024) != 0 ? null : pushMessaging, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : notificationsBannerMessaging, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : recentlyViewed, (i & 8192) != 0 ? null : list4, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : map3, (i & 32768) != 0 ? null : list5, (i & 65536) != 0 ? null : list6);
    }
}
