package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes2.dex */
public abstract class tr1 {
    public static final tr1 a = new a();
    public static final tr1 b = new b();
    public static final tr1 c = new c();
    public static final tr1 d = new d();
    public static final tr1 e = new e();

    class a extends tr1 {
        a() {
        }

        @Override // defpackage.tr1
        public boolean a() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean b() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // defpackage.tr1
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends tr1 {
        b() {
        }

        @Override // defpackage.tr1
        public boolean a() {
            return false;
        }

        @Override // defpackage.tr1
        public boolean b() {
            return false;
        }

        @Override // defpackage.tr1
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // defpackage.tr1
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class c extends tr1 {
        c() {
        }

        @Override // defpackage.tr1
        public boolean a() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean b() {
            return false;
        }

        @Override // defpackage.tr1
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // defpackage.tr1
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    class d extends tr1 {
        d() {
        }

        @Override // defpackage.tr1
        public boolean a() {
            return false;
        }

        @Override // defpackage.tr1
        public boolean b() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // defpackage.tr1
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends tr1 {
        e() {
        }

        @Override // defpackage.tr1
        public boolean a() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean b() {
            return true;
        }

        @Override // defpackage.tr1
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // defpackage.tr1
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
