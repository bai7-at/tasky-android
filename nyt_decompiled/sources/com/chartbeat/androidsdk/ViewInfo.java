package com.chartbeat.androidsdk;

/* loaded from: classes2.dex */
final class ViewInfo {
    private String externalReferrer;
    private String internalReferrer;
    private String token;
    private String viewId;
    private String viewTitle;

    ViewInfo(String str, String str2, String str3, String str4, String str5) {
        this.viewId = str;
        this.viewTitle = str2;
        this.internalReferrer = str3;
        this.externalReferrer = str4;
        this.token = str5;
    }

    public String getExternalReferrer() {
        return this.externalReferrer;
    }

    public String getInternalReferrer() {
        return this.internalReferrer;
    }

    public String getToken() {
        return this.token;
    }

    public String getViewId() {
        return this.viewId;
    }

    public String getViewTitle() {
        return this.viewTitle;
    }
}
