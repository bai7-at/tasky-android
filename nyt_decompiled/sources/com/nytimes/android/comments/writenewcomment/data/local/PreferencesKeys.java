package com.nytimes.android.comments.writenewcomment.data.local;

import defpackage.s16;
import defpackage.u16;

/* loaded from: classes4.dex */
final class PreferencesKeys {
    public static final PreferencesKeys INSTANCE = new PreferencesKeys();
    private static final s16.a COMMENTER_NAME = u16.f("commenterName");
    private static final s16.a COMMENTER_LOCATION = u16.f("commenterLoc");

    private PreferencesKeys() {
    }

    public final s16.a getCOMMENTER_LOCATION() {
        return COMMENTER_LOCATION;
    }

    public final s16.a getCOMMENTER_NAME() {
        return COMMENTER_NAME;
    }
}
