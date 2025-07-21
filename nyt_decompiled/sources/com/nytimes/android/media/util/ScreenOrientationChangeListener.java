package com.nytimes.android.media.util;

import android.content.Context;
import android.content.res.Configuration;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public abstract class ScreenOrientationChangeListener extends OrientationEventListener {
    private final Context context;
    private volatile int defaultOrientation;
    private int prevRotation;

    public ScreenOrientationChangeListener(Context context) {
        this(context, 3);
    }

    private int getDeviceDefaultOrientation() {
        if (this.defaultOrientation != 0) {
            return this.defaultOrientation;
        }
        if (isDefaultLandscape()) {
            this.defaultOrientation = 2;
        } else {
            this.defaultOrientation = 1;
        }
        return this.defaultOrientation;
    }

    private int getRotation(int i) {
        if (i >= 330 || i < 30) {
            return 0;
        }
        if (i >= 60 && i < 120) {
            return 1;
        }
        if (i < 150 || i >= 210) {
            return (i < 240 || i >= 300) ? -1 : 3;
        }
        return 2;
    }

    private boolean isDefaultLandscape() {
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        Configuration configuration = this.context.getResources().getConfiguration();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        boolean z = rotation == 0 || rotation == 2;
        return (z && configuration.orientation == 2) || (!z && configuration.orientation == 1);
    }

    private void printConfiguration() {
        Configuration configuration = this.context.getResources().getConfiguration();
        StringBuilder sb = new StringBuilder();
        sb.append("Am I in Portrait? ");
        sb.append(configuration.orientation == 1);
        NYTLogger.l(sb.toString(), new Object[0]);
    }

    private void reportOrientationChanged(int i) {
        printConfiguration();
        int deviceDefaultOrientation = getDeviceDefaultOrientation();
        NYTLogger.l("The TRUE default is " + (deviceDefaultOrientation == 2 ? "Landscape" : "Portrait"), new Object[0]);
        int i2 = deviceDefaultOrientation == 2 ? 1 : 2;
        if (i != 0 && i != 2) {
            deviceDefaultOrientation = i2;
        }
        onScreenOrientationChanged(deviceDefaultOrientation);
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        int rotation;
        if (i == -1 || this.prevRotation == (rotation = getRotation(i)) || rotation == -1) {
            return;
        }
        this.prevRotation = rotation;
        reportOrientationChanged(rotation);
    }

    public abstract void onScreenOrientationChanged(int i);

    public ScreenOrientationChangeListener(Context context, int i) {
        super(context, i);
        this.defaultOrientation = 0;
        this.prevRotation = -1;
        this.context = context;
    }
}
