package zendesk.core;

import android.content.Context;
import com.google.gson.JsonElement;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ActionHandler {
    boolean canHandle(String str);

    ActionDescription getActionDescription();

    int getPriority();

    void handle(Map<String, Object> map, Context context);

    void updateSettings(Map<String, JsonElement> map);
}
