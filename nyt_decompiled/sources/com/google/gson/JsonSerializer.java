package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t, Type type2, JsonSerializationContext jsonSerializationContext);
}
