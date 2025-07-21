package io.embrace.android.embracesdk.opentelemetry;

import defpackage.dv;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class OpenTelemetryAttributeKeysKt {
    private static final dv androidApiLevel;
    private static final dv androidState;
    private static final dv deviceManufacturer;
    private static final dv deviceModelIdentifier;
    private static final dv deviceModelName;
    private static final dv exceptionMessage;
    private static final dv exceptionStacktrace;
    private static final dv exceptionType;
    private static final dv logRecordUid;
    private static final dv osBuildId;
    private static final dv osName;
    private static final dv osType;
    private static final dv osVersion;
    private static final dv serviceName;
    private static final dv serviceVersion;

    static {
        dv a = dv.a("android.os.api_level");
        zq3.g(a, "AttributeKey.stringKey(\"android.os.api_level\")");
        androidApiLevel = a;
        dv a2 = dv.a("android.state");
        zq3.g(a2, "AttributeKey.stringKey(\"android.state\")");
        androidState = a2;
        dv a3 = dv.a("device.manufacturer");
        zq3.g(a3, "AttributeKey.stringKey(\"device.manufacturer\")");
        deviceManufacturer = a3;
        dv a4 = dv.a("os.model.identifier");
        zq3.g(a4, "AttributeKey.stringKey(\"os.model.identifier\")");
        deviceModelIdentifier = a4;
        dv a5 = dv.a("os.model.name");
        zq3.g(a5, "AttributeKey.stringKey(\"os.model.name\")");
        deviceModelName = a5;
        dv a6 = dv.a("log.record.uid");
        zq3.g(a6, "AttributeKey.stringKey(\"log.record.uid\")");
        logRecordUid = a6;
        dv a7 = dv.a("os.name");
        zq3.g(a7, "AttributeKey.stringKey(\"os.name\")");
        osName = a7;
        dv a8 = dv.a("os.version");
        zq3.g(a8, "AttributeKey.stringKey(\"os.version\")");
        osVersion = a8;
        dv a9 = dv.a("os.type");
        zq3.g(a9, "AttributeKey.stringKey(\"os.type\")");
        osType = a9;
        dv a10 = dv.a("os.build_id");
        zq3.g(a10, "AttributeKey.stringKey(\"os.build_id\")");
        osBuildId = a10;
        dv a11 = dv.a("service.name");
        zq3.g(a11, "AttributeKey.stringKey(\"service.name\")");
        serviceName = a11;
        dv a12 = dv.a("service.version");
        zq3.g(a12, "AttributeKey.stringKey(\"service.version\")");
        serviceVersion = a12;
        dv a13 = dv.a("exception.message");
        zq3.g(a13, "AttributeKey.stringKey(\"exception.message\")");
        exceptionMessage = a13;
        dv a14 = dv.a("exception.stacktrace");
        zq3.g(a14, "AttributeKey.stringKey(\"exception.stacktrace\")");
        exceptionStacktrace = a14;
        dv a15 = dv.a("exception.type");
        zq3.g(a15, "AttributeKey.stringKey(\"exception.type\")");
        exceptionType = a15;
    }

    public static final dv getAndroidApiLevel() {
        return androidApiLevel;
    }

    public static final dv getAndroidState() {
        return androidState;
    }

    public static final dv getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public static final dv getDeviceModelIdentifier() {
        return deviceModelIdentifier;
    }

    public static final dv getDeviceModelName() {
        return deviceModelName;
    }

    public static final dv getExceptionMessage() {
        return exceptionMessage;
    }

    public static final dv getExceptionStacktrace() {
        return exceptionStacktrace;
    }

    public static final dv getExceptionType() {
        return exceptionType;
    }

    public static final dv getLogRecordUid() {
        return logRecordUid;
    }

    public static final dv getOsBuildId() {
        return osBuildId;
    }

    public static final dv getOsName() {
        return osName;
    }

    public static final dv getOsType() {
        return osType;
    }

    public static final dv getOsVersion() {
        return osVersion;
    }

    public static final dv getServiceName() {
        return serviceName;
    }

    public static final dv getServiceVersion() {
        return serviceVersion;
    }
}
