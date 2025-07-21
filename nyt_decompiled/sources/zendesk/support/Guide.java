package zendesk.support;

import com.zendesk.logger.Logger;
import java.util.Locale;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.support.HelpCenterTracker;

/* loaded from: classes5.dex */
public enum Guide {
    INSTANCE;

    private static final String LOG_TAG = "Guide";
    HelpCenterBlipsProvider blipsProvider;
    GuideModule guideModule;
    private Locale helpCenterLocaleOverride;
    private HelpCenterTracker helpCenterTracker;
    private boolean initialized;

    public Locale getHelpCenterLocaleOverride() {
        return this.helpCenterLocaleOverride;
    }

    public GuideModule guideModule() {
        return this.guideModule;
    }

    public void init(Zendesk zendesk2) {
        if (this.helpCenterTracker == null) {
            this.helpCenterTracker = new HelpCenterTracker.DefaultTracker();
        }
        if (!zendesk2.isInitialized()) {
            Logger.d(LOG_TAG, "Cannot use Guide SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...)", new Object[0]);
        } else {
            initApplicationScope(zendesk2.coreModule());
            this.initialized = true;
        }
    }

    void initApplicationScope(CoreModule coreModule) {
        DaggerGuideSdkProvidersComponent.builder().coreModule(coreModule).guideProviderModule(new GuideProviderModule(this.helpCenterTracker)).build().inject(this);
    }

    void installTracker(HelpCenterTracker helpCenterTracker) {
        this.helpCenterTracker = helpCenterTracker;
        initApplicationScope(Zendesk.INSTANCE.coreModule());
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public HelpCenterProvider provider() {
        if (isInitialized()) {
            return this.guideModule.providesHelpCenterProvider();
        }
        Logger.d(LOG_TAG, "Cannot get HelpCenterProvider before SDK has been initialized. init() must be called before provider().", new Object[0]);
        return null;
    }

    void reset() {
        this.helpCenterTracker = null;
        this.helpCenterLocaleOverride = null;
        this.initialized = false;
    }

    public void setHelpCenterLocaleOverride(Locale locale) {
        this.helpCenterLocaleOverride = locale;
        initApplicationScope(Zendesk.INSTANCE.coreModule());
    }
}
