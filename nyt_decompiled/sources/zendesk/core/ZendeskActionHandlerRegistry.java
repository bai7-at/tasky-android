package zendesk.core;

import com.google.gson.JsonElement;
import defpackage.mn0;
import defpackage.r48;
import defpackage.rm9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.2
        @Override // java.util.Comparator
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    ZendeskActionHandlerRegistry() {
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void add(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.add(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void clear() {
        this.registry.clear();
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public ActionHandler handlerByAction(String str) {
        if (r48.d(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public List<ActionHandler> handlersByAction(final String str) {
        if (r48.d(str)) {
            return Collections.emptyList();
        }
        List<ActionHandler> e = mn0.e(this.registry, new rm9() { // from class: zendesk.core.ZendeskActionHandlerRegistry.1
            @Override // defpackage.rm9
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(e, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return e;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void remove(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.remove(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void updateSettings(Map<String, JsonElement> map) {
        for (ActionHandler actionHandler : this.registry) {
            if (actionHandler != null) {
                actionHandler.updateSettings(map);
            }
        }
    }
}
