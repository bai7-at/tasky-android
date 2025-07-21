package com.nytimes.android.media.util;

import defpackage.ba2;
import defpackage.d62;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class AudioFileVerifier_Factory implements ba2 {
    private final p76 exceptionLoggerProvider;

    public AudioFileVerifier_Factory(p76 p76Var) {
        this.exceptionLoggerProvider = p76Var;
    }

    public static AudioFileVerifier_Factory create(p76 p76Var) {
        return new AudioFileVerifier_Factory(p76Var);
    }

    public static AudioFileVerifier newInstance(d62 d62Var) {
        return new AudioFileVerifier(d62Var);
    }

    @Override // defpackage.p76
    public AudioFileVerifier get() {
        return newInstance((d62) this.exceptionLoggerProvider.get());
    }
}
