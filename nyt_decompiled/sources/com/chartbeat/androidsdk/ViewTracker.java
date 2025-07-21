package com.chartbeat.androidsdk;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
final class ViewTracker {
    private static final double SECOND_IN_DOUBLE = 1000.0d;
    private static final String TAG = "ViewTracker";
    private ViewContent content;
    private ViewDimension dimension;
    private String domain;
    private String subdomain;
    private ViewInfo viewInfo;
    private final long viewInitTime = System.currentTimeMillis();

    ViewTracker(String str, String str2, String str3, String str4, String str5, String str6, String str7, ViewDimension viewDimension) {
        this.viewInfo = new ViewInfo(str, str2, str5, str6, str7);
        this.domain = str3;
        this.subdomain = str4;
        if (viewDimension == null) {
            this.dimension = new ViewDimension();
        } else {
            this.dimension = viewDimension;
        }
        this.content = new ViewContent();
    }

    LinkedHashMap<String, String> getContentParams() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        ViewContent viewContent = this.content;
        if (viewContent != null) {
            linkedHashMap.putAll(viewContent.toPingParams());
        }
        return linkedHashMap;
    }

    LinkedHashMap<String, String> getDimensionParams() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        ViewDimension viewDimension = this.dimension;
        if (viewDimension != null) {
            linkedHashMap.putAll(viewDimension.toPingParams());
        }
        return linkedHashMap;
    }

    String getDomain() {
        return this.domain;
    }

    String getExternalReferrer() {
        ViewInfo viewInfo = this.viewInfo;
        if (viewInfo != null) {
            return viewInfo.getExternalReferrer();
        }
        return null;
    }

    String getInternalReferrer() {
        ViewInfo viewInfo = this.viewInfo;
        if (viewInfo != null) {
            return viewInfo.getInternalReferrer();
        }
        return null;
    }

    String getMinutesInView() {
        return String.format(Locale.US, "%.2f", Double.valueOf(getViewingTimeInMinutes()));
    }

    String getSubdomain() {
        return this.subdomain;
    }

    String getToken() {
        ViewInfo viewInfo = this.viewInfo;
        if (viewInfo != null) {
            return viewInfo.getToken();
        }
        return null;
    }

    String getViewId() {
        ViewInfo viewInfo = this.viewInfo;
        if (viewInfo != null) {
            return viewInfo.getViewId();
        }
        return null;
    }

    String getViewTitle() {
        ViewInfo viewInfo = this.viewInfo;
        if (viewInfo != null) {
            return viewInfo.getViewTitle();
        }
        return null;
    }

    double getViewingTimeInMinutes() {
        long currentTimeMillis = System.currentTimeMillis() - this.viewInitTime;
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        return (currentTimeMillis / SECOND_IN_DOUBLE) / 60.0d;
    }

    boolean isSameView(String str) {
        String viewId = this.viewInfo.getViewId();
        return viewId != null && viewId.equals(str);
    }

    void updateAuthors(String str) {
        this.content = new ViewContent(this.content.getSections(), str, this.content.getZones(), this.content.getPageLoadTime());
    }

    void updateDimension(int i, int i2, int i3, int i4) {
        this.dimension = new ViewDimension(i, i2, i3, i4, Math.max(this.dimension.getMaxScrollDepth(), i));
    }

    void updateDomain(String str) {
        if (str == null || str.isEmpty()) {
            this.domain = null;
        } else {
            this.domain = str;
        }
    }

    void updateExternalReferrer(String str) {
        this.viewInfo = new ViewInfo(this.viewInfo.getViewId(), this.viewInfo.getViewTitle(), this.viewInfo.getInternalReferrer(), str, this.viewInfo.getToken());
    }

    void updateInternalReferrer(String str) {
        this.viewInfo = new ViewInfo(this.viewInfo.getViewId(), this.viewInfo.getViewTitle(), str, this.viewInfo.getExternalReferrer(), this.viewInfo.getToken());
    }

    void updatePageLoadingTime(float f) {
        this.content = new ViewContent(this.content.getSections(), this.content.getAuthors(), this.content.getZones(), f);
    }

    void updateSections(String str) {
        this.content = new ViewContent(str, this.content.getAuthors(), this.content.getZones(), this.content.getPageLoadTime());
    }

    void updateSubdomain(String str) {
        if (str == null || str.isEmpty()) {
            this.subdomain = null;
        } else {
            this.subdomain = str;
        }
    }

    void updateZones(String str) {
        this.content = new ViewContent(this.content.getSections(), this.content.getAuthors(), str, this.content.getPageLoadTime());
    }

    boolean wasReferredFromAnotherView() {
        return this.viewInfo.getInternalReferrer() != null;
    }
}
