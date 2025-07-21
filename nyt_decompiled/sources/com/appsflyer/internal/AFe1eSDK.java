package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class AFe1eSDK extends FilterInputStream {
    private short AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int afDebugLog;
    private int afInfoLog;
    private int afRDLog;
    private final int valueOf;
    private long[] values;

    public AFe1eSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.valueOf = min;
        this.AFKeystoreWrapper = new byte[min];
        this.values = new long[4];
        this.AFInAppEventType = new long[4];
        this.afDebugLog = min;
        this.afRDLog = min;
        this.values = AFe1bSDK.valueOf(i ^ i4, min ^ i4);
        this.AFInAppEventType = AFe1bSDK.valueOf(i2 ^ i4, i3 ^ i4);
    }

    private int valueOf() throws IOException {
        int i;
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.afDebugLog == this.valueOf) {
            byte[] bArr = this.AFKeystoreWrapper;
            int i2 = this.afInfoLog;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFKeystoreWrapper, i3, this.valueOf - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.valueOf);
            if (i3 < this.valueOf) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int read2 = ((FilterInputStream) this).in.read();
            this.afInfoLog = read2;
            this.afDebugLog = 0;
            if (read2 < 0) {
                int i4 = this.valueOf;
                i = i4 - (this.AFKeystoreWrapper[i4 - 1] & 255);
            } else {
                i = this.valueOf;
            }
            this.afRDLog = i;
        }
        return this.afRDLog;
    }

    private void values() {
        long[] jArr = this.values;
        long[] jArr2 = this.AFInAppEventType;
        short s = this.AFInAppEventParameterName;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.valueOf; i2++) {
            this.AFKeystoreWrapper[i2] = (byte) (r1[i2] ^ ((this.values[this.AFInAppEventParameterName] >> (i2 << 3)) & 255));
        }
        this.AFInAppEventParameterName = (short) ((this.AFInAppEventParameterName + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.afRDLog - this.afDebugLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.afDebugLog;
        if (i >= this.afRDLog) {
            return -1;
        }
        byte[] bArr = this.AFKeystoreWrapper;
        this.afDebugLog = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.afDebugLog;
            if (i5 >= this.afRDLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFKeystoreWrapper;
            this.afDebugLog = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
