package com.nytimes.android.media.audio.views;

import com.nytimes.android.media.audio.AudioManager;
import defpackage.ax;
import defpackage.hb5;
import defpackage.op4;
import defpackage.zh4;

/* loaded from: classes4.dex */
public abstract class b implements op4 {
    public static void a(AudioDrawerDialogFragment audioDrawerDialogFragment, AudioManager audioManager) {
        audioDrawerDialogFragment.audioManager = audioManager;
    }

    public static void b(AudioDrawerDialogFragment audioDrawerDialogFragment, ax axVar) {
        audioDrawerDialogFragment.eventReporter = axVar;
    }

    public static void c(AudioDrawerDialogFragment audioDrawerDialogFragment, hb5 hb5Var) {
        audioDrawerDialogFragment.mediaController = hb5Var;
    }

    public static void d(AudioDrawerDialogFragment audioDrawerDialogFragment, zh4 zh4Var) {
        audioDrawerDialogFragment.mediaEvents = zh4Var;
    }
}
