package io.embrace.android.embracesdk.internal.serialization;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public interface PlatformSerializer {
    <T> T fromJson(InputStream inputStream, Class<T> cls);

    <T> T fromJson(InputStream inputStream, Type type2);

    <T> T fromJson(String str, Class<T> cls);

    <T> T fromJson(String str, Type type2);

    <T> String toJson(T t);

    <T> String toJson(T t, Class<T> cls);

    <T> String toJson(T t, Type type2);

    <T> void toJson(T t, Class<T> cls, OutputStream outputStream);

    <T> void toJson(T t, ParameterizedType parameterizedType, OutputStream outputStream);
}
