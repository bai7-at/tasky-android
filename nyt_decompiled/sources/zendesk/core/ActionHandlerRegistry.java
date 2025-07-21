package zendesk.core;

import com.google.gson.JsonElement;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ActionHandlerRegistry {
    void add(ActionHandler actionHandler);

    void clear();

    ActionHandler handlerByAction(String str);

    List<ActionHandler> handlersByAction(String str);

    void remove(ActionHandler actionHandler);

    void updateSettings(Map<String, JsonElement> map);
}
