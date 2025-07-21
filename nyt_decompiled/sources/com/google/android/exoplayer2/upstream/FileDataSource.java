package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.upstream.a;
import defpackage.d50;
import defpackage.sq8;
import defpackage.ur;
import defpackage.z19;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class FileDataSource extends d50 {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements a.InterfaceC0194a {
        private sq8 a;

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDataSource a() {
            FileDataSource fileDataSource = new FileDataSource();
            sq8 sq8Var = this.a;
            if (sq8Var != null) {
                fileDataSource.i(sq8Var);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile w(Uri uri) {
        try {
            return new RandomAccessFile((String) ur.e(uri.getPath()), QueryKeys.EXTERNAL_REFERRER);
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e, (z19.a < 21 || !a.b(e.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, 2006);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        Uri uri = bVar.a;
        this.f = uri;
        u(bVar);
        RandomAccessFile w = w(uri);
        this.e = w;
        try {
            w.seek(bVar.g);
            long j = bVar.h;
            if (j == -1) {
                j = this.e.length() - bVar.g;
            }
            this.g = j;
            if (j < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.h = true;
            v(bVar);
            return this.g;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                t();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return this.f;
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) z19.j(this.e)).read(bArr, i, (int) Math.min(this.g, i2));
            if (read > 0) {
                this.g -= read;
                s(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
