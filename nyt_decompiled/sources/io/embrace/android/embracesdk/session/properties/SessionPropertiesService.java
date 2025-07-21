package io.embrace.android.embracesdk.session.properties;

import java.util.Map;

/* loaded from: classes5.dex */
public interface SessionPropertiesService {
    boolean addProperty(String str, String str2, boolean z);

    Map<String, String> getProperties();

    boolean populateCurrentSession();

    boolean removeProperty(String str);
}
