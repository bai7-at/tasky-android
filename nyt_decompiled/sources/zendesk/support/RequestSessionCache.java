package zendesk.support;

import java.util.List;

/* loaded from: classes5.dex */
interface RequestSessionCache {
    boolean containsAllTicketForms(List<Long> list);

    List<TicketForm> getTicketFormsById(List<Long> list);
}
