package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface JsonDeserializationContext {
    <T> T deserialize(JsonElement jsonElement, Type type2) throws JsonParseException;
}
