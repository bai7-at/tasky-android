package com.nytimes.android.api.cms;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Video;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class Video_VideoFilesJsonAdapter extends JsonAdapter<Video.VideoFiles> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Video.VideoFiles> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public Video_VideoFilesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("width", "fileSize", "duration", "height", "isLive", "bitrate", "videoEncoding", "url", TransferTable.COLUMN_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "width");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isLive");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "bitrate");
        zq3.g(f3, "adapter(...)");
        this.longAdapter = f3;
        JsonAdapter<String> f4 = iVar.f(String.class, b0.e(), "videoEncoding");
        zq3.g(f4, "adapter(...)");
        this.nullableStringAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Video.VideoFiles");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Video.VideoFiles fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        int i = -1;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool2 = bool;
        Long l = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x = c29.x("width", "width", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -2;
                    break;
                case 1:
                    num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x2 = c29.x("fileSize", "fileSize", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -3;
                    break;
                case 2:
                    num3 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num3 == null) {
                        JsonDataException x3 = c29.x("duration", "duration", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -5;
                    break;
                case 3:
                    num4 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num4 == null) {
                        JsonDataException x4 = c29.x("height", "height", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -9;
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x5 = c29.x("isLive", "isLive", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    break;
                case 5:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x6 = c29.x("bitrate", "bitrate", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
                case 6:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
            }
        }
        jsonReader.h();
        if (i == -512) {
            return new Video.VideoFiles(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool2.booleanValue(), l.longValue(), str, str2, str3);
        }
        Constructor<Video.VideoFiles> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Video.VideoFiles.class.getDeclaredConstructor(cls, cls, cls, cls, Boolean.TYPE, Long.TYPE, String.class, String.class, String.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Video.VideoFiles newInstance = constructor.newInstance(num, num2, num3, num4, bool2, l, str, str2, str3, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Video.VideoFiles videoFiles) {
        zq3.h(hVar, "writer");
        if (videoFiles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("width");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(videoFiles.getWidth()));
        hVar.C("fileSize");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(videoFiles.getFileSize()));
        hVar.C("duration");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(videoFiles.getDuration()));
        hVar.C("height");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(videoFiles.getHeight()));
        hVar.C("isLive");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(videoFiles.isLive()));
        hVar.C("bitrate");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(videoFiles.getBitrate()));
        hVar.C("videoEncoding");
        this.nullableStringAdapter.mo197toJson(hVar, videoFiles.getVideoEncoding());
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, videoFiles.getUrl());
        hVar.C(TransferTable.COLUMN_TYPE);
        this.nullableStringAdapter.mo197toJson(hVar, videoFiles.getType());
        hVar.l();
    }
}
