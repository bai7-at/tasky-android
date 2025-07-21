package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.UserStateInput;

/* loaded from: classes5.dex */
public final class UserStateInput_InputAdapter implements h8 {
    public static final UserStateInput_InputAdapter INSTANCE = new UserStateInput_InputAdapter();

    private UserStateInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public UserStateInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, UserStateInput userStateInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userStateInput, "value");
        if (userStateInput.getAccountMastheadUserModal() instanceof nk5.c) {
            lu3Var.name("accountMastheadUserModal");
            j8.e(j8.b(j8.d(AccountMastheadUserModalInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getAccountMastheadUserModal());
        }
        if (userStateInput.getBottomSheet() instanceof nk5.c) {
            lu3Var.name("bottomSheet");
            j8.e(j8.b(j8.d(BottomSheetInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getBottomSheet());
        }
        if (userStateInput.getCookShareLinkTooltipWeb() instanceof nk5.c) {
            lu3Var.name("cookShareLinkTooltipWeb");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCookShareLinkTooltipWeb());
        }
        if (userStateInput.getCoreNewsSubOnboardingProductPreferences() instanceof nk5.c) {
            lu3Var.name("coreNewsSubOnboardingProductPreferences");
            j8.e(j8.b(j8.d(SubscriberOnboardingProductPreferencesInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubOnboardingProductPreferences());
        }
        if (userStateInput.getCoreNewsSubOnboardingStepAllSet() instanceof nk5.c) {
            lu3Var.name("coreNewsSubOnboardingStepAllSet");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubOnboardingStepAllSet());
        }
        if (userStateInput.getCoreNewsSubOnboardingStepNewsAppDownload() instanceof nk5.c) {
            lu3Var.name("coreNewsSubOnboardingStepNewsAppDownload");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubOnboardingStepNewsAppDownload());
        }
        if (userStateInput.getCoreNewsSubOnboardingStepNewsletters() instanceof nk5.c) {
            lu3Var.name("coreNewsSubOnboardingStepNewsletters");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubOnboardingStepNewsletters());
        }
        if (userStateInput.getCoreNewsSubOnboardingStepProductPreferences() instanceof nk5.c) {
            lu3Var.name("coreNewsSubOnboardingStepProductPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubOnboardingStepProductPreferences());
        }
        if (userStateInput.getCoreNewsSubscriberOnboarding() instanceof nk5.c) {
            lu3Var.name("coreNewsSubscriberOnboarding");
            j8.e(j8.b(j8.d(SubscriberOnboardingV2Input_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getCoreNewsSubscriberOnboarding());
        }
        if (userStateInput.getDisrupterReadInAppDock() instanceof nk5.c) {
            lu3Var.name("disrupterReadInAppDock");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getDisrupterReadInAppDock());
        }
        if (userStateInput.getDisrupterReadInAppViews() instanceof nk5.c) {
            lu3Var.name("disrupterReadInAppViews");
            j8.e(j8.b(j8.d(ViewTrackerInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getDisrupterReadInAppViews());
        }
        if (userStateInput.getEmailSignupDock() instanceof nk5.c) {
            lu3Var.name("emailSignupDock");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getEmailSignupDock());
        }
        if (userStateInput.getGetStartedLater() instanceof nk5.c) {
            lu3Var.name("getStartedLater");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getGetStartedLater());
        }
        if (userStateInput.getGetStartedNow() instanceof nk5.c) {
            lu3Var.name("getStartedNow");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getGetStartedNow());
        }
        if (userStateInput.getLiveOnboardingBlock() instanceof nk5.c) {
            lu3Var.name("liveOnboardingBlock");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getLiveOnboardingBlock());
        }
        if (userStateInput.getMastheadUserModalAppDownload() instanceof nk5.c) {
            lu3Var.name("mastheadUserModalAppDownload");
            j8.e(j8.b(j8.d(MastheadUserModalAppDownloadInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getMastheadUserModalAppDownload());
        }
        if (userStateInput.getMessageSelectionMessageCaps() instanceof nk5.c) {
            lu3Var.name("messageSelectionMessageCaps");
            j8.e(j8.b(j8.a(j8.b(j8.d(MessageSelectionMessageCapInput_InputAdapter.INSTANCE, false, 1, null))))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getMessageSelectionMessageCaps());
        }
        if (userStateInput.getProductSelection() instanceof nk5.c) {
            lu3Var.name("productSelection");
            j8.e(j8.b(j8.d(ProductSelectionInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getProductSelection());
        }
        if (userStateInput.getRegiOnboarding() instanceof nk5.c) {
            lu3Var.name("regiOnboarding");
            j8.e(j8.b(j8.d(RegiOnboardingInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboarding());
        }
        if (userStateInput.getRegiOnboardingGamesPreferences() instanceof nk5.c) {
            lu3Var.name("regiOnboardingGamesPreferences");
            j8.e(j8.b(j8.d(RegiOnboardingGamesPreferencesInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingGamesPreferences());
        }
        if (userStateInput.getRegiOnboardingProductPreferences() instanceof nk5.c) {
            lu3Var.name("regiOnboardingProductPreferences");
            j8.e(j8.b(j8.d(SubscriberOnboardingProductPreferencesInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingProductPreferences());
        }
        if (userStateInput.getRegiOnboardingTopicSelections() instanceof nk5.c) {
            lu3Var.name("regiOnboardingTopicSelections");
            j8.e(j8.b(j8.a(j8.b(j8.d(OnboardingTopicsInput_InputAdapter.INSTANCE, false, 1, null))))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingTopicSelections());
        }
        if (userStateInput.getRegiOnboardingV2() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2");
            j8.e(j8.b(j8.d(RegiOnboardingV2Input_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2());
        }
        if (userStateInput.getRegiOnboardingV2StepAllSet() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepAllSet");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepAllSet());
        }
        if (userStateInput.getRegiOnboardingV2StepGamesPreferences() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepGamesPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepGamesPreferences());
        }
        if (userStateInput.getRegiOnboardingV2StepNewsAppDownload() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepNewsAppDownload");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepNewsAppDownload());
        }
        if (userStateInput.getRegiOnboardingV2StepNewsletters() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepNewsletters");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepNewsletters());
        }
        if (userStateInput.getRegiOnboardingV2StepProductPreferences() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepProductPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepProductPreferences());
        }
        if (userStateInput.getRegiOnboardingV2StepSaveArticles() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepSaveArticles");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepSaveArticles());
        }
        if (userStateInput.getRegiOnboardingV2StepTopicsPreferences() instanceof nk5.c) {
            lu3Var.name("regiOnboardingV2StepTopicsPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getRegiOnboardingV2StepTopicsPreferences());
        }
        if (userStateInput.getSavedArticleTooltip() instanceof nk5.c) {
            lu3Var.name("savedArticleTooltip");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSavedArticleTooltip());
        }
        if (userStateInput.getShareLinkTooltipApp() instanceof nk5.c) {
            lu3Var.name("shareLinkTooltipApp");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getShareLinkTooltipApp());
        }
        if (userStateInput.getShareLinkTooltipWeb() instanceof nk5.c) {
            lu3Var.name("shareLinkTooltipWeb");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getShareLinkTooltipWeb());
        }
        if (userStateInput.getStickyGiftTestWeb() instanceof nk5.c) {
            lu3Var.name("stickyGiftTestWeb");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getStickyGiftTestWeb());
        }
        if (userStateInput.getStoryBlock() instanceof nk5.c) {
            lu3Var.name("storyBlock");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getStoryBlock());
        }
        if (userStateInput.getSubOnboardingAppDlDisruptor() instanceof nk5.c) {
            lu3Var.name("subOnboardingAppDlDisruptor");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingAppDlDisruptor());
        }
        if (userStateInput.getSubOnboardingAppDlDock() instanceof nk5.c) {
            lu3Var.name("subOnboardingAppDlDock");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingAppDlDock());
        }
        if (userStateInput.getSubOnboardingStepAppDL() instanceof nk5.c) {
            lu3Var.name("subOnboardingStepAppDL");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingStepAppDL());
        }
        if (userStateInput.getSubOnboardingStepCooking() instanceof nk5.c) {
            lu3Var.name("subOnboardingStepCooking");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingStepCooking());
        }
        if (userStateInput.getSubOnboardingStepGames() instanceof nk5.c) {
            lu3Var.name("subOnboardingStepGames");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingStepGames());
        }
        if (userStateInput.getSubOnboardingStepNewsletters() instanceof nk5.c) {
            lu3Var.name("subOnboardingStepNewsletters");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingStepNewsletters());
        }
        if (userStateInput.getSubOnboardingTopicSelections() instanceof nk5.c) {
            lu3Var.name("subOnboardingTopicSelections");
            j8.e(j8.b(j8.a(j8.b(j8.d(OnboardingTopicsInput_InputAdapter.INSTANCE, false, 1, null))))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingTopicSelections());
        }
        if (userStateInput.getSubOnboardingV2StepAllSet() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepAllSet");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepAllSet());
        }
        if (userStateInput.getSubOnboardingV2StepGamesPreferences() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepGamesPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepGamesPreferences());
        }
        if (userStateInput.getSubOnboardingV2StepNewsAppDownload() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepNewsAppDownload");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepNewsAppDownload());
        }
        if (userStateInput.getSubOnboardingV2StepNewsletters() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepNewsletters");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepNewsletters());
        }
        if (userStateInput.getSubOnboardingV2StepNotifications() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepNotifications");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepNotifications());
        }
        if (userStateInput.getSubOnboardingV2StepProductPreferences() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepProductPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepProductPreferences());
        }
        if (userStateInput.getSubOnboardingV2StepSaveArticles() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepSaveArticles");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepSaveArticles());
        }
        if (userStateInput.getSubOnboardingV2StepTopicsPreferences() instanceof nk5.c) {
            lu3Var.name("subOnboardingV2StepTopicsPreferences");
            j8.e(j8.b(j8.d(SubOnboardingStepInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubOnboardingV2StepTopicsPreferences());
        }
        if (userStateInput.getSubscriberOnboarding() instanceof nk5.c) {
            lu3Var.name("subscriberOnboarding");
            j8.e(j8.b(j8.d(SubscriberOnboardingInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubscriberOnboarding());
        }
        if (userStateInput.getSubscriberOnboardingGamesPreferences() instanceof nk5.c) {
            lu3Var.name("subscriberOnboardingGamesPreferences");
            j8.e(j8.b(j8.d(SubscriberOnboardingGamesPreferencesInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubscriberOnboardingGamesPreferences());
        }
        if (userStateInput.getSubscriberOnboardingProductPreferences() instanceof nk5.c) {
            lu3Var.name("subscriberOnboardingProductPreferences");
            j8.e(j8.b(j8.d(SubscriberOnboardingProductPreferencesInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubscriberOnboardingProductPreferences());
        }
        if (userStateInput.getSubscriberOnboardingV2() instanceof nk5.c) {
            lu3Var.name("subscriberOnboardingV2");
            j8.e(j8.b(j8.d(SubscriberOnboardingV2Input_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSubscriberOnboardingV2());
        }
        if (userStateInput.getSynthVoiceTestWeb() instanceof nk5.c) {
            lu3Var.name("synthVoiceTestWeb");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getSynthVoiceTestWeb());
        }
        if (userStateInput.getTargetedNewsletterSignup() instanceof nk5.c) {
            lu3Var.name("targetedNewsletterSignup");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getTargetedNewsletterSignup());
        }
        if (userStateInput.getViewedLivePosts() instanceof nk5.c) {
            lu3Var.name("viewedLivePosts");
            j8.e(j8.b(j8.a(j8.b(j8.d(LivePostsSeenInput_InputAdapter.INSTANCE, false, 1, null))))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getViewedLivePosts());
        }
        if (userStateInput.getViewedTrustModule() instanceof nk5.c) {
            lu3Var.name("viewedTrustModule");
            j8.e(j8.b(j8.a(j8.b(j8.d(ViewedTrustModuleInput_InputAdapter.INSTANCE, false, 1, null))))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getViewedTrustModule());
        }
        if (userStateInput.getWelcomeBannerGames() instanceof nk5.c) {
            lu3Var.name("welcomeBannerGames");
            j8.e(j8.b(j8.d(ViewTrackerInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getWelcomeBannerGames());
        }
        if (userStateInput.getWelcomeBannerRegi() instanceof nk5.c) {
            lu3Var.name("welcomeBannerRegi");
            j8.e(j8.b(j8.d(MessageCapInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getWelcomeBannerRegi());
        }
        if (userStateInput.getYourPlacesGlobalUpdate() instanceof nk5.c) {
            lu3Var.name("yourPlacesGlobalUpdate");
            j8.e(j8.b(j8.d(YourPlacesGlobalUpdateInput_InputAdapter.INSTANCE, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) userStateInput.getYourPlacesGlobalUpdate());
        }
    }
}
