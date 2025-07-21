package com.nytimes.android.push;

import android.content.Context;
import android.os.Bundle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.fl6;
import defpackage.z38;
import defpackage.zq3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class BreakingNewsAlert implements Serializable {
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 2;
    private final String alertId;
    private final String alertMsg;
    private final String alertTitle;
    private final long assetId;
    private final String campaignId;
    private final String collapseKey;
    private final String guid;
    private final String label;
    private final String messageId;
    private final int notificationHashCode;
    private final String productId;
    private final String pubDate;
    private final long receiveTime;
    private final String richContentUrl;
    private final String tag;
    private final String tinyurl;
    private final long unixPubDate;
    private final String uri;
    private final String url;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long b(Bundle bundle) {
            try {
                String string = bundle.getString("content_id");
                if (string == null) {
                    string = "";
                }
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return BreakingNewsAlertManager.ARTICLE_ID_MISSING;
            }
        }

        private final String c(Bundle bundle, Context context) {
            String string = bundle.getString("label");
            if (string != null) {
                return string;
            }
            String string2 = context.getString(fl6.app_name);
            zq3.g(string2, "getString(...)");
            return string2;
        }

        private final long d(Bundle bundle) {
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                String string = bundle.getString("unixPubDate");
                if (string == null) {
                    string = "";
                }
                return timeUnit.convert(Long.parseLong(string), TimeUnit.SECONDS);
            } catch (NumberFormatException unused) {
                return System.currentTimeMillis();
            }
        }

        public final BreakingNewsAlert a(Bundle bundle, Context context) {
            zq3.h(bundle, "extras");
            zq3.h(context, "context");
            return new BreakingNewsAlert(bundle.getString("uri"), bundle.getString("link"), bundle.getString("tinyURL"), d(bundle), bundle.getString("pubDate"), c(bundle, context), bundle.getString("guid"), bundle.getString("title"), bundle.getString("collapseKey"), b(bundle), bundle.getString("tag"), 0L, bundle.getString("alertId"), bundle.getString("messageId"), bundle.getString("productId"), bundle.getString("alertTitle"), bundle.getString("richContentUrl"), bundle.getString("campaignId"), ProgressEvent.PART_COMPLETED_EVENT_CODE, null);
        }

        private a() {
        }
    }

    public BreakingNewsAlert(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, long j2, String str9, long j3, String str10, String str11, String str12, String str13, String str14, String str15) {
        zq3.h(str5, "label");
        this.uri = str;
        this.url = str2;
        this.tinyurl = str3;
        this.unixPubDate = j;
        this.pubDate = str4;
        this.label = str5;
        this.guid = str6;
        this.alertMsg = str7;
        this.collapseKey = str8;
        this.assetId = j2;
        this.tag = str9;
        this.receiveTime = j3;
        this.alertId = str10;
        this.messageId = str11;
        this.productId = str12;
        this.alertTitle = str13;
        this.richContentUrl = str14;
        this.campaignId = str15;
        this.notificationHashCode = (str7 + Long.toString(j3)).hashCode();
    }

    public final String a() {
        return this.alertId;
    }

    public final String b() {
        return this.alertMsg;
    }

    public final String c() {
        return this.alertTitle;
    }

    public final long d() {
        return this.assetId;
    }

    public final String e() {
        return this.campaignId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreakingNewsAlert)) {
            return false;
        }
        BreakingNewsAlert breakingNewsAlert = (BreakingNewsAlert) obj;
        return zq3.c(this.uri, breakingNewsAlert.uri) && zq3.c(this.url, breakingNewsAlert.url) && zq3.c(this.tinyurl, breakingNewsAlert.tinyurl) && this.unixPubDate == breakingNewsAlert.unixPubDate && zq3.c(this.pubDate, breakingNewsAlert.pubDate) && zq3.c(this.label, breakingNewsAlert.label) && zq3.c(this.guid, breakingNewsAlert.guid) && zq3.c(this.alertMsg, breakingNewsAlert.alertMsg) && zq3.c(this.collapseKey, breakingNewsAlert.collapseKey) && this.assetId == breakingNewsAlert.assetId && zq3.c(this.tag, breakingNewsAlert.tag) && this.receiveTime == breakingNewsAlert.receiveTime && zq3.c(this.alertId, breakingNewsAlert.alertId) && zq3.c(this.messageId, breakingNewsAlert.messageId) && zq3.c(this.productId, breakingNewsAlert.productId) && zq3.c(this.alertTitle, breakingNewsAlert.alertTitle) && zq3.c(this.richContentUrl, breakingNewsAlert.richContentUrl) && zq3.c(this.campaignId, breakingNewsAlert.campaignId);
    }

    public final String f() {
        return this.label;
    }

    public final String g() {
        return this.messageId;
    }

    public final int h() {
        return this.notificationHashCode;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tinyurl;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.unixPubDate)) * 31;
        String str4 = this.pubDate;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.label.hashCode()) * 31;
        String str5 = this.guid;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.alertMsg;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.collapseKey;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.assetId)) * 31;
        String str8 = this.tag;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Long.hashCode(this.receiveTime)) * 31;
        String str9 = this.alertId;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.messageId;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.productId;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.alertTitle;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.richContentUrl;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.campaignId;
        return hashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String i() {
        return this.productId;
    }

    public final String j() {
        return this.richContentUrl;
    }

    public final String k() {
        return this.tag;
    }

    public final String l() {
        return this.tinyurl;
    }

    public final long m() {
        return this.unixPubDate;
    }

    public final String n() {
        return this.uri;
    }

    public final String o() {
        return this.url;
    }

    public String toString() {
        z38 z38Var = z38.a;
        String format = String.format(Locale.getDefault(), "{ bna = { %s = \"%s\"; %s = \"%s\"; %s = %d; %s = \"%s\";%s = \"%s\";  %s = %d; %s = \"%s\"; %s = \"%s\"; %s = \"%s\"; %s = %d; %s = \"%s\"; } }", Arrays.copyOf(new Object[]{"link", this.url, "tinyURL", this.tinyurl, "unixPubDate", Long.valueOf(this.unixPubDate), "pubDate", this.pubDate, "label", this.label, "guid", this.guid, "title", this.alertMsg, "collapseKey", this.collapseKey, "tag", this.tag, "content_id", Long.valueOf(this.assetId), "alertId", this.alertId, "messageId", this.messageId, "productId", this.productId, "campaignId", this.campaignId}, 28));
        zq3.g(format, "format(...)");
        return format;
    }

    public /* synthetic */ BreakingNewsAlert(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, long j2, String str9, long j3, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str8, (i & 512) == 0 ? j2 : 0L, (i & 1024) != 0 ? null : str9, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? System.currentTimeMillis() : j3, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15);
    }
}
