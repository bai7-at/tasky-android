package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AFc1oSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    private final Body AFInAppEventParameterName;

    @NonNull
    final Map<String, List<String>> AFInAppEventType;
    final boolean AFKeystoreWrapper;
    final int valueOf;

    @NonNull
    public final AFc1tSDK values;

    public AFc1oSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFc1tSDK aFc1tSDK) {
        this.AFInAppEventParameterName = body;
        this.valueOf = i;
        this.AFKeystoreWrapper = z;
        this.AFInAppEventType = new HashMap(map);
        this.values = aFc1tSDK;
    }

    @Nullable
    public final String AFInAppEventType(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it2 = headerField.iterator();
        StringBuilder sb = new StringBuilder(it2.next());
        while (it2.hasNext()) {
            sb.append(", ");
            sb.append(it2.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1oSDK aFc1oSDK = (AFc1oSDK) obj;
        if (this.valueOf == aFc1oSDK.valueOf && this.AFKeystoreWrapper == aFc1oSDK.AFKeystoreWrapper && this.AFInAppEventParameterName.equals(aFc1oSDK.AFInAppEventParameterName) && this.AFInAppEventType.equals(aFc1oSDK.AFInAppEventType)) {
            return this.values.equals(aFc1oSDK.values);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.AFInAppEventType.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventType.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.valueOf;
    }

    public int hashCode() {
        return (((((((this.AFInAppEventParameterName.hashCode() * 31) + this.valueOf) * 31) + (this.AFKeystoreWrapper ? 1 : 0)) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.values.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFKeystoreWrapper;
    }
}
