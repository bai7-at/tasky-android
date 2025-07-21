package io.embrace.android.embracesdk.samples;

/* loaded from: classes5.dex */
public interface CrashSamplesNdkDelegate {
    void sigAbort();

    void sigIllegalInstruction();

    void sigfpe();

    void sigsegv();

    void throwException();
}
