package type;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class UserStateInput {
    private final nk5 accountMastheadUserModal;
    private final nk5 bottomSheet;
    private final nk5 cookShareLinkTooltipWeb;
    private final nk5 coreNewsSubOnboardingProductPreferences;
    private final nk5 coreNewsSubOnboardingStepAllSet;
    private final nk5 coreNewsSubOnboardingStepNewsAppDownload;
    private final nk5 coreNewsSubOnboardingStepNewsletters;
    private final nk5 coreNewsSubOnboardingStepProductPreferences;
    private final nk5 coreNewsSubscriberOnboarding;
    private final nk5 disrupterReadInAppDock;
    private final nk5 disrupterReadInAppViews;
    private final nk5 emailSignupDock;
    private final nk5 getStartedLater;
    private final nk5 getStartedNow;
    private final nk5 liveOnboardingBlock;
    private final nk5 mastheadUserModalAppDownload;
    private final nk5 messageSelectionMessageCaps;
    private final nk5 productSelection;
    private final nk5 regiOnboarding;
    private final nk5 regiOnboardingGamesPreferences;
    private final nk5 regiOnboardingProductPreferences;
    private final nk5 regiOnboardingTopicSelections;
    private final nk5 regiOnboardingV2;
    private final nk5 regiOnboardingV2StepAllSet;
    private final nk5 regiOnboardingV2StepGamesPreferences;
    private final nk5 regiOnboardingV2StepNewsAppDownload;
    private final nk5 regiOnboardingV2StepNewsletters;
    private final nk5 regiOnboardingV2StepProductPreferences;
    private final nk5 regiOnboardingV2StepSaveArticles;
    private final nk5 regiOnboardingV2StepTopicsPreferences;
    private final nk5 savedArticleTooltip;
    private final nk5 shareLinkTooltipApp;
    private final nk5 shareLinkTooltipWeb;
    private final nk5 stickyGiftTestWeb;
    private final nk5 storyBlock;
    private final nk5 subOnboardingAppDlDisruptor;
    private final nk5 subOnboardingAppDlDock;
    private final nk5 subOnboardingStepAppDL;
    private final nk5 subOnboardingStepCooking;
    private final nk5 subOnboardingStepGames;
    private final nk5 subOnboardingStepNewsletters;
    private final nk5 subOnboardingTopicSelections;
    private final nk5 subOnboardingV2StepAllSet;
    private final nk5 subOnboardingV2StepGamesPreferences;
    private final nk5 subOnboardingV2StepNewsAppDownload;
    private final nk5 subOnboardingV2StepNewsletters;
    private final nk5 subOnboardingV2StepNotifications;
    private final nk5 subOnboardingV2StepProductPreferences;
    private final nk5 subOnboardingV2StepSaveArticles;
    private final nk5 subOnboardingV2StepTopicsPreferences;
    private final nk5 subscriberOnboarding;
    private final nk5 subscriberOnboardingGamesPreferences;
    private final nk5 subscriberOnboardingProductPreferences;
    private final nk5 subscriberOnboardingV2;
    private final nk5 synthVoiceTestWeb;
    private final nk5 targetedNewsletterSignup;
    private final nk5 viewedLivePosts;
    private final nk5 viewedTrustModule;
    private final nk5 welcomeBannerGames;
    private final nk5 welcomeBannerRegi;
    private final nk5 yourPlacesGlobalUpdate;

    public UserStateInput() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 536870911, null);
    }

    public final nk5 component1() {
        return this.accountMastheadUserModal;
    }

    public final nk5 component10() {
        return this.disrupterReadInAppDock;
    }

    public final nk5 component11() {
        return this.disrupterReadInAppViews;
    }

    public final nk5 component12() {
        return this.emailSignupDock;
    }

    public final nk5 component13() {
        return this.getStartedLater;
    }

    public final nk5 component14() {
        return this.getStartedNow;
    }

    public final nk5 component15() {
        return this.liveOnboardingBlock;
    }

    public final nk5 component16() {
        return this.mastheadUserModalAppDownload;
    }

    public final nk5 component17() {
        return this.messageSelectionMessageCaps;
    }

    public final nk5 component18() {
        return this.productSelection;
    }

    public final nk5 component19() {
        return this.regiOnboarding;
    }

    public final nk5 component2() {
        return this.bottomSheet;
    }

    public final nk5 component20() {
        return this.regiOnboardingGamesPreferences;
    }

    public final nk5 component21() {
        return this.regiOnboardingProductPreferences;
    }

    public final nk5 component22() {
        return this.regiOnboardingTopicSelections;
    }

    public final nk5 component23() {
        return this.regiOnboardingV2;
    }

    public final nk5 component24() {
        return this.regiOnboardingV2StepAllSet;
    }

    public final nk5 component25() {
        return this.regiOnboardingV2StepGamesPreferences;
    }

    public final nk5 component26() {
        return this.regiOnboardingV2StepNewsAppDownload;
    }

    public final nk5 component27() {
        return this.regiOnboardingV2StepNewsletters;
    }

    public final nk5 component28() {
        return this.regiOnboardingV2StepProductPreferences;
    }

    public final nk5 component29() {
        return this.regiOnboardingV2StepSaveArticles;
    }

    public final nk5 component3() {
        return this.cookShareLinkTooltipWeb;
    }

    public final nk5 component30() {
        return this.regiOnboardingV2StepTopicsPreferences;
    }

    public final nk5 component31() {
        return this.savedArticleTooltip;
    }

    public final nk5 component32() {
        return this.shareLinkTooltipApp;
    }

    public final nk5 component33() {
        return this.shareLinkTooltipWeb;
    }

    public final nk5 component34() {
        return this.stickyGiftTestWeb;
    }

    public final nk5 component35() {
        return this.storyBlock;
    }

    public final nk5 component36() {
        return this.subOnboardingAppDlDisruptor;
    }

    public final nk5 component37() {
        return this.subOnboardingAppDlDock;
    }

    public final nk5 component38() {
        return this.subOnboardingStepAppDL;
    }

    public final nk5 component39() {
        return this.subOnboardingStepCooking;
    }

    public final nk5 component4() {
        return this.coreNewsSubOnboardingProductPreferences;
    }

    public final nk5 component40() {
        return this.subOnboardingStepGames;
    }

    public final nk5 component41() {
        return this.subOnboardingStepNewsletters;
    }

    public final nk5 component42() {
        return this.subOnboardingTopicSelections;
    }

    public final nk5 component43() {
        return this.subOnboardingV2StepAllSet;
    }

    public final nk5 component44() {
        return this.subOnboardingV2StepGamesPreferences;
    }

    public final nk5 component45() {
        return this.subOnboardingV2StepNewsAppDownload;
    }

    public final nk5 component46() {
        return this.subOnboardingV2StepNewsletters;
    }

    public final nk5 component47() {
        return this.subOnboardingV2StepNotifications;
    }

    public final nk5 component48() {
        return this.subOnboardingV2StepProductPreferences;
    }

    public final nk5 component49() {
        return this.subOnboardingV2StepSaveArticles;
    }

    public final nk5 component5() {
        return this.coreNewsSubOnboardingStepAllSet;
    }

    public final nk5 component50() {
        return this.subOnboardingV2StepTopicsPreferences;
    }

    public final nk5 component51() {
        return this.subscriberOnboarding;
    }

    public final nk5 component52() {
        return this.subscriberOnboardingGamesPreferences;
    }

    public final nk5 component53() {
        return this.subscriberOnboardingProductPreferences;
    }

    public final nk5 component54() {
        return this.subscriberOnboardingV2;
    }

    public final nk5 component55() {
        return this.synthVoiceTestWeb;
    }

    public final nk5 component56() {
        return this.targetedNewsletterSignup;
    }

    public final nk5 component57() {
        return this.viewedLivePosts;
    }

    public final nk5 component58() {
        return this.viewedTrustModule;
    }

    public final nk5 component59() {
        return this.welcomeBannerGames;
    }

    public final nk5 component6() {
        return this.coreNewsSubOnboardingStepNewsAppDownload;
    }

    public final nk5 component60() {
        return this.welcomeBannerRegi;
    }

    public final nk5 component61() {
        return this.yourPlacesGlobalUpdate;
    }

    public final nk5 component7() {
        return this.coreNewsSubOnboardingStepNewsletters;
    }

    public final nk5 component8() {
        return this.coreNewsSubOnboardingStepProductPreferences;
    }

    public final nk5 component9() {
        return this.coreNewsSubscriberOnboarding;
    }

    public final UserStateInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32, nk5 nk5Var33, nk5 nk5Var34, nk5 nk5Var35, nk5 nk5Var36, nk5 nk5Var37, nk5 nk5Var38, nk5 nk5Var39, nk5 nk5Var40, nk5 nk5Var41, nk5 nk5Var42, nk5 nk5Var43, nk5 nk5Var44, nk5 nk5Var45, nk5 nk5Var46, nk5 nk5Var47, nk5 nk5Var48, nk5 nk5Var49, nk5 nk5Var50, nk5 nk5Var51, nk5 nk5Var52, nk5 nk5Var53, nk5 nk5Var54, nk5 nk5Var55, nk5 nk5Var56, nk5 nk5Var57, nk5 nk5Var58, nk5 nk5Var59, nk5 nk5Var60, nk5 nk5Var61) {
        zq3.h(nk5Var, "accountMastheadUserModal");
        zq3.h(nk5Var2, "bottomSheet");
        zq3.h(nk5Var3, "cookShareLinkTooltipWeb");
        zq3.h(nk5Var4, "coreNewsSubOnboardingProductPreferences");
        zq3.h(nk5Var5, "coreNewsSubOnboardingStepAllSet");
        zq3.h(nk5Var6, "coreNewsSubOnboardingStepNewsAppDownload");
        zq3.h(nk5Var7, "coreNewsSubOnboardingStepNewsletters");
        zq3.h(nk5Var8, "coreNewsSubOnboardingStepProductPreferences");
        zq3.h(nk5Var9, "coreNewsSubscriberOnboarding");
        zq3.h(nk5Var10, "disrupterReadInAppDock");
        zq3.h(nk5Var11, "disrupterReadInAppViews");
        zq3.h(nk5Var12, "emailSignupDock");
        zq3.h(nk5Var13, "getStartedLater");
        zq3.h(nk5Var14, "getStartedNow");
        zq3.h(nk5Var15, "liveOnboardingBlock");
        zq3.h(nk5Var16, "mastheadUserModalAppDownload");
        zq3.h(nk5Var17, "messageSelectionMessageCaps");
        zq3.h(nk5Var18, "productSelection");
        zq3.h(nk5Var19, "regiOnboarding");
        zq3.h(nk5Var20, "regiOnboardingGamesPreferences");
        zq3.h(nk5Var21, "regiOnboardingProductPreferences");
        zq3.h(nk5Var22, "regiOnboardingTopicSelections");
        zq3.h(nk5Var23, "regiOnboardingV2");
        zq3.h(nk5Var24, "regiOnboardingV2StepAllSet");
        zq3.h(nk5Var25, "regiOnboardingV2StepGamesPreferences");
        zq3.h(nk5Var26, "regiOnboardingV2StepNewsAppDownload");
        zq3.h(nk5Var27, "regiOnboardingV2StepNewsletters");
        zq3.h(nk5Var28, "regiOnboardingV2StepProductPreferences");
        zq3.h(nk5Var29, "regiOnboardingV2StepSaveArticles");
        zq3.h(nk5Var30, "regiOnboardingV2StepTopicsPreferences");
        zq3.h(nk5Var31, "savedArticleTooltip");
        zq3.h(nk5Var32, "shareLinkTooltipApp");
        zq3.h(nk5Var33, "shareLinkTooltipWeb");
        zq3.h(nk5Var34, "stickyGiftTestWeb");
        zq3.h(nk5Var35, "storyBlock");
        zq3.h(nk5Var36, "subOnboardingAppDlDisruptor");
        zq3.h(nk5Var37, "subOnboardingAppDlDock");
        zq3.h(nk5Var38, "subOnboardingStepAppDL");
        zq3.h(nk5Var39, "subOnboardingStepCooking");
        zq3.h(nk5Var40, "subOnboardingStepGames");
        zq3.h(nk5Var41, "subOnboardingStepNewsletters");
        zq3.h(nk5Var42, "subOnboardingTopicSelections");
        zq3.h(nk5Var43, "subOnboardingV2StepAllSet");
        zq3.h(nk5Var44, "subOnboardingV2StepGamesPreferences");
        zq3.h(nk5Var45, "subOnboardingV2StepNewsAppDownload");
        zq3.h(nk5Var46, "subOnboardingV2StepNewsletters");
        zq3.h(nk5Var47, "subOnboardingV2StepNotifications");
        zq3.h(nk5Var48, "subOnboardingV2StepProductPreferences");
        zq3.h(nk5Var49, "subOnboardingV2StepSaveArticles");
        zq3.h(nk5Var50, "subOnboardingV2StepTopicsPreferences");
        zq3.h(nk5Var51, "subscriberOnboarding");
        zq3.h(nk5Var52, "subscriberOnboardingGamesPreferences");
        zq3.h(nk5Var53, "subscriberOnboardingProductPreferences");
        zq3.h(nk5Var54, "subscriberOnboardingV2");
        zq3.h(nk5Var55, "synthVoiceTestWeb");
        zq3.h(nk5Var56, "targetedNewsletterSignup");
        zq3.h(nk5Var57, "viewedLivePosts");
        zq3.h(nk5Var58, "viewedTrustModule");
        zq3.h(nk5Var59, "welcomeBannerGames");
        zq3.h(nk5Var60, "welcomeBannerRegi");
        zq3.h(nk5Var61, "yourPlacesGlobalUpdate");
        return new UserStateInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var11, nk5Var12, nk5Var13, nk5Var14, nk5Var15, nk5Var16, nk5Var17, nk5Var18, nk5Var19, nk5Var20, nk5Var21, nk5Var22, nk5Var23, nk5Var24, nk5Var25, nk5Var26, nk5Var27, nk5Var28, nk5Var29, nk5Var30, nk5Var31, nk5Var32, nk5Var33, nk5Var34, nk5Var35, nk5Var36, nk5Var37, nk5Var38, nk5Var39, nk5Var40, nk5Var41, nk5Var42, nk5Var43, nk5Var44, nk5Var45, nk5Var46, nk5Var47, nk5Var48, nk5Var49, nk5Var50, nk5Var51, nk5Var52, nk5Var53, nk5Var54, nk5Var55, nk5Var56, nk5Var57, nk5Var58, nk5Var59, nk5Var60, nk5Var61);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStateInput)) {
            return false;
        }
        UserStateInput userStateInput = (UserStateInput) obj;
        return zq3.c(this.accountMastheadUserModal, userStateInput.accountMastheadUserModal) && zq3.c(this.bottomSheet, userStateInput.bottomSheet) && zq3.c(this.cookShareLinkTooltipWeb, userStateInput.cookShareLinkTooltipWeb) && zq3.c(this.coreNewsSubOnboardingProductPreferences, userStateInput.coreNewsSubOnboardingProductPreferences) && zq3.c(this.coreNewsSubOnboardingStepAllSet, userStateInput.coreNewsSubOnboardingStepAllSet) && zq3.c(this.coreNewsSubOnboardingStepNewsAppDownload, userStateInput.coreNewsSubOnboardingStepNewsAppDownload) && zq3.c(this.coreNewsSubOnboardingStepNewsletters, userStateInput.coreNewsSubOnboardingStepNewsletters) && zq3.c(this.coreNewsSubOnboardingStepProductPreferences, userStateInput.coreNewsSubOnboardingStepProductPreferences) && zq3.c(this.coreNewsSubscriberOnboarding, userStateInput.coreNewsSubscriberOnboarding) && zq3.c(this.disrupterReadInAppDock, userStateInput.disrupterReadInAppDock) && zq3.c(this.disrupterReadInAppViews, userStateInput.disrupterReadInAppViews) && zq3.c(this.emailSignupDock, userStateInput.emailSignupDock) && zq3.c(this.getStartedLater, userStateInput.getStartedLater) && zq3.c(this.getStartedNow, userStateInput.getStartedNow) && zq3.c(this.liveOnboardingBlock, userStateInput.liveOnboardingBlock) && zq3.c(this.mastheadUserModalAppDownload, userStateInput.mastheadUserModalAppDownload) && zq3.c(this.messageSelectionMessageCaps, userStateInput.messageSelectionMessageCaps) && zq3.c(this.productSelection, userStateInput.productSelection) && zq3.c(this.regiOnboarding, userStateInput.regiOnboarding) && zq3.c(this.regiOnboardingGamesPreferences, userStateInput.regiOnboardingGamesPreferences) && zq3.c(this.regiOnboardingProductPreferences, userStateInput.regiOnboardingProductPreferences) && zq3.c(this.regiOnboardingTopicSelections, userStateInput.regiOnboardingTopicSelections) && zq3.c(this.regiOnboardingV2, userStateInput.regiOnboardingV2) && zq3.c(this.regiOnboardingV2StepAllSet, userStateInput.regiOnboardingV2StepAllSet) && zq3.c(this.regiOnboardingV2StepGamesPreferences, userStateInput.regiOnboardingV2StepGamesPreferences) && zq3.c(this.regiOnboardingV2StepNewsAppDownload, userStateInput.regiOnboardingV2StepNewsAppDownload) && zq3.c(this.regiOnboardingV2StepNewsletters, userStateInput.regiOnboardingV2StepNewsletters) && zq3.c(this.regiOnboardingV2StepProductPreferences, userStateInput.regiOnboardingV2StepProductPreferences) && zq3.c(this.regiOnboardingV2StepSaveArticles, userStateInput.regiOnboardingV2StepSaveArticles) && zq3.c(this.regiOnboardingV2StepTopicsPreferences, userStateInput.regiOnboardingV2StepTopicsPreferences) && zq3.c(this.savedArticleTooltip, userStateInput.savedArticleTooltip) && zq3.c(this.shareLinkTooltipApp, userStateInput.shareLinkTooltipApp) && zq3.c(this.shareLinkTooltipWeb, userStateInput.shareLinkTooltipWeb) && zq3.c(this.stickyGiftTestWeb, userStateInput.stickyGiftTestWeb) && zq3.c(this.storyBlock, userStateInput.storyBlock) && zq3.c(this.subOnboardingAppDlDisruptor, userStateInput.subOnboardingAppDlDisruptor) && zq3.c(this.subOnboardingAppDlDock, userStateInput.subOnboardingAppDlDock) && zq3.c(this.subOnboardingStepAppDL, userStateInput.subOnboardingStepAppDL) && zq3.c(this.subOnboardingStepCooking, userStateInput.subOnboardingStepCooking) && zq3.c(this.subOnboardingStepGames, userStateInput.subOnboardingStepGames) && zq3.c(this.subOnboardingStepNewsletters, userStateInput.subOnboardingStepNewsletters) && zq3.c(this.subOnboardingTopicSelections, userStateInput.subOnboardingTopicSelections) && zq3.c(this.subOnboardingV2StepAllSet, userStateInput.subOnboardingV2StepAllSet) && zq3.c(this.subOnboardingV2StepGamesPreferences, userStateInput.subOnboardingV2StepGamesPreferences) && zq3.c(this.subOnboardingV2StepNewsAppDownload, userStateInput.subOnboardingV2StepNewsAppDownload) && zq3.c(this.subOnboardingV2StepNewsletters, userStateInput.subOnboardingV2StepNewsletters) && zq3.c(this.subOnboardingV2StepNotifications, userStateInput.subOnboardingV2StepNotifications) && zq3.c(this.subOnboardingV2StepProductPreferences, userStateInput.subOnboardingV2StepProductPreferences) && zq3.c(this.subOnboardingV2StepSaveArticles, userStateInput.subOnboardingV2StepSaveArticles) && zq3.c(this.subOnboardingV2StepTopicsPreferences, userStateInput.subOnboardingV2StepTopicsPreferences) && zq3.c(this.subscriberOnboarding, userStateInput.subscriberOnboarding) && zq3.c(this.subscriberOnboardingGamesPreferences, userStateInput.subscriberOnboardingGamesPreferences) && zq3.c(this.subscriberOnboardingProductPreferences, userStateInput.subscriberOnboardingProductPreferences) && zq3.c(this.subscriberOnboardingV2, userStateInput.subscriberOnboardingV2) && zq3.c(this.synthVoiceTestWeb, userStateInput.synthVoiceTestWeb) && zq3.c(this.targetedNewsletterSignup, userStateInput.targetedNewsletterSignup) && zq3.c(this.viewedLivePosts, userStateInput.viewedLivePosts) && zq3.c(this.viewedTrustModule, userStateInput.viewedTrustModule) && zq3.c(this.welcomeBannerGames, userStateInput.welcomeBannerGames) && zq3.c(this.welcomeBannerRegi, userStateInput.welcomeBannerRegi) && zq3.c(this.yourPlacesGlobalUpdate, userStateInput.yourPlacesGlobalUpdate);
    }

    public final nk5 getAccountMastheadUserModal() {
        return this.accountMastheadUserModal;
    }

    public final nk5 getBottomSheet() {
        return this.bottomSheet;
    }

    public final nk5 getCookShareLinkTooltipWeb() {
        return this.cookShareLinkTooltipWeb;
    }

    public final nk5 getCoreNewsSubOnboardingProductPreferences() {
        return this.coreNewsSubOnboardingProductPreferences;
    }

    public final nk5 getCoreNewsSubOnboardingStepAllSet() {
        return this.coreNewsSubOnboardingStepAllSet;
    }

    public final nk5 getCoreNewsSubOnboardingStepNewsAppDownload() {
        return this.coreNewsSubOnboardingStepNewsAppDownload;
    }

    public final nk5 getCoreNewsSubOnboardingStepNewsletters() {
        return this.coreNewsSubOnboardingStepNewsletters;
    }

    public final nk5 getCoreNewsSubOnboardingStepProductPreferences() {
        return this.coreNewsSubOnboardingStepProductPreferences;
    }

    public final nk5 getCoreNewsSubscriberOnboarding() {
        return this.coreNewsSubscriberOnboarding;
    }

    public final nk5 getDisrupterReadInAppDock() {
        return this.disrupterReadInAppDock;
    }

    public final nk5 getDisrupterReadInAppViews() {
        return this.disrupterReadInAppViews;
    }

    public final nk5 getEmailSignupDock() {
        return this.emailSignupDock;
    }

    public final nk5 getGetStartedLater() {
        return this.getStartedLater;
    }

    public final nk5 getGetStartedNow() {
        return this.getStartedNow;
    }

    public final nk5 getLiveOnboardingBlock() {
        return this.liveOnboardingBlock;
    }

    public final nk5 getMastheadUserModalAppDownload() {
        return this.mastheadUserModalAppDownload;
    }

    public final nk5 getMessageSelectionMessageCaps() {
        return this.messageSelectionMessageCaps;
    }

    public final nk5 getProductSelection() {
        return this.productSelection;
    }

    public final nk5 getRegiOnboarding() {
        return this.regiOnboarding;
    }

    public final nk5 getRegiOnboardingGamesPreferences() {
        return this.regiOnboardingGamesPreferences;
    }

    public final nk5 getRegiOnboardingProductPreferences() {
        return this.regiOnboardingProductPreferences;
    }

    public final nk5 getRegiOnboardingTopicSelections() {
        return this.regiOnboardingTopicSelections;
    }

    public final nk5 getRegiOnboardingV2() {
        return this.regiOnboardingV2;
    }

    public final nk5 getRegiOnboardingV2StepAllSet() {
        return this.regiOnboardingV2StepAllSet;
    }

    public final nk5 getRegiOnboardingV2StepGamesPreferences() {
        return this.regiOnboardingV2StepGamesPreferences;
    }

    public final nk5 getRegiOnboardingV2StepNewsAppDownload() {
        return this.regiOnboardingV2StepNewsAppDownload;
    }

    public final nk5 getRegiOnboardingV2StepNewsletters() {
        return this.regiOnboardingV2StepNewsletters;
    }

    public final nk5 getRegiOnboardingV2StepProductPreferences() {
        return this.regiOnboardingV2StepProductPreferences;
    }

    public final nk5 getRegiOnboardingV2StepSaveArticles() {
        return this.regiOnboardingV2StepSaveArticles;
    }

    public final nk5 getRegiOnboardingV2StepTopicsPreferences() {
        return this.regiOnboardingV2StepTopicsPreferences;
    }

    public final nk5 getSavedArticleTooltip() {
        return this.savedArticleTooltip;
    }

    public final nk5 getShareLinkTooltipApp() {
        return this.shareLinkTooltipApp;
    }

    public final nk5 getShareLinkTooltipWeb() {
        return this.shareLinkTooltipWeb;
    }

    public final nk5 getStickyGiftTestWeb() {
        return this.stickyGiftTestWeb;
    }

    public final nk5 getStoryBlock() {
        return this.storyBlock;
    }

    public final nk5 getSubOnboardingAppDlDisruptor() {
        return this.subOnboardingAppDlDisruptor;
    }

    public final nk5 getSubOnboardingAppDlDock() {
        return this.subOnboardingAppDlDock;
    }

    public final nk5 getSubOnboardingStepAppDL() {
        return this.subOnboardingStepAppDL;
    }

    public final nk5 getSubOnboardingStepCooking() {
        return this.subOnboardingStepCooking;
    }

    public final nk5 getSubOnboardingStepGames() {
        return this.subOnboardingStepGames;
    }

    public final nk5 getSubOnboardingStepNewsletters() {
        return this.subOnboardingStepNewsletters;
    }

    public final nk5 getSubOnboardingTopicSelections() {
        return this.subOnboardingTopicSelections;
    }

    public final nk5 getSubOnboardingV2StepAllSet() {
        return this.subOnboardingV2StepAllSet;
    }

    public final nk5 getSubOnboardingV2StepGamesPreferences() {
        return this.subOnboardingV2StepGamesPreferences;
    }

    public final nk5 getSubOnboardingV2StepNewsAppDownload() {
        return this.subOnboardingV2StepNewsAppDownload;
    }

    public final nk5 getSubOnboardingV2StepNewsletters() {
        return this.subOnboardingV2StepNewsletters;
    }

    public final nk5 getSubOnboardingV2StepNotifications() {
        return this.subOnboardingV2StepNotifications;
    }

    public final nk5 getSubOnboardingV2StepProductPreferences() {
        return this.subOnboardingV2StepProductPreferences;
    }

    public final nk5 getSubOnboardingV2StepSaveArticles() {
        return this.subOnboardingV2StepSaveArticles;
    }

    public final nk5 getSubOnboardingV2StepTopicsPreferences() {
        return this.subOnboardingV2StepTopicsPreferences;
    }

    public final nk5 getSubscriberOnboarding() {
        return this.subscriberOnboarding;
    }

    public final nk5 getSubscriberOnboardingGamesPreferences() {
        return this.subscriberOnboardingGamesPreferences;
    }

    public final nk5 getSubscriberOnboardingProductPreferences() {
        return this.subscriberOnboardingProductPreferences;
    }

    public final nk5 getSubscriberOnboardingV2() {
        return this.subscriberOnboardingV2;
    }

    public final nk5 getSynthVoiceTestWeb() {
        return this.synthVoiceTestWeb;
    }

    public final nk5 getTargetedNewsletterSignup() {
        return this.targetedNewsletterSignup;
    }

    public final nk5 getViewedLivePosts() {
        return this.viewedLivePosts;
    }

    public final nk5 getViewedTrustModule() {
        return this.viewedTrustModule;
    }

    public final nk5 getWelcomeBannerGames() {
        return this.welcomeBannerGames;
    }

    public final nk5 getWelcomeBannerRegi() {
        return this.welcomeBannerRegi;
    }

    public final nk5 getYourPlacesGlobalUpdate() {
        return this.yourPlacesGlobalUpdate;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.accountMastheadUserModal.hashCode() * 31) + this.bottomSheet.hashCode()) * 31) + this.cookShareLinkTooltipWeb.hashCode()) * 31) + this.coreNewsSubOnboardingProductPreferences.hashCode()) * 31) + this.coreNewsSubOnboardingStepAllSet.hashCode()) * 31) + this.coreNewsSubOnboardingStepNewsAppDownload.hashCode()) * 31) + this.coreNewsSubOnboardingStepNewsletters.hashCode()) * 31) + this.coreNewsSubOnboardingStepProductPreferences.hashCode()) * 31) + this.coreNewsSubscriberOnboarding.hashCode()) * 31) + this.disrupterReadInAppDock.hashCode()) * 31) + this.disrupterReadInAppViews.hashCode()) * 31) + this.emailSignupDock.hashCode()) * 31) + this.getStartedLater.hashCode()) * 31) + this.getStartedNow.hashCode()) * 31) + this.liveOnboardingBlock.hashCode()) * 31) + this.mastheadUserModalAppDownload.hashCode()) * 31) + this.messageSelectionMessageCaps.hashCode()) * 31) + this.productSelection.hashCode()) * 31) + this.regiOnboarding.hashCode()) * 31) + this.regiOnboardingGamesPreferences.hashCode()) * 31) + this.regiOnboardingProductPreferences.hashCode()) * 31) + this.regiOnboardingTopicSelections.hashCode()) * 31) + this.regiOnboardingV2.hashCode()) * 31) + this.regiOnboardingV2StepAllSet.hashCode()) * 31) + this.regiOnboardingV2StepGamesPreferences.hashCode()) * 31) + this.regiOnboardingV2StepNewsAppDownload.hashCode()) * 31) + this.regiOnboardingV2StepNewsletters.hashCode()) * 31) + this.regiOnboardingV2StepProductPreferences.hashCode()) * 31) + this.regiOnboardingV2StepSaveArticles.hashCode()) * 31) + this.regiOnboardingV2StepTopicsPreferences.hashCode()) * 31) + this.savedArticleTooltip.hashCode()) * 31) + this.shareLinkTooltipApp.hashCode()) * 31) + this.shareLinkTooltipWeb.hashCode()) * 31) + this.stickyGiftTestWeb.hashCode()) * 31) + this.storyBlock.hashCode()) * 31) + this.subOnboardingAppDlDisruptor.hashCode()) * 31) + this.subOnboardingAppDlDock.hashCode()) * 31) + this.subOnboardingStepAppDL.hashCode()) * 31) + this.subOnboardingStepCooking.hashCode()) * 31) + this.subOnboardingStepGames.hashCode()) * 31) + this.subOnboardingStepNewsletters.hashCode()) * 31) + this.subOnboardingTopicSelections.hashCode()) * 31) + this.subOnboardingV2StepAllSet.hashCode()) * 31) + this.subOnboardingV2StepGamesPreferences.hashCode()) * 31) + this.subOnboardingV2StepNewsAppDownload.hashCode()) * 31) + this.subOnboardingV2StepNewsletters.hashCode()) * 31) + this.subOnboardingV2StepNotifications.hashCode()) * 31) + this.subOnboardingV2StepProductPreferences.hashCode()) * 31) + this.subOnboardingV2StepSaveArticles.hashCode()) * 31) + this.subOnboardingV2StepTopicsPreferences.hashCode()) * 31) + this.subscriberOnboarding.hashCode()) * 31) + this.subscriberOnboardingGamesPreferences.hashCode()) * 31) + this.subscriberOnboardingProductPreferences.hashCode()) * 31) + this.subscriberOnboardingV2.hashCode()) * 31) + this.synthVoiceTestWeb.hashCode()) * 31) + this.targetedNewsletterSignup.hashCode()) * 31) + this.viewedLivePosts.hashCode()) * 31) + this.viewedTrustModule.hashCode()) * 31) + this.welcomeBannerGames.hashCode()) * 31) + this.welcomeBannerRegi.hashCode()) * 31) + this.yourPlacesGlobalUpdate.hashCode();
    }

    public String toString() {
        return "UserStateInput(accountMastheadUserModal=" + this.accountMastheadUserModal + ", bottomSheet=" + this.bottomSheet + ", cookShareLinkTooltipWeb=" + this.cookShareLinkTooltipWeb + ", coreNewsSubOnboardingProductPreferences=" + this.coreNewsSubOnboardingProductPreferences + ", coreNewsSubOnboardingStepAllSet=" + this.coreNewsSubOnboardingStepAllSet + ", coreNewsSubOnboardingStepNewsAppDownload=" + this.coreNewsSubOnboardingStepNewsAppDownload + ", coreNewsSubOnboardingStepNewsletters=" + this.coreNewsSubOnboardingStepNewsletters + ", coreNewsSubOnboardingStepProductPreferences=" + this.coreNewsSubOnboardingStepProductPreferences + ", coreNewsSubscriberOnboarding=" + this.coreNewsSubscriberOnboarding + ", disrupterReadInAppDock=" + this.disrupterReadInAppDock + ", disrupterReadInAppViews=" + this.disrupterReadInAppViews + ", emailSignupDock=" + this.emailSignupDock + ", getStartedLater=" + this.getStartedLater + ", getStartedNow=" + this.getStartedNow + ", liveOnboardingBlock=" + this.liveOnboardingBlock + ", mastheadUserModalAppDownload=" + this.mastheadUserModalAppDownload + ", messageSelectionMessageCaps=" + this.messageSelectionMessageCaps + ", productSelection=" + this.productSelection + ", regiOnboarding=" + this.regiOnboarding + ", regiOnboardingGamesPreferences=" + this.regiOnboardingGamesPreferences + ", regiOnboardingProductPreferences=" + this.regiOnboardingProductPreferences + ", regiOnboardingTopicSelections=" + this.regiOnboardingTopicSelections + ", regiOnboardingV2=" + this.regiOnboardingV2 + ", regiOnboardingV2StepAllSet=" + this.regiOnboardingV2StepAllSet + ", regiOnboardingV2StepGamesPreferences=" + this.regiOnboardingV2StepGamesPreferences + ", regiOnboardingV2StepNewsAppDownload=" + this.regiOnboardingV2StepNewsAppDownload + ", regiOnboardingV2StepNewsletters=" + this.regiOnboardingV2StepNewsletters + ", regiOnboardingV2StepProductPreferences=" + this.regiOnboardingV2StepProductPreferences + ", regiOnboardingV2StepSaveArticles=" + this.regiOnboardingV2StepSaveArticles + ", regiOnboardingV2StepTopicsPreferences=" + this.regiOnboardingV2StepTopicsPreferences + ", savedArticleTooltip=" + this.savedArticleTooltip + ", shareLinkTooltipApp=" + this.shareLinkTooltipApp + ", shareLinkTooltipWeb=" + this.shareLinkTooltipWeb + ", stickyGiftTestWeb=" + this.stickyGiftTestWeb + ", storyBlock=" + this.storyBlock + ", subOnboardingAppDlDisruptor=" + this.subOnboardingAppDlDisruptor + ", subOnboardingAppDlDock=" + this.subOnboardingAppDlDock + ", subOnboardingStepAppDL=" + this.subOnboardingStepAppDL + ", subOnboardingStepCooking=" + this.subOnboardingStepCooking + ", subOnboardingStepGames=" + this.subOnboardingStepGames + ", subOnboardingStepNewsletters=" + this.subOnboardingStepNewsletters + ", subOnboardingTopicSelections=" + this.subOnboardingTopicSelections + ", subOnboardingV2StepAllSet=" + this.subOnboardingV2StepAllSet + ", subOnboardingV2StepGamesPreferences=" + this.subOnboardingV2StepGamesPreferences + ", subOnboardingV2StepNewsAppDownload=" + this.subOnboardingV2StepNewsAppDownload + ", subOnboardingV2StepNewsletters=" + this.subOnboardingV2StepNewsletters + ", subOnboardingV2StepNotifications=" + this.subOnboardingV2StepNotifications + ", subOnboardingV2StepProductPreferences=" + this.subOnboardingV2StepProductPreferences + ", subOnboardingV2StepSaveArticles=" + this.subOnboardingV2StepSaveArticles + ", subOnboardingV2StepTopicsPreferences=" + this.subOnboardingV2StepTopicsPreferences + ", subscriberOnboarding=" + this.subscriberOnboarding + ", subscriberOnboardingGamesPreferences=" + this.subscriberOnboardingGamesPreferences + ", subscriberOnboardingProductPreferences=" + this.subscriberOnboardingProductPreferences + ", subscriberOnboardingV2=" + this.subscriberOnboardingV2 + ", synthVoiceTestWeb=" + this.synthVoiceTestWeb + ", targetedNewsletterSignup=" + this.targetedNewsletterSignup + ", viewedLivePosts=" + this.viewedLivePosts + ", viewedTrustModule=" + this.viewedTrustModule + ", welcomeBannerGames=" + this.welcomeBannerGames + ", welcomeBannerRegi=" + this.welcomeBannerRegi + ", yourPlacesGlobalUpdate=" + this.yourPlacesGlobalUpdate + ")";
    }

    public UserStateInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32, nk5 nk5Var33, nk5 nk5Var34, nk5 nk5Var35, nk5 nk5Var36, nk5 nk5Var37, nk5 nk5Var38, nk5 nk5Var39, nk5 nk5Var40, nk5 nk5Var41, nk5 nk5Var42, nk5 nk5Var43, nk5 nk5Var44, nk5 nk5Var45, nk5 nk5Var46, nk5 nk5Var47, nk5 nk5Var48, nk5 nk5Var49, nk5 nk5Var50, nk5 nk5Var51, nk5 nk5Var52, nk5 nk5Var53, nk5 nk5Var54, nk5 nk5Var55, nk5 nk5Var56, nk5 nk5Var57, nk5 nk5Var58, nk5 nk5Var59, nk5 nk5Var60, nk5 nk5Var61) {
        zq3.h(nk5Var, "accountMastheadUserModal");
        zq3.h(nk5Var2, "bottomSheet");
        zq3.h(nk5Var3, "cookShareLinkTooltipWeb");
        zq3.h(nk5Var4, "coreNewsSubOnboardingProductPreferences");
        zq3.h(nk5Var5, "coreNewsSubOnboardingStepAllSet");
        zq3.h(nk5Var6, "coreNewsSubOnboardingStepNewsAppDownload");
        zq3.h(nk5Var7, "coreNewsSubOnboardingStepNewsletters");
        zq3.h(nk5Var8, "coreNewsSubOnboardingStepProductPreferences");
        zq3.h(nk5Var9, "coreNewsSubscriberOnboarding");
        zq3.h(nk5Var10, "disrupterReadInAppDock");
        zq3.h(nk5Var11, "disrupterReadInAppViews");
        zq3.h(nk5Var12, "emailSignupDock");
        zq3.h(nk5Var13, "getStartedLater");
        zq3.h(nk5Var14, "getStartedNow");
        zq3.h(nk5Var15, "liveOnboardingBlock");
        zq3.h(nk5Var16, "mastheadUserModalAppDownload");
        zq3.h(nk5Var17, "messageSelectionMessageCaps");
        zq3.h(nk5Var18, "productSelection");
        zq3.h(nk5Var19, "regiOnboarding");
        zq3.h(nk5Var20, "regiOnboardingGamesPreferences");
        zq3.h(nk5Var21, "regiOnboardingProductPreferences");
        zq3.h(nk5Var22, "regiOnboardingTopicSelections");
        zq3.h(nk5Var23, "regiOnboardingV2");
        zq3.h(nk5Var24, "regiOnboardingV2StepAllSet");
        zq3.h(nk5Var25, "regiOnboardingV2StepGamesPreferences");
        zq3.h(nk5Var26, "regiOnboardingV2StepNewsAppDownload");
        zq3.h(nk5Var27, "regiOnboardingV2StepNewsletters");
        zq3.h(nk5Var28, "regiOnboardingV2StepProductPreferences");
        zq3.h(nk5Var29, "regiOnboardingV2StepSaveArticles");
        zq3.h(nk5Var30, "regiOnboardingV2StepTopicsPreferences");
        zq3.h(nk5Var31, "savedArticleTooltip");
        zq3.h(nk5Var32, "shareLinkTooltipApp");
        zq3.h(nk5Var33, "shareLinkTooltipWeb");
        zq3.h(nk5Var34, "stickyGiftTestWeb");
        zq3.h(nk5Var35, "storyBlock");
        zq3.h(nk5Var36, "subOnboardingAppDlDisruptor");
        zq3.h(nk5Var37, "subOnboardingAppDlDock");
        zq3.h(nk5Var38, "subOnboardingStepAppDL");
        zq3.h(nk5Var39, "subOnboardingStepCooking");
        zq3.h(nk5Var40, "subOnboardingStepGames");
        zq3.h(nk5Var41, "subOnboardingStepNewsletters");
        zq3.h(nk5Var42, "subOnboardingTopicSelections");
        zq3.h(nk5Var43, "subOnboardingV2StepAllSet");
        zq3.h(nk5Var44, "subOnboardingV2StepGamesPreferences");
        zq3.h(nk5Var45, "subOnboardingV2StepNewsAppDownload");
        zq3.h(nk5Var46, "subOnboardingV2StepNewsletters");
        zq3.h(nk5Var47, "subOnboardingV2StepNotifications");
        zq3.h(nk5Var48, "subOnboardingV2StepProductPreferences");
        zq3.h(nk5Var49, "subOnboardingV2StepSaveArticles");
        zq3.h(nk5Var50, "subOnboardingV2StepTopicsPreferences");
        zq3.h(nk5Var51, "subscriberOnboarding");
        zq3.h(nk5Var52, "subscriberOnboardingGamesPreferences");
        zq3.h(nk5Var53, "subscriberOnboardingProductPreferences");
        zq3.h(nk5Var54, "subscriberOnboardingV2");
        zq3.h(nk5Var55, "synthVoiceTestWeb");
        zq3.h(nk5Var56, "targetedNewsletterSignup");
        zq3.h(nk5Var57, "viewedLivePosts");
        zq3.h(nk5Var58, "viewedTrustModule");
        zq3.h(nk5Var59, "welcomeBannerGames");
        zq3.h(nk5Var60, "welcomeBannerRegi");
        zq3.h(nk5Var61, "yourPlacesGlobalUpdate");
        this.accountMastheadUserModal = nk5Var;
        this.bottomSheet = nk5Var2;
        this.cookShareLinkTooltipWeb = nk5Var3;
        this.coreNewsSubOnboardingProductPreferences = nk5Var4;
        this.coreNewsSubOnboardingStepAllSet = nk5Var5;
        this.coreNewsSubOnboardingStepNewsAppDownload = nk5Var6;
        this.coreNewsSubOnboardingStepNewsletters = nk5Var7;
        this.coreNewsSubOnboardingStepProductPreferences = nk5Var8;
        this.coreNewsSubscriberOnboarding = nk5Var9;
        this.disrupterReadInAppDock = nk5Var10;
        this.disrupterReadInAppViews = nk5Var11;
        this.emailSignupDock = nk5Var12;
        this.getStartedLater = nk5Var13;
        this.getStartedNow = nk5Var14;
        this.liveOnboardingBlock = nk5Var15;
        this.mastheadUserModalAppDownload = nk5Var16;
        this.messageSelectionMessageCaps = nk5Var17;
        this.productSelection = nk5Var18;
        this.regiOnboarding = nk5Var19;
        this.regiOnboardingGamesPreferences = nk5Var20;
        this.regiOnboardingProductPreferences = nk5Var21;
        this.regiOnboardingTopicSelections = nk5Var22;
        this.regiOnboardingV2 = nk5Var23;
        this.regiOnboardingV2StepAllSet = nk5Var24;
        this.regiOnboardingV2StepGamesPreferences = nk5Var25;
        this.regiOnboardingV2StepNewsAppDownload = nk5Var26;
        this.regiOnboardingV2StepNewsletters = nk5Var27;
        this.regiOnboardingV2StepProductPreferences = nk5Var28;
        this.regiOnboardingV2StepSaveArticles = nk5Var29;
        this.regiOnboardingV2StepTopicsPreferences = nk5Var30;
        this.savedArticleTooltip = nk5Var31;
        this.shareLinkTooltipApp = nk5Var32;
        this.shareLinkTooltipWeb = nk5Var33;
        this.stickyGiftTestWeb = nk5Var34;
        this.storyBlock = nk5Var35;
        this.subOnboardingAppDlDisruptor = nk5Var36;
        this.subOnboardingAppDlDock = nk5Var37;
        this.subOnboardingStepAppDL = nk5Var38;
        this.subOnboardingStepCooking = nk5Var39;
        this.subOnboardingStepGames = nk5Var40;
        this.subOnboardingStepNewsletters = nk5Var41;
        this.subOnboardingTopicSelections = nk5Var42;
        this.subOnboardingV2StepAllSet = nk5Var43;
        this.subOnboardingV2StepGamesPreferences = nk5Var44;
        this.subOnboardingV2StepNewsAppDownload = nk5Var45;
        this.subOnboardingV2StepNewsletters = nk5Var46;
        this.subOnboardingV2StepNotifications = nk5Var47;
        this.subOnboardingV2StepProductPreferences = nk5Var48;
        this.subOnboardingV2StepSaveArticles = nk5Var49;
        this.subOnboardingV2StepTopicsPreferences = nk5Var50;
        this.subscriberOnboarding = nk5Var51;
        this.subscriberOnboardingGamesPreferences = nk5Var52;
        this.subscriberOnboardingProductPreferences = nk5Var53;
        this.subscriberOnboardingV2 = nk5Var54;
        this.synthVoiceTestWeb = nk5Var55;
        this.targetedNewsletterSignup = nk5Var56;
        this.viewedLivePosts = nk5Var57;
        this.viewedTrustModule = nk5Var58;
        this.welcomeBannerGames = nk5Var59;
        this.welcomeBannerRegi = nk5Var60;
        this.yourPlacesGlobalUpdate = nk5Var61;
    }

    public /* synthetic */ UserStateInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32, nk5 nk5Var33, nk5 nk5Var34, nk5 nk5Var35, nk5 nk5Var36, nk5 nk5Var37, nk5 nk5Var38, nk5 nk5Var39, nk5 nk5Var40, nk5 nk5Var41, nk5 nk5Var42, nk5 nk5Var43, nk5 nk5Var44, nk5 nk5Var45, nk5 nk5Var46, nk5 nk5Var47, nk5 nk5Var48, nk5 nk5Var49, nk5 nk5Var50, nk5 nk5Var51, nk5 nk5Var52, nk5 nk5Var53, nk5 nk5Var54, nk5 nk5Var55, nk5 nk5Var56, nk5 nk5Var57, nk5 nk5Var58, nk5 nk5Var59, nk5 nk5Var60, nk5 nk5Var61, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6, (i & 64) != 0 ? nk5.a.b : nk5Var7, (i & 128) != 0 ? nk5.a.b : nk5Var8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nk5.a.b : nk5Var9, (i & 512) != 0 ? nk5.a.b : nk5Var10, (i & 1024) != 0 ? nk5.a.b : nk5Var11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var13, (i & 8192) != 0 ? nk5.a.b : nk5Var14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? nk5.a.b : nk5Var15, (i & 32768) != 0 ? nk5.a.b : nk5Var16, (i & 65536) != 0 ? nk5.a.b : nk5Var17, (i & 131072) != 0 ? nk5.a.b : nk5Var18, (i & 262144) != 0 ? nk5.a.b : nk5Var19, (i & 524288) != 0 ? nk5.a.b : nk5Var20, (i & Constants.MB) != 0 ? nk5.a.b : nk5Var21, (i & 2097152) != 0 ? nk5.a.b : nk5Var22, (i & 4194304) != 0 ? nk5.a.b : nk5Var23, (i & 8388608) != 0 ? nk5.a.b : nk5Var24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? nk5.a.b : nk5Var25, (i & 33554432) != 0 ? nk5.a.b : nk5Var26, (i & 67108864) != 0 ? nk5.a.b : nk5Var27, (i & 134217728) != 0 ? nk5.a.b : nk5Var28, (i & 268435456) != 0 ? nk5.a.b : nk5Var29, (i & 536870912) != 0 ? nk5.a.b : nk5Var30, (i & 1073741824) != 0 ? nk5.a.b : nk5Var31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? nk5.a.b : nk5Var32, (i2 & 1) != 0 ? nk5.a.b : nk5Var33, (i2 & 2) != 0 ? nk5.a.b : nk5Var34, (i2 & 4) != 0 ? nk5.a.b : nk5Var35, (i2 & 8) != 0 ? nk5.a.b : nk5Var36, (i2 & 16) != 0 ? nk5.a.b : nk5Var37, (i2 & 32) != 0 ? nk5.a.b : nk5Var38, (i2 & 64) != 0 ? nk5.a.b : nk5Var39, (i2 & 128) != 0 ? nk5.a.b : nk5Var40, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nk5.a.b : nk5Var41, (i2 & 512) != 0 ? nk5.a.b : nk5Var42, (i2 & 1024) != 0 ? nk5.a.b : nk5Var43, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var44, (i2 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var45, (i2 & 8192) != 0 ? nk5.a.b : nk5Var46, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? nk5.a.b : nk5Var47, (i2 & 32768) != 0 ? nk5.a.b : nk5Var48, (i2 & 65536) != 0 ? nk5.a.b : nk5Var49, (i2 & 131072) != 0 ? nk5.a.b : nk5Var50, (i2 & 262144) != 0 ? nk5.a.b : nk5Var51, (i2 & 524288) != 0 ? nk5.a.b : nk5Var52, (i2 & Constants.MB) != 0 ? nk5.a.b : nk5Var53, (i2 & 2097152) != 0 ? nk5.a.b : nk5Var54, (i2 & 4194304) != 0 ? nk5.a.b : nk5Var55, (i2 & 8388608) != 0 ? nk5.a.b : nk5Var56, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? nk5.a.b : nk5Var57, (i2 & 33554432) != 0 ? nk5.a.b : nk5Var58, (i2 & 67108864) != 0 ? nk5.a.b : nk5Var59, (i2 & 134217728) != 0 ? nk5.a.b : nk5Var60, (i2 & 268435456) != 0 ? nk5.a.b : nk5Var61);
    }
}
