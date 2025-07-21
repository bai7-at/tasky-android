package com.nytimes.android.media.util;

import defpackage.ba2;

/* loaded from: classes4.dex */
public final class MediaDurationFormatter_Factory implements ba2 {

    private static final class InstanceHolder {
        private static final MediaDurationFormatter_Factory INSTANCE = new MediaDurationFormatter_Factory();

        private InstanceHolder() {
        }
    }

    public static MediaDurationFormatter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MediaDurationFormatter newInstance() {
        return new MediaDurationFormatter();
    }

    @Override // defpackage.p76
    public MediaDurationFormatter get() {
        return newInstance();
    }
}
