package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.so5;
import defpackage.to;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0147a implements g {
        final /* synthetic */ InputStream a;

        C0147a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    class b implements g {
        final /* synthetic */ ByteBuffer a;

        b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.b(this.a);
        }
    }

    class c implements g {
        final /* synthetic */ so5 a;
        final /* synthetic */ to b;

        c(so5 so5Var, to toVar) {
            this.a = so5Var;
            this.b = toVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType c = imageHeaderParser.c(recyclableBufferedInputStream2);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.a.a();
                    return c;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class d implements f {
        final /* synthetic */ InputStream a;
        final /* synthetic */ to b;

        d(InputStream inputStream, to toVar) {
            this.a = inputStream;
            this.b = toVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    class e implements f {
        final /* synthetic */ so5 a;
        final /* synthetic */ to b;

        e(so5 so5Var, to toVar) {
            this.a = so5Var;
            this.b = toVar;
        }

        @Override // com.bumptech.glide.load.a.f
        public int a(ImageHeaderParser imageHeaderParser) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
                try {
                    int a = imageHeaderParser.a(recyclableBufferedInputStream2, this.b);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    this.a.a();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private interface f {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, so5 so5Var, to toVar) {
        return c(list, new e(so5Var, toVar));
    }

    public static int b(List list, InputStream inputStream, to toVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, toVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, toVar));
    }

    private static int c(List list, f fVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List list, so5 so5Var, to toVar) {
        return g(list, new c(so5Var, toVar));
    }

    public static ImageHeaderParser.ImageType e(List list, InputStream inputStream, to toVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, toVar);
        }
        inputStream.mark(5242880);
        return g(list, new C0147a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List list, g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.a((ImageHeaderParser) list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
