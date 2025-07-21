package okhttp3.internal.cache2;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ad0;
import defpackage.pm8;
import defpackage.px7;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final ad0 buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private px7 upstream;
    private final ad0 upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, px7 px7Var, ByteString byteString, long j) throws IOException {
            zq3.h(file, TransferTable.COLUMN_FILE);
            zq3.h(px7Var, "upstream");
            zq3.h(byteString, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, px7Var, 0L, byteString, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            zq3.h(file, TransferTable.COLUMN_FILE);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            zq3.g(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            ad0 ad0Var = new ad0();
            fileOperator.read(0L, ad0Var, 32L);
            if (!zq3.c(ad0Var.u0(r0.E()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = ad0Var.readLong();
            long readLong2 = ad0Var.readLong();
            ad0 ad0Var2 = new ad0();
            fileOperator.read(readLong + 32, ad0Var2, readLong2);
            return new Relay(randomAccessFile, null, readLong, ad0Var2.a1(), 0L, null);
        }

        private Companion() {
        }
    }

    public final class RelaySource implements px7 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final pm8 timeout = new pm8();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            zq3.e(file);
            FileChannel channel = file.getChannel();
            zq3.g(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r10 = java.lang.Math.min(r23, r21.this$0.getUpstreamPos() - r21.sourcePos);
            r2 = r21.fileOperator;
            defpackage.zq3.e(r2);
            r2.read(r21.sourcePos + 32, r22, r10);
            r21.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        
            r0 = r21.this$0.getUpstream();
            defpackage.zq3.e(r0);
            r11 = r0.read(r21.this$0.getUpstreamBuffer(), r21.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            r0 = r21.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        
            r1 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        
            r1.setUpstreamReader(null);
            defpackage.zq3.f(r1, "null cannot be cast to non-null type java.lang.Object");
            r1.notifyAll();
            r0 = defpackage.ww8.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            r19 = java.lang.Math.min(r11, r23);
            r21.this$0.getUpstreamBuffer().i(r22, 0, r19);
            r21.sourcePos += r19;
            r13 = r21.fileOperator;
            defpackage.zq3.e(r13);
            r13.write(r21.this$0.getUpstreamPos() + 32, r21.this$0.getUpstreamBuffer().clone(), r11);
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        
            if (r2.getBuffer().h1() <= r2.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().h1() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r11);
            r0 = defpackage.ww8.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
        
            r1 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
        
            r1.setUpstreamReader(null);
            defpackage.zq3.f(r1, "null cannot be cast to non-null type java.lang.Object");
            r1.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
        
            return r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
        
            r1 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
        
            r1.setUpstreamReader(null);
            defpackage.zq3.f(r1, "null cannot be cast to non-null type java.lang.Object");
            r1.notifyAll();
            r2 = defpackage.ww8.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
        
            throw r0;
         */
        @Override // defpackage.px7
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(defpackage.ad0 r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(ad0, long):long");
        }

        @Override // defpackage.px7, defpackage.yt7
        public pm8 timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.a aVar = ByteString.c;
        PREFIX_CLEAN = aVar.d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.d("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, px7 px7Var, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, px7Var, j, byteString, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        ad0 ad0Var = new ad0();
        ad0Var.m1(byteString);
        ad0Var.G1(j);
        ad0Var.G1(j2);
        if (ad0Var.h1() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        zq3.e(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        zq3.g(channel, "file!!.channel");
        new FileOperator(channel).write(0L, ad0Var, 32L);
    }

    private final void writeMetadata(long j) throws IOException {
        ad0 ad0Var = new ad0();
        ad0Var.m1(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        zq3.e(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        zq3.g(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, ad0Var, this.metadata.E());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        zq3.e(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.E());
        RandomAccessFile randomAccessFile2 = this.file;
        zq3.e(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            ww8 ww8Var = ww8.a;
        }
        px7 px7Var = this.upstream;
        if (px7Var != null) {
            Util.closeQuietly(px7Var);
        }
        this.upstream = null;
    }

    public final ad0 getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final px7 getUpstream() {
        return this.upstream;
    }

    public final ad0 getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final px7 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(px7 px7Var) {
        this.upstream = px7Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, px7 px7Var, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = px7Var;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new ad0();
        this.complete = this.upstream == null;
        this.buffer = new ad0();
    }
}
