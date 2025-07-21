package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    private final int a;
    private final a[] b;
    private final C0198b[] c;
    private final Map d;
    private final Map e;

    private static final class a {
        public final String a;
        private final int b;
        private final int c;

        private a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static a a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, i2, b.f(i, str));
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.b$b, reason: collision with other inner class name */
    private static final class C0198b {
        public final String a;
        private final int b;
        private final int c;
        private final float[] d = new float[16];

        private C0198b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static C0198b a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0198b(str, b.i(i, str), iArr2[0]);
        }
    }

    public b(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        GlUtil.b();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a a2 = a.a(this.a, i);
            this.b[i] = a2;
            this.d.put(a2.a, a2);
        }
        this.e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr3, 0);
        this.c = new C0198b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C0198b a3 = C0198b.a(this.a, i2);
            this.c[i2] = a3;
            this.e.put(a3.a, a3);
        }
        GlUtil.b();
    }

    private static void d(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    private int g(String str) {
        return f(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public int e(String str) {
        int g = g(str);
        GLES20.glEnableVertexAttribArray(g);
        GlUtil.b();
        return g;
    }

    public int j(String str) {
        return i(this.a, str);
    }
}
