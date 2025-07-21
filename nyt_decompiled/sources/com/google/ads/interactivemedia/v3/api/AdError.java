package com.google.ads.interactivemedia.v3.api;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.comscore.streaming.AdvertisementDeliveryType;
import com.comscore.streaming.ContentDeliveryMode;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.WindowState;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public final class AdError extends Exception {
    private final AdErrorCode zza;
    private final AdErrorType zzb;

    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(ContentMediaFormat.EXTRA_GENERIC),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(ContentFeedType.WEST_HD),
        VIDEO_PLAY_ERROR(WindowState.NORMAL),
        VAST_MEDIA_LOAD_TIMEOUT(WindowState.MINIMIZED),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(ContentDeliveryMode.ON_DEMAND),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(ContentDeliverySubscriptionType.SUBSCRIPTION),
        UNKNOWN_ERROR(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS),
        VAST_EMPTY_RESPONSE(ContentMediaFormat.PREVIEW_MOVIE),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(ContentMediaFormat.PREVIEW_GENERIC),
        ADS_REQUEST_NETWORK_ERROR(ContentMediaFormat.EXTRA_EPISODE),
        INVALID_ARGUMENTS(AdvertisementDeliveryType.NATIONAL),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206),
        ADS_PLAYER_NOT_PROVIDED(1207);

        private final int zzb;

        AdErrorCode(int i) {
            this.zzb = i;
        }

        public static AdErrorCode getErrorCodeByNumber(int i) {
            for (AdErrorCode adErrorCode : values()) {
                if (adErrorCode.getErrorNumber() == i) {
                    return adErrorCode;
                }
            }
            return i == 1204 ? INTERNAL_ERROR : UNKNOWN_ERROR;
        }

        public int getErrorNumber() {
            return this.zzb;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "AdErrorCode [name: " + name() + ", number: " + this.zzb + "]";
        }
    }

    public enum AdErrorType {
        LOAD,
        PLAY
    }

    public AdError(AdErrorType adErrorType, int i, String str) {
        this(adErrorType, AdErrorCode.getErrorCodeByNumber(i), str);
    }

    public AdErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeNumber() {
        return this.zza.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.zzb;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    @KeepForSdk
    public String toString() {
        return "AdError [errorType: " + String.valueOf(this.zzb) + ", errorCode: " + String.valueOf(this.zza) + ", message: " + getMessage() + "]";
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.zzb = adErrorType;
        this.zza = adErrorCode;
    }
}
