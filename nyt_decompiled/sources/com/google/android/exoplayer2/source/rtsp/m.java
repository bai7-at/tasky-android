package com.google.android.exoplayer2.source.rtsp;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import defpackage.tr;
import defpackage.z19;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class m {
    public static final m b = new b().e();
    private final ImmutableListMultimap a;

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        return tr.a(str, "Accept") ? "Accept" : tr.a(str, JsonDocumentFields.EFFECT_VALUE_ALLOW) ? JsonDocumentFields.EFFECT_VALUE_ALLOW : tr.a(str, "Authorization") ? "Authorization" : tr.a(str, "Bandwidth") ? "Bandwidth" : tr.a(str, "Blocksize") ? "Blocksize" : tr.a(str, Headers.CACHE_CONTROL) ? Headers.CACHE_CONTROL : tr.a(str, Headers.CONNECTION) ? Headers.CONNECTION : tr.a(str, "Content-Base") ? "Content-Base" : tr.a(str, "Content-Encoding") ? "Content-Encoding" : tr.a(str, Headers.CONTENT_LANGUAGE) ? Headers.CONTENT_LANGUAGE : tr.a(str, "Content-Length") ? "Content-Length" : tr.a(str, "Content-Location") ? "Content-Location" : tr.a(str, "Content-Type") ? "Content-Type" : tr.a(str, "CSeq") ? "CSeq" : tr.a(str, "Date") ? "Date" : tr.a(str, Headers.EXPIRES) ? Headers.EXPIRES : tr.a(str, HttpHeader.LOCATION) ? HttpHeader.LOCATION : tr.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : tr.a(str, "Proxy-Require") ? "Proxy-Require" : tr.a(str, "Public") ? "Public" : tr.a(str, Headers.RANGE) ? Headers.RANGE : tr.a(str, "RTP-Info") ? "RTP-Info" : tr.a(str, "RTCP-Interval") ? "RTCP-Interval" : tr.a(str, "Scale") ? "Scale" : tr.a(str, "Session") ? "Session" : tr.a(str, "Speed") ? "Speed" : tr.a(str, "Supported") ? "Supported" : tr.a(str, "Timestamp") ? "Timestamp" : tr.a(str, "Transport") ? "Transport" : tr.a(str, "User-Agent") ? "User-Agent" : tr.a(str, "Via") ? "Via" : tr.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public ImmutableListMultimap b() {
        return this.a;
    }

    public String d(String str) {
        ImmutableList e = e(str);
        if (e.isEmpty()) {
            return null;
        }
        return (String) com.google.common.collect.j.e(e);
    }

    public ImmutableList e(String str) {
        return this.a.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.a.equals(((m) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static final class b {
        private final ImmutableListMultimap.a a;

        public b() {
            this.a = new ImmutableListMultimap.a();
        }

        public b b(String str, String str2) {
            this.a.e(m.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List list) {
            for (int i = 0; i < list.size(); i++) {
                String[] W0 = z19.W0((String) list.get(i), ":\\s?");
                if (W0.length == 2) {
                    b(W0[0], W0[1]);
                }
            }
            return this;
        }

        public b d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        public m e() {
            return new m(this);
        }

        public b(String str, String str2, int i) {
            this();
            b("User-Agent", str);
            b("CSeq", String.valueOf(i));
            if (str2 != null) {
                b("Session", str2);
            }
        }
    }

    private m(b bVar) {
        this.a = bVar.a.d();
    }
}
