package io.embrace.android.embracesdk.session.properties;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource;
import io.embrace.android.embracesdk.ndk.NdkService;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceSessionPropertiesService implements SessionPropertiesService {
    public static final Companion Companion = new Companion(null);
    private static final int SESSION_PROPERTY_KEY_LIMIT = 128;
    private static final int SESSION_PROPERTY_VALUE_LIMIT = 1024;
    private final qs2 dataSourceProvider;
    private final NdkService ndkService;
    private final EmbraceSessionProperties sessionProperties;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceSessionPropertiesService(NdkService ndkService, EmbraceSessionProperties embraceSessionProperties, qs2 qs2Var) {
        zq3.h(ndkService, "ndkService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(qs2Var, "dataSourceProvider");
        this.ndkService = ndkService;
        this.sessionProperties = embraceSessionProperties;
        this.dataSourceProvider = qs2Var;
    }

    private final String enforceLength(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, i - 3);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    private final boolean isValidKey(String str) {
        return true ^ (str == null || str.length() == 0);
    }

    private final boolean isValidValue(String str) {
        return str != null;
    }

    @Override // io.embrace.android.embracesdk.session.properties.SessionPropertiesService
    public boolean addProperty(String str, String str2, boolean z) {
        zq3.h(str, "originalKey");
        zq3.h(str2, "originalValue");
        if (!isValidKey(str)) {
            return false;
        }
        String enforceLength = enforceLength(str, 128);
        if (!isValidValue(str2)) {
            return false;
        }
        String enforceLength2 = enforceLength(str2, 1024);
        boolean add = this.sessionProperties.add(enforceLength, enforceLength2, z);
        if (add) {
            SessionPropertiesDataSource sessionPropertiesDataSource = (SessionPropertiesDataSource) this.dataSourceProvider.mo865invoke();
            if (sessionPropertiesDataSource != null) {
                sessionPropertiesDataSource.addProperty(enforceLength, enforceLength2);
            }
            this.ndkService.onSessionPropertiesUpdate(this.sessionProperties.get());
        }
        return add;
    }

    @Override // io.embrace.android.embracesdk.session.properties.SessionPropertiesService
    public Map<String, String> getProperties() {
        return this.sessionProperties.get();
    }

    @Override // io.embrace.android.embracesdk.session.properties.SessionPropertiesService
    public boolean populateCurrentSession() {
        SessionPropertiesDataSource sessionPropertiesDataSource = (SessionPropertiesDataSource) this.dataSourceProvider.mo865invoke();
        if (sessionPropertiesDataSource != null) {
            return sessionPropertiesDataSource.addProperties(getProperties());
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.session.properties.SessionPropertiesService
    public boolean removeProperty(String str) {
        zq3.h(str, "originalKey");
        if (!isValidKey(str)) {
            return false;
        }
        String enforceLength = enforceLength(str, 128);
        boolean remove = this.sessionProperties.remove(enforceLength);
        if (remove) {
            SessionPropertiesDataSource sessionPropertiesDataSource = (SessionPropertiesDataSource) this.dataSourceProvider.mo865invoke();
            if (sessionPropertiesDataSource != null) {
                sessionPropertiesDataSource.removeProperty(enforceLength);
            }
            this.ndkService.onSessionPropertiesUpdate(this.sessionProperties.get());
        }
        return remove;
    }
}
