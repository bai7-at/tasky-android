package zendesk.core;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import defpackage.r48;

/* loaded from: classes5.dex */
class GsonSerializer implements Serializer {
    private static final String LOG_TAG = "GsonSerializer";
    private final Gson gson;

    GsonSerializer(Gson gson) {
        this.gson = gson;
    }

    @Override // zendesk.core.Serializer
    public <E> E deserialize(Object obj, Class<E> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!r48.b(str)) {
                return null;
            }
            try {
                return (E) this.gson.fromJson(str, (Class) cls);
            } catch (JsonSyntaxException unused) {
                Logger.b(LOG_TAG, "Unable to deserialize String into object of type %s", cls.getSimpleName());
                return null;
            }
        }
        if (!(obj instanceof JsonElement)) {
            Logger.b(LOG_TAG, "Unable to deserialize the provided object into %s", cls.getSimpleName());
            return null;
        }
        try {
            return (E) this.gson.fromJson((JsonElement) obj, (Class) cls);
        } catch (JsonSyntaxException e) {
            Logger.b(LOG_TAG, "Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e);
            return null;
        }
    }

    @Override // zendesk.core.Serializer
    public String serialize(Object obj) {
        return this.gson.toJson(obj);
    }
}
