package com.datadog.android;

/* loaded from: classes2.dex */
public enum DatadogSite {
    US1("us1", "browser-intake-datadoghq.com"),
    US3("us3"),
    US5("us5"),
    EU1("eu1", "browser-intake-datadoghq.eu"),
    AP1("ap1"),
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    STAGING("staging", "browser-intake-datad0g.com");

    private final String intakeEndpoint;
    private final String intakeHostName;
    private final String siteName;

    DatadogSite(String str, String str2) {
        this.siteName = str;
        this.intakeHostName = str2;
        this.intakeEndpoint = "https://" + str2;
    }

    public final String getIntakeEndpoint() {
        return this.intakeEndpoint;
    }

    public final String getSiteName$dd_sdk_android_core_release() {
        return this.siteName;
    }

    DatadogSite(String str) {
        this(str, "browser-intake-" + str + "-datadoghq.com");
    }
}
