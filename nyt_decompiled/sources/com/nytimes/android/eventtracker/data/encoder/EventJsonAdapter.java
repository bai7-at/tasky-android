package com.nytimes.android.eventtracker.data.encoder;

import com.nytimes.android.eventtracker.model.Event;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class EventJsonAdapter {
    private final JsonAdapter<Event> jsonAdapter = new i.b().d().c(Event.class).serializeNulls();

    public final String a(Event event) {
        zq3.h(event, "event");
        String json = this.jsonAdapter.toJson(event);
        zq3.g(json, "toJson(...)");
        return json;
    }
}
