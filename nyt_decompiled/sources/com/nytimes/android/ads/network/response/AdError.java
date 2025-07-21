package com.nytimes.android.ads.network.response;

import defpackage.b22;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdError {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AdError[] $VALUES;
    public static final a Companion;
    private final int code;
    private final String reason;
    public static final AdError INTERNAL_ERROR = new AdError("INTERNAL_ERROR", 0, 0, "Internal error");
    public static final AdError INVALID_REQUEST = new AdError("INVALID_REQUEST", 1, 1, "Invalid request");
    public static final AdError NETWORK_ERROR = new AdError("NETWORK_ERROR", 2, 2, "Network Error");
    public static final AdError NO_FILL_ERROR = new AdError("NO_FILL_ERROR", 3, 3, "No Fill");
    public static final AdError APP_ID_MISSING = new AdError("APP_ID_MISSING", 4, 8, "App ID Missing");
    public static final AdError REQEUST_ID_MISMATCH = new AdError("REQEUST_ID_MISMATCH", 5, 10, "Request ID Mismatch");
    public static final AdError INVALID_AD_STRING = new AdError("INVALID_AD_STRING", 6, 11, "Invalid Ad String");
    public static final AdError MEDIATION_NO_FILL = new AdError("MEDIATION_NO_FILL", 7, 9, "Mediation No Fill");
    public static final AdError AD_IS_BLANK = new AdError("AD_IS_BLANK", 8, 12, "Ad is Blank");
    public static final AdError AD_PRIVACY_DATA_MISSING = new AdError("AD_PRIVACY_DATA_MISSING", 9, 13, "Ad Privacy Data is Missing");
    public static final AdError INVALID_AD_UNIT_PATH = new AdError("INVALID_AD_UNIT_PATH", 10, 14, "Ad Unit Path is Invalid");
    public static final AdError MISSING_CRITICAL_AD_TARGETING = new AdError("MISSING_CRITICAL_AD_TARGETING", 11, 15, "Ad request is missing critical targeting. Make sure the request is properly configured.");
    public static final AdError UNKNOWN_ERROR = new AdError("UNKNOWN_ERROR", 12, -1, "Unknown Error.");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdError a(int i) {
            AdError adError;
            AdError[] values = AdError.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    adError = null;
                    break;
                }
                adError = values[i2];
                if (adError.getCode() == i) {
                    break;
                }
                i2++;
            }
            return adError == null ? AdError.UNKNOWN_ERROR : adError;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AdError[] $values() {
        return new AdError[]{INTERNAL_ERROR, INVALID_REQUEST, NETWORK_ERROR, NO_FILL_ERROR, APP_ID_MISSING, REQEUST_ID_MISMATCH, INVALID_AD_STRING, MEDIATION_NO_FILL, AD_IS_BLANK, AD_PRIVACY_DATA_MISSING, INVALID_AD_UNIT_PATH, MISSING_CRITICAL_AD_TARGETING, UNKNOWN_ERROR};
    }

    static {
        AdError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AdError(String str, int i, int i2, String str2) {
        this.code = i2;
        this.reason = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AdError valueOf(String str) {
        return (AdError) Enum.valueOf(AdError.class, str);
    }

    public static AdError[] values() {
        return (AdError[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final String getReason() {
        return this.reason;
    }
}
