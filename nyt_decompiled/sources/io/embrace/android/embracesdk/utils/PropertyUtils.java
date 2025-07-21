package io.embrace.android.embracesdk.utils;

import android.os.Parcelable;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public final class PropertyUtils {
    public static final PropertyUtils INSTANCE = new PropertyUtils();
    public static final int MAX_PROPERTY_SIZE = 10;

    private PropertyUtils() {
    }

    private final Object checkIfSerializable(String str, Object obj, InternalEmbraceLogger internalEmbraceLogger) {
        if (obj == null) {
            return Constants.NULL_VERSION_ID;
        }
        if ((obj instanceof Parcelable) || (obj instanceof Serializable)) {
            return obj;
        }
        internalEmbraceLogger.log("The property with key " + str + " has an entry that cannot be serialized. It will be ignored.", InternalEmbraceLogger.Severity.WARNING, null, false);
        return "not serializable";
    }

    public static final Map<String, Object> sanitizeProperties(Map<String, ? extends Object> map, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        if (map == null) {
            return t.i();
        }
        if (map.size() > 10) {
            internalEmbraceLogger.log("The maximum number of properties is 10, the rest will be ignored.", InternalEmbraceLogger.Severity.WARNING, null, false);
        }
        Set<Map.Entry<String, ? extends Object>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (((Map.Entry) obj).getKey() != null) {
                arrayList.add(obj);
            }
        }
        List<Map.Entry> P0 = i.P0(arrayList, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(P0, 10)), 16));
        for (Map.Entry entry : P0) {
            String str = (String) entry.getKey();
            if (str == null) {
                str = Constants.NULL_VERSION_ID;
            }
            PropertyUtils propertyUtils = INSTANCE;
            String str2 = (String) entry.getKey();
            if (str2 == null) {
                str2 = "";
            }
            Pair pair = new Pair(str, propertyUtils.checkIfSerializable(str2, entry.getValue(), internalEmbraceLogger));
            linkedHashMap.put(pair.c(), pair.d());
        }
        return linkedHashMap;
    }
}
