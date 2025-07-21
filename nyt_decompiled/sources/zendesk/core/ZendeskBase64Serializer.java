package zendesk.core;

import android.util.Base64;
import com.zendesk.logger.Logger;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
class ZendeskBase64Serializer implements Serializer {
    private static final String LOG_TAG = "ZendeskBase64Serializer";
    private Serializer jsonSerializer;

    ZendeskBase64Serializer(Serializer serializer) {
        this.jsonSerializer = serializer;
    }

    @Override // zendesk.core.Serializer
    public <E> E deserialize(Object obj, Class<E> cls) {
        if (obj instanceof String) {
            return (E) this.jsonSerializer.deserialize(new String(Base64.decode((String) obj, 2)), cls);
        }
        Logger.i(LOG_TAG, "Data was not of type string. Cannot deserialize. Returning null.", new Object[0]);
        return null;
    }

    @Override // zendesk.core.Serializer
    public String serialize(Object obj) {
        String serialize = this.jsonSerializer.serialize(obj);
        if (serialize != null) {
            return Base64.encodeToString(serialize.getBytes(Charset.defaultCharset()), 2);
        }
        return null;
    }
}
