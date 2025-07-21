package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u1;
import defpackage.sv5;
import defpackage.u20;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final t0 format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.t0 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.audioTrackState = r4
                r3.isRecoverable = r9
                r3.format = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, com.google.android.exoplayer2.t0, boolean, java.lang.Exception):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final t0 format;
        public final boolean isRecoverable;

        public WriteException(int i, t0 t0Var, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = t0Var;
        }
    }

    public interface a {
        void a(boolean z);

        void b(Exception exc);

        void c(long j);

        void d();

        void e(int i, long j, long j2);

        void f();

        void g();

        void h();
    }

    void L();

    void a();

    boolean b(t0 t0Var);

    void c(AudioDeviceInfo audioDeviceInfo);

    boolean d();

    u1 e();

    boolean f();

    void flush();

    void g(int i);

    void h();

    void i(u1 u1Var);

    void j(com.google.android.exoplayer2.audio.a aVar);

    void k(u20 u20Var);

    boolean l(ByteBuffer byteBuffer, long j, int i);

    void m(a aVar);

    int n(t0 t0Var);

    void o();

    void p();

    void pause();

    long q(boolean z);

    default void r(long j) {
    }

    void release();

    void s();

    void t(float f);

    void u(sv5 sv5Var);

    void v();

    void w(t0 t0Var, int i, int[] iArr);

    void x(boolean z);

    public static final class ConfigurationException extends Exception {
        public final t0 format;

        public ConfigurationException(Throwable th, t0 t0Var) {
            super(th);
            this.format = t0Var;
        }

        public ConfigurationException(String str, t0 t0Var) {
            super(str);
            this.format = t0Var;
        }
    }
}
