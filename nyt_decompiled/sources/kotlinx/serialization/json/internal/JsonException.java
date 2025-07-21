package kotlinx.serialization.json.internal;

import defpackage.zq3;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
