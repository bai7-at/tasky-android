package com.nytimes.android.media.util;

import com.nytimes.android.api.cms.AudioAsset;
import defpackage.d62;
import java.io.File;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class AudioFileVerifier {
    static final String ID_FORMAT = ", Asset Id: %d ";
    static final String INVALID_AUDIO_ERROR_TITLE = "Invalid audio asset (not a crash): ";
    static final String INVALID_URL_ERROR_FORMAT = "Invalid audio file url for asset: %s ";
    static final String MISSING_URL_ERROR = ", Missing audio file url for asset";
    static final String TITLE_FORMAT = ", Asset title: %s ";
    private final d62 exceptionLogger;

    public enum SupportedAudioExtension {
        MP3,
        M3U8
    }

    public AudioFileVerifier(d62 d62Var) {
        this.exceptionLogger = d62Var;
    }

    private static String getFileExtension(String str) {
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    private void reportInvalidAudio(AudioAsset audioAsset, String str) {
        this.exceptionLogger.c(INVALID_AUDIO_ERROR_TITLE);
        this.exceptionLogger.a(str);
        d62 d62Var = this.exceptionLogger;
        Locale locale = Locale.US;
        d62Var.a(String.format(locale, TITLE_FORMAT, audioAsset.getDisplayTitle()));
        this.exceptionLogger.a(String.format(locale, ID_FORMAT, Long.valueOf(audioAsset.getAssetId())));
        this.exceptionLogger.d();
    }

    public boolean isSupported(AudioAsset audioAsset) {
        if (audioAsset.fileUrl() == null) {
            reportInvalidAudio(audioAsset, MISSING_URL_ERROR);
            return false;
        }
        String fileExtension = getFileExtension(audioAsset.fileUrl());
        for (SupportedAudioExtension supportedAudioExtension : SupportedAudioExtension.values()) {
            if (supportedAudioExtension.name().equalsIgnoreCase(fileExtension)) {
                return true;
            }
        }
        reportInvalidAudio(audioAsset, String.format(Locale.US, INVALID_URL_ERROR_FORMAT, audioAsset.fileUrl()));
        return false;
    }
}
