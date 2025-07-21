package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ConnectionErrorCodeType {
    INVALID_CREDENTIALS("INVALID_CREDENTIALS"),
    CLUSTER_NOT_FOUND("CLUSTER_NOT_FOUND"),
    NETWORK_ERRORS("NETWORK_ERRORS"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INSUFFICIENT_CLOUDHSM_HSMS("INSUFFICIENT_CLOUDHSM_HSMS"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_LOCKED_OUT("USER_LOCKED_OUT"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_NOT_FOUND("USER_NOT_FOUND"),
    USER_LOGGED_IN("USER_LOGGED_IN"),
    SUBNET_NOT_FOUND("SUBNET_NOT_FOUND"),
    INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET("INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET"),
    XKS_PROXY_ACCESS_DENIED("XKS_PROXY_ACCESS_DENIED"),
    XKS_PROXY_NOT_REACHABLE("XKS_PROXY_NOT_REACHABLE"),
    XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND("XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND"),
    XKS_PROXY_INVALID_RESPONSE("XKS_PROXY_INVALID_RESPONSE"),
    XKS_PROXY_INVALID_CONFIGURATION("XKS_PROXY_INVALID_CONFIGURATION"),
    XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION("XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION"),
    XKS_PROXY_TIMED_OUT("XKS_PROXY_TIMED_OUT"),
    XKS_PROXY_INVALID_TLS_CONFIGURATION("XKS_PROXY_INVALID_TLS_CONFIGURATION");

    public static final ConnectionErrorCodeType USER_LOCKED_OUT;
    public static final ConnectionErrorCodeType USER_NOT_FOUND;
    private static final Map<String, ConnectionErrorCodeType> enumMap;
    private String value;

    static {
        ConnectionErrorCodeType connectionErrorCodeType = INVALID_CREDENTIALS;
        ConnectionErrorCodeType connectionErrorCodeType2 = CLUSTER_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType3 = NETWORK_ERRORS;
        ConnectionErrorCodeType connectionErrorCodeType4 = INTERNAL_ERROR;
        ConnectionErrorCodeType connectionErrorCodeType5 = INSUFFICIENT_CLOUDHSM_HSMS;
        ConnectionErrorCodeType connectionErrorCodeType6 = USER_LOCKED_OUT;
        USER_LOCKED_OUT = connectionErrorCodeType6;
        ConnectionErrorCodeType connectionErrorCodeType7 = USER_NOT_FOUND;
        USER_NOT_FOUND = connectionErrorCodeType7;
        ConnectionErrorCodeType connectionErrorCodeType8 = USER_LOGGED_IN;
        ConnectionErrorCodeType connectionErrorCodeType9 = SUBNET_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType10 = INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET;
        ConnectionErrorCodeType connectionErrorCodeType11 = XKS_PROXY_ACCESS_DENIED;
        ConnectionErrorCodeType connectionErrorCodeType12 = XKS_PROXY_NOT_REACHABLE;
        ConnectionErrorCodeType connectionErrorCodeType13 = XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND;
        ConnectionErrorCodeType connectionErrorCodeType14 = XKS_PROXY_INVALID_RESPONSE;
        ConnectionErrorCodeType connectionErrorCodeType15 = XKS_PROXY_INVALID_CONFIGURATION;
        ConnectionErrorCodeType connectionErrorCodeType16 = XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION;
        ConnectionErrorCodeType connectionErrorCodeType17 = XKS_PROXY_TIMED_OUT;
        ConnectionErrorCodeType connectionErrorCodeType18 = XKS_PROXY_INVALID_TLS_CONFIGURATION;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("INVALID_CREDENTIALS", connectionErrorCodeType);
        hashMap.put("CLUSTER_NOT_FOUND", connectionErrorCodeType2);
        hashMap.put("NETWORK_ERRORS", connectionErrorCodeType3);
        hashMap.put("INTERNAL_ERROR", connectionErrorCodeType4);
        hashMap.put("INSUFFICIENT_CLOUDHSM_HSMS", connectionErrorCodeType5);
        hashMap.put("USER_LOCKED_OUT", connectionErrorCodeType6);
        hashMap.put("USER_NOT_FOUND", connectionErrorCodeType7);
        hashMap.put("USER_LOGGED_IN", connectionErrorCodeType8);
        hashMap.put("SUBNET_NOT_FOUND", connectionErrorCodeType9);
        hashMap.put("INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET", connectionErrorCodeType10);
        hashMap.put("XKS_PROXY_ACCESS_DENIED", connectionErrorCodeType11);
        hashMap.put("XKS_PROXY_NOT_REACHABLE", connectionErrorCodeType12);
        hashMap.put("XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND", connectionErrorCodeType13);
        hashMap.put("XKS_PROXY_INVALID_RESPONSE", connectionErrorCodeType14);
        hashMap.put("XKS_PROXY_INVALID_CONFIGURATION", connectionErrorCodeType15);
        hashMap.put("XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION", connectionErrorCodeType16);
        hashMap.put("XKS_PROXY_TIMED_OUT", connectionErrorCodeType17);
        hashMap.put("XKS_PROXY_INVALID_TLS_CONFIGURATION", connectionErrorCodeType18);
    }

    ConnectionErrorCodeType(String str) {
        this.value = str;
    }

    public static ConnectionErrorCodeType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ConnectionErrorCodeType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
