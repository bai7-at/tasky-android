package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.util.crashreport.CrashReportManager;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import defpackage.y62;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class v62 {
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    private static final d[] Y;
    private static final d[] Z;
    private static final d[] a0;
    private static final d[] b0;
    private static final d[] c0;
    private static final d d0;
    private static final d[] e0;
    private static final d[] f0;
    private static final d[] g0;
    private static final d[] h0;
    static final d[][] i0;
    private static final d[] j0;
    private static final HashMap[] k0;
    private static final HashMap[] l0;
    private static final HashSet m0;
    private static final HashMap n0;
    static final Charset o0;
    static final byte[] p0;
    private static final byte[] q0;
    private static final Pattern r0;
    private static final Pattern s0;
    private static final Pattern t0;
    private static final Pattern u0;
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private boolean e;
    private final HashMap[] f;
    private Set g;
    private ByteOrder h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private static final boolean u = Log.isLoggable("ExifInterface", 3);
    private static final List v = Arrays.asList(1, 6, 3, 8);
    private static final List w = Arrays.asList(2, 7, 4, 5);
    public static final int[] x = {8, 8, 8};
    public static final int[] y = {4};
    public static final int[] z = {8};
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    class a extends MediaDataSource {
        long a;
        final /* synthetic */ f b;

        a(f fVar) {
            this.b = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.b.available()) {
                        return -1;
                    }
                    this.b.i(j);
                    this.a = j;
                }
                if (i2 > this.b.available()) {
                    i2 = this.b.available();
                }
                int read = this.b.read(bArr, i, i2);
                if (read >= 0) {
                    this.a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.a = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {
        private static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder f = ByteOrder.BIG_ENDIAN;
        final DataInputStream a;
        private ByteOrder b;
        int c;
        private byte[] d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.a.available();
        }

        public long b() {
            return readInt() & 4294967295L;
        }

        public void d(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void h(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.a.skip(i3);
                if (skip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    skip = this.a.read(this.d, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.c += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.c++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.c++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.c++;
            int read = this.a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.c += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            this.c += i2;
            this.a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.c += 4;
            int read = this.a.read();
            int read2 = this.a.read();
            int read3 = this.a.read();
            int read4 = this.a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.c += 8;
            int read = this.a.read();
            int read2 = this.a.read();
            int read3 = this.a.read();
            int read4 = this.a.read();
            int read5 = this.a.read();
            int read6 = this.a.read();
            int read7 = this.a.read();
            int read8 = this.a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i;
            this.c += 2;
            int read = this.a.read();
            int read2 = this.a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                i = (read2 << 8) + read;
            } else {
                if (byteOrder != f) {
                    throw new IOException("Invalid byte order: " + this.b);
                }
                i = (read << 8) + read2;
            }
            return (short) i;
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.c += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.c++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.c += 2;
            int read = this.a.read();
            int read2 = this.a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            dataInputStream.mark(0);
            this.c = 0;
            this.b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.a.read(bArr, i, i2);
            this.c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.c += bArr.length;
            this.a.readFully(bArr);
        }
    }

    private static class c {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        c(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(v62.o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[v62.W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[v62.W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.a);
                wrap.putInt((int) eVar.b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i, ByteOrder byteOrder) {
            return g(new int[]{i}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[v62.W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (k instanceof String) {
                return Double.parseDouble((String) k);
            }
            if (k instanceof long[]) {
                if (((long[]) k).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k instanceof int[]) {
                if (((int[]) k).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) k;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (k instanceof String) {
                return Integer.parseInt((String) k);
            }
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) k;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(k instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) k;
            while (i < eVarArr.length) {
                sb.append(eVarArr[i].a);
                sb.append('/');
                sb.append(eVarArr[i].b);
                i++;
                if (i != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:166:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:169:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object k(java.nio.ByteOrder r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v62.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + v62.V[this.a] + ", data length:" + this.d.length + ")";
        }

        c(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    private static class e {
        public final long a;
        public final long b;

        e(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 1)};
        Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        c0 = dVarArr5;
        d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        i0 = dVarArr10;
        j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        k0 = new HashMap[dVarArr10.length];
        l0 = new HashMap[dVarArr10.length];
        m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        n0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        o0 = forName;
        p0 = "Exif\u0000\u0000".getBytes(forName);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr11 = i0;
            if (i >= dVarArr11.length) {
                HashMap hashMap = n0;
                d[] dVarArr12 = j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].a), 8);
                r0 = Pattern.compile(".*[1-9].*");
                s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            k0[i] = new HashMap();
            l0[i] = new HashMap();
            for (d dVar : dVarArr11[i]) {
                k0[i].put(Integer.valueOf(dVar.a), dVar);
                l0[i].put(dVar.b, dVar);
            }
            i++;
        }
    }

    public v62(String str) {
        d[][] dVarArr = i0;
        this.f = new HashMap[dVarArr.length];
        this.g = new HashSet(dVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        r(str);
    }

    private static boolean A(FileDescriptor fileDescriptor) {
        try {
            y62.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean B(HashMap hashMap) {
        c cVar;
        int i;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.h);
            int[] iArr2 = x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i = cVar.i(this.h)) == 1 && Arrays.equals(iArr, z)) || (i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean C(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.h) <= 512 && cVar2.i(this.h) <= 512;
    }

    private boolean D(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    private void E(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < i0.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e2) {
                    boolean z2 = u;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                    }
                    a();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (u) {
                    G();
                }
                throw th;
            }
        }
        if (!this.e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashReportManager.TIME_WINDOW);
            this.d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (N(this.d)) {
            f fVar = new f(inputStream);
            if (this.e) {
                n(fVar);
            } else {
                int i2 = this.d;
                if (i2 == 12) {
                    e(fVar);
                } else if (i2 == 7) {
                    h(fVar);
                } else if (i2 == 10) {
                    m(fVar);
                } else {
                    k(fVar);
                }
            }
            fVar.i(this.p);
            M(fVar);
        } else {
            b bVar = new b(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                f(bVar, 0, 0);
            } else if (i3 == 13) {
                i(bVar);
            } else if (i3 == 9) {
                j(bVar);
            } else if (i3 == 14) {
                o(bVar);
            }
        }
        a();
        if (!u) {
            return;
        }
        G();
    }

    private void F(b bVar) {
        ByteOrder H2 = H(bVar);
        this.h = H2;
        bVar.d(H2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            bVar.h(i2);
        }
    }

    private void G() {
        for (int i = 0; i < this.f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f[i].size());
            for (Map.Entry entry : this.f[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.h) + "'");
            }
        }
    }

    private ByteOrder H(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void I(byte[] bArr, int i) {
        f fVar = new f(bArr);
        F(fVar);
        J(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J(v62.f r26, int r27) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v62.J(v62$f, int):void");
    }

    private void K(int i, String str, String str2) {
        if (this.f[i].isEmpty() || this.f[i].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f[i];
        hashMap.put(str2, hashMap.get(str));
        this.f[i].remove(str);
    }

    private void L(f fVar, int i) {
        c cVar = (c) this.f[i].get("ImageLength");
        c cVar2 = (c) this.f[i].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f[i].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f[i].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i2 = cVar3.i(this.h);
            int i3 = cVar3.i(this.h);
            fVar.i(i2);
            byte[] bArr = new byte[i3];
            fVar.read(bArr);
            f(new b(bArr), i2, i);
        }
    }

    private void M(b bVar) {
        HashMap hashMap = this.f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar == null) {
            this.o = 6;
            p(bVar, hashMap);
            return;
        }
        int i = cVar.i(this.h);
        this.o = i;
        if (i != 1) {
            if (i == 6) {
                p(bVar, hashMap);
                return;
            } else if (i != 7) {
                return;
            }
        }
        if (B(hashMap)) {
            q(bVar, hashMap);
        }
    }

    private static boolean N(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void O(int i, int i2) {
        if (this.f[i].isEmpty() || this.f[i2].isEmpty()) {
            if (u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f[i].get("ImageLength");
        c cVar2 = (c) this.f[i].get("ImageWidth");
        c cVar3 = (c) this.f[i2].get("ImageLength");
        c cVar4 = (c) this.f[i2].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i3 = cVar.i(this.h);
        int i4 = cVar2.i(this.h);
        int i5 = cVar3.i(this.h);
        int i6 = cVar4.i(this.h);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap[] hashMapArr = this.f;
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    private void P(f fVar, int i) {
        c f2;
        c f3;
        c cVar = (c) this.f[i].get("DefaultCropSize");
        c cVar2 = (c) this.f[i].get("SensorTopBorder");
        c cVar3 = (c) this.f[i].get("SensorLeftBorder");
        c cVar4 = (c) this.f[i].get("SensorBottomBorder");
        c cVar5 = (c) this.f[i].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                L(fVar, i);
                return;
            }
            int i2 = cVar2.i(this.h);
            int i3 = cVar4.i(this.h);
            int i4 = cVar5.i(this.h);
            int i5 = cVar3.i(this.h);
            if (i3 <= i2 || i4 <= i5) {
                return;
            }
            c f4 = c.f(i3 - i2, this.h);
            c f5 = c.f(i4 - i5, this.h);
            this.f[i].put("ImageLength", f4);
            this.f[i].put("ImageWidth", f5);
            return;
        }
        if (cVar.a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            f2 = c.d(eVarArr[0], this.h);
            f3 = c.d(eVarArr[1], this.h);
        } else {
            int[] iArr = (int[]) cVar.k(this.h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            f2 = c.f(iArr[0], this.h);
            f3 = c.f(iArr[1], this.h);
        }
        this.f[i].put("ImageWidth", f2);
        this.f[i].put("ImageLength", f3);
    }

    private void Q() {
        O(0, 5);
        O(0, 4);
        O(5, 4);
        c cVar = (c) this.f[1].get("PixelXDimension");
        c cVar2 = (c) this.f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f[0].put("ImageWidth", cVar);
            this.f[0].put("ImageLength", cVar2);
        }
        if (this.f[4].isEmpty() && C(this.f[5])) {
            HashMap[] hashMapArr = this.f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!C(this.f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        K(0, "ThumbnailOrientation", "Orientation");
        K(0, "ThumbnailImageLength", "ImageLength");
        K(0, "ThumbnailImageWidth", "ImageWidth");
        K(5, "ThumbnailOrientation", "Orientation");
        K(5, "ThumbnailImageLength", "ImageLength");
        K(5, "ThumbnailImageWidth", "ImageWidth");
        K(4, "Orientation", "ThumbnailOrientation");
        K(4, "ImageLength", "ThumbnailImageLength");
        K(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.f[0].put("DateTime", c.a(b2));
        }
        if (b("ImageWidth") == null) {
            this.f[0].put("ImageWidth", c.b(0L, this.h));
        }
        if (b("ImageLength") == null) {
            this.f[0].put("ImageLength", c.b(0L, this.h));
        }
        if (b("Orientation") == null) {
            this.f[0].put("Orientation", c.b(0L, this.h));
        }
        if (b("LightSource") == null) {
            this.f[1].put("LightSource", c.b(0L, this.h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < i0.length; i++) {
            c cVar = (c) this.f[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                y62.b.a(mediaMetadataRetriever, new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f[0].put("ImageWidth", c.f(Integer.parseInt(str), this.h));
                }
                if (str2 != null) {
                    this.f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f[0].put("Orientation", c.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.i(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    if (fVar.read(bArr2) != i2) {
                        throw new IOException("Can't read exif");
                    }
                    this.p = i;
                    I(bArr2, 0);
                }
                if (u) {
                    Log.d("ExifInterface", "Heif meta: " + str + QueryKeys.SCROLL_POSITION_TOP + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        r22.d(r21.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b A[LOOP:0: B:9:0x0037->B:33:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(v62.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v62.f(v62$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(CrashReportManager.TIME_WINDOW);
        byte[] bArr = new byte[CrashReportManager.TIME_WINDOW];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (v(bArr)) {
            return 4;
        }
        if (y(bArr)) {
            return 9;
        }
        if (u(bArr)) {
            return 12;
        }
        if (w(bArr)) {
            return 7;
        }
        if (z(bArr)) {
            return 10;
        }
        if (x(bArr)) {
            return 13;
        }
        return D(bArr) ? 14 : 0;
    }

    private void h(f fVar) {
        int i;
        int i2;
        k(fVar);
        c cVar = (c) this.f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.d(this.h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.i(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.i(12L);
            }
            J(fVar2, 6);
            c cVar2 = (c) this.f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f[5].put("JPEGInterchangeFormat", cVar2);
                this.f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                c f2 = c.f(i5, this.h);
                c f3 = c.f(i6, this.h);
                this.f[0].put("ImageWidth", f2);
                this.f[0].put("ImageLength", f3);
            }
        }
    }

    private void i(b bVar) {
        if (u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, J)) {
                    return;
                }
                if (Arrays.equals(bArr2, H)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + y62.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.p = i;
                        I(bArr3, 0);
                        Q();
                        M(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                bVar.h(i2);
                length = i + i2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) {
        boolean z2 = u;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.h(i - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i, 5);
        bVar.h(i3 - bVar.a());
        bVar.d(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == d0.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f2 = c.f(readShort, this.h);
                c f3 = c.f(readShort2, this.h);
                this.f[0].put("ImageLength", f2);
                this.f[0].put("ImageWidth", f3);
                if (u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.h(readUnsignedShort2);
        }
    }

    private void k(f fVar) {
        c cVar;
        F(fVar);
        J(fVar, 0);
        P(fVar, 0);
        P(fVar, 5);
        P(fVar, 4);
        Q();
        if (this.d != 8 || (cVar = (c) this.f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.d);
        fVar2.d(this.h);
        fVar2.h(6);
        J(fVar2, 9);
        c cVar2 = (c) this.f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) {
        if (u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = (c) this.f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.d), (int) cVar.c, 5);
        }
        c cVar2 = (c) this.f[0].get("ISO");
        c cVar3 = (c) this.f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) {
        byte[] bArr = p0;
        fVar.h(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.p = bArr.length;
        I(bArr2, 0);
    }

    private void o(b bVar) {
        if (u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.LITTLE_ENDIAN);
        bVar.h(K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.p = i;
                        I(bArr3, 0);
                        M(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + y62.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.h(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i = cVar.i(this.h);
        int i2 = cVar2.i(this.h);
        if (this.d == 7) {
            i += this.q;
        }
        if (i > 0 && i2 > 0) {
            this.i = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[i2];
                bVar.skip(i);
                bVar.read(bArr);
                this.n = bArr;
            }
            this.l = i;
            this.m = i2;
        }
        if (u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i2);
        }
    }

    private void q(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] c2 = y62.c(cVar.k(this.h));
        long[] c3 = y62.c(cVar2.k(this.h));
        if (c2 == null || c2.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c3 == null || c3.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c2.length != c3.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : c3) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.k = true;
        this.j = true;
        this.i = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < c2.length; i4++) {
            int i5 = (int) c2[i4];
            int i6 = (int) c3[i4];
            if (i4 < c2.length - 1 && i5 + i6 != c2[i4 + 1]) {
                this.k = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j3 = i7;
            if (bVar.skip(j3) != j3) {
                Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (bVar.read(bArr2) != i6) {
                Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.n = bArr;
        if (this.k) {
            this.l = (int) c2[0];
            this.m = i;
        }
    }

    private void r(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (A(fileInputStream.getFD())) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            E(fileInputStream);
            y62.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            y62.b(fileInputStream2);
            throw th;
        }
    }

    private static boolean s(BufferedInputStream bufferedInputStream) {
        byte[] bArr = p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = p0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean u(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e3) {
            e = e3;
            bVar2 = bVar;
            if (u) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, B)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, C)) {
                    z2 = true;
                } else if (Arrays.equals(bArr3, D)) {
                    z3 = true;
                }
                if (z2 && z3) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean v(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean w(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder H2 = H(bVar2);
                this.h = H2;
                bVar2.d(H2);
                short readShort = bVar2.readShort();
                boolean z2 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean x(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean y(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean z(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder H2 = H(bVar2);
                this.h = H2;
                bVar2.d(H2);
                boolean z2 = bVar2.readShort() == 85;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d2 = d(str);
        if (d2 != null) {
            if (!m0.contains(str)) {
                return d2.j(this.h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = d2.a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d2.a);
                    return null;
                }
                e[] eVarArr = (e[]) d2.k(this.h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.a / eVar.b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.a / eVar2.b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.a / eVar3.b)));
            }
            try {
                return Double.toString(d2.h(this.h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d2 = d(str);
        if (d2 == null) {
            return i;
        }
        try {
            return d2.i(this.h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public boolean t() {
        int c2 = c("Orientation", 1);
        return c2 == 2 || c2 == 7 || c2 == 4 || c2 == 5;
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.a.mark(Integer.MAX_VALUE);
        }

        public void i(long j) {
            int i = this.c;
            if (i > j) {
                this.c = 0;
                this.a.reset();
            } else {
                j -= i;
            }
            h((int) j);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        d(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        d(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public v62(InputStream inputStream) {
        this(inputStream, 0);
    }

    public v62(InputStream inputStream, int i) {
        d[][] dVarArr = i0;
        this.f = new HashMap[dVarArr.length];
        this.g = new HashSet(dVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, p0.length);
                if (!s(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.e = true;
                this.c = null;
                this.b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (A(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.b = null;
            }
            E(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
