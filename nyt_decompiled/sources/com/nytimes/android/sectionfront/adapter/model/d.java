package com.nytimes.android.sectionfront.adapter.model;

import android.app.Application;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class d implements op4 {
    public static void a(SectionCoalescerSource sectionCoalescerSource, AudioFileVerifier audioFileVerifier) {
        sectionCoalescerSource.audioFileVerifier = audioFileVerifier;
    }

    public static void b(SectionCoalescerSource sectionCoalescerSource, Application application) {
        sectionCoalescerSource.context = application;
    }

    public static void c(SectionCoalescerSource sectionCoalescerSource, ImageCropper imageCropper) {
        sectionCoalescerSource.imageCropper = imageCropper;
    }

    public static void d(SectionCoalescerSource sectionCoalescerSource, boolean z) {
        sectionCoalescerSource.isPhone = z;
    }

    public static void e(SectionCoalescerSource sectionCoalescerSource, SFSummaryController sFSummaryController) {
        sectionCoalescerSource.sfSummaryController = sFSummaryController;
    }

    public static void f(SectionCoalescerSource sectionCoalescerSource, TimeStampUtil timeStampUtil) {
        sectionCoalescerSource.timeStampUtil = timeStampUtil;
    }
}
