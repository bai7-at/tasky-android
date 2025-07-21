package com.nytimes.android.ads.hybrid.adbridge.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.EnumJsonAdapter;
import com.squareup.moshi.i;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AdBridgeCommandModel {
    public static final a Companion = new a(null);
    private static final JsonAdapter c = new i.b().c(AdSlotEvent.class, EnumJsonAdapter.a(AdSlotEvent.class).d(AdSlotEvent.UnsupportedEvent)).d().c(AdBridgeCommandModel.class);
    private final AdSlotEvent a;
    private final Map b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AdBridgeCommandModel(AdSlotEvent adSlotEvent, Map map) {
        zq3.h(adSlotEvent, "eventName");
        this.a = adSlotEvent;
        this.b = map;
    }

    public final Map a() {
        return this.b;
    }

    public final AdSlotEvent b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBridgeCommandModel)) {
            return false;
        }
        AdBridgeCommandModel adBridgeCommandModel = (AdBridgeCommandModel) obj;
        return this.a == adBridgeCommandModel.a && zq3.c(this.b, adBridgeCommandModel.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AdBridgeCommandModel(eventName=" + this.a + ", eventData=" + this.b + ")";
    }

    public /* synthetic */ AdBridgeCommandModel(AdSlotEvent adSlotEvent, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AdSlotEvent.UnsupportedEvent : adSlotEvent, map);
    }
}
