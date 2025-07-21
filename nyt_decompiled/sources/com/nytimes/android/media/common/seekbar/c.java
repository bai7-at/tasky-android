package com.nytimes.android.media.common.seekbar;

import com.nytimes.android.media.util.MediaDurationFormatter;
import defpackage.bo4;
import defpackage.hb5;
import defpackage.kl4;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class c implements op4 {
    public static void a(MediaSeekBar mediaSeekBar, MediaDurationFormatter mediaDurationFormatter) {
        mediaSeekBar.durationFormatter = mediaDurationFormatter;
    }

    public static void b(MediaSeekBar mediaSeekBar, hb5 hb5Var) {
        mediaSeekBar.mediaControl = hb5Var;
    }

    public static void c(MediaSeekBar mediaSeekBar, bo4 bo4Var) {
        mediaSeekBar.mediaServiceConnection = bo4Var;
    }

    public static void d(MediaSeekBar mediaSeekBar, kl4 kl4Var) {
        mediaSeekBar.presenter = kl4Var;
    }
}
