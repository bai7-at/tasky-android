package com.nytimes.android.media.player;

import com.nytimes.android.media.analytics.AudioPlaybackEventTracker;
import com.nytimes.android.media.analytics.AudioSessionEventTracker;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.podcast.PodcastSource;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ax;
import defpackage.b99;
import defpackage.bp0;
import defpackage.ci4;
import defpackage.jh4;
import defpackage.op4;
import defpackage.ov5;
import defpackage.qq3;
import defpackage.vw5;
import defpackage.w89;

/* loaded from: classes4.dex */
public abstract class f implements op4 {
    public static void a(MediaService mediaService, AudioManager audioManager) {
        mediaService.audioManager = audioManager;
    }

    public static void b(MediaService mediaService, AudioPlaybackEventTracker audioPlaybackEventTracker) {
        mediaService.audioPlaybackEventTracker = audioPlaybackEventTracker;
    }

    public static void c(MediaService mediaService, AudioSessionEventTracker audioSessionEventTracker) {
        mediaService.audioSessionEventTracker = audioSessionEventTracker;
    }

    public static void d(MediaService mediaService, bp0 bp0Var) {
        mediaService.comScoreWrapper = bp0Var;
    }

    public static void e(MediaService mediaService, ax axVar) {
        mediaService.eventReporter = axVar;
    }

    public static void f(MediaService mediaService, ci4 ci4Var) {
        mediaService.historyWatcher = ci4Var;
    }

    public static void g(MediaService mediaService, qq3 qq3Var) {
        mediaService.internalPreferences = qq3Var;
    }

    public static void h(MediaService mediaService, jh4 jh4Var) {
        mediaService.mediaActivityLauncher = jh4Var;
    }

    public static void i(MediaService mediaService, NetworkStatus networkStatus) {
        mediaService.networkStatus = networkStatus;
    }

    public static void j(MediaService mediaService, ov5 ov5Var) {
        mediaService.playbackPositionManager = ov5Var;
    }

    public static void k(MediaService mediaService, a aVar) {
        mediaService.player = aVar;
    }

    public static void l(MediaService mediaService, vw5 vw5Var) {
        mediaService.podcastSearchResolver = vw5Var;
    }

    public static void m(MediaService mediaService, PodcastSource podcastSource) {
        mediaService.podcastSource = podcastSource;
    }

    public static void n(MediaService mediaService, w89 w89Var) {
        mediaService.videoEventReporter = w89Var;
    }

    public static void o(MediaService mediaService, b99 b99Var) {
        mediaService.videoViewershipAnalyticsTracker = b99Var;
    }
}
