package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;

/* loaded from: classes5.dex */
class ZendeskHelpCenterBlipsProvider implements HelpCenterBlipsProvider {
    private BlipsProvider blipsProvider;
    private Locale locale;

    ZendeskHelpCenterBlipsProvider(BlipsProvider blipsProvider, Locale locale) {
        this.blipsProvider = blipsProvider;
        this.locale = locale;
    }
}
