package com.nytimes.android.media.audio.views;

import com.nytimes.android.media.util.MediaDurationFormatter;
import defpackage.ao7;
import defpackage.bo4;
import defpackage.hb5;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class n implements op4 {
    public static void a(SfAudioControl sfAudioControl, hb5 hb5Var) {
        sfAudioControl.mediaControl = hb5Var;
    }

    public static void b(SfAudioControl sfAudioControl, MediaDurationFormatter mediaDurationFormatter) {
        sfAudioControl.mediaDurationFormatter = mediaDurationFormatter;
    }

    public static void c(SfAudioControl sfAudioControl, ao7 ao7Var) {
        sfAudioControl.presenter = ao7Var;
    }

    public static void d(SfAudioControl sfAudioControl, bo4 bo4Var) {
        sfAudioControl.serviceConnection = bo4Var;
    }
}
