package com.nytimes.android.subauth.core.database.typeconverters;

import com.amazonaws.util.DateUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import com.squareup.moshi.h;
import defpackage.er2;
import defpackage.ul8;
import defpackage.um8;
import defpackage.zq3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class UserSubscriptionDateJsonAdapter extends JsonAdapter<Date> {
    private final SimpleDateFormat formatter;
    private final Rfc3339DateJsonAdapter rfc3339DateAdapter;

    public UserSubscriptionDateJsonAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        TimeZone.getTimeZone("GMT");
        this.formatter = simpleDateFormat;
        this.rfc3339DateAdapter = new Rfc3339DateJsonAdapter();
    }

    private final String a(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return this.formatter.format(date);
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Unable to parse date from UserDetails to save to DB.", new Object[0]);
            return null;
        }
    }

    private final Date b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.formatter.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    private final Date c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.rfc3339DateAdapter.fromJson(str);
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").f(e, "Unable to parse date from UserDetails with RFC 3339 Date Adapter", new Object[0]);
            return null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @er2
    public Date fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        if (jsonReader.r() == JsonReader.Token.NULL) {
            return (Date) jsonReader.l();
        }
        String nextString = jsonReader.nextString();
        Date b = b(nextString);
        if (b == null) {
            b = c(nextString);
        }
        if (b != null) {
            return b;
        }
        ul8.a.z("SUBAUTH").d("Unable to parse date from UserDetails", new Object[0]);
        return b;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @um8
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Date date) {
        zq3.h(hVar, "writer");
        hVar.K0(a(date));
    }
}
