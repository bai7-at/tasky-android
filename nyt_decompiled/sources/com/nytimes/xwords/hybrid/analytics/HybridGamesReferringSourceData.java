package com.nytimes.xwords.hybrid.analytics;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class HybridGamesReferringSourceData implements Serializable {
    public static final a a = new a(null);
    private static final long serialVersionUID = 1;
    private final String detail;
    private final String messageId;

    /* renamed from: type, reason: collision with root package name */
    private final String f79type;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridGamesReferringSourceData(String str, String str2, String str3) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        zq3.h(str2, "detail");
        this.f79type = str;
        this.detail = str2;
        this.messageId = str3;
    }

    public final String a() {
        return this.detail;
    }

    public final String b() {
        return this.messageId;
    }

    public final String c() {
        return this.f79type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridGamesReferringSourceData)) {
            return false;
        }
        HybridGamesReferringSourceData hybridGamesReferringSourceData = (HybridGamesReferringSourceData) obj;
        return zq3.c(this.f79type, hybridGamesReferringSourceData.f79type) && zq3.c(this.detail, hybridGamesReferringSourceData.detail) && zq3.c(this.messageId, hybridGamesReferringSourceData.messageId);
    }

    public int hashCode() {
        int hashCode = ((this.f79type.hashCode() * 31) + this.detail.hashCode()) * 31;
        String str = this.messageId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybridGamesReferringSourceData(type=" + this.f79type + ", detail=" + this.detail + ", messageId=" + this.messageId + ")";
    }
}
