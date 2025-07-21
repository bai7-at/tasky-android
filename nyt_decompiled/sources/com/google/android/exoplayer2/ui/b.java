package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.z19;

/* loaded from: classes2.dex */
abstract class b {
    public static String a(String str) {
        return InstructionFileId.DOT + str + ",." + str + " *";
    }

    public static String b(int i) {
        return z19.D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}
