package zendesk.support;

/* loaded from: classes5.dex */
class ZendeskHelpCenterProvider implements HelpCenterProvider {
    private final HelpCenterBlipsProvider blipsProvider;
    private final ZendeskHelpCenterService helpCenterService;
    private final HelpCenterSessionCache helpCenterSessionCache;
    private final HelpCenterTracker helpCenterTracker;
    private final HelpCenterSettingsProvider settingsProvider;

    ZendeskHelpCenterProvider(HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ZendeskHelpCenterService zendeskHelpCenterService, HelpCenterSessionCache helpCenterSessionCache, HelpCenterTracker helpCenterTracker) {
        this.settingsProvider = helpCenterSettingsProvider;
        this.blipsProvider = helpCenterBlipsProvider;
        this.helpCenterService = zendeskHelpCenterService;
        this.helpCenterSessionCache = helpCenterSessionCache;
        this.helpCenterTracker = helpCenterTracker;
    }
}
