package io.embrace.android.embracesdk.arch.schema;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.dv;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class TelemetryAttributes {
    private final ConfigService configService;
    private final Map<String, String> customAttributes;
    private final Map<dv, String> map;
    private final EmbraceSessionProperties sessionProperties;

    public TelemetryAttributes(ConfigService configService, EmbraceSessionProperties embraceSessionProperties, Map<String, String> map) {
        zq3.h(configService, "configService");
        this.configService = configService;
        this.sessionProperties = embraceSessionProperties;
        this.customAttributes = map;
        this.map = new LinkedHashMap();
    }

    public final String getAttribute(EmbraceAttributeKey embraceAttributeKey) {
        zq3.h(embraceAttributeKey, TransferTable.COLUMN_KEY);
        return this.map.get(embraceAttributeKey.getAttributeKey());
    }

    public final void setAttribute(EmbraceAttributeKey embraceAttributeKey, String str) {
        zq3.h(embraceAttributeKey, TransferTable.COLUMN_KEY);
        zq3.h(str, "value");
        setAttribute(embraceAttributeKey.getAttributeKey(), str);
    }

    public final Map<String, String> snapshot() {
        EmbraceSessionProperties embraceSessionProperties;
        Map<String, String> map;
        Map<String, String> map2;
        boolean shouldGateLogProperties = this.configService.getSessionBehavior().shouldGateLogProperties();
        boolean shouldGateSessionProperties = this.configService.getSessionBehavior().shouldGateSessionProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!shouldGateLogProperties && (map2 = this.customAttributes) != null) {
            linkedHashMap.putAll(map2);
        }
        if (!shouldGateSessionProperties && (embraceSessionProperties = this.sessionProperties) != null && (map = embraceSessionProperties.get()) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.e(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(EmbraceExtensionsKt.toSessionPropertyAttributeName((String) entry.getKey()), entry.getValue());
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        Map<dv, String> map3 = this.map;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(t.e(map3.size()));
        Iterator<T> it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap3.put(((dv) entry2.getKey()).getKey(), entry2.getValue());
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }

    public final String getAttribute(dv dvVar) {
        zq3.h(dvVar, TransferTable.COLUMN_KEY);
        return this.map.get(dvVar);
    }

    public final void setAttribute(dv dvVar, String str) {
        zq3.h(dvVar, TransferTable.COLUMN_KEY);
        zq3.h(str, "value");
        this.map.put(dvVar, str);
    }

    public /* synthetic */ TelemetryAttributes(ConfigService configService, EmbraceSessionProperties embraceSessionProperties, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configService, (i & 2) != 0 ? null : embraceSessionProperties, (i & 4) != 0 ? null : map);
    }
}
