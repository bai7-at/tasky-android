package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import defpackage.ur;
import defpackage.zj0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class s implements Closeable {
    public static final Charset g = zj0.c;
    private final d a;
    private final Loader b = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    private final Map c = Collections.synchronizedMap(new HashMap());
    private g d;
    private Socket e;
    private volatile boolean f;

    public interface b {
        void k(byte[] bArr);
    }

    private final class c implements Loader.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(f fVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void k(f fVar, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c o(f fVar, long j, long j2, IOException iOException, int i) {
            if (!s.this.f) {
                s.this.a.a(iOException);
            }
            return Loader.f;
        }
    }

    public interface d {
        default void a(Exception exc) {
        }

        default void b(List list, Exception exc) {
        }

        void c(List list);
    }

    private static final class e {
        private final List a = new ArrayList();
        private int b = 1;
        private long c;

        private ImmutableList a(byte[] bArr) {
            ur.g(this.b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, s.g) : new String(bArr, 0, bArr.length - 2, s.g));
            ImmutableList t = ImmutableList.t(this.a);
            e();
            return t;
        }

        private ImmutableList b(byte[] bArr) {
            ur.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, s.g);
            this.a.add(str);
            int i = this.b;
            if (i == 1) {
                if (!u.f(str)) {
                    return null;
                }
                this.b = 2;
                return null;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            long g = u.g(str);
            if (g != -1) {
                this.c = g;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.c > 0) {
                this.b = 3;
                return null;
            }
            ImmutableList t = ImmutableList.t(this.a);
            e();
            return t;
        }

        private static byte[] d(byte b, DataInputStream dataInputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte readByte = dataInputStream.readByte();
                bArr[1] = readByte;
                byteArrayOutputStream.write(readByte);
            }
        }

        private void e() {
            this.a.clear();
            this.b = 1;
            this.c = 0L;
        }

        public ImmutableList c(byte b, DataInputStream dataInputStream) {
            ImmutableList b2 = b(d(b, dataInputStream));
            while (b2 == null) {
                if (this.b == 3) {
                    long j = this.c;
                    if (j <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int d = Ints.d(j);
                    ur.g(d != -1);
                    byte[] bArr = new byte[d];
                    dataInputStream.readFully(bArr, 0, d);
                    b2 = a(bArr);
                } else {
                    b2 = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return b2;
        }
    }

    private final class f implements Loader.e {
        private final DataInputStream a;
        private final e b = new e();
        private volatile boolean c;

        public f(InputStream inputStream) {
            this.a = new DataInputStream(inputStream);
        }

        private void b() {
            int readUnsignedByte = this.a.readUnsignedByte();
            int readUnsignedShort = this.a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) s.this.c.get(Integer.valueOf(readUnsignedByte));
            if (bVar == null || s.this.f) {
                return;
            }
            bVar.k(bArr);
        }

        private void d(byte b) {
            if (s.this.f) {
                return;
            }
            s.this.a.c(this.b.c(b, this.a));
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            while (!this.c) {
                byte readByte = this.a.readByte();
                if (readByte == 36) {
                    b();
                } else {
                    d(readByte);
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
            this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g implements Closeable {
        private final OutputStream a;
        private final HandlerThread b;
        private final Handler c;

        public g(OutputStream outputStream) {
            this.a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(byte[] bArr, List list) {
            try {
                this.a.write(bArr);
            } catch (Exception e) {
                if (s.this.f) {
                    return;
                }
                s.this.a.b(list, e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.c;
            final HandlerThread handlerThread = this.b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: g47
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.b.join();
            } catch (InterruptedException unused) {
                this.b.interrupt();
            }
        }

        public void d(final List list) {
            final byte[] b = u.b(list);
            this.c.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.g.this.b(b, list);
                }
            });
        }
    }

    public s(d dVar) {
        this.a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f) {
            return;
        }
        try {
            g gVar = this.d;
            if (gVar != null) {
                gVar.close();
            }
            this.b.l();
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
            this.f = true;
        } catch (Throwable th) {
            this.f = true;
            throw th;
        }
    }

    public void h(Socket socket) {
        this.e = socket;
        this.d = new g(socket.getOutputStream());
        this.b.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void i(int i, b bVar) {
        this.c.put(Integer.valueOf(i), bVar);
    }

    public void j(List list) {
        ur.i(this.d);
        this.d.d(list);
    }
}
