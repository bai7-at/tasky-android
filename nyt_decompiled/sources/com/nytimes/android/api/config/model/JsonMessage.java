package com.nytimes.android.api.config.model;

import com.google.gson.JsonElement;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes3.dex */
public final class JsonMessage {
    private final AbTest abTest;
    private final JsonElement action;
    private final AnalyticsValues analyticsValues;
    private final List<TextChunk> body;
    private final String cadence;
    private final boolean cancelable;
    private final String context;
    private final String historyID;
    private final String id;
    private final String kicker;
    private final JsonElement mediaResource;
    private final JsonElement placement;
    private final List<String> platform;
    private final JsonElement presentationRule;
    private final boolean subscriptionRequired;
    private final MessageTargets targeting;

    public JsonMessage(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4, JsonElement jsonElement3, boolean z, List<TextChunk> list, String str5, JsonElement jsonElement4, boolean z2, AbTest abTest, AnalyticsValues analyticsValues, List<String> list2, MessageTargets messageTargets) {
        zq3.h(str, "id");
        zq3.h(str2, "historyID");
        zq3.h(str3, "context");
        zq3.h(jsonElement2, "placement");
        zq3.h(str4, "cadence");
        zq3.h(list, "body");
        zq3.h(analyticsValues, "analyticsValues");
        zq3.h(list2, "platform");
        this.id = str;
        this.historyID = str2;
        this.context = str3;
        this.presentationRule = jsonElement;
        this.placement = jsonElement2;
        this.cadence = str4;
        this.action = jsonElement3;
        this.cancelable = z;
        this.body = list;
        this.kicker = str5;
        this.mediaResource = jsonElement4;
        this.subscriptionRequired = z2;
        this.abTest = abTest;
        this.analyticsValues = analyticsValues;
        this.platform = list2;
        this.targeting = messageTargets;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.kicker;
    }

    public final JsonElement component11() {
        return this.mediaResource;
    }

    public final boolean component12() {
        return this.subscriptionRequired;
    }

    public final AbTest component13() {
        return this.abTest;
    }

    public final AnalyticsValues component14() {
        return this.analyticsValues;
    }

    public final List<String> component15() {
        return this.platform;
    }

    public final MessageTargets component16() {
        return this.targeting;
    }

    public final String component2() {
        return this.historyID;
    }

    public final String component3() {
        return this.context;
    }

    public final JsonElement component4() {
        return this.presentationRule;
    }

    public final JsonElement component5() {
        return this.placement;
    }

    public final String component6() {
        return this.cadence;
    }

    public final JsonElement component7() {
        return this.action;
    }

    public final boolean component8() {
        return this.cancelable;
    }

    public final List<TextChunk> component9() {
        return this.body;
    }

    public final JsonMessage copy(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, String str4, JsonElement jsonElement3, boolean z, List<TextChunk> list, String str5, JsonElement jsonElement4, boolean z2, AbTest abTest, AnalyticsValues analyticsValues, List<String> list2, MessageTargets messageTargets) {
        zq3.h(str, "id");
        zq3.h(str2, "historyID");
        zq3.h(str3, "context");
        zq3.h(jsonElement2, "placement");
        zq3.h(str4, "cadence");
        zq3.h(list, "body");
        zq3.h(analyticsValues, "analyticsValues");
        zq3.h(list2, "platform");
        return new JsonMessage(str, str2, str3, jsonElement, jsonElement2, str4, jsonElement3, z, list, str5, jsonElement4, z2, abTest, analyticsValues, list2, messageTargets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonMessage)) {
            return false;
        }
        JsonMessage jsonMessage = (JsonMessage) obj;
        return zq3.c(this.id, jsonMessage.id) && zq3.c(this.historyID, jsonMessage.historyID) && zq3.c(this.context, jsonMessage.context) && zq3.c(this.presentationRule, jsonMessage.presentationRule) && zq3.c(this.placement, jsonMessage.placement) && zq3.c(this.cadence, jsonMessage.cadence) && zq3.c(this.action, jsonMessage.action) && this.cancelable == jsonMessage.cancelable && zq3.c(this.body, jsonMessage.body) && zq3.c(this.kicker, jsonMessage.kicker) && zq3.c(this.mediaResource, jsonMessage.mediaResource) && this.subscriptionRequired == jsonMessage.subscriptionRequired && zq3.c(this.abTest, jsonMessage.abTest) && zq3.c(this.analyticsValues, jsonMessage.analyticsValues) && zq3.c(this.platform, jsonMessage.platform) && zq3.c(this.targeting, jsonMessage.targeting);
    }

    public final AbTest getAbTest() {
        return this.abTest;
    }

    public final JsonElement getAction() {
        return this.action;
    }

    public final AnalyticsValues getAnalyticsValues() {
        return this.analyticsValues;
    }

    public final List<TextChunk> getBody() {
        return this.body;
    }

    public final String getCadence() {
        return this.cadence;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getHistoryID() {
        return this.historyID;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKicker() {
        return this.kicker;
    }

    public final JsonElement getMediaResource() {
        return this.mediaResource;
    }

    public final JsonElement getPlacement() {
        return this.placement;
    }

    public final List<String> getPlatform() {
        return this.platform;
    }

    public final JsonElement getPresentationRule() {
        return this.presentationRule;
    }

    public final boolean getSubscriptionRequired() {
        return this.subscriptionRequired;
    }

    public final MessageTargets getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.historyID.hashCode()) * 31) + this.context.hashCode()) * 31;
        JsonElement jsonElement = this.presentationRule;
        int hashCode2 = (((((hashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31) + this.placement.hashCode()) * 31) + this.cadence.hashCode()) * 31;
        JsonElement jsonElement2 = this.action;
        int hashCode3 = (((((hashCode2 + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31) + Boolean.hashCode(this.cancelable)) * 31) + this.body.hashCode()) * 31;
        String str = this.kicker;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        JsonElement jsonElement3 = this.mediaResource;
        int hashCode5 = (((hashCode4 + (jsonElement3 == null ? 0 : jsonElement3.hashCode())) * 31) + Boolean.hashCode(this.subscriptionRequired)) * 31;
        AbTest abTest = this.abTest;
        int hashCode6 = (((((hashCode5 + (abTest == null ? 0 : abTest.hashCode())) * 31) + this.analyticsValues.hashCode()) * 31) + this.platform.hashCode()) * 31;
        MessageTargets messageTargets = this.targeting;
        return hashCode6 + (messageTargets != null ? messageTargets.hashCode() : 0);
    }

    public String toString() {
        return "JsonMessage(id=" + this.id + ", historyID=" + this.historyID + ", context=" + this.context + ", presentationRule=" + this.presentationRule + ", placement=" + this.placement + ", cadence=" + this.cadence + ", action=" + this.action + ", cancelable=" + this.cancelable + ", body=" + this.body + ", kicker=" + this.kicker + ", mediaResource=" + this.mediaResource + ", subscriptionRequired=" + this.subscriptionRequired + ", abTest=" + this.abTest + ", analyticsValues=" + this.analyticsValues + ", platform=" + this.platform + ", targeting=" + this.targeting + ")";
    }
}
