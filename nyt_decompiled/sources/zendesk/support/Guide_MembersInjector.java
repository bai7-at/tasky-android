package zendesk.support;

import defpackage.op4;

/* loaded from: classes5.dex */
public abstract class Guide_MembersInjector implements op4 {
    public static void injectBlipsProvider(Guide guide, HelpCenterBlipsProvider helpCenterBlipsProvider) {
        guide.blipsProvider = helpCenterBlipsProvider;
    }

    public static void injectGuideModule(Guide guide, GuideModule guideModule) {
        guide.guideModule = guideModule;
    }
}
