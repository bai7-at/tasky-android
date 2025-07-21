package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes5.dex */
class ZendeskHelpCenterService {
    private final HelpCenterService helpCenterService;
    private final ZendeskLocaleConverter localeConverter;

    ZendeskHelpCenterService(HelpCenterService helpCenterService, ZendeskLocaleConverter zendeskLocaleConverter) {
        this.helpCenterService = helpCenterService;
        this.localeConverter = zendeskLocaleConverter;
    }
}
