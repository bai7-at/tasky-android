package com.appsflyer.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes2.dex */
public final class AFe1dSDK {
    private static byte[] afDebugLog = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    static final byte[] valueOf = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    static final int[] AFInAppEventParameterName = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    static final int[] AFKeystoreWrapper = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    static final int[] values = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    static final int[] AFInAppEventType = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    private static int[] afRDLog = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = afDebugLog;
            i = b & 255;
            int i2 = b2 & 255;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = afDebugLog[i3] & 255;
            valueOf[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = ((i5 ^ (i6 ^ i7)) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            AFInAppEventParameterName[i4] = i9;
            AFKeystoreWrapper[i4] = (i9 >>> 8) | (i9 << 24);
            values[i4] = (i9 >>> 16) | (i9 << 16);
            AFInAppEventType[i4] = (i9 << 8) | (i9 >>> 24);
        }
        afRDLog[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            afRDLog[i11] = i10 << 24;
        }
    }

    static int[] AFInAppEventType(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 1) * 4;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i4 + 3;
            int i7 = ((bArr[i4 + 1] & 255) << 16) | (bArr[i4] << 24) | ((bArr[i4 + 2] & 255) << 8);
            i4 += 4;
            iArr[i5] = i7 | (bArr[i6] & 255);
        }
        int i8 = 4;
        int i9 = 0;
        while (i8 < i2) {
            int i10 = iArr[i8 - 1];
            if (i3 == 0) {
                byte[] bArr2 = afDebugLog;
                i10 = ((bArr2[i10 >>> 24] & 255) | (((bArr2[(i10 >>> 16) & 255] << 24) | ((bArr2[(i10 >>> 8) & 255] & 255) << 16)) | ((bArr2[i10 & 255] & 255) << 8))) ^ afRDLog[i9];
                i3 = 4;
                i9++;
            }
            iArr[i8] = i10 ^ iArr[i8 - 4];
            i8++;
            i3--;
        }
        return valueOf(bArr, iArr, i);
    }

    public static byte[][] AFKeystoreWrapper(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    private static int[] valueOf(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = 4;
        int[] iArr2 = new int[(i + 1) * 4];
        int i3 = i * 4;
        iArr2[0] = iArr[i3];
        iArr2[1] = iArr[i3 + 1];
        iArr2[2] = iArr[i3 + 2];
        iArr2[3] = iArr[i3 + 3];
        int i4 = i3 - 4;
        for (int i5 = 1; i5 < i; i5++) {
            int i6 = iArr[i4];
            int[] iArr3 = AFInAppEventParameterName;
            byte[] bArr2 = afDebugLog;
            int i7 = iArr3[bArr2[i6 >>> 24] & 255];
            int[] iArr4 = AFKeystoreWrapper;
            int i8 = i7 ^ iArr4[bArr2[(i6 >>> 16) & 255] & 255];
            int[] iArr5 = values;
            int i9 = i8 ^ iArr5[bArr2[(i6 >>> 8) & 255] & 255];
            int[] iArr6 = AFInAppEventType;
            iArr2[i2] = iArr6[bArr2[i6 & 255] & 255] ^ i9;
            int i10 = iArr[i4 + 1];
            iArr2[i2 + 1] = iArr6[bArr2[i10 & 255] & 255] ^ ((iArr4[bArr2[(i10 >>> 16) & 255] & 255] ^ iArr3[bArr2[i10 >>> 24] & 255]) ^ iArr5[bArr2[(i10 >>> 8) & 255] & 255]);
            int i11 = iArr[i4 + 2];
            int i12 = i2 + 3;
            iArr2[i2 + 2] = iArr6[bArr2[i11 & 255] & 255] ^ ((iArr3[bArr2[i11 >>> 24] & 255] ^ iArr4[bArr2[(i11 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i11 >>> 8) & 255] & 255]);
            int i13 = iArr[i4 + 3];
            i2 += 4;
            iArr2[i12] = iArr6[bArr2[i13 & 255] & 255] ^ ((iArr3[bArr2[i13 >>> 24] & 255] ^ iArr4[bArr2[(i13 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i13 >>> 8) & 255] & 255]);
            i4 -= 4;
        }
        iArr2[i2] = iArr[i4];
        iArr2[i2 + 1] = iArr[i4 + 1];
        iArr2[i2 + 2] = iArr[i4 + 2];
        iArr2[i2 + 3] = iArr[i4 + 3];
        return iArr2;
    }
}
