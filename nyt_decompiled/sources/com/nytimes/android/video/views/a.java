package com.nytimes.android.video.views;

import com.nytimes.android.media.util.CaptionPrefManager;
import com.nytimes.android.utils.AppPreferences;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class a implements op4 {
    public static void a(CaptionsView captionsView, AppPreferences appPreferences) {
        captionsView.appPreferences = appPreferences;
    }

    public static void b(CaptionsView captionsView, CaptionPrefManager captionPrefManager) {
        captionsView.captionUtil = captionPrefManager;
    }
}
