package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.nytimes.android.media.audio.views.AudioIndicator;

/* loaded from: classes4.dex */
public abstract class ur8 {
    public static final Bundle a(Activity activity) {
        zq3.h(activity, "<this>");
        AudioIndicator audioIndicator = (AudioIndicator) activity.findViewById(fg6.audio_indicator);
        if (audioIndicator == null) {
            return null;
        }
        if (audioIndicator.getVisibility() != 0) {
            audioIndicator = null;
        }
        if (audioIndicator != null) {
            return c5.b(activity, audioIndicator, audioIndicator.getTransitionName()).c();
        }
        return null;
    }
}
