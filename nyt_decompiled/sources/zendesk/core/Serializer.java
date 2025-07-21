package zendesk.core;

/* loaded from: classes5.dex */
interface Serializer {
    <E> E deserialize(Object obj, Class<E> cls);

    String serialize(Object obj);
}
