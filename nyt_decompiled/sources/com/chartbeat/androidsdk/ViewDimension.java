package com.chartbeat.androidsdk;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
final class ViewDimension {
    private int fullyRenderedDocWidth;
    private int maxScrollDepth;
    private int scrollPositionTop;
    private int scrollWindowHeight;
    private int totalContentHeight;

    ViewDimension() {
        this.scrollPositionTop = -1;
        this.totalContentHeight = -1;
        this.scrollWindowHeight = -1;
        this.fullyRenderedDocWidth = -1;
        this.maxScrollDepth = -1;
    }

    int getMaxScrollDepth() {
        return this.maxScrollDepth;
    }

    LinkedHashMap<String, String> toPingParams() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        int i = this.scrollPositionTop;
        if (i != -1) {
            linkedHashMap.put(QueryKeys.SCROLL_POSITION_TOP, String.valueOf(i));
        }
        int i2 = this.maxScrollDepth;
        if (i2 != -1) {
            linkedHashMap.put(QueryKeys.MAX_SCROLL_DEPTH, String.valueOf(i2));
        }
        int i3 = this.totalContentHeight;
        if (i3 != -1) {
            linkedHashMap.put(QueryKeys.CONTENT_HEIGHT, String.valueOf(i3));
        }
        int i4 = this.fullyRenderedDocWidth;
        if (i4 != -1) {
            linkedHashMap.put(QueryKeys.DOCUMENT_WIDTH, String.valueOf(i4));
        }
        int i5 = this.scrollWindowHeight;
        if (i5 != -1) {
            linkedHashMap.put(QueryKeys.SCROLL_WINDOW_HEIGHT, String.valueOf(i5));
        }
        return linkedHashMap;
    }

    ViewDimension(int i, int i2, int i3, int i4, int i5) {
        this.scrollPositionTop = i;
        this.totalContentHeight = i3;
        this.scrollWindowHeight = i2;
        this.fullyRenderedDocWidth = i4;
        this.maxScrollDepth = i5;
    }
}
